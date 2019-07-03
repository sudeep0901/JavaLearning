package org.sudeep;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.URIReferenceException;

public class StreamsZipFile {

	public static void main(String[] args) throws IOException,
			URIReferenceException, URISyntaxException {
		// TODO Auto-generated method stub

		String[] data = { "Line 1", "Line 2 2", "Line 3 3 3", "Line 4 4 4 4",
				"Line 5 5 5 5" };

		try (FileSystem zipFS = openZip(Paths.get("myData.zip"))) {
			copyToZipfile(zipFS);
			writeToFileInzip1(zipFS, data);
			writeToFileInzip2(zipFS, data);
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + " - "
					+ e.getMessage());
		}

	}

	private static FileSystem openZip(Path zipPath) throws IOException,
			URIReferenceException, URISyntaxException {

		Map<String, String> providerProps = new HashMap<>();
		providerProps.put("create", "true");

		URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);

		FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);

		return zipFs;

	}

	private static void copyToZipfile(FileSystem zipFs) throws IOException {
		Path sourceFile = Paths.get("file1.txt");

		// Path sourceFile = FileSystems.getDefault().getPath("file1.txt");

		Path destFile = zipFs.getPath("/fileCopied.txt");
		Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
	}

	@SuppressWarnings("unused")
	private static void writeToFileInzip1(FileSystem zipFs, String[] data)
			throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(zipFs
				.getPath("/newFile1.txt"))) {
			for (String d : data) {
				writer.write(d);
				writer.newLine();
			}
		}
	}
	
	
	@SuppressWarnings("unused")
	private static void writeToFileInzip2(FileSystem zipFs, String[] data)
			throws IOException {
	 
		Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data),
				Charset.defaultCharset(), StandardOpenOption.CREATE);
	}
}
