// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite;

import java.nio.Buffer;
import java.nio.ByteBuffer;

final class TensorImpl
{
    private static native ByteBuffer buffer(final long p0);
    
    private static native long create(final long p0, final int p1, final int p2);
    
    private static native long createSignatureInputTensor(final long p0, final String p1);
    
    private static native long createSignatureOutputTensor(final long p0, final String p1);
    
    private static native void delete(final long p0);
    
    private static native int dtype(final long p0);
    
    private static native boolean hasDelegateBufferHandle(final long p0);
    
    private static native int index(final long p0);
    
    private static native String name(final long p0);
    
    private static native int numBytes(final long p0);
    
    private static native float quantizationScale(final long p0);
    
    private static native int quantizationZeroPoint(final long p0);
    
    private static native void readMultiDimensionalArray(final long p0, final Object p1);
    
    private static native int[] shape(final long p0);
    
    private static native int[] shapeSignature(final long p0);
    
    private static native void writeDirectBuffer(final long p0, final Buffer p1);
    
    private static native void writeMultiDimensionalArray(final long p0, final Object p1);
    
    private static native void writeScalar(final long p0, final Object p1);
}
