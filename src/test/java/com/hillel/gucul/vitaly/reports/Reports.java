package com.hillel.gucul.vitaly.reports;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.FileSystemNotFoundException;

/**
 * Created by insomnia on 21.07.17.
 */
public class Reports {

    @Test
    public  void test(){

        InvoceData data = new InvoceData();

        InvoiceDesign design = new InvoiceDesign(data);
        try {
            JasperReportBuilder report = design.build();
            report.toPdf(new FileOutputStream(new File("/home/insomnia/sonic/reports.pdf")));
        }catch (DRException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
