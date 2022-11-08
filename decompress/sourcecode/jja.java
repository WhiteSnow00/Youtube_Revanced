import java.util.Map;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Typeface;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.app.Activity;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jja extends acja implements acie, jki
{
    anvp a;
    private final aceo b;
    private final CardView c;
    private final ImageView d;
    private final TextView e;
    private final View f;
    private final ImageView g;
    private final FixedAspectRatioFrameLayout h;
    private final acih i;
    private final Activity j;
    private final Resources k;
    private final SharedPreferences l;
    private acij m;
    private final adcr n;
    private athj o;
    
    public jja(final Activity j, final aceo b, final vax vax, final SharedPreferences l, final adcr n, final ViewGroup viewGroup, final byte[] array) {
        this.b = b;
        this.j = j;
        this.k = j.getResources();
        final CardView c = (CardView)LayoutInflater.from((Context)j).inflate(2131625318, viewGroup, false);
        this.c = c;
        final TextView e = (TextView)c.findViewById(2131430754);
        e.getClass();
        this.e = e;
        final ImageView d = (ImageView)c.findViewById(2131432006);
        d.getClass();
        this.d = d;
        this.i = new acih(vax, (View)c, this);
        this.f = c.findViewById(2131428009);
        this.g = (ImageView)c.findViewById(2131428010);
        this.h = (FixedAspectRatioFrameLayout)c.findViewById(2131432026);
        this.l = l;
        this.n = n;
    }
    
    private static int f(final acij acij) {
        return acij.b("REFINEMENT_POSITION", -1);
    }
    
    private final void g() {
        this.f.setBackground(this.k.getDrawable(2131233215));
        this.g.setImageDrawable((Drawable)null);
        this.f.setPadding(0, 0, 0, 0);
        this.j(this.k.getDimensionPixelSize(2131169470));
        this.c.f((float)this.k.getDimensionPixelSize(2131169469));
        this.c.d(tmy.ct((Context)this.j, 2130970845).orElse(0));
        this.h.a = this.k.getFraction(2131361819, 1, 1);
        this.e.setLines(2);
        this.e.setTextSize(0, (float)this.k.getDimensionPixelOffset(2131169473));
        this.e.setGravity(8388611);
        this.n(this.k.getDimensionPixelSize(2131169472), this.k.getDimensionPixelSize(2131169474));
    }
    
    private final void j(final int n) {
        tmy.aF(this.f, tmy.aD(n), (Class)RelativeLayout$LayoutParams.class);
    }
    
    private final void m(final anvp anvp) {
        anvr anvr;
        if ((anvr = anvp.f) == null) {
            anvr = anvr.a;
        }
        if (anvr == null) {
            this.g();
        }
        else {
            int bh;
            if ((bh = aqql.bH(anvr.b)) == 0) {
                bh = 1;
            }
            if (--bh != 2) {
                if (bh != 3) {
                    if (bh != 4) {
                        if (bh != 5) {
                            this.g();
                        }
                        else {
                            final int orElse = tmy.ct((Context)this.j, 2130970858).orElse(0);
                            this.f.setBackground((Drawable)null);
                            this.o(orElse);
                            final int dimensionPixelSize = this.k.getDimensionPixelSize(2131169468);
                            this.f.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            this.j(this.k.getDimensionPixelSize(2131169471));
                            this.c.f((float)this.k.getDimensionPixelOffset(2131169478));
                            this.c.d(orElse);
                            this.h.a = this.k.getFraction(2131361819, 1, 1);
                            this.e.setLines(2);
                            this.e.setTextSize(0, (float)this.k.getDimensionPixelSize(2131169476));
                            this.e.setGravity(8388627);
                            final int dimensionPixelSize2 = this.k.getDimensionPixelSize(2131169475);
                            this.n(dimensionPixelSize2, dimensionPixelSize2);
                        }
                    }
                    else {
                        final int orElse2 = tmy.ct((Context)this.j, 2130970858).orElse(0);
                        this.f.setBackground((Drawable)null);
                        this.o(orElse2);
                        final int dimensionPixelSize3 = this.k.getDimensionPixelSize(2131169468);
                        this.f.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
                        this.j(this.k.getDimensionPixelSize(2131169479));
                        this.c.d(orElse2);
                        this.c.f((float)this.k.getDimensionPixelOffset(2131169478));
                        this.h.a = this.k.getFraction(2131361794, 1, 1);
                        this.e.setLines(2);
                        this.e.setTextSize(0, (float)this.k.getDimensionPixelSize(2131169476));
                        this.e.setGravity(8388627);
                        final int dimensionPixelSize4 = this.k.getDimensionPixelSize(2131169475);
                        this.n(dimensionPixelSize4, dimensionPixelSize4);
                    }
                }
                else {
                    final int orElse3 = tmy.ct((Context)this.j, 2130970858).orElse(0);
                    this.f.setBackground((Drawable)null);
                    this.o(orElse3);
                    final int dimensionPixelSize5 = this.k.getDimensionPixelSize(2131169468);
                    this.f.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
                    this.j(this.k.getDimensionPixelSize(2131169477));
                    this.c.f((float)this.k.getDimensionPixelOffset(2131169478));
                    this.c.d(orElse3);
                    this.h.a = this.k.getFraction(2131361819, 1, 1);
                    this.e.setLines(3);
                    this.e.setTextSize(0, (float)this.k.getDimensionPixelSize(2131169476));
                    this.e.setGravity(8388627);
                    final int dimensionPixelSize6 = this.k.getDimensionPixelSize(2131169475);
                    this.n(dimensionPixelSize6, dimensionPixelSize6);
                }
            }
            else {
                this.f.setBackground((Drawable)null);
                this.g.setImageDrawable((Drawable)null);
                this.f.setPadding(0, 0, 0, 0);
                this.j(this.k.getDimensionPixelSize(2131169480));
                this.c.f((float)this.k.getDimensionPixelSize(2131169469));
                this.c.d(tmy.ct((Context)this.j, 2130970858).orElse(0));
                this.h.a = this.k.getFraction(2131361797, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, (float)this.k.getDimensionPixelOffset(2131169473));
                this.e.setGravity(8388611);
                final int dimensionPixelSize7 = this.k.getDimensionPixelSize(2131169475);
                this.n(dimensionPixelSize7, dimensionPixelSize7);
            }
            final acta a = acta.a(this.c.getContext());
            a.c((int)tmy.aY(this.j.getResources().getDisplayMetrics(), this.c.b()));
            this.n.c((View)this.c, (Drawable)a.b());
        }
        if (this.p()) {
            anvr anvr2;
            if ((anvr2 = anvp.f) == null) {
                anvr2 = anvr.a;
            }
            Label_1013: {
                Label_0951: {
                    if (anvr2 != null) {
                        final int b = anvr2.b;
                        final int bh2 = aqql.bH(b);
                        Label_0886: {
                            if (bh2 != 0) {
                                if (bh2 == 6) {
                                    break Label_0886;
                                }
                            }
                            final int bh3 = aqql.bH(b);
                            if (bh3 != 0) {
                                if (bh3 == 4) {
                                    break Label_0886;
                                }
                            }
                            final int bh4 = aqql.bH(b);
                            if (bh4 == 0) {
                                break Label_0951;
                            }
                            if (bh4 != 5) {
                                break Label_0951;
                            }
                        }
                        final int orElse4 = tmy.ct((Context)this.j, 2130970852).orElse(0);
                        this.c.d(orElse4);
                        this.e.setTextColor(tmy.ct((Context)this.j, 2130970857).orElse(0));
                        if (this.g.getDrawable() != null) {
                            this.o(orElse4);
                        }
                        break Label_1013;
                    }
                }
                final int orElse5 = tmy.ct((Context)this.j, 2130970860).orElse(0);
                this.c.d(orElse5);
                this.e.setTextColor(tmy.ct((Context)this.j, 2130970924).orElse(0));
                if (this.g.getDrawable() != null) {
                    this.o(orElse5);
                }
            }
            this.e.setTypeface((Typeface)null, 1);
            this.c.setSelected(true);
            this.c.setClickable(false);
            return;
        }
        this.e.setTextColor(tmy.ct((Context)this.j, 2130970924).orElse(0));
        this.e.setTypeface((Typeface)null, 0);
        this.c.setSelected(false);
        this.c.setClickable(true);
    }
    
    private final void n(final int n, final int n2) {
        tmy.aF((View)this.e, tmy.ay(n, n2, n, n2), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    private final void o(final int n) {
        final GradientDrawable imageDrawable = (GradientDrawable)this.k.getDrawable(2131233216);
        imageDrawable.setStroke(tmy.aZ(this.k.getDisplayMetrics(), 1), ahy.e(ahu.a(this.k, 2131102382, this.j.getTheme()), n));
        this.g.setImageDrawable((Drawable)imageDrawable);
    }
    
    private final boolean p() {
        final athj o = this.o;
        return o != null && o.a == f(this.m);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void c(final acir acir) {
        this.i.c();
    }
    
    public final boolean h(final View view) {
        if (this.m == null) {
            return false;
        }
        if (this.p()) {
            return true;
        }
        final akac akac = (akac)this.m.c("HORIZONTAL_CARD_LIST");
        final int f = f(this.m);
        if (akac != null && jfi.g(akac)) {
            final jki jki = (jki)this.m.c("REFINEMENT_SELECTION_LISTENER");
            final anvp a = this.a;
            if (a != null && jki != null) {
                jki.l(a, f);
            }
            final CardView c = this.c;
            c.requestRectangleOnScreen(new Rect(0, 0, c.getWidth(), this.c.getHeight()));
            return true;
        }
        final SharedPreferences l = this.l;
        if (l == null || !l.getBoolean("force_enable_sticky_browsy_bars", false)) {
            aioe aioe;
            if ((aioe = this.a.e) == null) {
                aioe = aioe.a;
            }
            anve anve;
            if ((anve = ((anvb)((agzd)aioe).rr((agyr)SearchEndpointOuterClass.searchEndpoint)).e) == null) {
                anve = anve.a;
            }
            anvd anvd;
            if ((anvd = anve.c) == null) {
                anvd = anvd.a;
            }
            if (!anvd.c) {
                return false;
            }
        }
        if (f != -1) {
            this.m.e().put("HORIZONTAL_CARD_LIST", jfi.e(akac, f));
        }
        return false;
    }
    
    public final void l(final anvp anvp, final int n) {
        this.m(anvp);
    }
}
