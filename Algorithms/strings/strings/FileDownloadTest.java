package strings;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * @author Singaram Subramanian
 */
public class FileDownloadTest {

	public static void main(String[] args) {

		// Make sure that this directory exists
		String dirName = "C:\\FileDownload";

		try {

			System.out.println("Downloading \'Maven, Eclipse and OSGi working together\' PDF document...");

			saveFileFromUrlWithJavaIO("/Users/vinayak/test1.log",
					"https://hivevalidationrgstorage.blob.core.windows.net/graph-engine-output/david_graph_engine.log?sv=2018-03-28&ss=bfqt&srt=sco&sp=rwdlacup&se=2099-10-05T18:38:49Z&st=2019-10-05T10:38:49Z&spr=https&sig=EAFOW3OQlwNMVxVyNyMRzNMmBYBhiF9HDr9TVHBZeaw%3D");

			System.out.println("Downloaded \'Maven, Eclipse and OSGi working together\' PDF document.");

			System.out.println("Downloading \'InnoQ Web Services Standards Poster\' PDF document...");

			/*
			 * saveFileFromUrlWithCommonsIO( dirName +
			 * "\\innoq_ws-standards_poster_2007-02.pdf",
			 * "http://singztechmusings.files.wordpress.com/2011/08/innoq_ws-standards_poster_2007-02.pdf"
			 * );
			 * 
			 * System.out.
			 * println("Downloaded \'InnoQ Web Services Standards Poster\' PDF document.");
			 */

			try {

				File f = new File("/Users/vinayak/test1.log");

				BufferedReader b = new BufferedReader(new FileReader(f));

				String readLine = "";

				System.out.println("Reading file using Buffered Reader");

				while ((readLine = b.readLine()) != null) {

					if (readLine.contains("WARNING")) {
						System.out.println(readLine);
					}
				}

				System.out.println("Completed file reading  using Buffered Reader");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

// Using Java IO
	public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
			throws MalformedURLException, IOException {
		BufferedInputStream in = null;
		FileOutputStream fout = null;
		try {
			in = new BufferedInputStream(new URL(fileUrl).openStream());
			fout = new FileOutputStream(fileName);

			byte data[] = new byte[1024];
			int count;
			while ((count = in.read(data, 0, 1024)) != -1) {
				fout.write(data, 0, count);
			}
		} finally {
			if (in != null)
				in.close();
			if (fout != null)
				fout.close();
		}
	}

}
