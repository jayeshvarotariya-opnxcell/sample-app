package com.example.daggersetup

import javax.inject.Inject
import javax.inject.Named


data class Mobile @Inject constructor( @Named("number" ) val number : String )