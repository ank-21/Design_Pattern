import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    List<FileSystem> fileSystemList;
    String directoryName;
    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    public void ls(){
        System.out.println("Directory name is " + directoryName);
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }
}
