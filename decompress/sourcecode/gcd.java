import android.text.TextUtils;
import android.graphics.drawable.RippleDrawable;
import android.view.TouchDelegate;
import android.graphics.Typeface;
import android.graphics.PorterDuff$Mode;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcd extends LinearLayout
{
    private final ImageView A;
    private final YouTubeTextView B;
    public Drawable a;
    public Drawable b;
    public final ImageView c;
    public final ImageView d;
    public gcc e;
    public int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private Drawable y;
    private Drawable z;
    
    public gcd(final Context context) {
        this(context, true);
    }
    
    public gcd(final Context context, final boolean g) {
        super(context, (AttributeSet)null);
        this.g = g;
        final Resources resources = this.getResources();
        this.v = this.getResources().getDimensionPixelSize(2131165827);
        this.w = this.getResources().getDimensionPixelSize(2131167015);
        this.n = resources.getDimensionPixelOffset(2131165832);
        this.o = resources.getDimensionPixelOffset(2131167017);
        this.p = resources.getDimensionPixelOffset(2131165830);
        this.q = resources.getDimensionPixelOffset(2131165831);
        this.r = resources.getDimensionPixelOffset(2131165837);
        this.s = resources.getDimensionPixelOffset(2131165839);
        this.t = resources.getDimensionPixelOffset(2131167018);
        resources.getDimensionPixelOffset(2131165835);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131165829);
        this.u = dimensionPixelSize;
        this.x = resources.getDimensionPixelSize(2131165828);
        this.h = tmy.cn(context, 2130970940);
        this.i = tmy.cn(context, 2130970857);
        this.j = tmy.cn(context, 2130970864);
        this.k = tmy.cn(context, 2130970924);
        this.l = tmy.cn(context, 2130970925);
        this.m = tmy.cn(context, 2130970850);
        View.inflate(context, 2131624174, (ViewGroup)this);
        this.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
        this.setMinimumHeight(dimensionPixelSize);
        this.setOrientation(0);
        this.c = (ImageView)this.findViewById(2131427725);
        this.d = (ImageView)this.findViewById(2131429270);
        this.A = (ImageView)this.findViewById(2131428179);
        this.B = (YouTubeTextView)this.findViewById(2131431950);
    }
    
    private static void h(final Drawable drawable, final int n) {
        drawable.mutate().setColorFilter(n, PorterDuff$Mode.SRC_IN);
    }
    
    private final void i(final boolean b) {
        final gcc e = this.e;
        e.getClass();
        final YouTubeTextView b2 = this.B;
        Typeface typeface;
        if (e.e) {
            typeface = abyk.g.a(this.getContext());
        }
        else {
            typeface = abyk.a.a(this.getContext());
        }
        b2.setTypeface(typeface);
        final YouTubeTextView b3 = this.B;
        final gcc e2 = this.e;
        int n;
        if (b) {
            if (e2.d) {
                n = e2.o;
            }
            else {
                n = 0;
            }
        }
        else {
            n = e2.m;
        }
        ana.ab((View)b3, n, b3.getPaddingTop(), this.e.n, this.B.getPaddingBottom());
    }
    
    public final gcb a() {
        final gcb gcb = new gcb(null);
        gcb.f(false);
        gcb.d(false);
        gcb.b(true);
        gcb.x(false);
        gcb.k(0);
        gcb.m(2130969044);
        gcb.u(2130969044);
        gcb.h(this.p);
        final int r = this.r;
        gcb.a = r;
        gcb.d |= 0x1000;
        gcb.q(r);
        gcb.r(this.s);
        gcb.j(this.n);
        gcb.c(this.v);
        gcb.p(false);
        gcb.o(false);
        gcb.i(0);
        gcb.w(false);
        gcb.s(17);
        return gcb;
    }
    
    public final void b(final aiit aiit) {
        this.e.getClass();
        tmy.aH((View)this, -2, -2);
        this.setOrientation(0);
        this.setMinimumHeight(this.u);
        this.setMinimumWidth(this.e.p);
        this.setClickable(this.e.g);
        final YouTubeTextView b = this.B;
        final boolean i = this.e.i;
        int n = 1;
        b.setSingleLine(i ^ true);
        this.B.setGravity(this.e.r);
        final gcc e = this.e;
        e.getClass();
        if (e.b) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(0);
            this.i(true);
            this.e.getClass();
            this.z = this.getResources().getDrawable(2131232636);
            this.y = this.getResources().getDrawable(2131232637);
            if (this.e.w.h()) {
                h(this.z, (int)this.e.w.c());
                h(this.y, (int)this.e.w.c());
            }
        }
        else if (e.c) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.A.setVisibility(8);
            this.i(true);
        }
        else if (e.a) {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            this.i(true);
        }
        else {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            this.i(false);
        }
        if (!aiit.i) {
            n = 2;
        }
        this.e(n, this.g);
        Object b2;
        if ((aiit.b & 0x2) != 0x0) {
            ajsq ajsq;
            if ((ajsq = aiit.f) == null) {
                ajsq = ajsq.a;
            }
            b2 = abyh.b(ajsq);
        }
        else {
            b2 = null;
        }
        this.B.setText((CharSequence)b2);
        ahgn ahgn;
        if ((ahgn = aiit.h) == null) {
            ahgn = ahgn.a;
        }
        ahgm ahgm;
        if ((ahgm = ahgn.c) == null) {
            ahgm = ahgm.a;
        }
        if ((ahgm.b & 0x2) != 0x0) {
            ahgn ahgn2;
            if ((ahgn2 = aiit.h) == null) {
                ahgn2 = ahgn.a;
            }
            ahgm ahgm2;
            if ((ahgm2 = ahgn2.c) == null) {
                ahgm2 = ahgm.a;
            }
            if (!ahgm2.c.isEmpty()) {
                ahgn ahgn3;
                if ((ahgn3 = aiit.h) == null) {
                    ahgn3 = ahgn.a;
                }
                ahgm ahgm3;
                if ((ahgm3 = ahgn3.c) == null) {
                    ahgm3 = ahgm.a;
                }
                this.setContentDescription((CharSequence)ahgm3.c);
                return;
            }
        }
        this.setContentDescription((CharSequence)null);
    }
    
    public final void c(final aiit aiit) {
        final gcb a = this.a();
        this.g(a, aiit);
        this.e = a.a();
        this.b(aiit);
    }
    
    public final void d(final int n) {
        this.e.getClass();
        this.e(n, true);
    }
    
    public final void e(int textColor, final boolean b) {
        this.e.getClass();
        this.f = textColor;
        boolean selected = true;
        if (textColor != 1) {
            selected = false;
        }
        this.setSelected(selected);
        if (this.e.h) {
            this.setBackground(tmy.cq(this.getContext(), 2130970944));
        }
        else {
            this.setTouchDelegate((TouchDelegate)null);
            final gcc e = this.e;
            if (this.isSelected()) {
                textColor = e.u;
            }
            else {
                textColor = e.v;
            }
            this.setBackgroundResource(textColor);
            if (b) {
                final Context context = this.getContext();
                final gcc e2 = this.e;
                if (this.isSelected()) {
                    textColor = e2.x;
                }
                else {
                    textColor = e2.y;
                }
                this.setBackground((Drawable)new RippleDrawable(tmy.cp(context, textColor), this.getBackground(), (Drawable)null));
            }
            else {
                final acta a = acta.a(this.getContext());
                a.b = this.getBackground();
                a.c(this.e.q);
                this.setBackground((Drawable)a.b());
            }
        }
        final YouTubeTextView b2 = this.B;
        final gcc e3 = this.e;
        if (this.isSelected()) {
            textColor = e3.s;
        }
        else {
            textColor = e3.t;
        }
        b2.setTextColor(textColor);
        if (this.e.b) {
            final ImageView a2 = this.A;
            Drawable imageDrawable;
            if (this.isSelected()) {
                imageDrawable = this.y;
            }
            else {
                imageDrawable = this.z;
            }
            a2.setImageDrawable(imageDrawable);
        }
        final gcc e4 = this.e;
        e4.getClass();
        if (e4.c && this.a != null && this.b != null) {
            this.d.setVisibility(0);
            final ImageView d = this.d;
            Drawable imageDrawable2;
            if (this.isSelected()) {
                imageDrawable2 = this.a;
            }
            else {
                imageDrawable2 = this.b;
            }
            d.setImageDrawable(imageDrawable2);
            return;
        }
        this.d.setVisibility(8);
    }
    
    public final void f(final int minimumWidth) {
        this.B.setMinimumWidth(minimumWidth);
        this.B.setMaxWidth(Integer.MAX_VALUE);
    }
    
    public final void g(final gcb gcb, final aiit aiit) {
        int x = 0;
        gcb.e(false);
        gcb.d(aiit.c == 6);
        gcb.f(aiit.c == 7);
        ajsq ajsq;
        if ((ajsq = aiit.f) == null) {
            ajsq = ajsq.a;
        }
        gcb.g(TextUtils.isEmpty((CharSequence)abyh.b(ajsq)) ^ true);
        aiiv aiiv;
        if ((aiiv = aiit.e) == null) {
            aiiv = aiiv.a;
        }
        aiiu aiiu;
        if ((aiiu = aiiu.b(aiiv.c)) == null) {
            aiiu = aiiu.a;
        }
        if (aiiu != aiiu.g) {
            final aiiv e = aiit.e;
            aiiv a;
            if (e == null) {
                a = aiiv.a;
            }
            else {
                a = e;
            }
            aiiu aiiu2;
            if ((aiiu2 = aiiu.b(a.c)) == null) {
                aiiu2 = aiiu.a;
            }
            if (aiiu2 != aiiu.i) {
                aiiv a2;
                if (e == null) {
                    a2 = aiiv.a;
                }
                else {
                    a2 = e;
                }
                aiiu aiiu3;
                if ((aiiu3 = aiiu.b(a2.c)) == null) {
                    aiiu3 = aiiu.a;
                }
                if (aiiu3 != aiiu.k) {
                    aiiv a3;
                    if (e == null) {
                        a3 = aiiv.a;
                    }
                    else {
                        a3 = e;
                    }
                    aiiu aiiu4;
                    if ((aiiu4 = aiiu.b(a3.c)) == null) {
                        aiiu4 = aiiu.a;
                    }
                    if (aiiu4 != aiiu.b) {
                        aiiv a4;
                        if (e == null) {
                            a4 = aiiv.a;
                        }
                        else {
                            a4 = e;
                        }
                        aiiu aiiu5;
                        if ((aiiu5 = aiiu.b(a4.c)) == null) {
                            aiiu5 = aiiu.a;
                        }
                        if (aiiu5 != aiiu.n) {
                            aiiv a5;
                            if (e == null) {
                                a5 = aiiv.a;
                            }
                            else {
                                a5 = e;
                            }
                            aiiu aiiu6;
                            if ((aiiu6 = aiiu.b(a5.c)) == null) {
                                aiiu6 = aiiu.a;
                            }
                            if (aiiu6 != aiiu.m) {
                                aiiv a6;
                                if ((a6 = e) == null) {
                                    a6 = aiiv.a;
                                }
                                aiiu aiiu7;
                                if ((aiiu7 = aiiu.b(a6.c)) == null) {
                                    aiiu7 = aiiu.a;
                                }
                                if (aiiu7 == aiiu.o) {
                                    gcb.t(2131231174);
                                    gcb.v(this.k);
                                    gcb.l(2131231173);
                                    gcb.n(this.k);
                                    return;
                                }
                                gcb.t(2131231166);
                                gcb.v(this.h);
                                gcb.l(2131231172);
                                gcb.n(this.i);
                                return;
                            }
                        }
                        gcb.t(2131231171);
                        gcb.l(2131231171);
                        gcb.v(this.k);
                        gcb.n(this.k);
                        gcb.u(2130970946);
                        gcb.m(2130970947);
                        gcb.j(this.o);
                        gcb.r(this.t);
                        gcb.c(this.w);
                        gcb.h(this.q);
                        gcb.p(true);
                        if ((aiit.b & 0x2) == 0x0) {
                            gcb.q(0);
                            gcb.i(this.o);
                            aiiv aiiv2;
                            if ((aiiv2 = aiit.e) == null) {
                                aiiv2 = aiiv.a;
                            }
                            aiiu aiiu8;
                            if ((aiiu8 = aiiu.b(aiiv2.c)) == null) {
                                aiiu8 = aiiu.a;
                            }
                            if (aiiu8 == aiiu.n) {
                                gcb.x(true);
                            }
                        }
                        aiiv aiiv3;
                        if ((aiiv3 = aiit.e) == null) {
                            aiiv3 = aiiv.a;
                        }
                        aiiu aiiu9;
                        if ((aiiu9 = aiiu.b(aiiv3.c)) == null) {
                            aiiu9 = aiiu.a;
                        }
                        if (aiiu9 == aiiu.m) {
                            if (aiit.c == 7) {
                                akbe akbe;
                                if ((akbe = akbe.b(((akbf)aiit.d).c)) == null) {
                                    akbe = akbe.a;
                                }
                                if (akbe == akbe.hd) {
                                    gcb.b = aexq.k(this.m);
                                    return;
                                }
                            }
                            gcb.o(true);
                        }
                        return;
                    }
                }
            }
            final boolean b = (aiit.b & 0x2) == 0x0 && aiit.c != 7;
            gcb.b(b ^ true);
            if (b) {
                x = this.x;
            }
            gcb.k(x);
            int n;
            if (!b) {
                n = 2131231170;
            }
            else {
                n = 2131231168;
            }
            gcb.t(n);
            gcb.v(this.k);
            gcb.l(2131231169);
            gcb.n(this.l);
            gcb.u(2130970946);
            gcb.m(2130970947);
            return;
        }
        gcb.t(2131231167);
        gcb.v(this.j);
        gcb.l(2131231172);
        gcb.n(this.i);
    }
}
