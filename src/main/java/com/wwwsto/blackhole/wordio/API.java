package com.wwwsto.blackhole.wordio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.extractor.POITextExtractor;
import org.apache.poi.ooxml.extractor.ExtractorFactory;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;

public interface API {

	default String extractText(String fileName) throws IOException, OpenXML4JException, XmlException {
		FileInputStream fis = new FileInputStream(fileName);
		// Firstly, get an extractor for the Workbook
		POITextExtractor textExtractor = ExtractorFactory.createExtractor(fis);
		return textExtractor.getText();
	}
}
