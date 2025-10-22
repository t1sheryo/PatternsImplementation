package visitor;

import model.JsonDocument;
import model.XmlDocument;

public interface Visitor {
    void visitDocument(JsonDocument document);
    void visitDocument(XmlDocument document);
}
