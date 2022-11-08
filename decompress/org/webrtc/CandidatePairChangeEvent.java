// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public final class CandidatePairChangeEvent
{
    public final IceCandidate a;
    public final IceCandidate b;
    public final int c;
    public final String d;
    public final int e;
    
    CandidatePairChangeEvent(final IceCandidate a, final IceCandidate b, final int c, final String d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
