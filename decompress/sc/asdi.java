import java.net.URI;
import java.net.SocketAddress;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdi extends arwr
{
    final SocketAddress a;
    final String b;
    
    public asdi(final SocketAddress a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final arwu a(final URI uri, final arwp arwp) {
        return new asdh(this);
    }
    
    public final String b() {
        return "directaddress";
    }
}
