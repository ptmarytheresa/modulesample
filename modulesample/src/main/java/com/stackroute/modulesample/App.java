package com.stackroute.modulesample;

import com.stackroute.modulesample.service.DiagnosisService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 DiagnosisService service = new DiagnosisService();
         service.diagnose("Fatigue");
    }
}
