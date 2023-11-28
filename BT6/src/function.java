import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class function {
    public static void file(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file/account.txt"));
            StringBuilder content = new StringBuilder();
            String line;

            // Đếm số dòng trong tệp để xác định kích thước mảng
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
                lineCount++;
            }
            reader.close();

            // Tạo mảng để lưu trữ dòng từ tệp
            String[] s = new String[lineCount];

            // Mở lại tệp và đọc dòng vào mảng
            reader = new BufferedReader(new FileReader("file/account.txt"));
            int n = 0;
            while ((line = reader.readLine()) != null) {
                s[n] = line;
                n++;
            }
            reader.close();

            // In ra mảng dòng đã đọc
            for (String str : s) {
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }
    }

}
