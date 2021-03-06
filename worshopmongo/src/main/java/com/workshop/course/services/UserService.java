package com.workshop.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.course.domain.User;
import com.workshop.course.dto.UserDTO;
import com.workshop.course.repository.UserRepository;
import com.workshop.course.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
	}

	public User insert(User user) {
		return repo.insert(user);
	}

	public void delete(String id) {
		repo.deleteById(id);
	}

	public User update(User obj) {
		User newUser = findById(obj.getId());
		updateData(newUser, obj);
		return repo.save(newUser);
	}

	private void updateData(User newUser, User obj) {
		newUser.setName(obj.getName());
		newUser.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}
}
