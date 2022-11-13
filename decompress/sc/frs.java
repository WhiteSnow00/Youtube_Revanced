import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frs extends dst
{
    @dyi(a = 6)
    @dyj(a = dyk.a)
    List a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oti c;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command e;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    int f;
    
    public frs() {
        super("ActiveState");
    }
    
    private final frq b() {
        return (frq)super.s;
    }
    
    protected final Object Q(final dun dun, Object f) {
        final int c = dun.c;
        if (c == -1932591986) {
            final dvb dvb = (dvb)f;
            final duv b = dun.b;
            final dsx dsx = (dsx)dun.d[0];
            final View a = dvb.a;
            final ouk u = ((frs)b).c.u;
            if (u != null) {
                f = u.f;
                if (f != null) {
                    final ActiveStateScrollSelectionController a2 = ((frn)f).a;
                    if (a2 != null) {
                        ((DefaultScrollSelectionController)a2).s(a);
                    }
                }
            }
            return null;
        }
        if (c == -1048037474) {
            coy.e((dsx)dun.d[0], (duk)f);
            return null;
        }
        if (c != 1803022739) {
            return null;
        }
        final dxq dxq = (dxq)f;
        final duv b2 = dun.b;
        final dsx dsx2 = (dsx)dun.d[0];
        final View b3 = dxq.b;
        final frs frs = (frs)b2;
        final oti c2 = frs.c;
        final frt a3 = frs.b().a;
        final ouk u2 = c2.u;
        if (u2 != null) {
            final Object f2 = u2.f;
            if (f2 != null) {
                final ActiveStateScrollSelectionController a4 = ((frn)f2).a;
                if (a4 != null) {
                    ((DefaultScrollSelectionController)a4).n(b3, (gjk)a3);
                }
            }
        }
        return null;
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final arkg b = this.b;
        final CommandOuterClass$Command e = this.e;
        final CommandOuterClass$Command d = this.d;
        final oti c = this.c;
        new WeakReference(dsx);
        elx.a = new frt(b, (ouc)c.q, e, d);
        if (elx.a != null) {
            this.b().a = (frt)elx.a;
        }
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        ((frq)dwr2).a = ((frq)dwr).a;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    protected final dst c(final dsx dsx) {
        final List a = this.a;
        final int f = this.f;
        final int n = f - 1;
        if (f != 0) {
            Object o;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            throw new IllegalArgumentException("Unknown enum value: ".concat(epf.M(f)));
                        }
                        o = dwo.b(dsx);
                        ((dwn)o).aa();
                    }
                    else {
                        o = dwo.b(dsx);
                    }
                }
                else {
                    o = dsn.b(dsx);
                    ((dsm)o).j();
                }
            }
            else {
                o = dsn.b(dsx);
            }
            ((dsr)o).Q(M((Class)frs.class, "ActiveState", dsx, 1803022739, new Object[] { dsx }));
            ((dsr)o).J(M((Class)frs.class, "ActiveState", dsx, -1932591986, new Object[] { dsx }));
            if (a != null) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    ((dss)o).g(((dst)iterator.next()).j());
                }
            }
            return ((dss)o).a();
        }
        throw null;
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new frq();
    }
}
