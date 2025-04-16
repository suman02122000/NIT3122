# 🌍 Language Explorer App - NIT3122 Final Assignment

This Android application is developed as part of the **NIT3122** course final project. The app allows users to **log in**, **view a list of languages**, and explore **detailed language information** fetched from a remote API.

> 📂 GitHub Repository: [https://github.com/suman02122000/NIT3122](https://github.com/suman02122000/NIT3122)

---

## 📱 Features

- 🔐 **Login Screen**
  - API-based user authentication
- 📋 **Dashboard Screen**
  - Horizontally scrollable list of languages
  - Uses RecyclerView and Retrofit
- 📝 **Detail Screen**
  - Displays in-depth information on each selected language
- 🎯 **Dependency Injection**
  - Implemented using Hilt
- ✅ **Unit Testing**
  - ViewModel testing using JUnit
- 🧠 **Clean Architecture**
  - Organized by package: `activities`, `api`, `adapter`, `models`, `viewmodel`, `di`
- 🌐 **API Integration**
  - Fetches language data from [vu-nit3213-api](https://nit3213api.onrender.com/)

---

## 🛠 Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM + DI
- **DI**: Hilt (Dagger 2)
- **HTTP Client**: Retrofit + OkHttp
- **UI**: Jetpack Components (RecyclerView, ConstraintLayout)
- **Testing**: JUnit, Espresso (optional)
- **Build Tool**: Gradle (with Kotlin DSL & Version Catalogs)

---

## 📦 Project Structure

com.example.language ├── activities # UI screens: Login, Dashboard, Detail ├── adapter # RecyclerView adapter ├── api # ApiClient, ApiService ├── di # Hilt modules ├── models # Data models (e.g., LoginResponse) ├── viewmodel # ViewModel for logic separation

yaml
Copy
Edit

---

## ✅ Functional Requirements Covered

- [x] API integration with Retrofit
- [x] Login functionality using POST request
- [x] Dashboard with dynamic data list
- [x] Detail screen with passed data
- [x] Hilt Dependency Injection setup
- [x] Clean and modular codebase
- [x] Unit tests for ViewModel
- [x] GitHub version control with meaningful commits

---

## 🧪 Unit Testing

Tests are available in:

src/test/java/com/example/language/viewmodel/LoginViewModelTest.kt

yaml
Copy
Edit

Example tested:
- `isValidCredentials(username, password)` function

---

## 🔧 Getting Started

### Clone the repo:
```bash
git clone https://github.com/suman02122000/NIT3122.git
Open in Android Studio and Run:
Make sure you are using Kotlin 1.9+

Click Run or use an emulator/device

📄 Notes
Internet permission is required to fetch API data

Use /sydney/auth for login endpoint

The app uses static language API at /dashboard/languages

🧑‍💻 Author
Suman Basnet
Final Assignment – NIT3122
Melbourne, Australia
GitHub: @suman02122000

