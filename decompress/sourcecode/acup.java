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

public final class acup implements acue, tpb, tpa
{
    private static final int g;
    private static final int h;
    public final acuq a;
    public final Set b;
    public final tti c;
    public tpc d;
    public boolean e;
    public acug f;
    private final Rect i;
    private final int[] j;
    private final ViewTreeObserver$OnGlobalLayoutListener k;
    private View l;
    private acun m;
    private boolean n;
    private final auip o;
    
    static {
        g = (int)TimeUnit.SECONDS.toMillis(12L);
        h = (int)TimeUnit.SECONDS.toMillis(6L);
    }
    
    public acup(final auip o, final vax vax, final wwu wwu, final byte[] array, final byte[] array2, final byte[] array3) {
        this.i = new Rect();
        this.j = new int[2];
        this.n = false;
        this.o = o;
        this.a = new acuq((acue)this, vax, wwu);
        this.b = new CopyOnWriteArraySet();
        this.c = new tti(Looper.myLooper(), (Object)this);
        this.k = (ViewTreeObserver$OnGlobalLayoutListener)new zdj(this, 3);
    }
    
    private final Rect l(Rect i) {
        this.i.set(i);
        this.l.getLocationInWindow(this.j);
        i = this.i;
        final int[] j = this.j;
        i.offset(j[0], j[1]);
        return this.i;
    }
    
    private static boolean m(final acug acug) {
        View c;
        if (acug != null) {
            c = acug.c;
        }
        else {
            c = null;
        }
        return c != null && c.isShown();
    }
    
    public final void b(final acug acug) {
        if (acug != null && acug == this.f) {
            this.f();
        }
    }
    
    public final void c(acug c) {
        View c2;
        if (c != null) {
            c2 = c.c;
        }
        else {
            c2 = null;
        }
        if (c2 != null) {
            if (!tqt.e(c2.getContext())) {
                if (this.f == null && !this.i()) {
                    this.f = c;
                    final auip o = this.o;
                    final acuf a = acug.a();
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
                    final aibb f = c.f;
                    if (f != null) {
                        a.a(f);
                    }
                    else {
                        a.d = null;
                    }
                    final aibb g = c.g;
                    if (g != null) {
                        a.b(g);
                    }
                    else {
                        a.e = null;
                    }
                    a.h = (acul)new acuo(this, c);
                    c = a.c();
                    final View c3 = c.c;
                    final View inflate = View.inflate(c3.getContext(), 2131625645, (ViewGroup)null);
                    final TextView textView = (TextView)inflate.findViewById(2131432130);
                    final TextView textView2 = (TextView)inflate.findViewById(2131432127);
                    tmy.t(textView, c.d);
                    tmy.t(textView2, c.e);
                    final int visibility = textView.getVisibility();
                    boolean b = false;
                    if (visibility == 8) {
                        tmy.aF((View)textView2, tmy.aB(0), (Class)ViewGroup$MarginLayoutParams.class);
                    }
                    final TextView textView3 = (TextView)inflate.findViewById(2131427452);
                    final TextView textView4 = (TextView)inflate.findViewById(2131428701);
                    auip.D(textView3, c.f);
                    auip.D(textView4, c.g);
                    final acun m = new acun(inflate, c3, c.j, c.k, c.i, 0, Optional.of(o.b));
                    ((acum)m.e).g = (boolean)c.n.e((Object)false);
                    o.E(textView3, m, c.f, 1);
                    o.E(textView4, m, c.g, 2);
                    final float l = c.l;
                    final acum acum = (acum)m.e;
                    acum.l = l;
                    if (acum.isShown()) {
                        acum.requestLayout();
                    }
                    if (c.m.h()) {
                        ((acum)m.e).e((int)c.m.c());
                    }
                    if (1 == c.h) {
                        b = true;
                    }
                    m.d(b);
                    m.f(c.q);
                    m.e((View$OnClickListener)new aafm(c, m, 6));
                    this.m = m;
                    this.d.c(c2);
                    c2.getViewTreeObserver().addOnGlobalLayoutListener(this.k);
                }
            }
        }
    }
    
    public final void d(final acun acun, final int n) {
        if (this.i()) {
            acun.b(n);
            if (acun == this.m) {
                this.h();
            }
        }
        if (this.n) {
            this.h();
        }
    }
    
    public final void e(final View view) {
        if (view == null) {
            this.f();
        }
    }
    
    public final void f() {
        this.d(this.m, 0);
    }
    
