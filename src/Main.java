import java.io.File;
import java.io.IOException;
import java.util.Date;

class Main {
    public static void main(String[] args) {

        try {
            File catalog = new File("testnext");
            catalog.mkdir();

            File catalog2 = new File("testnext2" + File.separator + "next" + File.separator + "test");
            catalog2.mkdirs();

            File file4 = new File("testnext2" + File.separator + "next" + File.separator + "test", "test.txt");
            if (!file4.exists()) ;
            file4.createNewFile();

            File file2 = new File("test2.txt");
            if (!file2.exists()) ;
            file2.createNewFile();

            File file = new File("test.txt");


            if (!file.exists()) ;
            file.createNewFile();
            System.out.println("-----file------");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println("Can write? " + file.canWrite());
            System.out.println("Can read? " + file.canRead());
            System.out.println("Can execute? " + file.canExecute());
            System.out.println("Is file? " + file.isFile());
            System.out.println("is directory? " + file.isDirectory());
            System.out.println("Last modification " + new Date(file.lastModified()));
            System.out.println("Length file with byte " + file.length());
            file.delete();
            System.out.println("-----file2------");
            System.out.println("Can write? " + file2.canWrite());
            System.out.println("Is hidden? " + file2.isHidden());
            System.out.println("Last modification " + new Date(file2.lastModified()));
            System.out.println("-----catalog-----");
            System.out.println("Is directory? " + catalog.isDirectory());

            Main.writeAllPaths(new File(System.getProperty("user.dir")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));

    }

    static void writeAllPaths(File namePath) {
        String[] nameFilesAndCatalogs = namePath.list();
        //System.out.println(namePath.getPath());
        for (int i = 0; i < nameFilesAndCatalogs.length; i++) {
            File p = new File(namePath.getPath(), nameFilesAndCatalogs[i]);

            //if (p.isFile())
            //System.out.println(p.getPath());

            if (p.isDirectory())
                writeAllPaths(new File(p.getPath()));

        }


    }
}

