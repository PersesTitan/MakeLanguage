package make;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;


public class MakeLanguage {

    //args = main 에서 가져옴
    //extension = 확장자 입력
    //difCase = 확장자 대소문자 구분 허용
    public static String getURL(@NotNull String[] args, @NotNull String extension, boolean difCase) throws IOException {
        String filePath = args[0];
        File file = new File(filePath);
        if (!file.canRead()) throw new IOException("파일을 읽을 수 없습니다.");
        if (difCase) {
            extension = extension.toLowerCase(Locale.ROOT);
            if (!file.getName().toLowerCase(Locale.ROOT).endsWith(extension)) throw new IOException("확장자 오류");
        } else {
            if (!file.getName().endsWith(extension)) throw new IOException("확장자 오류");
        }

        StringBuilder TotalText = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String lines;
            while ((lines = reader.readLine()) != null) TotalText.append(lines).append("\n");
        } return TotalText.toString();
    }

    public static void endCode() {
        try {
            System.in.read();
        } catch (Exception ignored) {}
    }
}
