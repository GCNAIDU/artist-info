package com.global.artist.model.common;

public class Header {
	  private float status_code;
	  private float execute_time;
	  private float available;


	 // Getter Methods 

	  public float getStatus_code() {
	    return status_code;
	  }

	  public float getExecute_time() {
	    return execute_time;
	  }

	  public float getAvailable() {
	    return available;
	  }

	 // Setter Methods 

	  public void setStatus_code( float status_code ) {
	    this.status_code = status_code;
	  }

	  public void setExecute_time( float execute_time ) {
	    this.execute_time = execute_time;
	  }

	  public void setAvailable( float available ) {
	    this.available = available;
	  }
	}
