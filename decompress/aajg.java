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

public final class aajg implements aakf, thj
{
    private static final int[] f;
    protected final Activity a;
    protected final veh b;
    protected final acig c;
    protected aajf d;
    public abwe e;
    private final acqv g;
    private aaje h;
    
    static {
        f = new int[] { 2130968780, 2130969085, 2130970229, 2130970554, 2130970563, 2130970602, 2130970596 };
    }
    
    public aajg(final Activity a, final acqv g, final veh b, final acig c) {
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes(aajg.f);
        for (int i = 0; i < 7; ++i) {
            if (obtainStyledAttributes.getResourceId(i, -1) == -1) {
                throw new IllegalStateException("Resource attribute required but not provided ".concat(String.valueOf(a.getResources().getResourceEntryName(aajg.f[i]))));
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    @Override
    public final void a(Object a, final xab xab, final Pair pair, final aakp aakp) {
        if (a != null) {
            if (a instanceof aplb) {
                final aplb aplb = (aplb)a;
                if (aplb.k) {
                    if (this.d == null) {
                        this.d = new aajf((Context)this.a, this.b(), this.b, this.c);
                    }
                    final aajf d = this.d;
                    d.getClass();
                    d.e = LayoutInflater.from(d.a).inflate(2131625686, (ViewGroup)null);
                    d.f = (ImageView)d.e.findViewById(2131427747);
                    d.g = (ImageView)d.e.findViewById(2131429698);
                    d.h = new acip((tqp)d.d, d.f);
                    d.i = new acip((tqp)d.d, d.g);
                    d.j = (TextView)d.e.findViewById(2131428669);
                    d.k = (TextView)d.e.findViewById(2131428665);
                    d.m = (TextView)d.e.findViewById(2131427452);
                    d.n = (TextView)d.e.findViewById(2131428701);
                    (d.l = d.b.setView(d.e).create()).setOnCancelListener((DialogInterface$OnCancelListener)new far(d, 13));
                    d.q = xab;
                    if ((aplb.b & 0x4) != 0x0) {
                        d.f.setVisibility(0);
                        final acip h = d.h;
                        aowb aowb;
                        if ((aowb = aplb.d) == null) {
                            aowb = aowb.a;
                        }
                        h.k(aowb);
                    }
                    else {
                        d.f.setVisibility(8);
                        d.h.a();
                    }
                    if ((aplb.b & 0x1) != 0x0) {
                        aowb aowb2;
                        if ((aowb2 = aplb.c) == null) {
                            aowb2 = aowb.a;
                        }
                        final aowa u = aamz.U(aowb2);
                        if (u != null) {
                            final float n = (float)u.d;
                            final float n2 = (float)u.e;
                            final ImageView g = d.g;
                            tqf.aF((View)g, tqf.aD((int)(n / n2 * g.getLayoutParams().height)), (Class)ViewGroup$LayoutParams.class);
                        }
                        d.g.setVisibility(0);
                        final acip i = d.i;
                        aowb aowb3;
                        if ((aowb3 = aplb.c) == null) {
                            aowb3 = aowb.a;
                        }
                        i.k(aowb3);
                    }
                    else {
                        d.g.setVisibility(8);
                        d.i.a();
                    }
                    final TextView j = d.j;
                    ajws ajws;
                    if ((aplb.b & 0x20) != 0x0) {
                        if ((ajws = aplb.e) == null) {
                            ajws = ajws.a;
                        }
                    }
                    else {
                        ajws = null;
                    }
                    tqf.t(j, (CharSequence)acbu.b(ajws));
                    final TextView k = d.k;
                    ajws ajws2;
                    if ((aplb.b & 0x40) != 0x0) {
                        if ((ajws2 = aplb.f) == null) {
                            ajws2 = ajws.a;
                        }
                    }
                    else {
                        ajws2 = null;
                    }
                    tqf.t(k, (CharSequence)acbu.b(ajws2));
                    final zig zig = new zig(d, aakp, 2);
                    aiet aiet;
                    if ((aiet = aplb.h) == null) {
                        aiet = aiet.a;
                    }
                    aies p4;
                    if ((aiet.b & 0x1) != 0x0) {
                        aiet aiet2;
                        if ((aiet2 = aplb.h) == null) {
                            aiet2 = aiet.a;
                        }
                        if ((p4 = aiet2.c) == null) {
                            p4 = aies.a;
                        }
                    }
                    else {
                        p4 = null;
                    }
                    d.p = p4;
                    final aiet g2 = aplb.g;
                    aiet a2;
                    if (g2 == null) {
                        a2 = aiet.a;
                    }
                    else {
                        a2 = g2;
                    }
                    aies o;
                    if ((a2.b & 0x1) != 0x0) {
                        aiet a3;
                        if ((a3 = g2) == null) {
                            a3 = aiet.a;
                        }
                        if ((o = a3.c) == null) {
                            o = aies.a;
                        }
                    }
                    else {
                        o = null;
                    }
                    d.o = o;
                    if (d.p == null && d.o == null) {
                        tqf.t(d.n, d.a.getResources().getText(2132017611));
                        tqf.v((View)d.m, false);
                    }
                    else {
                        d.c(d.o, d.m, (View$OnClickListener)zig);
                        d.c(d.p, d.n, (View$OnClickListener)zig);
                    }
                    d.l.show();
                    aajf.b(d.c, aplb);
                }
                else {
                    aajf.b(this.b, aplb);
                }
                if (xab != null) {
                    xab.t((xbe)new wzy(aplb.i), (alji)null);
                }
            }
            else if (a instanceof ajhc) {
                if (this.e == null) {
                    this.e = new abwe((Context)this.a, this.b());
                }
                final abwe e = this.e;
                final ajhc ajhc = (ajhc)a;
                final acqv g3 = this.g;
                if (pair != null) {
                    final gja gja = new gja(e, aakp, pair, 14, (byte[])null, (byte[])null, (byte[])null);
                    ((AlertDialog)e.a).setButton(-1, (CharSequence)pair.first, (DialogInterface$OnClickListener)gja);
                    ((AlertDialog)e.a).setButton(-2, ((Context)e.b).getResources().getText(2132017892), (DialogInterface$OnClickListener)gja);
                }
                else {
                    final szi szi = new szi(e, aakp, 7, (byte[])null, (byte[])null, (byte[])null);
                    a = e.a;
                    ((AlertDialog)a).setButton(-2, ((Context)e.b).getResources().getText(2132017892), (DialogInterface$OnClickListener)szi);
                }
                int a4;
                if ((ajhc.b & 0x1) != 0x0) {
                    akfj akfj;
                    if ((akfj = ajhc.c) == null) {
                        akfj = akfj.a;
                    }
                    akfi akfi;
                    if ((akfi = akfi.b(akfj.c)) == null) {
                        akfi = akfi.a;
                    }
                    a4 = g3.a(akfi);
                }
                else {
                    a4 = 0;
                }
                ((AlertDialog)e.a).setMessage((CharSequence)ajhc.e);
                ((AlertDialog)e.a).setTitle((CharSequence)ajhc.d);
                ((AlertDialog)e.a).setIcon(a4);
                ((AlertDialog)e.a).show();
                final Window window = ((AlertDialog)e.a).getWindow();
                if (window != null) {
                    if (tvo.e((Context)e.b)) {
                        window.setLayout(-2, -2);
                    }
                    else {
                        window.setLayout((int)((Context)e.b).getResources().getDimension(2131170262), -2);
                    }
                }
                if (xab != null) {
                    xab.t((xbe)new wzy(ajhc.h), (alji)null);
                }
            }
            else if (a instanceof aizd) {
                if (this.h == null) {
                    this.h = new aaje((Context)this.a, this.b(), this.b);
                }
                final aizd aizd = (aizd)a;
                if (xab != null) {
                    xab.t((xbe)new wzy(aizd.o), (alji)null);
                }
                final aaje h2 = this.h;
                h2.getClass();
                h2.f = xab;
                final szi szi2 = new szi(h2, aakp, 6);
                h2.c.setButton(-1, h2.a.getResources().getText(2132018941), (DialogInterface$OnClickListener)szi2);
                h2.c.setButton(-2, h2.a.getResources().getText(2132017611), (DialogInterface$OnClickListener)szi2);
                final TextView d2 = h2.d;
                ajws ajws3;
                if ((aizd.b & 0x1) != 0x0) {
                    if ((ajws3 = aizd.c) == null) {
                        ajws3 = ajws.a;
                    }
                }
                else {
                    ajws3 = null;
                }
                tqf.t(d2, (CharSequence)acbu.b(ajws3));
                final TextView e2 = h2.e;
                ajws ajws4;
                if ((aizd.b & 0x40000000) != 0x0) {
                    if ((ajws4 = aizd.v) == null) {
                        ajws4 = ajws.a;
                    }
                }
                else {
                    ajws4 = null;
                }
                tqf.t(e2, (CharSequence)acbu.b(ajws4));
                h2.c.show();
                aiet aiet3;
                if ((aiet3 = aizd.i) == null) {
                    aiet3 = aiet.a;
                }
                aies h3;
                if ((aiet3.b & 0x1) != 0x0) {
                    aiet aiet4;
                    if ((aiet4 = aizd.i) == null) {
                        aiet4 = aiet.a;
                    }
                    if ((h3 = aiet4.c) == null) {
                        h3 = aies.a;
                    }
                }
                else {
                    h3 = null;
                }
                final aiet h4 = aizd.h;
                aiet a5;
                if (h4 == null) {
                    a5 = aiet.a;
                }
                else {
                    a5 = h4;
                }
                aies g4;
                if ((a5.b & 0x1) != 0x0) {
                    aiet a6;
                    if ((a6 = h4) == null) {
                        a6 = aiet.a;
                    }
                    if ((g4 = a6.c) == null) {
                        g4 = aies.a;
                    }
                }
                else {
                    g4 = null;
                }
                if (h3 != null) {
                    final Button button = h2.c.getButton(-2);
                    ajws ajws5;
                    if ((h3.b & 0x200) != 0x0) {
                        if ((ajws5 = h3.i) == null) {
                            ajws5 = ajws.a;
                        }
                    }
                    else {
                        ajws5 = null;
                    }
                    button.setText((CharSequence)acbu.b(ajws5));
                    h2.c.getButton(-2).setTextColor(tqf.cr(h2.a, 2130970850));
                    if (xab != null) {
                        xab.t((xbe)new wzy(h3.w), (alji)null);
                    }
                }
                else if (g4 != null) {
                    h2.c.getButton(-2).setVisibility(8);
                }
                if (g4 != null) {
                    final Button button2 = h2.c.getButton(-1);
                    ajws ajws6;
                    if ((g4.b & 0x200) != 0x0) {
                        if ((ajws6 = g4.i) == null) {
                            ajws6 = ajws.a;
                        }
                    }
                    else {
                        ajws6 = null;
                    }
                    button2.setText((CharSequence)acbu.b(ajws6));
                    h2.c.getButton(-1).setTextColor(tqf.cr(h2.a, 2130970850));
                    if (xab != null) {
                        xab.t((xbe)new wzy(g4.w), (alji)null);
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
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zop zop = (zop)o;
            final aajf d = this.d;
            if (d != null && d.l.isShowing()) {
                d.l.cancel();
            }
            final abwe e = this.e;
            array = null;
            if (e != null) {
                e.l();
                return null;
            }
        }
        else {
            array = new Class[] { zop.class };
        }
        return array;
    }
}
