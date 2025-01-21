package com.projetointensivo.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		private Long id;
		private String tille;
		
		@Column(name = "game_year")
		private Integer year;
		private String genre;
		private String platform;
		private String imgUrl;
		private String shortDescription;
		private String longDescription;
		
		public Game() {
			
			
			
		}

		public Game(Long id, String tille, Integer year, String genre, String platform, String imgUrl,
				String shortDescription, String longDescription) {

			this.id = id;
			this.tille = tille;
			this.year = year;
			this.genre = genre;
			this.platform = platform;
			this.imgUrl = imgUrl;
			this.shortDescription = shortDescription;
			this.longDescription = longDescription;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTille() {
			return tille;
		}

		public void setTille(String tille) {
			this.tille = tille;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getPlatform() {
			return platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getLongDescription() {
			return longDescription;
		}

		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Game other = (Game) obj;
			return Objects.equals(id, other.id);
		}
		
		
		
		
}
