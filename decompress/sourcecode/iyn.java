import java.util.Arrays;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import j$.util.Optional;
import java.util.function.Consumer;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyn extends abry implements shm, fqb
{
    public final Context a;
    public final aceo b;
    public final iym c;
    public ViewGroup d;
    public shl e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public aomi j;
    private final iyq k;
    private TextView l;
    private ViewGroup m;
    private TextView[] n;
    private View o;
    private View p;
    private TextView q;
    private TextView r;
    private Drawable s;
    private Drawable t;
    private sin u;
    private boolean v;
    private boolean w;
    
    public iyn(final Context a, final aceo b, final iyq k) {
        super(a);
        this.j = aomi.b;
        this.a = a;
        this.b = b;
        this.c = new iym(this, a);
        this.k = k;
    }
    
    private final boolean r(final int n) {
        if (this.d == null) {
            return false;
        }
        final TextView[] n2 = this.n;
        n2.getClass();
        final TextView[] array = n2;
        if (n < 5) {
            final TextView textView = n2[n];
            textView.getClass();
            if (textView.isSelected()) {
                return true;
            }
        }
        return false;
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new absc(-1, -1, false);
    }
    
    public final shk e() {
        return (shk)this.c;
    }
    
    public final void f() {
        this.w = true;
        this.q();
    }
    
    public final void g(final aomi aomi) {
        if (this.d != null && this.j == aomi) {
            return;
        }
        final LayoutInflater from = LayoutInflater.from(this.a);
        final ViewGroup d = this.d;
        if (d != null) {
            d.removeAllViews();
        }
        if (aomi != null && (aomi.equals(aomi.c) || aomi.equals(aomi.d))) {
            final ViewGroup d2 = (ViewGroup)from.inflate(2131625614, (ViewGroup)this);
            this.d = d2;
            final iyq k = this.k;
            final CardView cardView = (CardView)d2.findViewById(2131432047);
            k.f.ifPresent((Consumer)hus.o);
            k.e = Optional.of((Object)aomi);
            k.f = Optional.of((Object)cardView);
            k.d.b(null);
            final RecyclerView recyclerView = (RecyclerView)cardView.findViewById(2131432046);
            recyclerView.ac(k.d);
            k.g = Optional.of((Object)recyclerView);
            k.c.l(k);
        }
        else {
            this.d = (ViewGroup)from.inflate(2131625613, (ViewGroup)this);
            final iyq i = this.k;
            i.f = Optional.empty();
            i.g = Optional.empty();
            i.e = Optional.empty();
            i.c.n(i);
        }
        aomi b = aomi;
        if (aomi == null) {
            b = aomi.b;
        }
        this.j = b;
        this.l = (TextView)this.d.findViewById(2131429883);
        final ViewGroup m = (ViewGroup)this.d.findViewById(2131430080);
        this.m = m;
        this.q = (TextView)m.findViewById(2131431906);
        this.s = agw.a(this.a, 2131233358);
        this.t = agw.a(this.a, 2131233361);
        this.r = (TextView)this.m.findViewById(2131431902);
        this.u = new sin(this.r);
        final TextView textView = (TextView)this.m.findViewById(2131431892);
        int n = 0;
        this.n = new TextView[] { textView, (TextView)this.m.findViewById(2131431893), (TextView)this.m.findViewById(2131431894), (TextView)this.m.findViewById(2131431895), (TextView)this.m.findViewById(2131431896) };
        (this.o = this.m.findViewById(2131431565)).setOnClickListener((View$OnClickListener)new iwh(this, 14, (byte[])null));
        this.o.setOnTouchListener((View$OnTouchListener)new gby(this, 3));
        (this.p = this.m.findViewById(2131431806)).setOnClickListener((View$OnClickListener)new iwh(this, 15, (char[])null));
        while (true) {
            final TextView[] n2 = this.n;
            final int length = n2.length;
            if (n >= 5) {
                break;
            }
            final TextView textView2 = n2[n];
            textView2.getClass();
            textView2.setOnClickListener((View$OnClickListener)new iyl(this, n));
            ++n;
        }
        this.r.setOnClickListener((View$OnClickListener)new iwh(this, 13));
    }
    
    public final void h() {
        if (this.e == null) {
            return;
        }
        final int[] array = new int[this.g];
        int i = 0;
        int n = 0;
        while (i < this.g) {
            int n2 = n;
            if (this.r(i)) {
                array[n] = i;
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        this.e.b(Arrays.copyOf(array, n));
    }
    
    public final void i() {
        final ViewGroup d = this.d;
        if (d != null) {
            d.setVisibility(8);
            final sin u = this.u;
            u.getClass();
            u.a();
            final View o = this.o;
            o.getClass();
            o.setVisibility(8);
            final View p = this.p;
            p.getClass();
            p.setVisibility(8);
        }
        this.v = false;
        this.w = false;
        this.h = 0;
        this.i = 0;
        this.setVisibility(8);
    }
    
    public final void j(final fkk fkk) {
        if (fkk.n()) {
            if (this.d != null) {
                final TextView l = this.l;
                l.getClass();
                l.setVisibility(0);
                final ViewGroup m = this.m;
                m.getClass();
                m.setVisibility(8);
            }
        }
        else {
            if (this.d != null) {
                final TextView i = this.l;
                i.getClass();
                i.setVisibility(8);
                final ViewGroup j = this.m;
                j.getClass();
                j.setVisibility(0);
            }
            final iym c = this.c;
            if (c != null) {
                final boolean c2 = fkk.c();
                if (c.a != null) {
                    float n;
                    if (c2) {
                        n = c.f.a.getResources().getDimension(2131167013);
                    }
                    else if (tmy.bq(c.f.a)) {
                        n = c.f.a.getResources().getDimension(2131167902);
                    }
                    else {
                        n = c.f.a.getResources().getDimension(2131169780);
                    }
                    float n2;
                    if (c2) {
                        n2 = c.f.a.getResources().getDimension(2131167013);
                    }
                    else {
                        n2 = c.f.a.getResources().getDimension(2131167902);
                    }
                    final TextView b = c.b;
                    b.getClass();
                    b.setTextSize(0, n);
                    final TextView c3 = c.c;
                    c3.getClass();
                    c3.setTextSize(0, n2);
                }
            }
        }
    }
    
    public final void k(final shl e) {
        this.e = e;
    }
    
    public final void l(final int n, final boolean selected) {
        if (this.d != null) {
            final TextView[] n2 = this.n;
            n2.getClass();
            final TextView[] array = n2;
            if (n < 5) {
                final TextView textView = n2[n];
                textView.getClass();
                textView.setSelected(selected);
                if (this.f) {
                    Drawable drawable;
                    if (selected) {
                        drawable = this.s;
                    }
                    else {
                        drawable = this.t;
                    }
                    api.j(textView, (Drawable)null, (Drawable)null, drawable);
                    return;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
            }
        }
    }
    
    public final void m(final boolean b) {
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
    }
    
    public final String mr() {
        return "player_overlay_survey";
    }
    
    public final void n() {
        final sin u = this.u;
        if (u == null) {
            return;
        }
        u.b(true, false);
    }
    
    public final void o(final String s, final List list, final boolean f, final aomi aomi) {
        this.g(aomi);
        this.i();
        this.f = f;
        this.g = list.size();
        final TextView l = this.l;
        l.getClass();
        l.setText((CharSequence)s);
        final TextView q = this.q;
        q.getClass();
        q.setText((CharSequence)s);
        final int size = list.size();
        int n = 0;
        while (true) {
            final TextView[] n2 = this.n;
            n2.getClass();
            final TextView[] array = n2;
            if (n >= 5) {
                break;
            }
            final TextView textView = n2[n];
            textView.getClass();
            if (n < list.size()) {
                textView.setText((CharSequence)list.get(n));
                textView.setVisibility(0);
            }
            else if (n == size && f) {
                textView.setText(2132019917);
                textView.setVisibility(0);
            }
            else {
                textView.setVisibility(4);
            }
            this.l(n, false);
            ++n;
        }
        final ViewGroup d = this.d;
        d.getClass();
        d.setVisibility(0);
    }
    
    public final boolean ow(final fkk fkk) {
        return ezp.d(fkk);
    }
    
    public final void p(final int n) {
        if (this.d == null) {
            return;
        }
        final String j = tsx.j((long)(int)Math.ceil(n / 1000.0f));
        final TextView r = this.r;
        r.getClass();
        r.setText((CharSequence)this.d.getResources().getString(2132019916, new Object[] { j }));
    }
    
    public final void q() {
        final int n = 0;
        this.v = false;
        int n2 = 0;
        int g;
        boolean b;
        while (true) {
            g = this.g;
            b = true;
            final boolean b2 = true;
            if (n2 >= g) {
                break;
            }
            boolean v = b2;
            if (!this.v) {
                v = (this.r(n2) && b2);
            }
            this.v = v;
            ++n2;
        }
        boolean v2 = b;
        if (!this.v) {
            v2 = (this.f && this.r(g) && b);
        }
        this.v = v2;
        if (this.d != null) {
            final View p = this.p;
            p.getClass();
            int visibility;
            if (v2 && this.f) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            p.setVisibility(visibility);
            final View o = this.o;
            o.getClass();
            int visibility2;
            if (this.w && !this.v) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
            o.setVisibility(visibility2);
        }
    }
}
