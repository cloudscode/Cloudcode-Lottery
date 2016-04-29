package com.cloudcode.lottery.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cloudcode.framework.utils.IOUtils;
import com.cloudcode.framework.utils.UUID;

public class WebUtil {
	public static List<String> getURLCollection(String address) {
		List<String> list = new LinkedList<String>();
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			InputStreamReader input = new InputStreamReader(in, "UTF-8");
			BufferedReader buf = new BufferedReader(input);
			String nextLine = buf.readLine();

			while (nextLine != null) {
				list.add(nextLine);
				nextLine = buf.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main1(String[] args) {

		String address = "http://fjtc.com.cn/Line-3607?Type=OLD";
		List<String> list = getURLCollection(address);
		String buf = "";
		for (String str : list) {
			buf += str + "\n";
		}

		String szContent = "<html><table class=\"cpzs_table mt10\" ><tr><td>02088</td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"><span>2</span></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"><span>5</span></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"><span>9</span></td><td class=\"num1\" style=\"background:#DDF3FF\"><span>10</span></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#DDF3FF\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"><span class=\"spNum\">14</span></td><td class=\"num1\" style=\"background:#F8FFCB\"><span>15</span></td><td class=\"num1\" style=\"background:#F8FFCB\"><span>16</span></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#F8FFCB\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"><span>29</span></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td class=\"num1\" style=\"background:#E6EBFF\"></td><td>100</td><td>4:4</td><td>0</td><td>27</td></tr>";
		szContent += "</table></html>";
		Document doc = Jsoup.parse(buf.toString(), "UTF-8");
		// Document doc= Jsoup.parse(szContent,"UTF-8");
		File file = new File("c:\\txt.txt");
		if (file.exists()) {
			file.delete();
		}
		List<String> result = new ArrayList<String>();

		Elements trs1 = doc.select("table");
		int count = 1;
		for (int j = 0; j < trs1.size(); j++) {
			if (trs1.get(j).attr("class").equals("cpzs_table mt10")) {
				Elements trs = trs1.get(j).select("tr");
				for (int i = 0; i < trs.size(); i++) {
					if (trs.get(i).select("th").size() > 0) {
						continue;
					}
					String issue = trs.get(i).select("td").get(0).text();
					if (!"投注说明".equals(issue) && !"冷热图".equals(issue)) {
						System.out.println(issue);
						StringBuffer sb = new StringBuffer();
						sb.append("insert into lottery_history(id,issue,a,b,c,d,e,f,g,specialnum,serialnum)values(");
						sb.append("'");
						sb.append(UUID.generateUUID());
						sb.append("','");
						sb.append(issue);
						sb.append("',");
						Elements tds = trs.get(i).select("span");
						String spNum = "";
						for (int k = 0; k < tds.size(); k++) {
							if (!tds.get(k).attr("class").equals("spNum")) {
								String text = tds.get(k).text();
								System.out.println(text);
								sb.append("");
								sb.append(text);
								sb.append(",");
							} else {
								spNum = tds.get(k).text();
							}
						}
						sb.append("");
						sb.append(spNum);
						sb.append(",");
						sb.append(count);
						sb.append(");");
						System.out.println(sb.toString());
						result.add(sb.toString());
						count++;
					}
				}
			}
		}
		String bufs = "";
		for (String str : result) {
			bufs += str + "\n";
		}
		try {
			IOUtils.writeTxtFile(bufs.toString(), file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws ScriptException {
		     String val1="123@<中国>123@123@<中国心>123";
			 Pattern pattern=Pattern.compile("(@<(.*?)>)+");
			 Matcher matcher=pattern.matcher(val1);
			 while(matcher.find()){
				 System.out.println(matcher.group());
			 }
			 String param="11";
			 String condition="param==1?'123':'345'";
			 ScriptEngineManager engineManager = new ScriptEngineManager();  
	        ScriptEngine engine = engineManager.getEngineByName("JavaScript"); 
	        ScriptContext scriptContext=new SimpleScriptContext();
	        scriptContext.setAttribute("param", param, 100);
	        String val = engine.eval(condition, scriptContext).toString();
	        System.out.println(val);
	}
}