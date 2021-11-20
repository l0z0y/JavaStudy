package recursion;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        File file = new File("C:");
       chekFile(file,"data");



    }
    public static void chekFile( File s , String filename ){
        if(s.isDirectory()){
            File[] files = s.listFiles();
            if(files != null&&files.length>0){
                for (File file : files) {
                    if(file.isFile()){
                        if(file.getName().equals(filename)){
                            System.out.println(file.getAbsolutePath());
                        }
                    }else{
                        chekFile(file,filename);
                    }
                }

            }
        }



    }
}
