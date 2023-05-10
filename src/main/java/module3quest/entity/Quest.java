package module3quest.entity;

import module3quest.repository.*;

import java.util.HashMap;
import java.util.HashSet;

public class Quest {

    private String firstQuestionId;
    private HashMap<String, Question> questQuestions;
    private HashMap<String, Completion> questCompletions;
    private HashMap<String, Answer> questAnswers;




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







