// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class PublicKeyVerifier
{
    public abstract Status initialize(final String p0, final byte[] p1, final byte[] p2);
    
    public abstract Status verify(final byte[] p0, final byte[] p1);
}
