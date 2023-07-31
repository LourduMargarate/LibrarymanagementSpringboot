package com.example.librarymanagement.model;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="BOOKTABLE")
public class Book {
@Id
@SequenceGenerator(name = "BOOK_SEQ",sequenceName = "book_seq",
initialValue = 1, allocationSize = 100)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_SEQ")
private long bookId;
@Column	
private String title;
@Column	
private String author;
@Column	
private String category;
@Column	
private String publication;
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
@Column	
private Date publish_Date;







}