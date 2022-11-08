// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.nio.ByteBuffer;

public class JniCommon
{
    public static native void nativeAddRef(final long p0);
    
    public static native ByteBuffer nativeAllocateByteBuffer(final int p0);
    
    public static native void nativeFreeByteBuffer(final ByteBuffer p0);
    
    public static native void nativeReleaseRef(final long p0);
}
