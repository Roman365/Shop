package ua.mapper;

import ua.domain.request.RegistrationRequest;
import ua.entity.Role;
import ua.entity.UserEntity;

public interface RegistrationMapper {

	public static UserEntity map(RegistrationRequest registrationRequest) {		//перетворення об'єкт entity в DTO(щоб уникнути LEsyInicilizationException)
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(registrationRequest.getEmail());					
		userEntity.setName(registrationRequest.getName());
		userEntity.setPassword(registrationRequest.getPassword());
		if(registrationRequest.isOwner()) {
			userEntity.setRole(Role.ROLE_USER_OWNER);
		}else {
			userEntity.setRole(Role.ROLE_USER);
		}
		return userEntity;
	}
	
	
}
