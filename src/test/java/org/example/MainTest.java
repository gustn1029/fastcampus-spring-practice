package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
//        given
        String[] arg = {"3","1","2"};

//        when & then
        Main.main(arg);
    }
}