public class Main {
    public static void main(String[] args) {
        var navigator = new FileNavigator();

        FileData data00;
        data00 = new FileData();
        data00.Name = "test.java";
        data00.Path = "~/lesson6/data/01/";
        data00.Size = 1024;
        navigator.add(data00);

        FileData data01;
        data01 = new FileData();
        data01.Name = "test01.java";
        data01.Path = "~/lesson6/data/01/";
        data01.Size = 1024 / 2;
        navigator.add(data01);

        FileData data02;
        data02 = new FileData();
        data02.Name = "test02.java";
        data02.Path = "~/lesson6/data/02/";
        data02.Size = 1024 / 2 / 2;
        navigator.add(data02);

        //find
        var path = "~/lesson6/data/01/";
        var size = 1024 / 2;

        var result = navigator.find(path, size);
        for (var fileData : result)
            System.out.println("--find--\nfind files\nfile: " + fileData.Name + "\npath: "
                    + fileData.Path + "\nsize: " + fileData.Size + "\n------");

        //remove
        path = "~/lesson6/data/01/";
        navigator.remove(path);
        var keys = navigator.Files.keySet();
        for (var key : keys)
            System.out.println("--remove--\nfiles in navigator\npath: " + key + "\n--------");

    }
}
