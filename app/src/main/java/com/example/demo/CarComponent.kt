package com.example.demo

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Cars

    fun inject(mainActivity: MainActivity)
}