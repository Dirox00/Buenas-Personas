package main;

import java.util.ArrayList;

import java.net.URLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class URLManager {

	private URL url;

	public URLManager () {}
	
	public URLManager (String path) {
		setURL(path);
	}	

	public void setURL (String path) {
		try {
			this.url = new URL(path);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> read () {
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			URLConnection urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String string;
			while ((string = bufferedReader.readLine()) != null) {
				arrayList.add(string + '\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}

}
