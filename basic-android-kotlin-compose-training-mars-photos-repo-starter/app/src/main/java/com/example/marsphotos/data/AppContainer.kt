package com.example.marsphotos.data

import com.example.marsphotos.data.MarsPhotosRepository


interface AppContainer {
    val marsPhotosRepository : MarsPhotosRepository
}