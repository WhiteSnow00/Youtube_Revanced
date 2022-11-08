import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izk implements rna, izt
{
    public final izu a;
    public final sjy b;
    CountDownTimer c;
    public long d;
    public boolean e;
    private final toa f;
    private final rne g;
    private final fjp h;
    private final wwv i;
    private sdm j;
    private sfh k;
    private sdr l;
    private soy m;
    private final qbo n;
    private final zhb o;
    
    public izk(final izu a, final toa f, final sjy b, final rne g, final zhb o, final qbo n, final fjp h, final wwv i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        o.getClass();
        this.o = o;
        n.getClass();
        this.n = n;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        this.f();
    }
    
    private final void f() {
        this.b();
        this.d = 0L;
        this.a.setVisibility(8);
        this.a.e();
        this.m = null;
        this.f.j(false);
    }
    
    private final void g() {
        this.j = null;
        this.l = null;
        this.k = null;
    }
    
    private final void h(final int n) {
        final sdr l = this.l;
        if (l != null) {
            this.g.e(this.j, this.k, l, n);
            this.g.h(this.j, this.k, this.l);
        }
        final sfh k = this.k;
        if (k != null) {
            this.g.l(this.j, k);
            this.g.q(this.j, this.k);
        }
        this.g();
    }
    
    public final void a(final sau sau) {
        if (this.m != null) {
            this.h(sdr.a(sau));
            this.m.f(sau);
        }
        this.f();
    }
    
    public final void b() {
        final CountDownTimer c = this.c;
        if (c != null) {
            c.cancel();
            this.c = null;
        }
    }
    
    public final void c() {
        this.h(4);
        this.f();
    }
    
    public final void d() {
        this.c = new izj(this, this.d).start();
    }
    
    public final boolean e(final soy m) {
        if (m.c().i() == null) {
            return false;
        }
        final ahlt i = m.c().i();
        this.j = sdm.a(m.e(), m.d());
        final sfh r = this.o.R();
        this.k = r;
        this.l = this.n.u(r, i);
        this.g.p(this.j, this.k);
        this.g.g(this.j, this.k, this.l);
        this.f();
        this.m = m;
        final int u = aeda.U(i.f);
        if (u != 0) {
            if (u == 2 && this.h.j().m()) {
                this.g.j(this.j, this.k);
                this.g.b(this.j, this.k, this.l);
                this.a(sau.i);
                return false;
            }
        }
        anss anss;
        if ((anss = i.e) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
            this.e = i.g;
            this.d = TimeUnit.SECONDS.toMillis((long)i.d);
            this.d();
            if ((i.b & 0x40) != 0x0) {
                final izu a = this.a;
                ahlu k;
                if ((k = i.h) == null) {
                    k = ahlu.a;
                }
                a.k = k;
            }
            anss anss2;
            if ((anss2 = i.e) == null) {
                anss2 = anss.a;
            }
            final ajkj e = (ajkj)((agzd)anss2).rr((agyr)ElementRendererOuterClass.elementRenderer);
            final aexq j = this.l.j;
            this.f.j(true);
            final acij acij = new acij();
            acij.g(new HashMap());
            acij.a(this.i);
            if (j.h()) {
                final agza builder = ((agzi)alff.a).createBuilder();
                final alek v = (alek)j.c();
                builder.copyOnWrite();
                final alff alff = (alff)builder.instance;
                alff.v = v;
                alff.c |= 0x400;
                acij.e = (alff)builder.build();
            }
            final izu a2 = this.a;
            if (a2.f == null) {
                a2.f = (ViewGroup)LayoutInflater.from(a2.getContext()).inflate(2131624001, (ViewGroup)a2);
                a2.g = (ViewGroup)a2.f.findViewById(2131427516);
                a2.h = a2.f.findViewById(2131431558);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)a2.h.getLayoutParams();
                relativeLayout$LayoutParams.bottomMargin += a2.c;
                a2.h.setOnClickListener((View$OnClickListener)new izp(a2, 2));
                a2.h.setOnTouchListener((View$OnTouchListener)new gby(a2, 4));
            }
            a2.e = e;
            ((acae)a2.a.a()).d(a2.e);
            a2.l = ((acae)a2.a.a()).d(a2.e);
            a2.g.addView(a2.b.a(), 0);
            a2.b.b(acij, a2.l);
            a2.f.setVisibility(0);
            a2.g.setVisibility(0);
            a2.h.setVisibility(0);
            a2.f();
            this.g.j(this.j, this.k);
            this.g.b(this.j, this.k, this.l);
            return true;
        }
        this.g.h(this.j, this.k, this.l);
        this.g.q(this.j, this.k);
        this.g();
        return false;
    }
}
