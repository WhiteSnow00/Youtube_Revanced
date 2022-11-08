import java.util.concurrent.atomic.AtomicReference;
import java.lang.ref.WeakReference;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ory
{
    public View a;
    public Integer b;
    public Integer c;
    public oue d;
    public asjf e;
    public oa f;
    public StringBuilder g;
    public String h;
    public String i;
    public WeakReference j;
    public osh k;
    public String l;
    public String m;
    public otb n;
    public AtomicReference o;
    public byte p;
    public elw q;
    private float r;
    private boolean s;
    private WeakReference t;
    private otg u;
    private afcr v;
    private boolean w;
    private boolean x;
    private int y;
    
    public ory() {
    }
    
    public ory(final orz orz) {
        this.a = orz.b;
        this.b = orz.c;
        this.c = orz.d;
        this.d = orz.e;
        this.e = orz.f;
        this.r = orz.g;
        this.q = orz.y;
        this.f = orz.h;
        this.s = orz.i;
        this.g = orz.j;
        this.h = orz.k;
        this.i = orz.l;
        this.t = orz.m;
        this.j = orz.n;
        this.u = orz.o;
        this.v = orz.p;
        this.k = orz.q;
        this.l = orz.r;
        this.m = orz.s;
        this.w = orz.t;
        this.n = orz.u;
        this.x = orz.v;
        this.y = orz.w;
        this.o = orz.x;
        this.p = 63;
    }
    
    public final orz a() {
        final byte p = this.p;
        final boolean b = true;
        if (p == 63 && this.h != null && this.i != null) {
            final orz orz = new orz(this.a, this.b, this.c, this.d, this.e, this.r, this.q, this.f, this.s, this.g, this.h, this.i, this.t, this.j, this.u, this.v, this.k, this.l, this.m, this.w, this.n, this.x, this.y, this.o, null, null, null);
            boolean b2 = b;
            if (orz.u != null) {
                b2 = (!orz.v && b);
            }
            agot.E(b2, (Object)"Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
            return orz;
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.p & 0x1) == 0x0) {
            sb.append(" imagePrefetchRangeRatio");
        }
        if ((this.p & 0x2) == 0x0) {
            sb.append(" useIncrementalMountOnChildrenInternal");
        }
        if ((this.p & 0x4) == 0x0) {
            sb.append(" useLegacyVisibleInternal");
        }
        if (this.h == null) {
            sb.append(" elementId");
        }
        if (this.i == null) {
            sb.append(" identifierProperty");
        }
        if ((this.p & 0x8) == 0x0) {
            sb.append(" shouldAddDebuggerViewTags");
        }
        if ((this.p & 0x10) == 0x0) {
            sb.append(" couldOverlapWithElementsConfig");
        }
        if ((this.p & 0x20) == 0x0) {
            sb.append(" elementDepthInTree");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    protected final void b(final boolean x) {
        this.x = x;
        this.p |= 0x10;
    }
    
    public final void c(final int y) {
        this.y = y;
        this.p |= 0x20;
    }
    
    public final void d(final float r) {
        this.r = r;
        this.p |= 0x1;
    }
    
    public final void e(final aqec aqec) {
        WeakReference t;
        if (aqec == null) {
            t = null;
        }
        else {
            t = new WeakReference((T)aqec);
        }
        this.t = t;
    }
    
    public final void f(final boolean w) {
        this.w = w;
        this.p |= 0x8;
    }
    
    public final void g(final otg u) {
        if (u == null) {
            return;
        }
        this.b(true);
        this.u = u;
    }
    
    public final void h(final afcr v) {
        this.b(true);
        this.v = v;
    }
    
    public final void i(final boolean s) {
        this.b(true);
        this.s = s;
        this.p |= 0x2;
    }
}
