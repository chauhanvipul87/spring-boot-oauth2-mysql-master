package org.thinkyard.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
public class Role extends BaseModel implements Serializable {


	private static final long serialVersionUID = 1L;

    public Role(){

    }

	@Column(name = "name")
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
