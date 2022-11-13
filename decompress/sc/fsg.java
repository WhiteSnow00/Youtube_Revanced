import java.util.Map;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import java.lang.ref.WeakReference;
import j$.util.Optional;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsg extends dst
{
    public static final int D = 0;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    boolean A;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Handler B;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    int C;
    @dyi(a = 6)
    @dyj(a = dyk.a)
    List a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    boolean c;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command e;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command f;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Optional g;
    @dyi(a = 10)
    @dyj(a = dyk.a)
    dst y;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg z;
    
    public fsg() {
        super("InlinePlayback");
    }
    
    private final fsf b() {
        return (fsf)super.s;
    }
    
    protected final Object Q(final dun dun, final Object o) {
        final int c = dun.c;
        if (c == -1932591986) {
            final dvb dvb = (dvb)o;
            final duv b = dun.b;
            final dsx dsx = (dsx)dun.d[0];
            final View a = dvb.a;
            final fsg fsg = (fsg)b;
            final arkg z = fsg.z;
            final arkg d = fsg.d;
            final boolean c2 = fsg.c;
            fsg.b().a.b = false;
            if (c2) {
                ((gjl)z.a()).s(a);
            }
            else {
                ((Map<Object, Object>)((aeea)d.a()).a).remove(System.identityHashCode(a));
            }
            return null;
        }
        if (c == -1048037474) {
            coy.e((dsx)dun.d[0], (duk)o);
            return null;
        }
        if (c != 1803022739) {
            return null;
        }
        final dxq dxq = (dxq)o;
        final duv b2 = dun.b;
        final dsx dsx2 = (dsx)dun.d[0];
        final View b3 = dxq.b;
        final fsg fsg2 = (fsg)b2;
        final arkg z2 = fsg2.z;
        final arkg d2 = fsg2.d;
        final CommandOuterClass$Command e = fsg2.e;
        final CommandOuterClass$Command f = fsg2.f;
        final boolean c3 = fsg2.c;
        final fsk c4 = fsg2.b().c;
        fsg2.b().a.b = true;
        c4.c(new WeakReference((T)dsx2));
        if (c3) {
            ((gjl)z2.a()).n(b3, (gjk)c4);
        }
        else {
            ((Map<Integer, gjk>)((aeea)d2.a()).a).put(Integer.valueOf(System.identityHashCode(b3)), (gjk)c4);
        }
        return null;
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final arkg b = this.b;
        final CommandOuterClass$Command e = this.e;
        final CommandOuterClass$Command f = this.f;
        final boolean a = this.A;
        final AtomicBoolean a2 = new AtomicBoolean(false);
        final fss a3 = new fss();
        elx.a = a2;
        elx2.a = a3;
        elx3.a = new fsk(new WeakReference((T)dsx), b, e, f, a3, a2, a);
        if (elx.a != null) {
            this.b().b = (AtomicBoolean)elx.a;
        }
        if (elx2.a != null) {
            this.b().a = (fss)elx2.a;
        }
        if (elx3.a != null) {
            this.b().c = (fsk)elx3.a;
        }
    }
    
    protected final cya aB(final dsx dsx, final cya cya) {
        final cya w = cya.w(cya);
        final fsk c = this.b().c;
        final fss a = this.b().a;
        c.c(new WeakReference((T)dsx));
        w.v((Class)fss.class, (Object)a);
        return w;
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        final fsf fsf = (fsf)dwr;
        final fsf fsf2 = (fsf)dwr2;
        fsf2.a = fsf.a;
        fsf2.b = fsf.b;
        fsf2.c = fsf.c;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    protected final dst c(final dsx dsx) {
        final Handler b = this.B;
        final dst y = this.y;
        final Optional g = this.g;
        final List a = this.a;
        final int c = this.C;
        final fss a2 = this.b().a;
        final fsk c2 = this.b().c;
        final AtomicBoolean b2 = this.b().b;
        c2.c(new WeakReference((T)dsx));
        b.post((Runnable)new fsi(b2, a2, 0));
        final int n = c - 1;
        if (c != 0) {
            Object o;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            throw new IllegalArgumentException("Unknown enum value: ".concat(epf.M(c)));
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
            ((dsr)o).Q(M((Class)fsg.class, "InlinePlayback", dsx, 1803022739, new Object[] { dsx }));
            ((dsr)o).J(M((Class)fsg.class, "InlinePlayback", dsx, -1932591986, new Object[] { dsx }));
            if (g.isPresent()) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    ((dss)o).g(((dst)iterator.next()).j());
                }
                ((dss)o).g(((dst)g.get()).j());
            }
            else {
                ((dss)o).g(y.j());
                final Iterator iterator2 = a.iterator();
                while (iterator2.hasNext()) {
                    ((dss)o).g(((dst)iterator2.next()).j());
                }
                float n2;
                if (!b2.get()) {
                    n2 = 1.0f;
                }
                else {
                    n2 = 0.0f;
                }
                ((dsr)o).o(n2);
            }
            return ((dss)o).a();
        }
        throw null;
    }
    
    public final /* bridge */ dst j() {
        final fsg fsg = (fsg)super.j();
        final dst y = fsg.y;
        dst j;
        if (y != null) {
            j = y.j();
        }
        else {
            j = null;
        }
        fsg.y = j;
        fsg.s = (dwr)new fsf();
        return fsg;
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new fsf();
    }
}
