import android.text.Spanned;
import java.util.Map;
import android.view.ViewStub;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class koj implements acil
{
    private final qbo A;
    public final View a;
    public boolean b;
    private final Context c;
    private final View d;
    private final aceo e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final acnj l;
    private final acih m;
    private final acek n;
    private final fzz o;
    private final gil p;
    private TextView q;
    private ImageView r;
    private ike s;
    private gim t;
    private String u;
    private String v;
    private boolean w;
    private Drawable x;
    private Drawable y;
    private final adcr z;
    
    public koj(final Context c, final aceo e, final vax vax, final acnj l, final qbo a, final adcr z, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.p = new kny(this, 2);
        this.c = c;
        this.e = e;
        final View inflate = LayoutInflater.from(c).inflate(2131625050, viewGroup, false);
        this.d = inflate;
        this.f = (TextView)inflate.findViewById(2131432092);
        this.i = (ImageView)inflate.findViewById(2131432006);
        this.j = inflate.findViewById(2131432008);
        this.g = (ImageView)inflate.findViewById(2131431364);
        this.h = (TextView)inflate.findViewById(2131428769);
        this.q = (TextView)inflate.findViewById(2131432229);
        this.r = (ImageView)inflate.findViewById(2131432227);
        final View viewById = inflate.findViewById(2131432026);
        this.a = viewById;
        this.k = (ImageView)inflate.findViewById(2131428448);
        this.l = l;
        this.A = a;
        this.z = z;
        final acej b = e.b().b();
        b.c = (acem)new koh(this);
        b.f = 1;
        this.n = b.a();
        this.m = new acih(vax, inflate);
        this.o = new fzz((ViewStub)inflate.findViewById(2131431680), 0);
        if (a != null) {
            final ViewStub viewStub = (ViewStub)viewById.findViewById(2131430137);
            ike q = null;
            if (viewStub != null) {
                q = a.Q(viewStub, (ikn)null);
            }
            this.s = q;
        }
    }
    
    private final void f() {
        final ImageView r = this.r;
        if (r != null) {
            r.setVisibility(8);
        }
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void b() {
        if (this.b) {
            this.d.setBackgroundColor(tmy.cn(this.c, 2130970838));
            if (this.z.d()) {
                if (this.x == null) {
                    final acta a = acta.a(this.c);
                    a.a = tmy.cn(this.c, 2130970946);
                    a.b = this.d.getBackground();
                    this.x = (Drawable)a.b();
                }
                this.d.setBackground(this.x);
            }
            this.f.setTextColor(tmy.cn(this.c, 2130970924));
            this.g.setVisibility(0);
            tmy.E(this.i, (int)(this.c.getResources().getFraction(2131361810, 1, 1) * 255.0f));
            this.h.setTextColor(tmy.ct(this.c, 2130970884).orElse(0));
            tmy.v(this.j, true);
            return;
        }
        if (this.z.d()) {
            if (this.y == null) {
                final acta a2 = acta.a(this.c);
                a2.a = tmy.cn(this.c, 2130970946);
                this.y = (Drawable)a2.b();
            }
            this.d.setBackground(this.y);
        }
        else {
            this.d.setBackground((Drawable)null);
        }
        this.f.setTextColor(tmy.cn(this.c, 2130970926));
        this.g.setVisibility(4);
        tmy.E(this.i, (int)(this.c.getResources().getFraction(2131361809, 1, 1) * 255.0f));
        this.h.setTextColor(tmy.ct(this.c, 2130970885).orElse(0));
        tmy.v(this.j, false);
    }
    
    public final void c(final acir acir) {
        final gim t = this.t;
        if (t != null) {
            t.qs(this.p);
        }
    }
    
    public final boolean d() {
        final gim t = this.t;
        if (t != null && t.d() != null) {
            final String u = this.u;
            if (u != null) {
                return t.qt(u, this.v);
            }
        }
        return this.w;
    }
}
