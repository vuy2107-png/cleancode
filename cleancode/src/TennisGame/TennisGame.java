package TennisGame;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String score = "";

        if (score1 == score2) {
            score = getEqualScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = getAdvantageOrWin(score1, score2);
        } else {
            score = getNormalScore(score1, score2);
        }

        return score;
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int scoreDifference = score1 - score2;

        if (scoreDifference == 1) return "Advantage player1";
        else if (scoreDifference == -1) return "Advantage player2";
        else if (scoreDifference >= 2) return "Win for player1";
        else return "Win for player2";
    }

    private static String getNormalScore(int score1, int score2) {
        return getScoreTerm(score1) + "-" + getScoreTerm(score2);
    }

    private static String getScoreTerm(int score) {
        switch (score) {
            case LOVE:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            case FORTY:
                return "Forty";
            default:
                return "Invalid";
        }
    }

    // Demo test nhỏ để chạy thử
    public static void main(String[] args) {
        System.out.println(getScore("player1", "player2", 0, 0)); // Love-All
        System.out.println(getScore("player1", "player2", 1, 0)); // Fifteen-Love
        System.out.println(getScore("player1", "player2", 2, 2)); // Thirty-All
        System.out.println(getScore("player1", "player2", 4, 3)); // Advantage player1
        System.out.println(getScore("player1", "player2", 2, 4)); // Win for player2
    }
}
