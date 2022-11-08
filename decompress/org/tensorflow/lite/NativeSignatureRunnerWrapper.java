// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite;

final class NativeSignatureRunnerWrapper
{
    private static native void nativeAllocateTensors(final long p0, final long p1);
    
    private static native int nativeGetInputIndex(final long p0, final String p1);
    
    private static native int nativeGetOutputIndex(final long p0, final String p1);
    
    private static native long nativeGetSignatureRunner(final long p0, final String p1);
    
    private static native int nativeGetSubgraphIndex(final long p0);
    
    private static native String[] nativeInputNames(final long p0);
    
    private static native void nativeInvoke(final long p0, final long p1);
    
    private static native String[] nativeOutputNames(final long p0);
    
    private static native boolean nativeResizeInput(final long p0, final long p1, final String p2, final int[] p3);
}
