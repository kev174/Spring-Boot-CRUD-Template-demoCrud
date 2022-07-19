package com.cisco.dev.demoCrud.inter;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cisco.dev.demoCrud.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
