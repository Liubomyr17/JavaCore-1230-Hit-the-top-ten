package com.company;

/*

1230 Hit the top ten
Add another method so that the program displays the number 10.
Hint:
use method overload.
Requirements:
1. The Solution class must contain three methods.
2. The overloaded transformValue method should double the number passed to it.
3. The type and value of variable i cannot be changed.
4. The type and value of variable x cannot be changed.
5. The display command cannot be changed.
6. The main method should call the transformValue method only once.
7. The program should display the number 10.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {

        return i * i;
    }
    public static int transformValue(Integer i) {
        return i * 2;
    }
}


