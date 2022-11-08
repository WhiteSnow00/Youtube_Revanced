import android.widget.ListView;
import android.widget.ListAdapter;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView$OnItemClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.a;
import android.view.ViewGroup;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class ex
{
    public final et a;
    private final int b;
    
    public ex(final Context context) {
        this(context, ey.a(context, 0));
    }
    
    public ex(final Context context, final int b) {
        this.a = new et((Context)new ContextThemeWrapper(context, ey.a(context, b)));
        this.b = b;
    }
    
    public final Context a() {
        return this.a.a;
    }
    
    public ey b() {
        final ey ey = new ey(this.a.a, this.b);
        final et a = this.a;
        final ew a2 = ey.a;
        final View e = a.e;
        if (e != null) {
            a2.w = e;
        }
        else {
            final CharSequence d = a.d;
            if (d != null) {
                a2.a(d);
            }
            final Drawable c = a.c;
            if (c != null) {
                a2.s = c;
                a2.r = 0;
                final ImageView t = a2.t;
                if (t != null) {
                    t.setVisibility(0);
                    a2.t.setImageDrawable(c);
                }
            }
        }
        final CharSequence f = a.f;
        if (f != null) {
            a2.e = f;
            final TextView v = a2.v;
            if (v != null) {
                v.setText(f);
            }
        }
        final CharSequence g = a.g;
        if (g != null) {
            a2.f(-1, g, a.h);
        }
        final CharSequence i = a.i;
        if (i != null) {
            a2.f(-2, i, a.j);
        }
        if (a.o != null || a.p != null) {
            final AlertController$RecycleListView f2 = (AlertController$RecycleListView)a.b.inflate(a2.B, (ViewGroup)null);
            Object p;
            if (a.t) {
                p = new er(a, a.a, a2.C, a.o, f2);
            }
            else {
                int n;
                if (a.u) {
                    n = a2.D;
                }
                else {
                    n = a2.E;
                }
                p = a.p;
                if (p == null) {
                    p = new ev(a.a, n, a.o);
                }
            }
            a2.x = (ListAdapter)p;
            a2.y = a.v;
            if (a.q != null) {
                f2.setOnItemClickListener((AdapterView$OnItemClickListener)new a(a, a2, 1));
            }
            else if (a.w != null) {
                f2.setOnItemClickListener((AdapterView$OnItemClickListener)new es(a, f2, a2));
            }
            if (a.u) {
                f2.setChoiceMode(1);
            }
            else if (a.t) {
                f2.setChoiceMode(2);
            }
            a2.f = (ListView)f2;
        }
        final View r = a.r;
        if (r != null) {
            a2.b(r);
        }
        ey.setCancelable(this.a.k);
        if (this.a.k) {
            ey.setCanceledOnTouchOutside(true);
        }
        ey.setOnCancelListener(this.a.l);
        ey.setOnDismissListener(this.a.m);
        final DialogInterface$OnKeyListener n2 = this.a.n;
        if (n2 != null) {
            ey.setOnKeyListener(n2);
        }
        return ey;
    }
    
    public final void c(final boolean k) {
        this.a.k = k;
    }
    
    public final void d(final View e) {
        this.a.e = e;
    }
    
    public final void e(final Drawable c) {
        this.a.c = c;
    }
    
    public final void f(final int n) {
        final et a = this.a;
        a.f = a.a.getText(n);
    }
    
    public final void g(final CharSequence f) {
        this.a.f = f;
    }
    
    public final void h(final int n, final DialogInterface$OnClickListener j) {
        final et a = this.a;
        a.i = a.a.getText(n);
        this.a.j = j;
    }
    
    public final void i(final CharSequence i, final DialogInterface$OnClickListener j) {
        final et a = this.a;
        a.i = i;
        a.j = j;
    }
    
    public final void j(final DialogInterface$OnCancelListener l) {
        this.a.l = l;
    }
    
    public final void k(final int n, final DialogInterface$OnClickListener h) {
        final et a = this.a;
        a.g = a.a.getText(n);
        this.a.h = h;
    }
    
    public final void l(final CharSequence g, final DialogInterface$OnClickListener h) {
        final et a = this.a;
        a.g = g;
        a.h = h;
    }
    
    public final void m(final ListAdapter p3, final int v, final DialogInterface$OnClickListener q) {
        final et a = this.a;
        a.p = p3;
        a.q = q;
        a.v = v;
        a.u = true;
    }
    
    public final void n(final int n) {
        final et a = this.a;
        a.d = a.a.getText(n);
    }
    
    public final void o(final CharSequence d) {
        this.a.d = d;
    }
    
    public final void p(final View r) {
        this.a.r = r;
    }
    
    public final void q() {
        this.b().show();
    }
}
