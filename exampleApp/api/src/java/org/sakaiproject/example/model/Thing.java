package org.sakaiproject.example.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An example thing
 * 
 * @author Steve Swinsburg (steve.swinsburg@anu.edu.au)
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thing implements Serializable {

	private long id;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public void setId(long x) {
		id = x;
	}
}
