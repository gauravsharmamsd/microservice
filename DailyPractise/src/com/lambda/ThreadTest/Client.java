package com.lambda.ThreadTest;
public class Client {

public static void main( String args [] ) {

    String filename = "test.txt";
    String filename2 = "test.txt";

    Reader reader = new Reader( filename ) ; 
    Writer writer = new Writer( filename2 ) ;

    while(true) {
        reader.run();
        writer.run();
    }

  }
} 

 class Writer implements Runnable {

public String filename; 

public Writer( String filename ) {
    this.filename = filename; 
}

@Override
public void run() { 

    synchronized( this.filename ) {
        System.out.println( "writing to a file:" + this.filename );  
    }  

 }
}


 class Reader implements Runnable {

public String filename; 

public Reader( String filename ) {
    this.filename = filename; 
}

@Override
public void run() { 

    synchronized( this.filename ) {
        System.out.println( "reading a file:" + this.filename );
    } 

}
}