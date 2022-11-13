import java.util.Iterator;
import android.util.DisplayMetrics;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ValueAnimator;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$MeasureSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import com.facebook.litho.ComponentTree;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecj extends dst
{
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean A;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public String B;
    @dyi(a = 0)
    @dyj(a = dyk.a)
    public float C;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public String D;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int E;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public long F;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public eek G;
    @dyi(a = 3)
    @dyj(a = dyk.f)
    public boolean H;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public int I;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public int J;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public onc K;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public int L;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public egv a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public egv b;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean c;
    @dyi(a = 6)
    @dyj(a = dyk.a)
    List d;
    @dyi(a = 10)
    @dyj(a = dyk.a)
    public dst e;
    @dyi(a = 0)
    @dyj(a = dyk.a)
    public float f;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public boolean g;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public int y;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    public long z;
    
    public ecj() {
        super("HorizontalScroll");
        this.y = -1;
        this.E = 1;
        this.H = true;
    }
    
    private final ech aD() {
        return (ech)super.t;
    }
    
    private final eci aE() {
        return (eci)super.s;
    }
    
    protected static final ech b() {
        return new ech();
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new ecl(context);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final dst e = this.e;
        elx.a = new aulc(this.y);
        final dtg b = ComponentTree.b(dsx.c(dsx), e);
        b.d = false;
        elx2.a = b.a();
        elx3.a = new AtomicBoolean(false);
        this.aE().c = (aulc)elx.a;
        this.aE().a = (ComponentTree)elx2.a;
        this.aE().b = (AtomicBoolean)elx3.a;
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final dst e = this.e;
        final boolean g = this.g;
        final boolean a = this.A;
        final List d = this.d;
        final int l = this.L;
        final egv b = this.b;
        final int j = this.J;
        final int i = this.I;
        final egv a2 = this.a;
        final boolean c = this.c;
        final float c2 = this.C;
        final ComponentTree a3 = this.aE().a;
        final Integer e2 = this.aD().e;
        final Integer d2 = this.aD().d;
        final int n = dtb.H() - dtb.E() - dtb.F();
        if (e2 != null && d2 != null) {
            int n2;
            if (!g) {
                n2 = 0;
            }
            else {
                n2 = n;
            }
            elx.a = Math.max(e2, n2);
            elx2.a = d2;
        }
        else {
            final dwq dwq = new dwq();
            a3.o(e, View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(dtb.a(), 1073741824), dwq);
            final int a4 = dwq.a;
            int n3;
            if (!g) {
                n3 = 0;
            }
            else {
                n3 = n;
            }
            final int max = Math.max(a4, n3);
            final int b2 = dwq.b;
            elx.a = max;
            elx2.a = b2;
            if (a && (c || n < dwq.a) && d != null && !d.isEmpty()) {
                final dtg b3 = ComponentTree.b(dsx.c(dsx), ((dwn)bma.e(dsx, d, n, dwq.a, c2, l, b, j, i, a2)).a);
                int n4 = 0;
                b3.d = false;
                b3.a().o(e, View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(dtb.a(), 1073741824), dwq);
                final int a5 = dwq.a;
                if (g) {
                    n4 = n;
                }
                elx.a = Math.max(a5, n4);
                elx2.a = dwq.b;
            }
        }
        elx3.a = n;
        elx4.a = dtb.L();
        this.aD().b = (Integer)elx.a;
        this.aD().a = (Integer)elx2.a;
        this.aD().f = (Integer)elx3.a;
        this.aD().c = (egx)elx4.a;
    }
    
    public final void Z(final dsx dsx, final dtb dtb, int a, final int n, final dwq dwq) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final dst e = this.e;
        final boolean a2 = this.A;
        final List d = this.d;
        final int l = this.L;
        final egv b = this.b;
        final int j = this.J;
        final int i = this.I;
        final egv a3 = this.a;
        final boolean c = this.c;
        final float c2 = this.C;
        final ComponentTree a4 = this.aE().a;
        final dwq dwq2 = new dwq();
        a4.o(e, View$MeasureSpec.makeMeasureSpec(0, 0), n, dwq2);
        final int a5 = dwq2.a;
        final int b2 = dwq2.b;
        elx.a = a5;
        elx2.a = b2;
        int size;
        if (View$MeasureSpec.getMode(a) == 0) {
            size = a5;
        }
        else {
            size = View$MeasureSpec.getSize(a);
        }
        dwq.a = size;
        dwq.b = b2;
        if (a2 && (c || View$MeasureSpec.getSize(a) < a5) && d != null && !d.isEmpty()) {
            final dtg b3 = ComponentTree.b(dsx.c(dsx), ((dwn)bma.e(dsx, d, View$MeasureSpec.getSize(a), a5, c2, l, b, j, i, a3)).a);
            b3.d = false;
            b3.a().o(e, View$MeasureSpec.makeMeasureSpec(0, 0), n, dwq2);
            elx.a = dwq2.a;
            elx2.a = dwq2.b;
            if (View$MeasureSpec.getMode(a) == 0) {
                a = dwq2.a;
            }
            else {
                a = View$MeasureSpec.getSize(a);
            }
            dwq.a = a;
            dwq.b = dwq2.b;
        }
        this.aD().e = (Integer)elx.a;
        this.aD().d = (Integer)elx2.a;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final ecl ecl = (ecl)o;
        final boolean h = this.H;
        final onc k = this.K;
        final eek g = this.G;
        final int e = this.E;
        final boolean a = this.A;
        final float f = this.f;
        final long z = this.z;
        float c = this.C;
        final String b = this.B;
        final String d = this.D;
        long f2 = this.F;
        final aulc c2 = this.aE().c;
        final ComponentTree a2 = this.aE().a;
        final AtomicBoolean b2 = this.aE().b;
        final int intValue = this.aD().b;
        final int intValue2 = this.aD().a;
        final int intValue3 = this.aD().f;
        final egx c3 = this.aD().c;
        ecl.setHorizontalScrollBarEnabled(h);
        ecl.setOverScrollMode(e);
        ecl.a.B(a2);
        ecl.g = c2;
        ecl.e = k;
        ecl.b = intValue;
        ecl.c = intValue2;
        if (g != null) {
            ecl.f = new ebv();
            ecl.f.a = g;
        }
        ecl.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new fad(ecl, c2, c3, 1, (byte[])null, (byte[])null, (byte[])null));
        if (a) {
            ecl.d = false;
            final DisplayMetrics displayMetrics = dsx.b().getDisplayMetrics();
            if (b2.compareAndSet(false, true)) {
                final int hashCode = b.hashCode();
                int n = 0;
                Label_0326: {
                    if (hashCode != 1075628947) {
                        if (hashCode == 1663720443) {
                            if (b.equals("MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT")) {
                                n = 1;
                                break Label_0326;
                            }
                        }
                    }
                    else if (b.equals("MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT")) {
                        n = 0;
                        break Label_0326;
                    }
                    n = -1;
                }
                final boolean b3 = n == 0 || (n != 1 && c3 == egx.c);
                final int n2 = intValue / 2;
                if (c < 0.0f) {
                    c = 0.0f;
                }
                final float n3 = c / 2.0f;
                final int n4 = bma.d(displayMetrics, n3) + n2;
                int n5;
                int n6;
                if (b3) {
                    final int d2 = bma.d(displayMetrics, n3);
                    n5 = intValue - intValue3;
                    n6 = n2 - d2 - intValue3;
                }
                else {
                    n6 = n4;
                    n5 = 0;
                }
                final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { n5, n6 });
                if ("MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE".equals(d)) {
                    ofInt.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
                }
                else {
                    ofInt.setInterpolator((TimeInterpolator)new LinearInterpolator());
                }
                final float c4 = bma.c(displayMetrics, n4);
                if (f2 <= 0L) {
                    f2 = 100L;
                }
                ofInt.setDuration((long)(c4 * 1000.0f) / f2);
                ofInt.setStartDelay((long)(1000.0f * f));
                if (z > 0L) {
                    ofInt.setRepeatCount((int)z - 1);
                }
                else {
                    ofInt.setRepeatCount(-1);
                }
                ofInt.addListener((Animator$AnimatorListener)new eck(ecl, f, b3, intValue));
                ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(ecl, 4));
                ofInt.start();
            }
        }
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final ecl ecl = (ecl)o;
        ecl.a.B((ComponentTree)null);
        ecl.b = 0;
        ecl.c = 0;
        ecl.g = null;
        ecl.e = null;
        ecl.setScrollX(0);
        final ebv f = ecl.f;
        if (f != null) {
            f.a = null;
            ecl.f = null;
        }
        ecl.setScrollX(0);
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        final eci eci = (eci)dwr;
        final eci eci2 = (eci)dwr2;
        eci2.a = eci.a;
        eci2.b = eci.b;
        eci2.c = eci.c;
    }
    
    protected final boolean af() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final boolean al() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final ecj ecj = (ecj)dst;
        final egv a = this.a;
        Label_0065: {
            if (a != null) {
                if (a.equals((Object)ecj.a)) {
                    break Label_0065;
                }
            }
            else if (ecj.a == null) {
                break Label_0065;
            }
            return false;
        }
        final egv b = this.b;
        Label_0100: {
            if (b != null) {
                if (b.equals((Object)ecj.b)) {
                    break Label_0100;
                }
            }
            else if (ecj.b == null) {
                break Label_0100;
            }
            return false;
        }
        if (this.c != ecj.c) {
            return false;
        }
        final List d = this.d;
        Label_0232: {
            if (d != null) {
                if (ecj.d != null) {
                    if (d.size() == ecj.d.size()) {
                        final Iterator iterator = this.d.iterator();
                        final Iterator iterator2 = ecj.d.iterator();
                        while (iterator.hasNext() && iterator2.hasNext()) {
                            if (!((dst)iterator.next()).f((dst)iterator2.next())) {
                                return false;
                            }
                        }
                        break Label_0232;
                    }
                }
                return false;
            }
            if (ecj.d != null) {
                return false;
            }
        }
        final dst e = this.e;
        Label_0267: {
            if (e != null) {
                if (e.f(ecj.e)) {
                    break Label_0267;
                }
            }
            else if (ecj.e == null) {
                break Label_0267;
            }
            return false;
        }
        if (Float.compare(this.f, ecj.f) != 0) {
            return false;
        }
        if (this.g != ecj.g) {
            return false;
        }
        final int l = this.L;
        Label_0325: {
            if (l != 0) {
                if (l == ecj.L) {
                    break Label_0325;
                }
            }
            else if (ecj.L == 0) {
                break Label_0325;
            }
            return false;
        }
        if (this.y != ecj.y) {
            return false;
        }
        final int i = this.I;
        Label_0367: {
            if (i != 0) {
                if (i == ecj.I) {
                    break Label_0367;
                }
            }
            else if (ecj.I == 0) {
                break Label_0367;
            }
            return false;
        }
        if (this.z != ecj.z) {
            return false;
        }
        if (this.A != ecj.A) {
            return false;
        }
        final String b2 = this.B;
        Label_0429: {
            if (b2 != null) {
                if (b2.equals(ecj.B)) {
                    break Label_0429;
                }
            }
            else if (ecj.B == null) {
                break Label_0429;
            }
            return false;
        }
        if (Float.compare(this.C, ecj.C) != 0) {
            return false;
        }
        final String d2 = this.D;
        Label_0480: {
            if (d2 != null) {
                if (d2.equals(ecj.D)) {
                    break Label_0480;
                }
            }
            else if (ecj.D == null) {
                break Label_0480;
            }
            return false;
        }
        final onc k = this.K;
        Label_0515: {
            if (k != null) {
                if (k.equals((Object)ecj.K)) {
                    break Label_0515;
                }
            }
            else if (ecj.K == null) {
                break Label_0515;
            }
            return false;
        }
        if (this.E != ecj.E) {
            return false;
        }
        if (this.F != ecj.F) {
            return false;
        }
        final eek g = this.G;
        Label_0577: {
            if (g != null) {
                if (g.equals(ecj.G)) {
                    break Label_0577;
                }
            }
            else if (ecj.G == null) {
                break Label_0577;
            }
            return false;
        }
        if (this.H != ecj.H) {
            return false;
        }
        final int j = this.J;
        final int m = ecj.J;
        if (j != 0) {
            if (j == m) {
                return true;
            }
        }
        else if (m == 0) {
            return true;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final ecj ecj = (ecj)super.j();
        final dst e = ecj.e;
        dst j;
        if (e != null) {
            j = e.j();
        }
        else {
            j = null;
        }
        ecj.e = j;
        ecj.s = (dwr)new eci();
        ecj.t = (duz)b();
        return ecj;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new eci();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final ech ech = (ech)duz;
        final ech ech2 = (ech)duz2;
        ech.a = ech2.a;
        ech.b = ech2.b;
        ech.c = ech2.c;
        ech.d = ech2.d;
        ech.e = ech2.e;
        ech.f = ech2.f;
    }
}
