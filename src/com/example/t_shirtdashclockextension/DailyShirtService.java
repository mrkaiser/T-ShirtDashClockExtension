package com.example.t_shirtdashclockextension;

import java.io.IOException;

import org.jsoup.nodes.Document;

import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

public class DailyShirtService extends DashClockExtension {

	@Override
	protected void onUpdateData(int arg0) {
		Document teeFury;
		try {
			teeFury = ShirtNameUtil.getTeeFury();
			String teeFuryName = ShirtNameUtil.parseFromTeeFury(teeFury);
			publishUpdate(new ExtensionData().status(teeFuryName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
