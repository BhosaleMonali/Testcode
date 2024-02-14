package cakeapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import cakeapi.entity.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
   public User findByEmail(String email);
//	Optional<User> findById(Long id);
//	public void deleteById(Integer id);
//	boolean existsById(Long id);
//	public User AuthenticateUser( String email, String password);
}
