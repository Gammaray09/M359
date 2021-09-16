package Unit3_Booleans_IfStatements.examples.review;



public class Review {
    private String reviewName;
    private String businessName;
    private int review;

    public Review(String reviewName, String businessName, int review) {
        this.reviewName = reviewName;
        this.businessName = businessName;
        this.review = review;
    }

    public String getReviewName() { return reviewName; }
    public void setReviewName(String reviewName) { this.reviewName = reviewName; }
    public String getBusinessName() { return businessName; }
    public void setBusinessName(String businessName) { this.businessName = businessName; }
    public int getReview() { return review; }
    public void setReview(int review) { this.review = review; }

    public String toString(){
        if(review == 5){
            return reviewName + "," + businessName + "," + review + "\n \t ** Highly recommended";
        } else if(review == 1){
            return reviewName + "," + businessName + "," + review + "\n \t ** Strongly discouraged";
        } else {
            return reviewName + "," + businessName + "," + review;
        }

    }
}
