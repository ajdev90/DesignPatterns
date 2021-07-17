package com.ajdev.designpatterns.creation.builder;

public class User {
	private String firstname;
	private String lastName;
	private long id;
	private String address;
	private String email;
	private int mobileNum;

	public User(UserBuilder builder) {
		this.firstname = builder.firstname;
		this.lastName = builder.lastName;
		this.id = builder.id;
		this.address = builder.address;
		this.email = builder.email;
		this.mobileNum = builder.mobileNum;
	}

	static class UserBuilder {
		private String firstname;
		private String lastName;
		private long id;
		private String address;
		private final String email;
		private int mobileNum;

		public UserBuilder(String email) {
			this.email = email;
		}

		public User build() {
			return new User(this);
		}

		public UserBuilder setFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public UserBuilder setLastName(String lastname) {
			this.lastName = lastname;
			return this;
		}

		public UserBuilder setId(long id) {
			this.id = id;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder setMobileNum(int mobileNum) {
			this.mobileNum = mobileNum;
			return this;
		}

	}

	@Override
	public String toString() {
		return this.email.toString() + "-" + this.id;
	}

}
