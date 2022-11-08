import android.view.View;
import android.content.Context;
import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dtc implements dul
{
    private static final Map a;
    private static final AtomicInteger b;
    private static final bku c;
    public final int w;
    
    static {
        final boolean a2 = dyo.a;
        c = new bku();
        a = new HashMap();
        b = new AtomicInteger();
    }
    
    public dtc() {
        final Class<? extends dtc> class1 = this.getClass();
        final Map a = dtc.a;
        synchronized (a) {
            if (!a.containsKey(class1)) {
                a.put(class1, dtc.b.incrementAndGet());
            }
            final int intValue = a.get(class1);
            monitorexit(a);
            this.w = intValue;
        }
    }
    
    public static dum M(final Class clazz, final String s, final dsw dsw, final int n, final Object[] array) {
        if (dsw != null) {
            final dss e = dsw.e;
            if (e != null) {
                if (clazz != e.getClass()) {
                    coy.d(2, "ComponentLifecycle:WrongContextForEventHandler:".concat(e.q()), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", s, dsw.e.q()));
                }
                final dss e2 = dsw.e;
                Object a;
                if (e2 == null) {
                    coy.d(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
                    a = dwb.a;
                }
                else {
                    a = new dum((duu)e2, n, array);
                }
                final ComponentTree h = dsw.h;
                if (h != null) {
                    h.D.l(dss.D(dsw.e), (dum)a);
                }
                return (dum)a;
            }
        }
        coy.d(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
        return (dum)dwb.a;
    }
    
    protected static void U(final dsw dsw, final Exception ex) {
        cox.f(dsw, ex);
    }
    
    static bku aA() {
        final boolean a = dyo.a;
        return dtc.c;
    }
    
    protected int K() {
        return 3;
    }
    
    protected dss L(final dsw dsw, final int n, final int n2) {
        return (dss)dsm.b(dsw).a;
    }
    
    protected dvw N() {
        this.getClass().getSimpleName();
        return (dvw)new dwl(this.K());
    }
    
    public final Object O(final Context context) {
        try {
            return this.R(context);
        }
        finally {}
    }
    
    public final Object P(final dum dum, Object q) {
        if (dum.c == -1048037474) {
            return this.Q(dum, q);
        }
        try {
            q = this.Q(dum, q);
            return q;
        }
        catch (final Exception ex) {
            final Object[] d = dum.d;
            if (d != null) {
                final Object o = d[0];
                if (o instanceof dsw) {
                    throw cox.d((dsw)o, ex);
                }
            }
            throw ex;
        }
    }
    
    protected Object Q(final dum dum, final Object o) {
        if (dum.c == -1048037474) {
            this.m().ls(o);
        }
        return null;
    }
    
    protected Object R(final Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }
    
    public void S(final dsw dsw, final Object o) {
        dsw.d = "bind";
        try {
            try {
                this.X(dsw, o);
                dsw.j();
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            cox.g(dsw, ex);
            dsw.j();
            return;
        }
        dsw.j();
    }
    
    protected void T(final dsw dsw) {
    }
    
    public void V(final dsw dsw, final Object o) {
        dsw.d = "mount";
        try {
            try {
                this.aa(dsw, o);
                dsw.j();
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            cox.g(dsw, ex);
            dsw.j();
            return;
        }
        dsw.j();
    }
    
    public void W(final dsw dsw) {
    }
    
    protected void X(final dsw dsw, final Object o) {
    }
    
    protected void Y(final dsw dsw, final dta dta) {
    }
    
    public void Z(final dsw dsw, final dta dta, final int n, final int n2, final dwp dwp) {
        throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ".concat(this.toString()));
    }
    
    protected cxz aB(final dsw dsw, final cxz cxz) {
        return cxz;
    }
    
    protected void aC(final cxz cxz) {
    }
    
    protected void aa(final dsw dsw, final Object o) {
    }
    
    protected void ab(final dsw dsw) {
    }
    
    protected void ac(final dsw dsw, final Object o) {
    }
    
    protected void ad(final dwq dwq, final dwq dwq2) {
    }
    
    public final void ae(final dsw dsw, final Object o) {
        try {
            this.ac(dsw, o);
        }
        catch (final Exception ex) {
            cox.g(dsw, ex);
        }
    }
    
    protected boolean af() {
        return false;
    }
    
    protected boolean ag() {
        return false;
    }
    
    public boolean ah() {
        return false;
    }
    
    protected boolean ai() {
        return false;
    }
    
    protected boolean aj() {
        return false;
    }
    
    public boolean ak() {
        return false;
    }
    
    public boolean al() {
        return false;
    }
    
    protected boolean am() {
        return false;
    }
    
    public int an() {
        return 1;
    }
    
    public void ao() {
    }
    
    public void ap() {
    }
    
    protected int aq(final int n, final int n2) {
        return Integer.MIN_VALUE;
    }
    
    protected int ar() {
        return 0;
    }
    
    public void as() {
    }
    
    protected void at() {
    }
    
    protected void au(final View view, final aol aol) {
    }
    
    protected void av(final aol aol, final int n, final int n2, final int n3) {
    }
    
    protected void aw(final Object o) {
    }
    
    public void ax() {
    }
    
    protected boolean ay(final dss dss, final dss dss2) {
        dwq s;
        if (dss == null) {
            s = null;
        }
        else {
            s = dss.s;
        }
        final dwq s2 = dss2.s;
        return !dss.f(dss2) || !cox.j(s, s2);
    }
    
    public final boolean az(final dss dss, final dss dss2) {
        return !this.am() || this.ay(dss, dss2);
    }
    
    protected dss c(final dsw dsw) {
        return (dss)dsm.b(dsw).a;
    }
    
    protected duz d(final dsw dsw) {
        return dvb.b(dsw, (dss)this, false);
    }
    
    protected abstract dum m();
}
