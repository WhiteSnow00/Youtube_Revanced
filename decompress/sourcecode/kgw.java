import java.util.Iterator;
import android.content.Context;
import java.util.ArrayList;
import android.text.Spanned;
import java.util.List;
import android.view.ViewStub;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

class kgw
{
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    public final View d;
    public final kgx e;
    final /* synthetic */ kgy f;
    private View g;
    
    public kgw(final kgy f, final int n) {
        this.f = f;
        final View inflate = View.inflate(f.a, n, (ViewGroup)null);
        this.d = inflate;
        this.e = new kgx(f.a, f.b, inflate, f.c, f.m, f.n, f.l, f.f, f.k, f.j, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = (ImageView)inflate.findViewById(2131428086);
        this.b = (TextView)inflate.findViewById(2131430520);
        this.c = (TextView)inflate.findViewById(2131430532);
    }
    
    public void a(acij acij) {
        this.c(acij);
        acij = new acij(acij);
        ((wwx)acij).b = this.f.i.d();
        this.b(((kcs)this.e).x, acij);
    }
    
    protected final void b(final View view, final acij acij) {
        final kgy f = this.f;
        final acnj d = f.d;
        final View d2 = this.d;
        final hys i = f.i;
        amer amer;
        if ((amer = i.a().v) == null) {
            amer = amer.a;
        }
        ameo ameo;
        if ((amer.b & 0x1) != 0x0) {
            amer amer2;
            if ((amer2 = i.a().v) == null) {
                amer2 = amer.a;
            }
            if ((ameo = amer2.c) == null) {
                ameo = ameo.a;
            }
        }
        else {
            ameo = null;
        }
        d.f(d2, view, ameo, this.f.i, ((wwx)acij).a);
    }
    
    public final void c(final acij acij) {
        final apmc a = this.f.i.a();
        final aceo b = this.f.b;
        final ImageView a2 = this.a;
        aiib a3;
        if (a.d == 33) {
            a3 = (aiib)a.e;
        }
        else {
            a3 = aiib.a;
        }
        aiic aiic;
        if ((aiic = a3.c) == null) {
            aiic = aiic.a;
        }
        aorm aorm;
        if ((aiic.b & 0x1) != 0x0) {
            aiic aiic2;
            if ((aiic2 = a3.c) == null) {
                aiic2 = aiic.a;
            }
            if ((aorm = aiic2.c) == null) {
                aorm = aorm.a;
            }
        }
        else if (a.d == 19) {
            aorm = (aorm)a.e;
        }
        else {
            aorm = aorm.a;
        }
        b.g(a2, aorm);
        this.a.setOnClickListener((View$OnClickListener)new kdw(this, a, 12));
        final acij acij2 = new acij(acij);
        ((wwx)acij2).b = this.f.i.d();
        final ajqg a4 = this.f.i.a;
        final int b2 = a4.b;
        final ahyh ahyh = null;
        ajsq ajsq;
        if ((b2 & 0x20) != 0x0) {
            if ((ajsq = a4.g) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        final Spanned b3 = abyh.b(ajsq);
        final boolean b4 = TextUtils.isEmpty((CharSequence)b3) ^ true;
        tmy.v((View)this.b, b4);
        tmy.v((View)this.c, b4);
        boolean b5 = false;
        if (b4) {
            final TextView b6 = this.b;
            final ajqg a5 = this.f.i.a;
            ajsq ajsq2;
            if ((a5.b & 0x8) != 0x0) {
                if ((ajsq2 = a5.f) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            b6.setText((CharSequence)abyh.b(ajsq2));
            final kgy f = this.f;
            final ajqg a6 = f.i.a;
            int a7;
            if (a6.c == 14) {
                final acng e = f.e;
                akbe akbe;
                if ((akbe = akbe.b(((akbf)a6.d).c)) == null) {
                    akbe = akbe.a;
                }
                a7 = e.a(akbe);
            }
            else {
                a7 = 0;
            }
            api.i(this.b, a7, 0);
            this.c.setText((CharSequence)b3);
        }
        if (this.f.i.a().w) {
            if (this.g == null) {
                this.g = ((ViewStub)this.d.findViewById(2131432458)).inflate();
            }
            this.g.setVisibility(0);
        }
        else {
            final View g = this.g;
            if (g != null) {
                g.setVisibility(8);
            }
        }
        final kgx e2 = this.e;
        ajsq ajsq3;
        if ((a.b & 0x8) != 0x0) {
            if ((ajsq3 = a.h) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        ((kcs)e2).A((CharSequence)abyh.b(ajsq3));
        final kgx e3 = this.e;
        final ArrayList ak = adwd.ak();
        final Context g2 = ((kcs)e3).g;
        final oas a8 = e3.a;
        apdo apdo;
        if ((a.b & 0x2000000) != 0x0) {
            if ((apdo = a.t) == null) {
                apdo = apdo.a;
            }
        }
        else {
            apdo = null;
        }
        final CharSequence h = jyg.h(g2, a8, apdo);
        if (!TextUtils.isEmpty(h)) {
            ak.add(h);
        }
        else {
            ajsq ajsq4;
            if ((ajsq4 = a.n) == null) {
                ajsq4 = ajsq.a;
            }
            Spanned spanned;
            if (!TextUtils.isEmpty((CharSequence)abyh.b(ajsq4))) {
                ajsq ajsq5;
                if ((ajsq5 = a.n) == null) {
                    ajsq5 = ajsq.a;
                }
                spanned = abyh.b(ajsq5);
            }
            else {
                ajsq ajsq6;
                if ((a.b & 0x10000) != 0x0) {
                    if ((ajsq6 = a.m) == null) {
                        ajsq6 = ajsq.a;
                    }
                }
                else {
                    ajsq6 = null;
                }
                spanned = abyh.b(ajsq6);
            }
            ak.add(gow.o((CharSequence)spanned));
            ajsq ajsq7;
            if ((a.b & 0x4000) != 0x0) {
                if ((ajsq7 = a.j) == null) {
                    ajsq7 = ajsq.a;
                }
            }
            else {
                ajsq7 = null;
            }
            ak.add(gow.o((CharSequence)abyh.b(ajsq7)));
        }
        ajsq ajsq8;
        if ((a.b & 0x2000) != 0x0) {
            if ((ajsq8 = a.i) == null) {
                ajsq8 = ajsq.a;
            }
        }
        else {
            ajsq8 = null;
        }
        final CharSequence o = gow.o((CharSequence)abyh.b(ajsq8));
        if (kgy.b(a) != null) {
            b5 = true;
        }
        ((kcs)e3).k(o, ak, b5);
        final kgx e4 = this.e;
        ajsq ajsq9;
        if ((a.b & 0x8000) != 0x0) {
            if ((ajsq9 = a.k) == null) {
                ajsq9 = ajsq.a;
            }
        }
        else {
            ajsq9 = null;
        }
        final Spanned b7 = abyh.b(ajsq9);
        ajsq ajsq10;
        if ((0x8000 & a.b) != 0x0) {
            if ((ajsq10 = a.k) == null) {
                ajsq10 = ajsq.a;
            }
        }
        else {
            ajsq10 = null;
        }
        final CharSequence i = abyh.i(ajsq10);
        final agzy x = a.x;
        apdo apdo2;
        if ((a.b & 0x2000000) != 0x0) {
            if ((apdo2 = a.t) == null) {
                apdo2 = apdo.a;
            }
        }
        else {
            apdo2 = null;
        }
        ((kcs)e4).p((CharSequence)b7, i, (List)x, apdo2);
        final kgx e5 = this.e;
        aorm aorm2;
        if ((aorm2 = a.g) == null) {
            aorm2 = aorm.a;
        }
        ((kcs)e5).y(aorm2);
        ((kcs)this.e).t(jfi.b((List)a.x));
        final kgx e6 = this.e;
        ahyq ahyq;
        if ((ahyq = a.r) == null) {
            ahyq = ahyq.a;
        }
        ahyu ahyu;
        if ((ahyq.b & 0x1) != 0x0) {
            ahyq ahyq2;
            if ((ahyq2 = a.r) == null) {
                ahyq2 = ahyq.a;
            }
            if ((ahyu = ahyq2.c) == null) {
                ahyu = ahyu.a;
            }
        }
        else {
            ahyu = null;
        }
        ((kcs)e6).w(ahyu);
        final kgx e7 = this.e;
        final ahyq q = a.q;
        ahyq a9;
        if (q == null) {
            a9 = ahyq.a;
        }
        else {
            a9 = q;
        }
        ahyr ahyr;
        if ((a9.b & 0x4) != 0x0) {
            ahyq a10;
            if ((a10 = q) == null) {
                a10 = ahyq.a;
            }
            if ((ahyr = a10.e) == null) {
                ahyr = ahyr.a;
            }
        }
        else {
            ahyr = null;
        }
        ((kcs)e7).u(ahyr);
        this.e.r.a(kgy.b(a));
        final kgx e8 = this.e;
        final ahyq s = a.s;
        ahyq a11;
        if (s == null) {
            a11 = ahyq.a;
        }
        else {
            a11 = s;
        }
        amfl amfl;
        if ((a11.b & 0x8) != 0x0) {
            ahyq a12;
            if ((a12 = s) == null) {
                a12 = ahyq.a;
            }
            if ((amfl = a12.f) == null) {
                amfl = amfl.a;
            }
        }
        else {
            amfl = null;
        }
        ((kcs)e8).r(amfl);
        final kgy f2 = this.f;
        final Iterator<Object> iterator = ((List<Object>)a.p).iterator();
        while (true) {
            ahyg ahyg;
            do {
                final ahyh h2 = ahyh;
                if (!iterator.hasNext()) {
                    f2.h = h2;
                    final kgy f3 = this.f;
                    f3.g.b(((kcs)this.e).q, f3.h);
                    this.e.b(acij2, a);
                    return;
                }
                ahyg = iterator.next();
            } while ((ahyg.b & 0x80000) == 0x0);
            ahyh h2;
            if ((h2 = ahyg.g) == null) {
                h2 = ahyh.a;
            }
            continue;
        }
    }
}
