package module3quest.entity;

import module3quest.repository.*;

public class Quest {

    private String firstQuestionId;

    public Quest(String firstQuestionId) {
        this.firstQuestionId = firstQuestionId;
    }

    public Question getFirstQuestion() {
        return QuestionRepository.getQuestionById(firstQuestionId);
    }

    public Answer getAnswerById(String answerId) {
        return AnswerRepository.getAnswerById(answerId);
    }

}







