package com.example.koindependancyinjectiondemo

import org.koin.dsl.module


val appModule = module{

    //Define a singleton for Course
    single { Course() }

    //Define a factory(new instance everytime)
    factory { Student(get (),get  ()) }

    //Define a factory(new instance everytime)
    factory { Friend() }

 }