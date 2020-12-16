package com.example.pertemuan5;

import java.util.ArrayList;

public class MoviesData {

    private String[] movieName = {
            "Tears of the Sun",
            "Kung Fu Hustle",
            "Furious 7",
            "Bumblebee",
            "Ready Player One",
            "Twilight",
            "X-Men: Apocalypse",
            "Exodus: Gods and Kings",
            "Pacific Rim",
            "Sniper: Ultimate Kill"
    };

    private String[] movieDesc = {
            "A Navy SEAL is sent to a war-torn African jungle to rescue a doctor, only to realize he must also save the refugees in the physician's care",
            "Sing, a mobster in 1940s China, longs to be as cool as the formally clad Axe Gang, a band of killers who rule Hong Kong, but can only pretend.",
            "A team of fast-driving outlaws has settled into normal lives, but a man with a vendetta chases them out of their complacency.",
            "Fleeing from the Decepticons in 1987, Bumblebee hides out on Earth. But after he befriends a sad teen, the battered Beetle’s foes are hot on his trail.",
            "In a world on the brink of collapse, a talented gamer takes the lead in a series of challenges to win ownership of a massive virtual reality universe.",
            "When Bella Swan moves in with her father, she starts school and meets Edward, a mysterious classmate who reveals himself to be a 108-year-old vampire.",
            "With mutants Apocalypse and Magneto intent on mankind's destruction, Professor X and his team of young X-Men must battle for the future of humanity.",
            "Raised by Pharaoh's daughter in the lap of luxury, Hebrew-born Moses returns to his roots to lead his enslaved people out of Egypt.",
            "When the world's defenses fail against the threat of alien sea creatures, the task of saving the planet falls to a former pilot and a raw trainee.",
            "When a Colombian drug kingpin takes over the smuggling routes to the U.S., a Marine sniper teams with a federal agent to take him and his cartel down."
    };

    private int[] movieImage = {
            R.drawable.tears_of_the_sun,
            R.drawable.kung_fu_hustle,
            R.drawable.furious,
            R.drawable.bumblebee,
            R.drawable.ready_player_one,
            R.drawable.twilight,
            R.drawable.xmen,
            R.drawable.exodus,
            R.drawable.pacific_rim,
            R.drawable.sniper
    };

    public ArrayList<Movies> getMovies(){
        ArrayList<Movies> movies = new ArrayList<>();
        for(int i = 0; i<movieName.length; i++){
            Movies movie = new Movies();
            movie.setImage(movieImage[i]);
            movie.setName(movieName[i]);
            movie.setDesc(movieDesc[i]);

            movies.add(movie);
        }
        return movies;
    }

}
