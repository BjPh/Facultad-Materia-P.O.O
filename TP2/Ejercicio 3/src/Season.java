public class Season {
    private final Episode[] episodes;

    public Season(Episode[] episodesAmount){
        this.episodes= episodesAmount;
    }

    public int getAmountEpisodes(){
        return episodes.length;
    }

    public int getEpisodesWatched(){
        int watched=0;
        for (Episode episode : episodes) {
            if (episode.isFlag()) {
                watched++;
            }
        }
        return watched;
    }

    public double getSeasonRating(){
        int episodesAmount = episodes.length;
        int totalRating= 0;
        for(Episode episode:episodes){
            if(episode.getRating()!= -1){
                totalRating=totalRating+episode.getRating();
            }
        }
        return ((double) totalRating /episodesAmount);
    }

    public boolean allSeasonWatched(){
        for(Episode episode: episodes){
            if (!episode.isFlag()){
                return false;
            }
        }
        return true;
    }

}
