import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.net.SocketAddress;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arsk
{
    public static final arrf a;
    public final List b;
    public final arrg c;
    private final int d;
    
    static {
        a = arrf.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    }
    
    public arsk(final SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), arrg.a);
    }
    
    public arsk(List unmodifiableList, final arrg c) {
        agot.v(unmodifiableList.isEmpty() ^ true, (Object)"addrs is empty");
        unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(unmodifiableList));
        this.b = unmodifiableList;
        c.getClass();
        this.c = c;
        this.d = unmodifiableList.hashCode();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof arsk)) {
            return false;
        }
        final arsk arsk = (arsk)o;
        if (this.b.size() == arsk.b.size()) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (!((SocketAddress)this.b.get(i)).equals(arsk.b.get(i))) {
                    return false;
                }
            }
            return this.c.equals(arsk.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String string = this.c.toString();
        final StringBuilder sb = new StringBuilder("[");
        sb.append(value);
        sb.append("/");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
