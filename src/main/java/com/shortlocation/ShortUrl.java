package com.shortlocation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is responsible to get the response from google for short url and
 * return it.
 * 
 * @author hv185014
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShortUrl {
	/**
	 * id of the SHort URL
	 */
	private String id;

	/**
	 * Long URL for which the short url is created.
	 */
	private String longUrl;

	/**
	 * 
	 */
	private String kind;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLongUrl() {
		return longUrl;
	}

	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", longUrl = " + longUrl + ", kind = " + kind + "]";
	}
}