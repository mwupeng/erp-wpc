package com.erpSys.main.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Log4jFile extends TimerTask {

	@Override
	public void run() {
		deleteAllFiles(10);
	}

	/**
	 * 定时器
	 * 
	 * @param day
	 */
	public void TimerDel(int day) {
		Timer timer = new Timer();
		long ms = day * (1000 * 60 * 60 * 24);
		timer.schedule(new Log4jFile(), 0, ms);
	}

	/**
	 * 封装
	 */
	private void deleteAllFiles(int day) {
		File file = new File("D://logs//" + Retime(day));
		deleteAllFilesOfDir(file);
	}

	/**
	 * 删除文件夹
	 * 
	 * @param path
	 * @return
	 */
	public void deleteAllFilesOfDir(File path) {
		// 判断是否存在
		if (!path.exists())
			return;
		if (path.isFile()) {
			path.delete();
			return;
		}
		path.delete();
	}

	/**
	 * 
	 * @param day 需要返回的天数
	 * @return 返回天数
	 */
	public String Retime(int day) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -day);
		date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String str = format.format(date);
		return str;

	}

}
