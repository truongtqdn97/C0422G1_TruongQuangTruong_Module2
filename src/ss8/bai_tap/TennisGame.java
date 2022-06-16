package ss8.bai_tap;

public class TennisGame {
    public static String tieScore(int scorePlayer){
        String score = "";
        switch (scorePlayer) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
    public static String advantagePlayer(int scorePlayer1, int scorePlayer2){
        String score = "";
        int minusScore = scorePlayer1 - scorePlayer2;
        if (minusScore == 1) score = "Advantage player1";
        else if (minusScore == -1) score = "Advantage player2";
        else if (minusScore >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore;
        if (scorePlayer1 == scorePlayer2) {
            tieScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            advantagePlayer(scorePlayer1,scorePlayer2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}