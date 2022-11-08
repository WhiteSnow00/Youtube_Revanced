// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

public abstract class ByteStore
{
    public static ByteStore create(final ByteStoreConfig byteStoreConfig) {
        return ByteStore$CppProxy.create(byteStoreConfig);
    }
    
    public abstract void clear();
    
    public abstract Transaction createTransaction();
    
    public abstract Transaction createTransactionWithContext(final TransactionContextOuterClass$TransactionContext p0);
    
    public abstract void set(final String p0, final byte[] p1);
    
    public abstract void setWithMetadata(final String p0, final byte[] p1, final byte[] p2);
    
    public abstract Snapshot snapshot();
    
    public abstract Subscription subscribe(final String p0, final Observer p1);
    
    public abstract ArrayList subscribeList(final ArrayList p0, final Observer p1);
    
    public abstract FaultSubscription subscribeToFaults(final FaultObserver p0);
    
    public abstract Subscription subscribeWithContext(final String p0, final ContextObserver p1);
    
    public abstract Subscription subscribeWithPriority(final String p0, final Observer p1, final int p2);
}
