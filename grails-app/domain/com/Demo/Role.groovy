package com.Demo

class Role {
  String firstName
  String lastName
  Date dob
  String emailId

  String password
  String confirmPassword


  static transients = ['confirmPassword']


  static constraints = {
    firstName(nullable: false, blank: false)

    password(validator: { val, obj ->
      if (val != obj.confirmPassword) {
        return "ERROR"
      }
    })
  }

  static mapping = {

  }
}
