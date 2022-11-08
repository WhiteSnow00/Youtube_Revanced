import java.util.logging.Level;
import android.os.Parcel;
import java.util.logging.Logger;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwt extends Binder
{
    private static final Logger a;
    private arws b;
    
    static {
        a = Logger.getLogger(arwt.class.getName());
    }
    
    public arwt(final arws b) {
        this.b = b;
    }
    
    public final void a() {
        this.b = null;
    }
    
    protected final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final arws b = this.b;
        if (b != null) {
            try {
                return b.to(n, parcel);
            }
            catch (final RuntimeException ex) {
                final Logger a = arwt.a;
                final Level warning = Level.WARNING;
                final StringBuilder sb = new StringBuilder("failure sending transaction ");
                sb.append(n);
                a.logp(warning, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", sb.toString(), ex);
            }
        }
        return false;
    }
    
    public final boolean pingBinder() {
        return this.b != null;
    }
}
