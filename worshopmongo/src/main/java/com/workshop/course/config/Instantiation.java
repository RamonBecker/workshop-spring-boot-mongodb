package com.workshop.course.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.workshop.course.domain.Post;
import com.workshop.course.domain.User;
import com.workshop.course.dto.UserDTO;
import com.workshop.course.repository.PostRepository;
import com.workshop.course.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		
		Post post1 = new Post(null, sdf.parse("21/10/2021"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!",
				new UserDTO(maria));
		Post post2 = new Post(null, sdf.parse("23/10/2021"), "Bom dia", "Acordei feliz hoje!", new UserDTO(maria));


		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
