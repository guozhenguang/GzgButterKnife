package com.example.gzgbutterknife

interface IBinder<T> {
    fun bind(target: T)
}