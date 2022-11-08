import java.net.SocketAddress;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwl extends SocketAddress
{
    private static final long serialVersionUID = 0L;
    private final int a;
    
    public arwl(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof arwl && this.a == ((arwl)o).a;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("BoundClientAddress[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
