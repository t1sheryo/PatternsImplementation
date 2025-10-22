package model;

import visitor.Visitor;

public class XmlDocument implements Document {
    private static int ID = 0;
    private final int id = ++ID;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDocument(this);
    }

    public int getID() { return id; }
}
