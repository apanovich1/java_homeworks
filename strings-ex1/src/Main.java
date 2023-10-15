/*На вход передать строку (будем считать, что это номер документа).
 Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.*/

public class Main {
    public static void main(String[] args) {
        StringProcessing document = new StringProcessing("1234-abc-5678-def-9j1i");
        document.GetNumbers("1234-abc-5678-def-9j1i");
        document.LetterReplace("1234-abc-5678-def-9j1i");
        document.GetLetters("1234-ABC-5678-def-9j1i");
        document.GetLettersUpper("1234-abc-5678-def-9j1i");
        document.ContainABC("1234-jkk-5678-def-9j1i");
        document.StartWithNumbersFive("5554-jkk-5678-def-9j1i");
        document.EndWithLettersAndNumbers("5554-jkk-5678-def-1a2b");
    }
}