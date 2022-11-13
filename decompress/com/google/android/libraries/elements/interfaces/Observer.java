// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class Observer
{
    public abstract Status storeDidUpdate(final ByteStore p0, final TransactionRecord p1);
}
