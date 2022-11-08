// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class NetworkChangeDetector$NetworkInformation
{
    public final String a;
    public final NetworkChangeDetector$ConnectionType b;
    public final NetworkChangeDetector$ConnectionType c;
    public final long d;
    public final NetworkChangeDetector$IPAddress[] e;
    
    public NetworkChangeDetector$NetworkInformation(final String a, final NetworkChangeDetector$ConnectionType b, final NetworkChangeDetector$ConnectionType c, final long d, final NetworkChangeDetector$IPAddress[] e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private NetworkChangeDetector$ConnectionType getConnectionType() {
        return this.b;
    }
    
    private long getHandle() {
        return this.d;
    }
    
    private NetworkChangeDetector$IPAddress[] getIpAddresses() {
        return this.e;
    }
    
    private String getName() {
        return this.a;
    }
    
    private NetworkChangeDetector$ConnectionType getUnderlyingConnectionTypeForVpn() {
        return this.c;
    }
}
