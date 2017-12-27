package com.example.vikas.quizee;

/**
 * Created by VIKAS on 12/28/2017.
 */


public class TrueFalse {

     private int mQuestionID;
    private boolean mAnswer;
    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }


    public boolean isAnswer() {
        return mAnswer;
    }

}