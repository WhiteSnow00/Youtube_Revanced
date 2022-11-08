// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import java.util.concurrent.atomic.AtomicBoolean;

final class ByteStore$CppProxy extends ByteStore
{
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private ByteStore$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    public static native ByteStore create(final ByteStoreConfig p0);
    
    private native void nativeDestroy(final long p0);
    
    private native void native_clear(final long p0);
    
    private native Transaction native_createTransaction(final long p0);
    
    private native Transaction native_createTransactionWithContext(final long p0, final TransactionContextOuterClass$TransactionContext p1);
    
    private native void native_set(final long p0, final String p1, final byte[] p2);
    
    private native void native_setWithMetadata(final long p0, final String p1, final byte[] p2, final byte[] p3);
    
    private native Snapshot native_snapshot(final long p0);
    
    private native Subscription native_subscribe(final long p0, final String p1, final Observer p2);
    
    private native ArrayList native_subscribeList(final long p0, final ArrayList p1, final Observer p2);
    
    private native FaultSubscription native_subscribeToFaults(final long p0, final FaultObserver p1);
    
    private native Subscription native_subscribeWithContext(final long p0, final String p1, final ContextObserver p2);
    
    private native Subscription native_subscribeWithPriority(final long p0, final String p1, final Observer p2, final int p3);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    public void clear() {
        this.native_clear(this.nativeRef);
    }
    
    public Transaction createTransaction() {
        return this.native_createTransaction(this.nativeRef);
    }
    
    public Transaction createTransactionWithContext(final TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
        return this.native_createTransactionWithContext(this.nativeRef, transactionContextOuterClass$TransactionContext);
    }
    
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
    
    public void set(final String s, final byte[] array) {
        this.native_set(this.nativeRef, s, array);
    }
    
    public void setWithMetadata(final String s, final byte[] array, final byte[] array2) {
        this.native_setWithMetadata(this.nativeRef, s, array, array2);
    }
    
    public Snapshot snapshot() {
        return this.native_snapshot(this.nativeRef);
    }
    
    public Subscription subscribe(final String s, final Observer observer) {
        return this.native_subscribe(this.nativeRef, s, observer);
    }
    
    public ArrayList subscribeList(final ArrayList list, final Observer observer) {
        return this.native_subscribeList(this.nativeRef, list, observer);
    }
    
    public FaultSubscription subscribeToFaults(final FaultObserver faultObserver) {
        return this.native_subscribeToFaults(this.nativeRef, faultObserver);
    }
    
    public Subscription subscribeWithContext(final String s, final ContextObserver contextObserver) {
        return this.native_subscribeWithContext(this.nativeRef, s, contextObserver);
    }
    
    public Subscription subscribeWithPriority(final String s, final Observer observer, final int n) {
        return this.native_subscribeWithPriority(this.nativeRef, s, observer, n);
    }
}
