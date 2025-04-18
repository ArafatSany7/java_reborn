class Movie {

    private String tittle, director;

    public Movie(String tittle, String director) {
        this.tittle = tittle;
        this.director = director;
    }

    public Movie() {
        this.tittle = "";
        this.director = "";
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}

public class c1 {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Cristhopher Nolan");
        Movie series = new Movie();

        series.setTittle("Interstellar");

        System.out.println(movie.getTittle());
        System.out.println(series.getTittle());
    }
}
