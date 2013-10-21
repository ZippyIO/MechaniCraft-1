package Will11690.mod.MechaniCraft.Capes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import Will11690.mod.MechaniCraft.Common.DevCapes;
import argo.jdom.JdomParser;

public class DevCapesVersionChecker implements Runnable {

	private static final String versionFileURL = "http://raw.github.com/Jadar/DeveloperCapesAPI/master/version";

	private byte result = 0;
	
	private static final byte ERROR = 0;
	private static final byte OLD = 1;
	private static final byte CURRENT = 2;

	@Override
	public void run() {

		try {

			URL url = new URL(versionFileURL);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			double version = Double.valueOf(new JdomParser().parse(reader).getStringValue("version"));
			
			if(version > DevCapes.version)
				result = OLD;
			else if(version == DevCapes.version)
				result = CURRENT;
			else
				result = ERROR;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public byte getResult() {
		return result;
	}
}
