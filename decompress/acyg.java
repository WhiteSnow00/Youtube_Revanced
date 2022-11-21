import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View$OnClickListener;
import j$.util.Optional;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.view.ViewGroup;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Rect;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyg implements acxv, tsh, tsg
{
    private static final int g;
    private static final int h;
    public final acyh a;
    public final Set b;
    public final two c;
    public tsi d;
    public boolean e;
    public acxx f;
    private final Rect i;
    private final int[] j;
    private final ViewTreeObserver$OnGlobalLayoutListener k;
    private View l;
    private acye m;
    private boolean n;
    private final aapu o;
    
    static {
        g = (int)TimeUnit.SECONDS.toMillis(12L);
        h = (int)TimeUnit.SECONDS.toMillis(6L);
    }
    
    public acyg(final aapu o, final veh veh, final xaa xaa, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = new Rect();
        this.j = new int[2];
        this.n = false;
        this.o = o;
        this.a = new acyh(this, veh, xaa);
        this.b = new CopyOnWriteArraySet();
        this.c = new two(Looper.myLooper(), (Object)this);
        this.k = (ViewTreeObserver$OnGlobalLayoutListener)new zha(this, 3);
    }
    
    private final Rect m(Rect i) {
        this.i.set(i);
        this.l.getLocationInWindow(this.j);
        i = this.i;
        final int[] j = this.j;
        i.offset(j[0], j[1]);
        return this.i;
    }
    
    private static boolean n(final acxx acxx) {
        View c;
        if (acxx != null) {
            c = acxx.c;
        }
        else {
            c = null;
        }
        return c != null && c.isShown();
    }
    
    @Override
    public final acxw a() {
        return acxx.a();
    }
    
    @Override
    public final void b(final acxx acxx) {
        if (acxx != null && acxx == this.f) {
            this.g();
        }
    }
    
    @Override
    public final void c(acxx c) {
        View c2;
        if (c != null) {
            c2 = c.c;
        }
        else {
            c2 = null;
        }
        if (c2 != null) {
            if (!tua.e(c2.getContext())) {
                if (this.f == null && !this.j()) {
                    this.f = c;
                    final aapu o = this.o;
                    final acxw a = acxx.a();
                    a.a = c.c;
                    a.b = c.d;
                    a.c = c.e;
                    a.o(c.h);
                    a.p(c.i);
                    a.m(c.j);
                    a.f(c.k);
                    a.l(c.l);
                    a.d(c.n);
                    a.g(c.m);
                    final aies f = c.f;
                    if (f != null) {
                        a.a(f);
                    }
                    else {
                        a.d = null;
                    }
                    final aies g = c.g;
                    if (g != null) {
                        a.b(g);
                    }
                    else {
                        a.e = null;
                    }
                    a.h = new acyf(this, c);
                    c = a.c();
                    final View c3 = c.c;
                    final View inflate = View.inflate(c3.getContext(), 2131625652, (ViewGroup)null);
                    final TextView textView = (TextView)inflate.findViewById(2131432134);
                    final TextView textView2 = (TextView)inflate.findViewById(2131432131);
                    tqf.t(textView, c.d);
                    tqf.t(textView2, c.e);
                    final int visibility = textView.getVisibility();
                    boolean b = false;
                    if (visibility == 8) {
                        tqf.aF((View)textView2, tqf.aB(0), (Class)ViewGroup$MarginLayoutParams.class);
                    }
                    final TextView textView3 = (TextView)inflate.findViewById(2131427452);
                    final TextView textView4 = (TextView)inflate.findViewById(2131428701);
                    aapu.bR(textView3, c.f);
                    aapu.bR(textView4, c.g);
                    final acye m = new acye(inflate, c3, c.j, c.k, c.i, 0, Optional.of(o.a));
                    ((acyd)m.e).g = (boolean)c.n.e(false);
                    o.bS(textView3, m, c.f, 1);
                    o.bS(textView4, m, c.g, 2);
                    final float l = c.l;
                    final acyd acyd = (acyd)m.e;
                    acyd.l = l;
                    if (acyd.isShown()) {
                        acyd.requestLayout();
                    }
                    if (c.m.h()) {
                        ((acyd)m.e).e((int)c.m.c());
                    }
                    if (1 == c.h) {
                        b = true;
                    }
                    m.d(b);
                    m.f(c.q);
                    m.e((View$OnClickListener)new zig(c, m, 7));
                    this.m = m;
                    this.d.c(c2);
                    c2.getViewTreeObserver().addOnGlobalLayoutListener(this.k);
                }
            }
        }
    }
    
    public final void d(final acxb acxb) {
        this.b.add(acxb);
        final acxx f = this.f;
        if (f != null) {
            acxb.mu(f);
        }
    }
    
    public final void e(final View view) {
        if (view == null) {
            this.g();
        }
    }
    
    public final void f(final acye acye, final int n) {
        if (this.j()) {
            acye.b(n);
            if (acye == this.m) {
                this.i();
            }
        }
        if (this.n) {
            this.i();
        }
    }
    
    public final void g() {
        this.f(this.m, 0);
    }
    
    public final void h(final View l) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.l = l;
        final tsi d = new tsi(l);
        this.d = d;
        d.c = (tsh)this;
        d.b = (tsg)this;
    }
    
    public final void i() {
        final acxx f = this.f;
        if (f != null) {
            final View c = f.c;
            if (c != null) {
                c.getViewTreeObserver().removeOnGlobalLayoutListener(this.k);
            }
        }
        this.m = null;
        this.f = null;
        this.n = false;
    }
    
    public final boolean j() {
        final acye m = this.m;
        return m != null && m.i();
    }
    
    public final boolean k() {
        return this.m != null && n(this.f);
    }
    
    public final acxw l(final aoxu aoxu) {
        final acyh a = this.a;
        acxw a3;
        if (aoxu == null) {
            final acxv a2 = a.a;
            a3 = acxx.a();
        }
        else {
            final acxv a4 = a.a;
            final acxw a5 = acxx.a();
            final long m = aoxu.m;
            final int n = 0;
            int n2;
            if (m > 0L) {
                n2 = (int)m;
            }
            else {
                n2 = 0;
            }
            a5.k(n2);
            boolean b = false;
            Label_0115: {
                if ((aoxu.b & 0x1) != 0x0) {
                    anql anql;
                    if ((anql = aoxu.c) == null) {
                        anql = anql.a;
                    }
                    if (anql.c) {
                        b = true;
                        break Label_0115;
                    }
                }
                b = false;
            }
            a5.h(b);
            final int b2 = aoxu.b;
            final acxb acxb = null;
            ajws ajws;
            if ((b2 & 0x4) != 0x0) {
                if ((ajws = aoxu.e) == null) {
                    ajws = ajws.a;
                }
            }
            else {
                ajws = null;
            }
            a5.b = (CharSequence)acbu.b(ajws);
            ajws ajws2;
            if ((aoxu.b & 0x8) != 0x0) {
                if ((ajws2 = aoxu.f) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            a5.c = (CharSequence)acbu.b(ajws2);
            anxb anxb;
            if ((anxb = aoxu.h) == null) {
                anxb = anxb.a;
            }
            aies aies;
            if (((ahcu)anxb).ry((ahci)ButtonRendererOuterClass.buttonRenderer)) {
                anxb anxb2;
                if ((anxb2 = aoxu.h) == null) {
                    anxb2 = anxb.a;
                }
                aies = (aies)((ahcu)anxb2).rx((ahci)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aies = null;
            }
            final acxw a6 = a5.a(aies);
            anxb anxb3;
            if ((anxb3 = aoxu.g) == null) {
                anxb3 = anxb.a;
            }
            aies aies2;
            if (((ahcu)anxb3).ry((ahci)ButtonRendererOuterClass.buttonRenderer)) {
                anxb anxb4;
                if ((anxb4 = aoxu.g) == null) {
                    anxb4 = anxb.a;
                }
                aies2 = (aies)((ahcu)anxb4).rx((ahci)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aies2 = null;
            }
            final acxw b3 = a6.b(aies2);
            aoxr aoxr;
            if ((aoxr = aoxu.l) == null) {
                aoxr = aoxr.a;
            }
            final int n3 = 2;
            int n4 = 0;
            Label_0439: {
                if (aoxr != null) {
                    final int aa = aqvq.aA(aoxr.b);
                    if (aa != 0) {
                        if (aa == 2) {
                            n4 = 0;
                            break Label_0439;
                        }
                    }
                }
                n4 = 1;
            }
            b3.o(n4);
            aoxt aoxt;
            if ((aoxt = aoxu.k) == null) {
                aoxt = aoxt.a;
            }
            int ay;
            if (aoxt == null || (ay = aqvq.ay(aoxt.b)) == 0) {
                ay = 1;
            }
            int n5;
            if (--ay != 1) {
                if (ay != 2) {
                    n5 = n;
                }
                else {
                    n5 = 2;
                }
            }
            else {
                n5 = 1;
            }
            b3.p(n5);
            aoxs aoxs;
            if ((aoxs = aoxu.j) == null) {
                aoxs = aoxs.a;
            }
            int az;
            if (aoxs == null || (az = aqvq.az(aoxs.b)) == 0) {
                az = 1;
            }
            int n6 = 0;
            Label_0634: {
                if (--az != 1) {
                    if (az == 3) {
                        n6 = 3;
                        break Label_0634;
                    }
                    if (az == 4) {
                        n6 = 4;
                        break Label_0634;
                    }
                    if (az != 7 && az != 8) {
                        n6 = 2;
                        break Label_0634;
                    }
                }
                n6 = 1;
            }
            b3.m(n6);
            aoxs aoxs2;
            if ((aoxs2 = aoxu.j) == null) {
                aoxs2 = aoxs.a;
            }
            int az2;
            if (aoxs2 == null || (az2 = aqvq.az(aoxs2.b)) == 0) {
                az2 = 1;
            }
            int n7 = 0;
            switch (az2 - 1) {
                default: {
                    n7 = n3;
                    break;
                }
                case 4:
                case 6:
                case 8: {
                    n7 = 3;
                    break;
                }
                case 3:
                case 5:
                case 7: {
                    n7 = 1;
                    break;
                }
            }
            b3.f(n7);
            float i;
            if ((i = aoxu.i) <= 0.0f) {
                i = 1.0f;
            }
            b3.l(i);
            b3.d(afbh.k(Boolean.TRUE));
            Object f = null;
            Label_0920: {
                Label_0907: {
                    if ((aoxu.b & 0x1) != 0x0) {
                        anql anql2;
                        if ((anql2 = aoxu.c) == null) {
                            anql2 = anql.a;
                        }
                        if (anql2.d.size() > 0) {
                            break Label_0907;
                        }
                        final anql c = aoxu.c;
                        anql a7;
                        if (c == null) {
                            a7 = anql.a;
                        }
                        else {
                            a7 = c;
                        }
                        if ((a7.b & 0x4) != 0x0) {
                            break Label_0907;
                        }
                        anql a8;
                        if ((a8 = c) == null) {
                            a8 = anql.a;
                        }
                        if ((a8.b & 0x8) != 0x0) {
                            break Label_0907;
                        }
                    }
                    if ((aoxu.b & 0x4000) == 0x0) {
                        f = acxb;
                        break Label_0920;
                    }
                }
                f = new hli(a, aoxu, 6);
            }
            b3.f = (acxb)f;
            a3 = b3;
        }
        return a3;
    }
    
    public final void ti(final tsf tsf) {
        if (this.m == null) {
            return;
        }
        if (!tsf.e() || !n(this.f)) {
            this.g();
            return;
        }
        if (this.m.i()) {
            final acye m = this.m;
            ((acyd)m.e).d(this.m(tsf.a));
            ((acyd)m.e).requestLayout();
            ((acyd)m.e).invalidate();
            return;
        }
        final acxx f = this.f;
        final Rect i = this.m(tsf.a);
        final acxb o = f.o;
        if (f.a) {
            if (o != null) {
                o.mu(f);
                o.a(f, 3);
            }
            for (final acxb acxb : this.b) {
                acxb.mu(f);
                acxb.a(f, 3);
            }
            this.i();
            return;
        }
        this.m.g(i);
        int n = f.b;
        if (n != -2) {
            if (n != -1) {
                if (n == 0) {
                    n = acyg.g;
                }
            }
            else {
                n = acyg.h;
            }
            final two c = this.c;
            c.sendMessageDelayed(c.obtainMessage(1, (Object)this.m), (long)n);
        }
        if (o != null) {
            o.mu(f);
        }
        final Iterator iterator2 = this.b.iterator();
        while (iterator2.hasNext()) {
            ((acxb)iterator2.next()).mu(f);
        }
        this.n = true;
    }
}
