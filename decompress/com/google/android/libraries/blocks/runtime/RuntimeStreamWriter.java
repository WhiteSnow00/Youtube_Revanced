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
    private final oao b;
    
    public RuntimeStreamWriter(final long a) {
        this.nativeSetWriter(this.a = a, (WriterProxy)(this.b = new oao()));
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
        phq phq;
        if (t instanceof StatusException) {
            final StatusException ex = (StatusException)t;
            phq = new phq(ex.b, ex.getMessage());
        }
        else {
            phq = new phq(agsq.o, t.getMessage());
        }
        final agza builder = ((agzi)agsr.a).createBuilder();
        final int s = ((agsq)phq.b).s;
        builder.copyOnWrite();
        final agsr agsr = (agsr)builder.instance;
        agsr.b |= 0x1;
        agsr.c = s;
        builder.copyOnWrite();
        agsr.a((agsr)builder.instance);
        final Object a2 = phq.a;
        if (a2 != null) {
            builder.copyOnWrite();
            final agsr agsr2 = (agsr)builder.instance;
            agsr2.b |= 0x4;
            agsr2.d = (String)a2;
        }
        this.nativeWritesDoneWithError(a, ((agxl)builder.build()).toByteArray());
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
