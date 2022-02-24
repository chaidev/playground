import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyTest2 {
    public static void main(String[] args) {
        String result = "";
        Map<String, Integer> resultMap = new HashMap<>();
        String input = "my.song.mpx 11b\nmy.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        String[] input2 = input.split("\n");

        // System.out.println(input2.length + ":" + Arrays.toString(input2));

        String[] musicExtensions = { "mp3", "aac", "flac" };
        String[] imageExtensions = { "jpg", "bmp", "gif" };
        String[] movieExtensions = { "mp4", "avi", "mkv" };
        //String[] otherExtensions = { "7z", "txt", "zip" };

        resultMap.put("music", 0);
        resultMap.put("images", 0);
        resultMap.put("movies", 0);
        resultMap.put("other", 0);

        mainloop: for (String fileString : input2) {
            String[] file2Size = fileString.split(" ");
            String extension = file2Size[0].substring(file2Size[0].lastIndexOf(".") + 1);
            String size = file2Size[1].substring(0, file2Size[1].indexOf("b"));

            for (String musicExtension : musicExtensions) {
                if (musicExtension.equals(extension)) {
                    Integer total = resultMap.get("music");
                    resultMap.put("music", total + Integer.parseInt(size));
                    continue mainloop;
                }
            }

            for (String imageExtension : imageExtensions) {
                if (imageExtension.equals(extension)) {
                    Integer total = resultMap.get("images");
                    resultMap.put("images", total + Integer.parseInt(size));
                    continue mainloop;
                }
            }

            for (String movieExtension : movieExtensions) {
                if (movieExtension.equals(extension)) {
                    Integer total = resultMap.get("movies");
                    resultMap.put("movies", total + Integer.parseInt(size));
                    continue mainloop;
                }
            }

            // Other

            Integer total = resultMap.get("other");
            resultMap.put("other", total + Integer.parseInt(size));
        }

        result += "music" + " " + resultMap.get("music") + "b\n";
        result += "images" + " " + resultMap.get("images") + "b\n";
        result += "movies" + " " + resultMap.get("movies") + "b\n";
        result += "other" + " " + resultMap.get("other") + "b";

        System.out.println(result);
    }
}
