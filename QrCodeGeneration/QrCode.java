package QrCodeGeneration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QrCode {
    public static void main(String[] args) throws Exception {
        String data = "https://quickkut.onrender.com/";
        String path = "qrcode.png";

        BitMatrix matrix = new MultiFormatWriter().encode(dat, BarcodeFormat.QR_CODE, 300,300);
        Path filePath = FileSystems.getDefault().getPath(path);
        MatrixToImageWriter.writeToPath(matrix, "PNG", filePath);

        System.out.println("QR code generated: " + path);
    }
}
