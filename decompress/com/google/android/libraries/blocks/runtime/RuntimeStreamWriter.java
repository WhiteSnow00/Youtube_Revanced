// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

import com.google.protobuf.MessageLite;
import com.google.android.libraries.blocks.StatusException;
import java.util.function.Consumer;

public final class RuntimeStreamWriter implements AutoCloseable
{
    private final long a;
    private final obu b;
    
    public RuntimeStreamWriter(final long a) {
        this.nativeSetWriter(this.a = a, (WriterProxy)(this.b = new obu()));
    }
    
    private native void nativeDelete(final long p0);
    
    private native void nativeSetWriter(final long p0, final WriterProxy p1);
    
    private native boolean nativeWrite(final long p0, final byte[] p1);
    
    private native void nativeWritesDone(final long p0);
    
    private native void nativeWritesDoneWithError(final long p0, final byte[] p1);
    
    public final void a(final Consumer a) {
        this.b.a = a;
    }
    
    public final void b(final Throwable t) {
        final long a = this.a;
        pja pja;
        if (t instanceof StatusException) {
            final StatusException ex = (StatusException)t;
            pja = new pja(ex.b, ex.getMessage());
        }
        else {
            pja = new pja(agup.o, t.getMessage());
        }
        final ahaz builder = ((ahbh)aguq.a).createBuilder();
        final int s = ((agup)pja.a).s;
        builder.copyOnWrite();
        final aguq aguq = (aguq)builder.instance;
        aguq.b |= 0x1;
        aguq.c = s;
        builder.copyOnWrite();
        aguq.a((aguq)builder.instance);
        final Object b = pja.b;
        if (b != null) {
            builder.copyOnWrite();
            final aguq aguq2 = (aguq)builder.instance;
            aguq2.b |= 0x4;
            aguq2.d = (String)b;
        }
        this.nativeWritesDoneWithError(a, ((agzk)builder.build()).toByteArray());
    }
    
    public final boolean c(final MessageLite messageLite) {
        return this.nativeWrite(this.a, messageLite.toByteArray());
    }
    
    @Override
    public final void close() {
        this.nativeWritesDone(this.a);
    }
    
    @Override
    protected final void finalize() {
        this.nativeDelete(this.a);
    }
}
