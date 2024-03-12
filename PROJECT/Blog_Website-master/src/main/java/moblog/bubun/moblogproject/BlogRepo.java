package moblog.bubun.moblogproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogRepo extends JpaRepository <Places, Integer>{

}
