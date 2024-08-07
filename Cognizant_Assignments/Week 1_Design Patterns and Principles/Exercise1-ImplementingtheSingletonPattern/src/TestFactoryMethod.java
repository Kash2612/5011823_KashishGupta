public class TestFactoryMethod {
    public static void main(String[] args) {

        DocumentFactory word = new WordFactory();
        Document wordFile=word.createDocument();
        wordFile.open();
        wordFile.save();
        wordFile.close();

        DocumentFactory pdf=new PDFFactory();
        Document pdfFile= pdf.createDocument();
        pdfFile.open();
        pdfFile.close();
        pdfFile.save();

        DocumentFactory excel=new SheetFactory();
        Document excelFile= excel.createDocument();
        excelFile.open();
        excelFile.save();
        excelFile.close();

    }
}
