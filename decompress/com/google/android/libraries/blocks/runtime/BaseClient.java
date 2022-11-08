// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

import com.google.android.libraries.blocks.StatusException;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.blocks.StreamReaderWriter;
import com.google.common.util.concurrent.SettableFuture;

public class BaseClient implements AutoCloseable
{
    public final long a;
    
    protected BaseClient(final long a) {
        this.a = a;
    }
    
    private native void nativeCallAsync(final long p0, final int p1, final byte[] p2, final SettableFuture p3);
    
    private native StreamReaderWriter nativeCallReadableWritableStream(final long p0, final int p1, final BaseClient$ReadableWritableStreamCreator p2);
    
    private native long nativeCallWritableStream(final long p0, final int p1, final SettableFuture p2);
    
    private native void nativeDelete(final long p0);
    
    private native InstanceProxy nativeGetUnderlyingInstanceProxy(final long p0);
    
    private native boolean nativeMethodExists(final long p0, final int p1);
    
    private native void nativeRelease(final long p0);
    
    private native String nativeToMovableRef(final long p0);
    
    private native String nativeToSharedRef(final long p0);
    
    public final InstanceProxy a() {
        return this.nativeGetUnderlyingInstanceProxy(this.a);
    }
    
    public final ListenableFuture b(final int n, final MessageLite messageLite, final ahbe ahbe) {
        final SettableFuture create = SettableFuture.create();
        this.nativeCallAsync(this.a, n, messageLite.toByteArray(), create);
        return afrp.f((ListenableFuture)create, (afry)new nxn(ahbe, 2), (Executor)afsl.a);
    }
    
    public final MessageLite c(final int n, final MessageLite messageLite, final ahbe ahbe) {
        try {
            return (MessageLite)ahbe.l(this.nativeCallSync(this.a, n, messageLite.toByteArray()), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahab ahab) {
            throw new StatusException(agsq.o, aexs.e(ahab.getMessage()), ahab.getStackTrace());
        }
    }
    
    @Override
    public final void close() {
        this.nativeRelease(this.a);
    }
    
    public final String d() {
        return this.nativeToMovableRef(this.a);
    }
    
    public final String e() {
        return this.nativeToSharedRef(this.a);
    }
    
    @Override
    protected final void finalize() {
        this.nativeDelete(this.a);
    }
    
    public native long nativeCallReadableStream(final long p0, final int p1, final byte[] p2);
    
    public native byte[] nativeCallSync(final long p0, final int p1, final byte[] p2);
}
