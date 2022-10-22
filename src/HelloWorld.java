/*public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World !");
   }
}
*/
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorld {
  public static final String DEST = "hello.pdf";
  
  public static void main(String args[]) throws IOException {
    PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
    Document document = new Document(pdf);
    String line = "Hello! Welcome to iTextPdf";
    document.add(new Paragraph(line));
    document.close();

    System.out.println("Awesome PDF just got created.");
  }
}
