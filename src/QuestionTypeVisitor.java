public class QuestionTypeVisitor extends AbstractQuestionTypeVisitor {

    public Question get(QuestionType type) {
        Question question = null;
        switch (type) {
            case Blurb:
                question = new Blurb();
                break;
            case CheckBox:
                question = new CheckBox();
                break;
            case TickBox:
                question = new TickBox();
                break;
        }
        return question;
    }
}
