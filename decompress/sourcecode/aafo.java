import android.app.AlertDialog$Builder;
import android.widget.Button;
import android.view.Window;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.DialogInterface$OnCancelListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.util.Pair;
import android.content.res.TypedArray;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafo implements aagn, tec
{
    private static final int[] f;
    protected final Activity a;
    protected final vax b;
    protected final aceo c;
    protected aafn d;
    public aamd e;
    private final acng g;
    private aafl h;
    
    static {
        f = new int[] { 2130968780, 2130969087, 2130970231, 2130970556, 2130970565, 2130970604, 2130970598 };
    }
    
    public aafo(final Activity a, final acng g, final vax b, final aceo c) {
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes(aafo.f);
        for (int i = 0; i < 7; ++i) {
            if (obtainStyledAttributes.getResourceId(i, -1) == -1) {
                throw new IllegalStateException("Resource attribute required but not provided ".concat(String.valueOf(a.getResources().getResourceEntryName(aafo.f[i]))));
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void a(Object b, final wwv wwv, final Pair pair, final aagx aagx) {
        if (b != null) {
            if (b instanceof apgl) {
                final apgl apgl = (apgl)b;
                if (apgl.k) {
                    if (this.d == null) {
                        this.d = new aafn((Context)this.a, this.b(), this.b, this.c);
                    }
                    final aafn d = this.d;
                    d.getClass();
                    d.e = LayoutInflater.from(d.a).inflate(2131625680, (ViewGroup)null);
                    d.f = (ImageView)d.e.findViewById(2131427747);
                    d.g = (ImageView)d.e.findViewById(2131429698);
                    d.h = new acex((tni)d.d, d.f);
                    d.i = new acex((tni)d.d, d.g);
                    d.j = (TextView)d.e.findViewById(2131428669);
                    d.k = (TextView)d.e.findViewById(2131428665);
                    d.m = (TextView)d.e.findViewById(2131427452);
                    d.n = (TextView)d.e.findViewById(2131428701);
                    (d.l = d.b.setView(d.e).create()).setOnCancelListener((DialogInterface$OnCancelListener)new fak(d, 13));
                    d.q = wwv;
                    if ((apgl.b & 0x4) != 0x0) {
                        d.f.setVisibility(0);
                        final acex h = d.h;
                        aorm aorm;
                        if ((aorm = apgl.d) == null) {
                            aorm = aorm.a;
                        }
                        h.k(aorm);
                    }
                    else {
                        d.f.setVisibility(8);
                        d.h.a();
                    }
                    if ((apgl.b & 0x1) != 0x0) {
                        aorm aorm2;
                        if ((aorm2 = apgl.c) == null) {
                            aorm2 = aorm.a;
                        }
                        final aorl k = actc.K(aorm2);
                        if (k != null) {
                            final int d2 = k.d;
                            final int e = k.e;
                            final ImageView g = d.g;
                            tmy.aF((View)g, tmy.aD((int)(d2 / (float)e * g.getLayoutParams().height)), (Class)ViewGroup$LayoutParams.class);
                        }
                        d.g.setVisibility(0);
                        final acex i = d.i;
                        aorm aorm3;
                        if ((aorm3 = apgl.c) == null) {
                            aorm3 = aorm.a;
                        }
                        i.k(aorm3);
                    }
                    else {
                        d.g.setVisibility(8);
                        d.i.a();
                    }
                    final TextView j = d.j;
                    ajsq ajsq;
                    if ((apgl.b & 0x20) != 0x0) {
                        if ((ajsq = apgl.e) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    tmy.t(j, (CharSequence)abyh.b(ajsq));
                    final TextView l = d.k;
                    ajsq ajsq2;
                    if ((apgl.b & 0x40) != 0x0) {
                        if ((ajsq2 = apgl.f) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    tmy.t(l, (CharSequence)abyh.b(ajsq2));
                    final aafm aafm = new aafm(d, aagx, 0);
                    aibc aibc;
                    if ((aibc = apgl.h) == null) {
                        aibc = aibc.a;
                    }
                    aibb p4;
                    if ((aibc.b & 0x1) != 0x0) {
                        aibc aibc2;
                        if ((aibc2 = apgl.h) == null) {
                            aibc2 = aibc.a;
                        }
                        if ((p4 = aibc2.c) == null) {
                            p4 = aibb.a;
                        }
                    }
                    else {
                        p4 = null;
                    }
                    d.p = p4;
                    final aibc g2 = apgl.g;
                    aibc a;
                    if (g2 == null) {
                        a = aibc.a;
                    }
                    else {
                        a = g2;
                    }
                    aibb o;
                    if ((a.b & 0x1) != 0x0) {
                        aibc a2;
                        if ((a2 = g2) == null) {
                            a2 = aibc.a;
                        }
                        if ((o = a2.c) == null) {
                            o = aibb.a;
                        }
                    }
                    else {
                        o = null;
                    }
                    d.o = o;
                    if (d.p == null && d.o == null) {
                        tmy.t(d.n, d.a.getResources().getText(2132017611));
                        tmy.v((View)d.m, false);
                    }
                    else {
                        d.c(d.o, d.m, (View$OnClickListener)aafm);
                        d.c(d.p, d.n, (View$OnClickListener)aafm);
                    }
                    d.l.show();
                    aafn.b(d.c, apgl);
                }
                else {
                    aafn.b(this.b, apgl);
                }
                if (wwv != null) {
                    wwv.t((wxz)new wws(apgl.i), (alff)null);
                }
            }
            else if (b instanceof ajcz) {
                if (this.e == null) {
                    this.e = new aamd((Context)this.a, this.b());
                }
                final aamd e2 = this.e;
                final ajcz ajcz = (ajcz)b;
                final acng g3 = this.g;
                if (pair != null) {
                    final aamd aamd = e2;
                    final gio gio = new gio(e2, aagx, pair, 14, (byte[])null, (byte[])null, (byte[])null);
                    ((AlertDialog)aamd.b).setButton(-1, (CharSequence)pair.first, (DialogInterface$OnClickListener)gio);
                    ((AlertDialog)aamd.b).setButton(-2, ((Context)aamd.a).getResources().getText(2132017891), (DialogInterface$OnClickListener)gio);
                }
                else {
                    final aamd aamd2 = e2;
                    ((AlertDialog)aamd2.b).setButton(-2, ((Context)aamd2.a).getResources().getText(2132017891), (DialogInterface$OnClickListener)new swa(aamd2, aagx, 7, (byte[])null, (byte[])null, (byte[])null));
                }
                int a3;
                if ((ajcz.b & 0x1) != 0x0) {
                    akbf akbf;
                    if ((akbf = ajcz.c) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    a3 = g3.a(akbe);
                }
                else {
                    a3 = 0;
                }
                ((AlertDialog)e2.b).setMessage((CharSequence)ajcz.e);
                b = e2.b;
                ((AlertDialog)b).setTitle((CharSequence)ajcz.d);
                ((AlertDialog)e2.b).setIcon(a3);
                ((AlertDialog)e2.b).show();
                final Window window = ((AlertDialog)e2.b).getWindow();
                if (window != null) {
                    if (tsi.g((Context)e2.a)) {
                        window.setLayout(-2, -2);
                    }
                    else {
                        window.setLayout((int)((Context)e2.a).getResources().getDimension(2131170222), -2);
                    }
                }
                if (wwv != null) {
                    wwv.t((wxz)new wws(ajcz.h), (alff)null);
                }
            }
            else if (b instanceof aiva) {
                if (this.h == null) {
                    this.h = new aafl((Context)this.a, this.b(), this.b);
                }
                final aiva aiva = (aiva)b;
                if (wwv != null) {
                    wwv.t((wxz)new wws(aiva.o), (alff)null);
                }
                final aafl h2 = this.h;
                h2.getClass();
                h2.f = wwv;
                final swa swa = new swa(h2, aagx, 6);
                h2.c.setButton(-1, h2.a.getResources().getText(2132018938), (DialogInterface$OnClickListener)swa);
                h2.c.setButton(-2, h2.a.getResources().getText(2132017611), (DialogInterface$OnClickListener)swa);
                final TextView d3 = h2.d;
                ajsq ajsq3;
                if ((aiva.b & 0x1) != 0x0) {
                    if ((ajsq3 = aiva.c) == null) {
                        ajsq3 = ajsq.a;
                    }
                }
                else {
                    ajsq3 = null;
                }
                tmy.t(d3, (CharSequence)abyh.b(ajsq3));
                final TextView e3 = h2.e;
                ajsq ajsq4;
                if ((aiva.b & 0x20000000) != 0x0) {
                    if ((ajsq4 = aiva.v) == null) {
                        ajsq4 = ajsq.a;
                    }
                }
                else {
                    ajsq4 = null;
                }
                tmy.t(e3, (CharSequence)abyh.b(ajsq4));
                h2.c.show();
                aibc aibc3;
                if ((aibc3 = aiva.i) == null) {
                    aibc3 = aibc.a;
                }
                aibb h3;
                if ((aibc3.b & 0x1) != 0x0) {
                    aibc aibc4;
                    if ((aibc4 = aiva.i) == null) {
                        aibc4 = aibc.a;
                    }
                    if ((h3 = aibc4.c) == null) {
                        h3 = aibb.a;
                    }
                }
                else {
                    h3 = null;
                }
                final aibc h4 = aiva.h;
                aibc a4;
                if (h4 == null) {
                    a4 = aibc.a;
                }
                else {
                    a4 = h4;
                }
                aibb g4;
                if ((a4.b & 0x1) != 0x0) {
                    aibc a5;
                    if ((a5 = h4) == null) {
                        a5 = aibc.a;
                    }
                    if ((g4 = a5.c) == null) {
                        g4 = aibb.a;
                    }
                }
                else {
                    g4 = null;
                }
                if (h3 != null) {
                    final Button button = h2.c.getButton(-2);
                    ajsq ajsq5;
                    if ((h3.b & 0x200) != 0x0) {
                        if ((ajsq5 = h3.i) == null) {
                            ajsq5 = ajsq.a;
                        }
                    }
                    else {
                        ajsq5 = null;
                    }
                    button.setText((CharSequence)abyh.b(ajsq5));
                    h2.c.getButton(-2).setTextColor(tmy.cn(h2.a, 2130970852));
                    if (wwv != null) {
                        wwv.t((wxz)new wws(h3.w), (alff)null);
                    }
                }
                else if (g4 != null) {
                    h2.c.getButton(-2).setVisibility(8);
                }
                if (g4 != null) {
                    final Button button2 = h2.c.getButton(-1);
                    ajsq ajsq6;
                    if ((g4.b & 0x200) != 0x0) {
                        if ((ajsq6 = g4.i) == null) {
                            ajsq6 = ajsq.a;
                        }
                    }
                    else {
                        ajsq6 = null;
                    }
                    button2.setText((CharSequence)abyh.b(ajsq6));
                    h2.c.getButton(-1).setTextColor(tmy.cn(h2.a, 2130970852));
                    if (wwv != null) {
                        wwv.t((wxz)new wws(g4.w), (alff)null);
                    }
                }
                else {
                    h2.c.getButton(-1).setVisibility(8);
                }
                h2.h = h3;
                h2.g = g4;
            }
        }
    }
    
    protected final AlertDialog$Builder b() {
        return new AlertDialog$Builder((Context)this.a);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zkx zkx = (zkx)o;
            final aafn d = this.d;
            if (d != null && d.l.isShowing()) {
                d.l.cancel();
            }
            final aamd e = this.e;
            array = null;
            if (e != null) {
                e.g();
                return null;
            }
        }
        else {
            array = new Class[] { zkx.class };
        }
        return array;
    }
}
