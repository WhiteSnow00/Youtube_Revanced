// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite;

class InterpreterFactoryImpl
{
    public InterpreterFactoryImpl() {
    }
    
    private static native String nativeRuntimeVersion();
    
    private static native String nativeSchemaVersion();
}
