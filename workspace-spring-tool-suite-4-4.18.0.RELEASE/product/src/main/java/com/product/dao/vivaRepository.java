package com.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.model.viva;

@Repository
public interface vivaRepository extends JpaRepository <viva,Integer> {
	List<viva> findByManareaStartingWith(String prefix);
	List<viva> findByManareaEndingWith(String suffix);
	//positional parameter,order should match

			@Query("select v from viva v where v.manarea=?1 and v.flavour=?2")

		     public List<viva> getVivaByManarea(String manarea,String flavour);

	        //named parameter

	        @Query("select v from viva v where v.manarea=:manarea")

		    public List<viva> getVivaByManarea(String manarea);

			//DML

			@Modifying

			@Query("delete from viva v where v.flavour=?1")

			public int deleteVivaByFlavour(String Flavour);

	        @Modifying

	        @Query("update viva v set v.manarea=?1 where v.flavour=?2")

	        public int updateVivaByFlavour(String manarea,String flavour);
	        @Query(value="select * from viva m where m.flavour=?",nativeQuery=true)

	        public List<viva> fetchVivaByFlavour(String flavour);
}
