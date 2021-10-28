import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    static final String FILEPATH ="myFile.TXT";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile("E:/InteliJ/JavaExam/src/test1.txt", 0, 18)));
            writeToFile(FILEPATH, "Today is Tuesday!!", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static byte[] readFromFile(String filePath, int position, int size)  throws IOException {
        RandomAccessFile file = new RandomAccessFile("E:/InteliJ/JavaExam/src/test1.txt", "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
    private static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile("E:/InteliJ/JavaExam/src/test1.txt", "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
