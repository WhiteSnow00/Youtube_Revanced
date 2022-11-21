import java.net.URI;
import java.net.SocketAddress;

// 
// Decompiled by Procyon v0.6.0
// 

final class asge extends arzl
{
    final SocketAddress a;
    final String b;
    
    public asge(final SocketAddress a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final arzo a(final URI uri, final arzj arzj) {
        return new asgd(this);
    }
    
    @Override
    public final String b() {
        return "directaddress";
    }
}
