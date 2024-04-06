import java.util.Scanner;

public class Serie {
    private String title, description, creator, genre;
    private final Season[] seasons;

    /**public Serie(String aTitle, String aDescription, String aCreator,
                 String aGenre,int seasonsAmount, int episodesAmount){

        this.title= aTitle;
        this.description= aDescription;
        this.creator= aCreator;
        this.genre= aGenre;
        this.seasons= new Season[seasonsAmount];
        for (int i = 0; i < seasonsAmount; i++) {
            seasons[i]= new Season(episodesAmount);
        }
    }*/

    public Serie(String aTitle, String aDescription, String aCreator,
                 String aGenre,Season[] seasonsAmount){

        this.title= aTitle;
        this.description= aDescription;
        this.creator= aCreator;
        this.genre= aGenre;
        this.seasons= seasonsAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotalEpisodesWatched(){
        int watched=0;
        for(Season season: seasons){
            watched= season.getEpisodesWatched();
        }
        return watched;
    }

    public double getTotalSerieRating(){
        double seasonRating=0;
        int seasonsAmount= seasons.length;
        for (Season season: seasons){
            seasonRating=seasonRating+season.getSeasonRating();
        }
        return ((double) seasonRating/seasonsAmount);
    }

    public boolean allSerieWatched(){
        for(Season season: seasons){
            if(!season.allSeasonWatched()){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la serie");
        String aTitle= userIn.nextLine();

        System.out.println("Ingrese la descripcion de la serie");
        String aDescription= userIn.nextLine();

        System.out.println("Ingrese el creador de la serie");
        String aCreator= userIn.nextLine();

        System.out.println("Ingrese el genero de la serie");
        String aGenre= userIn.nextLine();

        //Creacion de Temporadas
        System.out.println("ingrese la cantidad de temporadas");
        int seasonsAmount= userIn.nextInt();
        Season[] seasons= new Season[seasonsAmount];
        for (int i = 0; i <seasonsAmount ; i++) {
            //Creacion de los Episodios por Temporada
            System.out.println("Ingrese la cantidad de episodios para la temporada "+ i);
            int episodesAmount = userIn.nextInt();
            Episode[] episodes = new Episode[episodesAmount];
            String aEpisodeTitle, aEpisodeDescription;

            for (int y = 0; y < episodesAmount; y++) {
                System.out.println("Ingrese el titulo del episodio " + (y));
                aEpisodeTitle = userIn.nextLine();
                System.out.println("Ingrese la descripcion de episodio");
                aEpisodeDescription = userIn.nextLine();
                episodes[y] = new Episode(aEpisodeTitle, aEpisodeDescription);
            }
            seasons[i]=new Season(episodes);
        }


        Serie aSerie= new Serie(aTitle,aDescription,aCreator,aGenre,seasons);

    }
}
