# Native NDK Demo

An Android app that calls C++ code from Java using Android NDK.

## What Does This App Do?

- Shows a greeting message from C++ when the app starts
- Lets you enter two numbers and adds them using C++ code
- Displays the result on screen

## Project Files

### Java Side (declares native methods)

**File**: `app/src/main/java/com/example/nativendkdemo/MainActivity.java`

- Lines 13-14: Native methods are declared here

```java
public native String getGreetingFromNative();
public native int addNumbers(int a, int b);
```

### C++ Side (implements native methods)

**File**: `app/src/main/cpp/native-lib.cpp`

- The actual C++ code that runs when Java calls these methods

### Build Configuration

**File**: `app/src/main/cpp/CMakeLists.txt`

- Tells the system how to compile the C++ code

**File**: `app/build.gradle` (lines 31-36)

- Connects CMake to the Android build system

## How to Build and Run

### In Android Studio:

1. **Install Requirements**:

   - Go to `Tools` → `SDK Manager` → `SDK Tools`
   - Install `NDK (Side by side)` and `CMake`

2. **Open Project**:

   - Open this folder in Android Studio
   - Wait for Gradle sync to complete

3. **Run the App**:
   - Connect your Android phone (with USB debugging enabled) OR start an emulator
   - Click the green Run button ▶️

### From Command Line:

```bash
# Build and install
./gradlew installDebug

# On Windows
gradlew.bat installDebug
```

## How It Works (Simple Explanation)

1. When the app starts, it loads the C++ library (`System.loadLibrary("native-lib")`)
2. Java calls `getGreetingFromNative()` → C++ returns "Hello from C++ via JNI"
3. User enters two numbers and clicks "Add"
4. Java calls `addNumbers(a, b)` → C++ adds them → returns the sum
5. Result is shown on screen

## Requirements

- Android Studio (any recent version)
- Android device or emulator (Android 7.0 or higher)
- NDK and CMake (install via Android Studio)

## Quick Test

1. Open the app
2. See the greeting message at the top (from C++)
3. Type two numbers in the boxes
4. Click "Add"
5. See the result (calculated by C++)

