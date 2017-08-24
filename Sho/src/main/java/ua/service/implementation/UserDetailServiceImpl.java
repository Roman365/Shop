package ua.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ua.domain.request.RegistrationRequest;
import ua.entity.UserEntity;
import ua.mapper.RegistrationMapper;
import ua.repository.UserRepository;
import ua.service.UserService;

@Service
public class UserDetailServiceImpl implements UserDetailsService, UserService{ 
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDetails loadUserByUsername(String arg0){			
		UserEntity userEntity = userRepository.findByEmail(arg0);	
		if(userEntity==null) {										
			return null;	
		}
		return new User(userEntity.getEmail(),		
				userEntity.getPassword(),
				AuthorityUtils.createAuthorityList(userEntity.getRole().toString()));	
	}

	@Override
	public void save(RegistrationRequest registrationRequest) {
		UserEntity userEntity = RegistrationMapper.map(registrationRequest);
		userEntity.setPassword(bCryptPasswordEncoder.encode(userEntity.getPassword()));
		userRepository.save(userEntity);	
	}

}
