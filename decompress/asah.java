import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asah extends SocketAddress
{
    private static final long serialVersionUID = 0L;
    public final Intent a;
    
    protected asah(final Intent a) {
        adme.L(a.getComponent() != null, "Missing required component");
        this.a = a;
    }
    
    public static asah b(final ComponentName component) {
        return new asah(new Intent("grpc.io.action.BIND").setComponent(component));
    }
    
    public static asah c(final String s, final String s2) {
        return b(new ComponentName(s, s2));
    }
    
    public final ComponentName a() {
        return this.a.getComponent();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof asah && this.a.filterEquals(((asah)o).a);
    }
    
    @Override
    public final int hashCode() {
        Intent intent2;
        final Intent intent = intent2 = this.a;
        if (intent.getPackage() != null) {
            intent2 = intent.cloneFilter().setPackage((String)null);
        }
        return intent2.filterHashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("AndroidComponentAddress[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
