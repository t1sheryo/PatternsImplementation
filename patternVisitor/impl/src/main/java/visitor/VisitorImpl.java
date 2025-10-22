package visitor;

import model.JsonDocument;
import model.XmlDocument;

public class VisitorImpl implements Visitor {
    @Override
    public void visitDocument(JsonDocument document) {
        System.out.println("Visiting JSON document: " + document.getID());
    }

    @Override
    public void visitDocument(XmlDocument document) {
        System.out.println("Visiting XML document: " + document.getID());
    }
}
