package com.example.android_application;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData  extends AsyncTask<Void,Void,Void> {
    String data="";
    String dataParsed="";
    String singleParsed="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://pastebin.com/raw/8pLisiBm");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while (line!=null){
                line=bufferedReader.readLine();
                data=data+line;
            }
            JSONArray JA=new JSONArray(data);
            for (int i=0;i<JA.length();i++){
                JSONObject JO= (JSONObject) JA.get(i);
                singleParsed = "Name: "+JO.get("name")+"\n"+
                        "Profession: "+JO.get("profession")+"\n"+
                        "Born :"+JO.get("born")+"\n"+
                        "Nationality: "+JO.get("nationality")+"\n"+
                        "Best known books :"+JO.get("books")+"\n";
                dataParsed = dataParsed+singleParsed+"\n";
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Authors.data.setText(this.dataParsed);
    }
}
