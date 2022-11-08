// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.Arrays;

public class IceCandidate
{
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final PeerConnection$AdapterType e;
    
    IceCandidate(final String a, final int b, final String c, final String d, final PeerConnection$AdapterType e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private static boolean a(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        return o.equals(o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof IceCandidate)) {
            return false;
        }
        final IceCandidate iceCandidate = (IceCandidate)o;
        return a(this.a, iceCandidate.a) && this.b == iceCandidate.b && a(this.c, iceCandidate.c);
    }
    
    String getSdp() {
        return this.c;
    }
    
    String getSdpMid() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String string = this.e.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(":");
        sb.append(b);
        sb.append(":");
        sb.append(c);
        sb.append(":");
        sb.append(d);
        sb.append(":");
        sb.append(string);
        return sb.toString();
    }
}
