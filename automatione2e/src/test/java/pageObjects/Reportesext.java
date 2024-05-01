package pageObjects;

import com.relevantcodes.extentreports.ExtentReports;

public class Reportesext {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "Reportes-Automatizacion/reportePruebasRegresion.html";
		extent = new ExtentReports(Path, false);
		extent
		.addSystemInfo("Selenium Version", "4.17.0")
		.addSystemInfo("Platform", "Mac");
		return extent;
	}
	public static ExtentReports getInstancefail() {
		ExtentReports extent;
		String Path = "Reportes-Automatizacionfail/reportePruebasRegresion.html";
		extent = new ExtentReports(Path, false);
		extent
		.addSystemInfo("Selenium Version", "4.17.0")
		.addSystemInfo("Platform", "Mac");
		return extent;
	}

}
