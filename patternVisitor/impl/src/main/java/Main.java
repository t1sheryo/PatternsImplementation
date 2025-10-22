import model.JsonDocument;
import model.XmlDocument;
import visitor.VisitorImpl;

public class Main {
    public static void main(String[] args) {
        JsonDocument jsonDocument = new JsonDocument();
        XmlDocument xmlDocument = new XmlDocument();

        VisitorImpl visitor = new VisitorImpl();
        visitor.visitDocument(jsonDocument);
        visitor.visitDocument(xmlDocument);
    }
}
