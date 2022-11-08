import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arvr extends SocketAddress
{
    private static final long serialVersionUID = 0L;
    public final Intent a;
    
    protected arvr(final Intent a) {
        agot.v(a.getComponent() != null, (Object)"Missing required component");
        this.a = a;
    }
    
    public static arvr b(final ComponentName component) {
        return new arvr(new Intent("grpc.io.action.BIND").setComponent(component));
    }
    
    public static arvr c(final Context context) {
        return b(new ComponentName(context, (Class)context.getClass()));
    }
    
    public static arvr d(final String s, final String s2) {
        return b(new ComponentName(s, s2));
    }
    
    public final ComponentName a() {
        return this.a.getComponent();
    }
    
    public final String e() {
        return this.a().getPackageName();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof arvr && this.a.filterEquals(((arvr)o).a);
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
