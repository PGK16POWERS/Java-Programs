package QrCodeGeneration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QrCodeGen {
    public static void main(String[] args) {
        String data = "https://Khotsi.com";
        String filePath = "qrcode.png";
        int width = 300, height = 300;

        try {
            generateQRCode(data, filePath, width, height);
            System.out.println("Qr code Generated: " + filePath);
        } catch (WriterException | Exception e) {
            e.printStackTrace();
        }
    }

    public static <QRCodeWriter, BitMatrix> void generateQRCode(String text, String filePath, int width, int height) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    
}
