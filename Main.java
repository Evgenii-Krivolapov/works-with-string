public class Main {
    private static WorksWithCharacter character = new WorksWithCharacter();
    private static final String text = "My text is big";
    public static void main(String[] args) {
        System.out.println(character.countDuplecateCharcter(text));
        //Результат работы: { =3, b=1, s=1, t=2, e=1, g=1, x=1, i=2, y=1, M=1}
        System.out.println(character.firstNonRepeartedCharacter(text));
        //Результат работы: M
        System.out.println(character.reverseWords(text));
        //Результат работы: yM txet si gib
    }
}
