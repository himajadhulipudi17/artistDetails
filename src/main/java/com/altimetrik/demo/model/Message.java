package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
//	Header HeaderObject;
	 @JsonProperty("body")
	 Body BodyObject;


	 // Getter Methods 

//	 public Header getHeader() {
//	  return HeaderObject;
//	 }

	 public Body getBody() {
	  return BodyObject;
	 }

	 // Setter Methods 

//	 public void setHeader(Header headerObject) {
//	  this.HeaderObject = headerObject;
//	 }

	 public void setBody(Body bodyObject) {
	  this.BodyObject = bodyObject;
	 }
}
