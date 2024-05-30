# Dictionary App

## Overview
This project is a demonstration of Clean Architecture principles implemented in an Android application. It utilizes modern Android development tools and is built entirely with Jetpack Compose for the UI. The goal is to provide a reference implementation that showcases the use of Hilt for dependency injection, Coroutines Flow for reactive programming, and Room for data persistence.

## Key Features
- **Jetpack Compose UI**: Entirely built with Google's modern UI toolkit for intuitive and responsive layouts.
- **Clean Architecture**: The project is structured according to Clean Architecture guidelines which separate concerns with clear boundaries and abstractions.
- **Dependency Injection**: Using Hilt to manage dependencies across the application, promoting modularity and ease of testing.
- **Data Caching**: Local data caching implemented with Room, providing robust data management and offline capabilities.
- **Reactive Programming**: Utilizing Coroutines Flow to handle asynchronous data streams cleanly and efficiently.

## Technologies Used
- **[Jetpack Compose](https://developer.android.com/jetpack/compose)**: Modern toolkit for building native UI.
- **[Hilt](https://dagger.dev/hilt/)**: Dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
- **[Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)**: For managing background threads with simplified code and reducing needs for callbacks.
- **[Room](https://developer.android.com/training/data-storage/room)**: Persistence library providing an abstraction layer over SQLite to allow for more robust database access.
- **[Retrofit](https://square.github.io/retrofit/)**: A type-safe HTTP client for Android and Java.
- **[OkHttp](https://square.github.io/okhttp/)**: An HTTP client that’s efficient by default: HTTP/2 support allows all requests to the same host to share a socket.

## Architecture
This application is based on Clean Architecture principles involving the following layers:
- **Data Layer**: Manages application data and responsible for deciding whether to fetch data from a network or use local cached data.
- **Domain Layer**: Contains business logic and use cases.
- **Presentation Layer**: Shows data on the screen and communicates with other layers.