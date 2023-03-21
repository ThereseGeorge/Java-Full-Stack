package com.ani.funif;


public class App {
    public static <ImageUploader> void main(String[] args) throws Exception {
        ImageUploader up = new ImageUploader();

        up.select( imageTask -> {
            System.out.println("✅ Image Selection Completed ");

            up.compress( compressTask -> { 
                System.out.println("✅ Image Compression Completed ");

                up.upload( uploadTask -> {
                    System.out.println("✅ Image Upload Completed ");
                });
                
            });
        });
        
    }
}
