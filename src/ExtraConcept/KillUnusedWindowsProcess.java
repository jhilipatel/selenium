package ExtraConcept;

import org.openqa.selenium.os.WindowsUtils;

public class KillUnusedWindowsProcess {

	public static void main(String[] args) 
	{
		WindowsUtils.killByName("AsusLinkRemote.exe");
		System.out.println(WindowsUtils.thisIsWindows());

	}

}
