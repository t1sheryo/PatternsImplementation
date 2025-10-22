package model;

import visitor.Visitor;

public interface Document {
    void accept(Visitor visitor);
}
