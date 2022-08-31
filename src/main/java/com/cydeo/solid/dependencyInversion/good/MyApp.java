package com.cydeo.solid.dependencyInversion.good;

import com.cydeo.solid.dependencyInversion.bad.UserReader;

import java.io.Reader;

public class MyApp {

    public static void read(Reader reader) {

        UserReader userReader = new UserReader(reader);

        userReader.getUsername();

    }
}
