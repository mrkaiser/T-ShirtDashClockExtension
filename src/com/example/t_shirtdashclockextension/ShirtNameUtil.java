package com.example.t_shirtdashclockextension;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public final class ShirtNameUtil {

	public static String parseFromTeeFury(Document teeFury) {
		//TODO add logic for 
		Elements zoomPicDiv = teeFury.select("#zoom-pic");
		Elements image = zoomPicDiv.select("img");
		String name = image.attr("alt");
		return name;
	}
	
	public static String parseFromWoot(){
		return "";
	}
	
	public static Document getTeeFury() throws IOException{
		Document teeFuryDawtCom = Jsoup.connect("http://teefury.com").get();
		return teeFuryDawtCom;
	}
}
