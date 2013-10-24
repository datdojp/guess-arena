package jp.co.okayama.guessarena.model;

public class MatchOptionSet {
    private int mWordLengthMin;
    private int mWordLengthMax;
    private int mAnswerTimeInMinutes;
    private int mHintNumber;
    private int mGuessNumber;
    private int mCorrectionPercentages;
    private int mRetryNumber;

    public MatchOptionSet(int wordLengthMin, int wordLengthMax,
            int answerTimeInMinutes, int hintNumber, int guessNumber,
            int correctionPercentages, int retryNumber) {
        super();
        mWordLengthMin = wordLengthMin;
        mWordLengthMax = wordLengthMax;
        mAnswerTimeInMinutes = answerTimeInMinutes;
        mHintNumber = hintNumber;
        mGuessNumber = guessNumber;
        mCorrectionPercentages = correctionPercentages;
        mRetryNumber = retryNumber;
    }

    public int getWordLengthMin() {
        return mWordLengthMin;
    }
    public void setWordLengthMin(int wordLengthMin) {
        mWordLengthMin = wordLengthMin;
    }
    public int getWordLengthMax() {
        return mWordLengthMax;
    }
    public void setWordLengthMax(int wordLengthMax) {
        mWordLengthMax = wordLengthMax;
    }
    public int getAnswerTimeInMinutes() {
        return mAnswerTimeInMinutes;
    }
    public void setAnswerTimeInMinutes(int anserTimeInMinutes) {
        mAnswerTimeInMinutes = anserTimeInMinutes;
    }
    public int getHintNumber() {
        return mHintNumber;
    }
    public void setHintNumber(int hintNumber) {
        mHintNumber = hintNumber;
    }
    public int getGuessNumber() {
        return mGuessNumber;
    }
    public void setGuessNumber(int guessNumber) {
        mGuessNumber = guessNumber;
    }
    public int getCorrectionPercentages() {
        return mCorrectionPercentages;
    }
    public void setCorrectionPercentages(int correctionPercentages) {
        mCorrectionPercentages = correctionPercentages;
    }
    public int getRetryNumber() {
        return mRetryNumber;
    }
    public void setRetryNumber(int retryNumber) {
        mRetryNumber = retryNumber;
    }
}
