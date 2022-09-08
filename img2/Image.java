package com.cat.img;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cat.project.entity.Project;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Image {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long imgId;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "project", referencedColumnName = "pId")
	private Project project;
	
	@Column(nullable = false)
	private String fileOriName; // 업로드할 원래 파일이름
	
	@Column(nullable = false)
	private String fileUrl; // 저장할 장소 
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String imgDesc;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String imgLink;
	

	

	

	

}
