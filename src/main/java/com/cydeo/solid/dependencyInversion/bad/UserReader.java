package com.cydeo.solid.dependencyInversion.bad;

import com.cydeo.solid.dependencyInversion.good.Reader;
import org.xml.sax.XMLReader;

public class UserReader {

    private Reader reader;

    public UserReader(Reader reader) {
        this.reader = reader;
    }

    public String getUsername() {
        return reader.getUsername();
    }

}
