// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

public abstract class ContextObserver
{
    public abstract Status storeDidUpdate(final ByteStore p0, final TransactionRecord p1, final TransactionContextOuterClass$TransactionContext p2);
}
