interface Document {
    String Save(String content);
}

class PdfDocument implements Document {
    @Override
    public String Save(String Docu) {
        return "This Document " + Docu;
    }
}

class WordDocument implements Document {
    @Override
    public String Save(String Docu) {
        return "This Document " + Docu;
    }
}

class ExcelDocument implements Document {
    @Override
    public String Save(String Docu) {
        return "This Document " + Docu;
    }
}

class DocumentFactory {
    public static Document create(String method) {
        return switch (method) {
            case "Pdf" -> new PdfDocument();
            case "Word" -> new WordDocument();
            case "Excel" -> new ExcelDocument();
            default -> throw new IllegalArgumentException("Unknown document type: " + method);
        };

    }
}

public class Editorlient {
    public static void main(String[] args) {
        Document Pdf = DocumentFactory.create("Pdf");
        Document Word = DocumentFactory.create("Word");
        Document Excel = DocumentFactory.create("Excel");

        System.out.println("Save as " + Pdf.Save("PDF content"));
        System.out.println("Save as " + Word.Save("Word content"));
        System.out.println("Save as " + Excel.Save("Excel content"));

    }
}
