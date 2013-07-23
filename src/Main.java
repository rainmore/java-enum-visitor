public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        QuestionTypeVisitor visitor = new QuestionTypeVisitor();
        QuestionType type = QuestionType.Blurb;
        Question question = type.getQuestion(visitor);

        System.out.println(question.toString());

    }
}
