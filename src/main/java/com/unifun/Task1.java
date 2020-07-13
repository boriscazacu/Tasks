package com.unifun;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.DecimalFormat;

public class Task1 {
    private static final Logger LOGGER = Logger.getLogger(Task1.class);

    public String getCandidat(int N, int M){
        double allPerm = N+M;
        DecimalFormat formatter = new DecimalFormat("####.0000");
        if (N > M){
            return "A "+formatter.format( (N-M)/allPerm*100)+"%";
        }else if (N < M){
            return "B "+formatter.format((M-N)/allPerm*100)+"%";
        }else {
            return "draw";
        }
    }

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Task1 task1 = new Task1();
        LOGGER.info(task1.getCandidat(2,1));
        LOGGER.info(task1.getCandidat(455,821));
        LOGGER.info(task1.getCandidat(1548,733));
    }
}
