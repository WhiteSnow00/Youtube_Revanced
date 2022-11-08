// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

import j$.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

public final class AsyncCallback implements afsz
{
    private final int a;
    
    public AsyncCallback(final int a) {
        this.a = a;
    }
    
    public static void register(final ListenableFuture listenableFuture, final int n) {
        afva.w(listenableFuture, (afsz)new AsyncCallback(n), (Executor)afsl.a);
    }
    
    public native void nativeOnFailure(final int p0, final byte[] p1);
    
    public native void nativeOnSuccess(final int p0, final byte[] p1);
    
    public final void rz(final Throwable t) {
        final String message = t.getMessage();
        final int a = this.a;
        byte[] bytes;
        if (message == null) {
            bytes = new byte[0];
        }
        else {
            bytes = message.getBytes(StandardCharsets.UTF_8);
        }
        this.nativeOnFailure(a, bytes);
    }
}
