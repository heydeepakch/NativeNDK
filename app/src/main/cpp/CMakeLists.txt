cmake_minimum_required(VERSION 3.4.1)

# Creates a shared library named native-lib from native-lib.cpp
add_library(native-lib SHARED native-lib.cpp)

# Finds the Android log library (for logging to Logcat if needed)
find_library(log-lib log)

# Links the log library with native library
target_link_libraries(native-lib ${log-lib})


# This file produces libnative-lib.so that gets packaged into the APK.