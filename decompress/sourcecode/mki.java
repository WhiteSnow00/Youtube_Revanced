import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import android.os.RemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mki extends bkt
{
    private static final mnb h;
    private final mkh i;
    
    static {
        h = new mnb("MediaRouterCallback");
    }
    
    public mki(final mkh i) {
        kgk.aL((Object)i);
        this.i = i;
    }
    
    public final void i(final ccs ccs) {
        try {
            this.i.b(ccs.c, ccs.q);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void j(final ccs ccs) {
        try {
            this.i.g(ccs.c, ccs.q);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k(final ccs ccs) {
        try {
            this.i.h(ccs.c, ccs.q);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void o(final ccs ccs, final int n) {
        mki.h.a("onRouteSelected with reason = %d, routeId = %s", n, ccs.c);
        if (ccs.k == 1) {
            try {
                final String c = ccs.c;
                String c4 = null;
                Label_0175: {
                    if (c != null) {
                        if (c.endsWith("-groupRoute")) {
                            final CastDevice a = CastDevice.a(ccs.q);
                            if (a != null) {
                                final String c2 = a.c();
                                for (final ccs ccs2 : dmk.x()) {
                                    final String c3 = ccs2.c;
                                    if (c3 != null && !c3.endsWith("-groupRoute")) {
                                        final CastDevice a2 = CastDevice.a(ccs2.q);
                                        if (a2 != null && TextUtils.equals((CharSequence)a2.c(), (CharSequence)c2)) {
                                            c4 = ccs2.c;
                                            break Label_0175;
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    c4 = c;
                }
                if (this.i.a() >= 220400000) {
                    this.i.j(c4, c, ccs.q);
                    return;
                }
                this.i.i(c4, ccs.q);
            }
            catch (final RemoteException ex) {}
        }
    }
    
    public final void q(final ccs ccs, final int n) {
        mki.h.a("onRouteUnselected with reason = %d, routeId = %s", n, ccs.c);
        if (ccs.k != 1) {
            return;
        }
        try {
            this.i.k(ccs.c, ccs.q, n);
        }
        catch (final RemoteException ex) {}
    }
}
