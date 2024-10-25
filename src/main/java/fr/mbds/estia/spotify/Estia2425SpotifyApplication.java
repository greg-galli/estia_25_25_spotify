package fr.mbds.estia.spotify;

import fr.mbds.estia.spotify.entities.Music;
import fr.mbds.estia.spotify.repositories.MusicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Estia2425SpotifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Estia2425SpotifyApplication.class, args);
    }


    @Bean
    CommandLineRunner start(MusicRepository musicRepository) {
        return args -> {
            List<String> musicTitles = List.of("Music Title 1", "Music Title 2", "Music Title 3");
            // Iterate over the list of music titles
            musicTitles.forEach(musicTitle -> {
                Music musicInstance = Music.builder()
                        .title(musicTitle)
                        .trackLength(20)
                        .genre("Music Genre")
                        .build();
                musicRepository.save(musicInstance);
            });
        };
    }


}
