public enum QuestionType {
    Blurb,
    TickBox,
    CheckBox;

    public Question getQuestion(AbstractQuestionTypeVisitor visitor) {
        return visitor.get(this);
    }

    @Override
    public String toString() {
        return this.name();
    }
}
