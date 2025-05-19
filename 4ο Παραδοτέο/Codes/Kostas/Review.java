// Review Class
class Review {
    private int reviewId;
    private String comment;
    private int rating;
    private String revieweeType; // "Ticket" or "Accommodation"
    private int revieweeId;

    public Review(int reviewId, String comment, int rating, String revieweeType, int revieweeId) {
        this.reviewId = reviewId;
        this.comment = comment;
        this.rating = rating;
        this.revieweeType = revieweeType;
        this.revieweeId = revieweeId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    public String getRevieweeType() {
        return revieweeType;
    }

    public int getRevieweeId() {
        return revieweeId;
    }
}
