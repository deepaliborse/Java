import java.io.IOException;
import java.nio.file.*;

public class Question20 
{

public static void main(String[] args)

throws IOException
{
// create object of Path
Path path = Paths.get("/home/deepali/Downloads/Installation&Programs.docx");


// get File Size

long result;

result = Files.size(path);

System.out.println("File " + path + " Size = " + result + " bytes");

}
}

