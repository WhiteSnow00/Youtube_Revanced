import android.text.Spanned;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvj implements View$OnClickListener
{
    public final View a;
    public ImageView b;
    public TextView c;
    public aibk d;
    public fvi e;
    private final vax f;
    private final acng g;
    private final thh h;
    private final int i;
    private final int j;
    private final aeby k;
    
    public fvj(final vax f, final acng g, final thh h, final aeby k, final View a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.g = g;
        this.a = a;
        this.h = h;
        this.k = k;
        this.b = (ImageView)a.findViewById(2131432112);
        this.c = (TextView)a.findViewById(2131432113);
        a.setOnClickListener((View$OnClickListener)this);
        this.i = a.getResources().getDimensionPixelSize(2131165567);
        this.j = a.getResources().getDimensionPixelSize(2131165568);
    }
    
    private final GradientDrawable f(final int color, final int n) {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float)this.i);
        gradientDrawable.setStroke(this.j, n);
        return gradientDrawable;
    }
    
    private static int g(final aibk aibk) {
        final boolean e = aibk.e;
        final int n = 1;
        int n2;
        if (e) {
            aibl aibl;
            if ((aibl = aibk.q) == null) {
                aibl = aibl.a;
            }
            if ((n2 = aesy.aD(aibl.c)) == 0) {
                n2 = n;
            }
        }
        else {
            aibl a;
            if (aibk.c == 1) {
                a = (aibl)aibk.d;
            }
            else {
                a = aibl.a;
            }
            if ((n2 = aesy.aD(a.c)) == 0) {
                n2 = n;
            }
        }
        return n2;
    }
    
    public final void a() {
        this.a.setVisibility(8);
        final ImageView b = this.b;
        if (b != null) {
            b.setVisibility(8);
        }
        final TextView c = this.c;
        if (c != null) {
            c.setVisibility(8);
        }
    }
    
    public final void b(final aibk d) {
        this.d = d;
        this.d();
        this.k.S(this.d, this.a);
    }
    
    public final void c() {
        if (!this.e()) {
            final aibk d = this.d;
            if (d != null) {
                final agza builder = ((agzi)d).toBuilder();
                final boolean e = this.d.e;
                builder.copyOnWrite();
                final aibk aibk = (aibk)builder.instance;
                aibk.b |= 0x8;
                aibk.e = (e ^ true);
                final aibk d2 = (aibk)builder.build();
                this.d = d2;
                final fvi e2 = this.e;
                if (e2 != null) {
                    e2.a(d2.e);
                }
                this.d();
            }
        }
    }
    
    public final void d() {
        if (!this.e()) {
            final TextView c = this.c;
            final Drawable drawable = null;
            if (c != null) {
                final aibk d = this.d;
                if (d != null) {
                    Spanned spanned;
                    if (d.e) {
                        ajsq ajsq;
                        if ((d.b & 0x2000) != 0x0) {
                            if ((ajsq = d.n) == null) {
                                ajsq = ajsq.a;
                            }
                        }
                        else {
                            ajsq = null;
                        }
                        spanned = abyh.b(ajsq);
                    }
                    else {
                        ajsq ajsq2;
                        if ((d.b & 0x40) != 0x0) {
                            if ((ajsq2 = d.h) == null) {
                                ajsq2 = ajsq.a;
                            }
                        }
                        else {
                            ajsq2 = null;
                        }
                        spanned = abyh.b(ajsq2);
                    }
                    tmy.t(this.c, (CharSequence)spanned);
                }
            }
            final aibk d2 = this.d;
            if (d2 != null) {
                final int n = g(d2) - 1;
                if (n != 12) {
                    if (n != 13) {
                        if (n == 15) {
                            this.c.setTextColor(tmy.cn(this.a.getContext(), 2130970884));
                        }
                    }
                    else {
                        this.c.setTextColor(tmy.cn(this.a.getContext(), 2130970926));
                    }
                }
                else {
                    this.c.setTextColor(tmy.cn(this.a.getContext(), 2130970852));
                }
            }
            final ImageView b = this.b;
            if (b != null) {
                final aibk d3 = this.d;
                if (d3 != null) {
                    final boolean e = d3.e;
                    boolean b2 = true;
                    Label_0296: {
                        if (e) {
                            if ((d3.b & 0x1000) != 0x0) {
                                break Label_0296;
                            }
                        }
                        else if ((d3.b & 0x20) != 0x0) {
                            break Label_0296;
                        }
                        b2 = false;
                    }
                    if (!b2) {
                        b.setVisibility(8);
                    }
                    else {
                        akbf akbf;
                        if (e) {
                            if ((akbf = d3.m) == null) {
                                akbf = akbf.a;
                            }
                        }
                        else if ((akbf = d3.g) == null) {
                            akbf = akbf.a;
                        }
                        final ImageView b3 = this.b;
                        final acng g = this.g;
                        akbe akbe;
                        if ((akbe = akbe.b(akbf.c)) == null) {
                            akbe = akbe.a;
                        }
                        b3.setImageResource(g.a(akbe));
                        String contentDescription;
                        if (e) {
                            contentDescription = d3.o;
                        }
                        else {
                            contentDescription = d3.i;
                        }
                        this.b.setContentDescription((CharSequence)contentDescription);
                        if (this.c != null) {
                            final ImageView b4 = this.b;
                            final Drawable drawable2 = b4.getDrawable();
                            tnw.e(drawable2, this.c.getCurrentTextColor(), PorterDuff$Mode.SRC_IN);
                            b4.setImageDrawable(drawable2);
                        }
                        this.b.setVisibility(0);
                    }
                }
            }
            final aibk d4 = this.d;
            if (d4 != null) {
                final int n2 = g(d4) - 1;
                Object o;
                if (n2 != 12) {
                    if (n2 != 13) {
                        if (n2 != 15) {
                            o = drawable;
                        }
                        else {
                            o = this.f(tmy.cn(this.a.getContext(), 2130970878), 0);
                        }
                    }
                    else {
                        o = this.f(0, tmy.cn(this.a.getContext(), 2130970926));
                    }
                }
                else {
                    o = this.f(0, tmy.cn(this.a.getContext(), 2130970852));
                }
                if (o != null) {
                    tmy.s(this.a, (Drawable)o, 0);
                }
            }
            this.a.setVisibility(0);
            return;
        }
        this.a();
    }
    
    public final boolean e() {
        final aibk d = this.d;
        return d == null || d.f;
    }
    
    public final void onClick(final View view) {
        final aibk d = this.d;
        if (d == null) {
            return;
        }
        aioe aioe;
        if (d.e) {
            if ((aioe = d.p) == null) {
                aioe = aioe.a;
            }
        }
        else if ((aioe = d.k) == null) {
            aioe = aioe.a;
        }
        this.f.c(aioe, www.g((Object)this.d));
        if (this.h.o()) {
            this.c();
        }
    }
}
