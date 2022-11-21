import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.net.SocketAddress;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxm
{
    public static final arwn a;
    public final List b;
    public final arwo c;
    private final int d;
    
    static {
        a = arwn.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    }
    
    public arxm(final SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), arwo.a);
    }
    
    public arxm(List unmodifiableList, final arwo c) {
        adme.L(unmodifiableList.isEmpty() ^ true, "addrs is empty");
        unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(unmodifiableList));
        this.b = unmodifiableList;
        c.getClass();
        this.c = c;
        this.d = unmodifiableList.hashCode();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof arxm)) {
            return false;
        }
        final arxm arxm = (arxm)o;
        if (this.b.size() == arxm.b.size()) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (!((SocketAddress)this.b.get(i)).equals(arxm.b.get(i))) {
                    return false;
                }
            }
            return this.c.equals(arxm.c);
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
