package de.fillikos.rf2.service.webui.httpss.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.fillikos.rf2.service.webui.httpss.model.sessioninfo.SessionInfo;
import de.fillikos.rf2.service.webui.httpss.model.standings.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Connection {

    private String adresse, port;
    private URL url;
    private User[] users;
    private SessionInfo sessionInfo;
    private FileModel[] fileModel;
    private int rcSessionInfo, rcStandings, rc;

    public Connection(String adresse, String port) {
        this.adresse = adresse;
        this.port = port;
        this.url = null;
        this.users = new User[0];
        this.sessionInfo = new SessionInfo();
        this.fileModel = new FileModel[0];
    }

    public void sendchat(String nachricht) {
        try {
            url = new URL(adresse + port + "/rest/chat");
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("POST");
            OutputStreamWriter out = new OutputStreamWriter(
                    httpCon.getOutputStream());
            out.write(nachricht);
            out.close();
            httpCon.getInputStream();
            System.out.println(nachricht);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStandings() {
        ObjectMapper om = new ObjectMapper();
        try {
            users = om.readValue(new URL(adresse+port+"/rest/watch/standings"), User[].class);
            rcStandings = 0;
        } catch (MalformedURLException e) {
            rcStandings = 1;
            System.out.println("Keine Verbindung zum Server");
        } catch (ConnectException e) {
            rcStandings = 2;
            System.out.println("Kein Server gefunden");
        } catch (IOException e) {
            rcStandings = 3;
//            e.printStackTrace();
        }
    }

    public void loadSessionInfo() {
        ObjectMapper om = new ObjectMapper();
        try {
            sessionInfo = om.readValue(new URL(adresse+port+"/rest/watch/sessionInfo"), SessionInfo.class);
            rcSessionInfo = 0;
        } catch (MalformedURLException e) {
            rcSessionInfo = 1;
            System.out.println("Keine Verbindung zum Server");
        } catch (ConnectException e) {
            rcSessionInfo = 2;
            System.out.println("Kein Server gefunden");
        } catch (IOException e) {
            rcSessionInfo = 3;
//            e.printStackTrace();
        }
    }

    public String loadHistoryString() {
        StringBuilder result = new StringBuilder();
        try {
            url = new URL(adresse + port + "/rest/watch/standings/history");
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setRequestMethod("GET");
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(httpCon.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public void loadFile(String path) {
        ObjectMapper om = new ObjectMapper();
        try {
            System.out.println(Paths.get(path).toFile());
            fileModel = om.readValue(Paths.get(path).toFile(), FileModel[].class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String file, ArrayList<FileModel> data) {
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(Paths.get(file).toFile(), data);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User[] getStandings() {
        return users;
    }

    public ArrayList<User> getStandingsArray() {
        ArrayList<User> u = new ArrayList<User>();
        u.addAll(Arrays.asList(users));
        return u;
    }

    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    public void loadData() {
        loadStandings();
        loadSessionInfo();
        if(rcSessionInfo != 0 || rcStandings != 0) {
            switch(rcStandings) {
                case 0: break;
                case 1: rc = 11; break;
                case 2: rc = 12; break;
                default: rc = 142;
            }
            switch(rcSessionInfo) {
                case 0: break;
                case 1: rc = 21; break;
                case 2: rc = 22; break;
                default: rc = 242;
            }
        } else {
            rc = 0;
        }
    }

    public int getRc() {
        return rc;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPort() {
        return port;
    }
}
