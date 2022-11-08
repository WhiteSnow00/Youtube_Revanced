// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite.nnapi;

import java.io.Closeable;

public class NnApiDelegateImpl implements Closeable, AutoCloseable
{
    private static native long createDelegate(final int p0, final String p1, final String p2, final String p3, final int p4, final boolean p5, final boolean p6, final boolean p7, final long p8);
    
    private static native void deleteDelegate(final long p0);
    
    private static native int getNnapiErrno(final long p0);
    
    @Override
    public final void close() {
        throw null;
    }
}