    public final void g(final View l) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.l = l;
        final tpc d = new tpc(l);
        this.d = d;
        d.c = (tpb)this;
        d.b = (tpa)this;
    }
    
    public final void h() {
        final acug f = this.f;
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
    
    public final boolean i() {
        final acun m = this.m;
        return m != null && m.i();
    }
    
    public final boolean j() {
        return this.m != null && m(this.f);
    }
    
    public final acuf k(final aotf aotf) {
        final acuq a = this.a;
        acuf a3;
        if (aotf == null) {
            final acue a2 = a.a;
            a3 = acug.a();
        }
        else {
            final acue a4 = a.a;
            final acuf a5 = acug.a();
            final long m = aotf.m;
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
            Label_0108: {
                if ((aotf.b & 0x1) != 0x0) {
                    anmc anmc;
                    if ((anmc = aotf.c) == null) {
                        anmc = anmc.a;
                    }
                    if (anmc.c) {
                        b = true;
                        break Label_0108;
                    }
                }
                b = false;
            }
            a5.h(b);
            final int b2 = aotf.b;
            final actk actk = null;
            ajsq ajsq;
            if ((b2 & 0x4) != 0x0) {
                if ((ajsq = aotf.e) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            a5.b = (CharSequence)abyh.b(ajsq);
            ajsq ajsq2;
            if ((aotf.b & 0x8) != 0x0) {
                if ((ajsq2 = aotf.f) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            a5.c = (CharSequence)abyh.b(ajsq2);
            anss anss;
            if ((anss = aotf.h) == null) {
                anss = anss.a;
            }
            aibb aibb;
            if (((agzd)anss).rs((agyr)ButtonRendererOuterClass.buttonRenderer)) {
                anss anss2;
                if ((anss2 = aotf.h) == null) {
                    anss2 = anss.a;
                }
                aibb = (aibb)((agzd)anss2).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aibb = null;
            }
            final acuf a6 = a5.a(aibb);
            anss anss3;
            if ((anss3 = aotf.g) == null) {
                anss3 = anss.a;
            }
            aibb aibb2;
            if (((agzd)anss3).rs((agyr)ButtonRendererOuterClass.buttonRenderer)) {
                anss anss4;
                if ((anss4 = aotf.g) == null) {
                    anss4 = anss.a;
                }
                aibb2 = (aibb)((agzd)anss4).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aibb2 = null;
            }
            final acuf b3 = a6.b(aibb2);
            aotb aotb;
            if ((aotb = aotf.l) == null) {
                aotb = aotb.a;
            }
            final int n3 = 2;
            int n4 = 0;
            Label_0402: {
                if (aotb != null) {
                    final int ah = aqql.aH(aotb.b);
                    if (ah != 0) {
                        if (ah == 2) {
                            n4 = 0;
                            break Label_0402;
                        }
                    }
                }
                n4 = 1;
            }
            b3.o(n4);
            aote aote;
            if ((aote = aotf.k) == null) {
                aote = aote.a;
            }
            int af;
            if (aote == null || (af = aqql.aF(aote.b)) == 0) {
                af = 1;
            }
            int n5;
            if (--af != 1) {
                if (af != 2) {
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
            aotd aotd;
            if ((aotd = aotf.j) == null) {
                aotd = aotd.a;
            }
            int ag;
            if (aotd == null || (ag = aqql.aG(aotd.b)) == 0) {
                ag = 1;
            }
            int n6 = 0;
            Label_0589: {
                if (--ag != 1) {
                    if (ag == 3) {
                        n6 = 3;
                        break Label_0589;
                    }
                    if (ag == 4) {
                        n6 = 4;
                        break Label_0589;
                    }
                    if (ag != 7 && ag != 8) {
                        n6 = 2;
                        break Label_0589;
                    }
                }
                n6 = 1;
            }
            b3.m(n6);
            aotd aotd2;
            if ((aotd2 = aotf.j) == null) {
                aotd2 = aotd.a;
            }
            int ag2;
            if (aotd2 == null || (ag2 = aqql.aG(aotd2.b)) == 0) {
                ag2 = 1;
            }
            int n7 = 0;
            switch (ag2 - 1) {
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
            if ((i = aotf.i) <= 0.0f) {
                i = 1.0f;
            }
            b3.l(i);
            b3.d(aexq.k((Object)Boolean.TRUE));
            Object f = null;
            Label_0865: {
                Label_0853: {
                    if ((aotf.b & 0x1) != 0x0) {
                        anmc anmc2;
                        if ((anmc2 = aotf.c) == null) {
                            anmc2 = anmc.a;
                        }
                        if (anmc2.d.size() > 0) {
                            break Label_0853;
                        }
                        final anmc c = aotf.c;
                        anmc a7;
                        if (c == null) {
                            a7 = anmc.a;
                        }
                        else {
                            a7 = c;
                        }
                        if ((a7.b & 0x4) != 0x0) {
                            break Label_0853;
                        }
                        anmc a8;
                        if ((a8 = c) == null) {
                            a8 = anmc.a;
                        }
                        if ((a8.b & 0x8) != 0x0) {
                            break Label_0853;
                        }
                    }
                    if ((aotf.b & 0x4000) == 0x0) {
                        f = actk;
                        break Label_0865;
                    }
                }
                f = new hkg(a, aotf, 6);
            }
            b3.f = (actk)f;
            a3 = b3;
        }
        return a3;
    }
    
    public final void te(final toz toz) {
        if (this.m == null) {
            return;
        }
        if (!toz.e() || !m(this.f)) {
            this.f();
            return;
        }
        if (this.m.i()) {
            final acun m = this.m;
            ((acum)m.e).d(this.l(toz.a));
            ((acum)m.e).requestLayout();
            ((acum)m.e).invalidate();
            return;
        }
        final acug f = this.f;
        final Rect l = this.l(toz.a);
        final actk o = f.o;
        if (f.a) {
            if (o != null) {
                o.mv((Object)f);
                o.a((Object)f, 3);
            }
            for (final actk actk : this.b) {
                actk.mv((Object)f);
                actk.a((Object)f, 3);
            }
            this.h();
            return;
        }
        this.m.g(l);
        int n = f.b;
        if (n != -2) {
            if (n != -1) {
                if (n == 0) {
                    n = acup.g;
                }
            }
            else {
                n = acup.h;
            }
            final tti c = this.c;
            c.sendMessageDelayed(c.obtainMessage(1, (Object)this.m), (long)n);
        }
        if (o != null) {
            o.mv((Object)f);
        }
        final Iterator iterator2 = this.b.iterator();
        while (iterator2.hasNext()) {
            ((actk)iterator2.next()).mv((Object)f);
        }
        this.n = true;
    }
}
