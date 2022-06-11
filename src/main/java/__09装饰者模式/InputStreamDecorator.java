package __09装饰者模式;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wxg
 * @date 2022/5/27-21:43
 * @quotes 小不忍则乱大谋
 */
public class InputStreamDecorator {
    public static void main(String[] args) throws IOException {
        final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/java/__09装饰者模式/成本递归计算.png"));
        System.out.println(dataInputStream.read());
        dataInputStream.close();
    }
}
