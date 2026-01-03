#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_nativendkdemo_MainActivity_getGreetingFromNative(JNIEnv* env, jobject) {
    return env->NewStringUTF("Hello from C++ via JNI");
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_nativendkdemo_MainActivity_addNumbers(JNIEnv* env, jobject, jint a, jint b) {
    return a + b;
}
