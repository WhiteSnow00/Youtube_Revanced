// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class FaultObserver
{
    public abstract Status storeDidFault(final ByteStore p0, final String p1);
}
