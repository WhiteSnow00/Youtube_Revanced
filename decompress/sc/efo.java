import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$MeasureSpec;
import com.facebook.litho.ComponentTree;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.facebook.litho.widget.LithoScrollView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efo extends dst
{
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean A;
    @dyi(a = 10)
    @dyj(a = dyk.a)
    public dst a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean c;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean d;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int e;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean f;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public apo g;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int y;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public eek z;
    
    public efo() {
        super("VerticalScroll");
        this.y = 1;
    }
    
    private final efn aD() {
        return (efn)super.s;
    }
    
    private final olp aE() {
        return (olp)super.t;
    }
    
    protected static final olp b() {
        return new olp();
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return LayoutInflater.from(context).inflate(2131624682, (ViewGroup)null, false);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final dst a = this.a;
        final int e = this.e;
        final boolean d = this.d;
        final aulc a2 = new aulc((byte[])null, (byte[])null);
        a2.a = e;
        elx.a = a2;
        final dtg b = ComponentTree.b(dsx.c(dsx), a);
        b.d = d;
        elx2.a = b.a();
        this.aD().b = (aulc)elx.a;
        this.aD().a = (ComponentTree)elx2.a;
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final dst a = this.a;
        boolean c = this.c;
        final boolean b = this.b;
        final ComponentTree a2 = this.aD().a;
        final Object b2 = this.aE().b;
        final Object a3 = this.aE().a;
        final int h = dtb.H();
        final int e = dtb.E();
        final int f = dtb.F();
        final int a4 = dtb.a();
        final int g = dtb.G();
        final int d = dtb.D();
        if (b2 != null && (int)b2 == h - e - f) {
            if (!c || (a3 != null && (int)a3 == a4 - g - d)) {
                return;
            }
            c = true;
        }
        epf.Y(dsx, View$MeasureSpec.makeMeasureSpec(dtb.H(), 1073741824), View$MeasureSpec.makeMeasureSpec(dtb.a(), 1073741824), new dwq(), a2, a, c, b);
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        epf.Y(dsx, n, n2, dwq, this.aD().a, this.a, this.c, this.b);
        elx.a = dwq.a;
        elx2.a = dwq.b;
        this.aE().b = elx.a;
        this.aE().a = elx2.a;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final LithoScrollView lithoScrollView = (LithoScrollView)o;
        final boolean a = this.A;
        final boolean f = this.f;
        final boolean d = this.d;
        final apo g = this.g;
        final eek z = this.z;
        final int y = this.y;
        final ComponentTree a2 = this.aD().a;
        final aulc b = this.aD().b;
        lithoScrollView.d.B(a2);
        lithoScrollView.f = d;
        lithoScrollView.h = b;
        final jkm e = new jkm(lithoScrollView, b, 1, (byte[])null, (byte[])null, (byte[])null);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)e);
        lithoScrollView.e = (ViewTreeObserver$OnPreDrawListener)e;
        if (z != null) {
            lithoScrollView.g = new ebv();
            lithoScrollView.g.a = z;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.setNestedScrollingEnabled(f);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(a);
        lithoScrollView.c = g;
        lithoScrollView.setOverScrollMode(y);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final LithoScrollView lithoScrollView = (LithoScrollView)o;
        lithoScrollView.c = null;
        lithoScrollView.d.B((ComponentTree)null);
        lithoScrollView.h = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.e);
        lithoScrollView.e = null;
        final ebv g = lithoScrollView.g;
        if (g != null) {
            g.a = null;
            lithoScrollView.g = null;
        }
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        final efn efn = (efn)dwr;
        final efn efn2 = (efn)dwr2;
        efn2.a = efn.a;
        efn2.b = efn.b;
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean ah() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final boolean ay(dst a, final dst dst) {
        final efo efo = (efo)a;
        final efo efo2 = (efo)dst;
        final Object o = null;
        if (efo == null) {
            a = null;
        }
        else {
            a = efo.a;
        }
        final dub dub = new dub((Object)a, (Object)efo2.a);
        Object value;
        if (efo == null) {
            value = null;
        }
        else {
            value = efo.A;
        }
        final dub dub2 = new dub(value, (Object)efo2.A);
        Object value2;
        if (efo == null) {
            value2 = null;
        }
        else {
            value2 = true;
        }
        final dub dub3 = new dub(value2, (Object)true);
        Object value3;
        if (efo == null) {
            value3 = null;
        }
        else {
            value3 = efo.c;
        }
        final dub dub4 = new dub(value3, (Object)efo2.c);
        Object value4;
        if (efo == null) {
            value4 = null;
        }
        else {
            value4 = efo.f;
        }
        final dub dub5 = new dub(value4, (Object)efo2.f);
        Object value5;
        if (efo == null) {
            value5 = o;
        }
        else {
            value5 = efo.d;
        }
        final dub dub6 = new dub(value5, (Object)efo2.d);
        return !((dst)dub.a).f((dst)dub.b) || !((Boolean)dub2.a).equals(dub2.b) || !((Boolean)dub3.a).equals(dub3.b) || !((Boolean)dub4.a).equals(dub4.b) || !((Boolean)dub5.a).equals(dub5.b) || !((Boolean)dub6.a).equals(dub6.b);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final efo efo = (efo)dst;
        final dst a = this.a;
        Label_0062: {
            if (a != null) {
                if (a.f(efo.a)) {
                    break Label_0062;
                }
            }
            else if (efo.a == null) {
                break Label_0062;
            }
            return false;
        }
        if (this.b != efo.b) {
            return false;
        }
        if (this.c != efo.c) {
            return false;
        }
        if (this.d != efo.d) {
            return false;
        }
        if (this.e != efo.e) {
            return false;
        }
        if (this.f != efo.f) {
            return false;
        }
        final apo g = this.g;
        Label_0159: {
            if (g != null) {
                if (g.equals(efo.g)) {
                    break Label_0159;
                }
            }
            else if (efo.g == null) {
                break Label_0159;
            }
            return false;
        }
        if (this.y != efo.y) {
            return false;
        }
        final eek z = this.z;
        if (z != null) {
            if (z.equals(efo.z)) {
                return this.A == efo.A;
            }
        }
        else if (efo.z == null) {
            return this.A == efo.A;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final efo efo = (efo)super.j();
        final dst a = efo.a;
        dst j;
        if (a != null) {
            j = a.j();
        }
        else {
            j = null;
        }
        efo.a = j;
        efo.s = (dwr)new efn();
        efo.t = (duz)b();
        return efo;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new efn();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final olp olp = (olp)duz;
        final olp olp2 = (olp)duz2;
        olp.a = olp2.a;
        olp.b = olp2.b;
    }
}
