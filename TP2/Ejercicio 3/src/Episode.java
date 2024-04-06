public class Episode {
    private final String title, description;
    private boolean flag=false;
    private int rating= -1;

    public Episode(String aTitle, String aDescription){
        this.title= aTitle;
        this.description= aDescription;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int aRate){
        if (aRate<1 || aRate>5) {
            throw new  IllegalArgumentException("Rate out of range");
        }else {
            this.rating = aRate;
        }
    }

}
