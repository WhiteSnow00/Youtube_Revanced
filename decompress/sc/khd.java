import java.util.Map;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReference;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khd implements View$OnClickListener, acko
{
    public final View a;
    public final Object b;
    public final Object c;
    private final int d;
    private final Object e;
    private final Object f;
    private final Object g;
    private Object h;
    
    public khd(final Context e, final acgs f, final vcy g, final wyv wyv, final int d) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.c = wyv.pF();
        final View inflate = LayoutInflater.from(e).inflate(2131625064, (ViewGroup)null);
        (this.a = inflate).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(e.getResources().getDimensionPixelSize(2131168596), -2));
        inflate.setOnClickListener((View$OnClickListener)this);
        this.b = inflate.findViewById(2131430534);
    }
    
    public khd(final Context context, final vcy b, final acpl c, final acpm f, final int d) {
        this.d = d;
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = f;
        this.g = tpe.O(c.a(), (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class);
        final View inflate = View.inflate(context, 2131624291, (ViewGroup)null);
        this.e = inflate;
        final View view = inflate;
        inflate.setOnClickListener((View$OnClickListener)this);
        final View view2 = inflate;
        final TextView a = (TextView)inflate.findViewById(2131431953);
        this.a = (View)a;
        final TextView textView = a;
        a.setImportantForAccessibility(2);
    }
    
    public khd(final uho c, final gzs b, final tyv g, final asid f, final ViewGroup viewGroup, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.g = g;
        this.f = f;
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624008, viewGroup, false);
        this.e = inflate;
        final View view = inflate;
        final ImageView a = (ImageView)inflate.findViewById(2131427546);
        this.a = (View)a;
        final ImageView imageView = a;
        a.setOnClickListener((View$OnClickListener)this);
    }
    
    public final View a() {
        if (this.d != 0) {
            return (View)this.e;
        }
        return this.a;
    }
    
    public final void c(final acku acku) {
        final int d = this.d;
        if (d == 0) {
            this.h = null;
            return;
        }
        if (d != 1) {
            return;
        }
        asjv.b((AtomicReference)this.h);
    }
    
    public final void mN(final ackm ackm, final Object o) {
        final int d = this.d;
        final int n = -1;
        if (d == 0) {
            final anmm h = (anmm)o;
            this.h = h;
            ((wyw)this.c).t((wzz)new wyt(h.f), (alhi)null);
            final Object f = this.f;
            final Object b = this.b;
            aotp aotp;
            if ((aotp = h.c) == null) {
                aotp = aotp.a;
            }
            ((acgs)f).g((ImageView)b, aotp);
            final Object b2 = this.b;
            aotp aotp2;
            if ((aotp2 = h.c) == null) {
                aotp2 = aotp.a;
            }
            ((ImageView)b2).setContentDescription((CharSequence)ezt.v(aotp2));
            final Resources resources = ((Context)this.e).getResources();
            int width;
            if ((h.b & 0x4) != 0x0) {
                anmn anmn;
                if ((anmn = h.e) == null) {
                    anmn = anmn.a;
                }
                int ca;
                if ((ca = aqsx.cA(anmn.b)) == 0) {
                    ca = 1;
                }
                if (--ca != 0) {
                    if (ca != 1) {
                        width = n;
                    }
                    else {
                        width = resources.getDimensionPixelSize(2131168597);
                    }
                }
                else {
                    width = resources.getDimensionPixelSize(2131168596);
                }
            }
            else {
                width = resources.getDimensionPixelSize(2131168596);
            }
            if (width > 0) {
                this.a.getLayoutParams().width = width;
            }
            return;
        }
        if (d != 1) {
            final amgp h2 = (amgp)o;
            ((TextView)this.a).setText(vyg.h(h2));
            ColorStateList textColor;
            if (vyg.j(h2) - 1 != 1) {
                textColor = tpe.ct(((TextView)this.a).getContext(), 2130970924);
            }
            else {
                textColor = tpe.ct(((TextView)this.a).getContext(), 2130970922);
            }
            ((TextView)this.a).setTextColor(textColor);
            final CharSequence text = ((TextView)this.a).getText();
            amgq amgq;
            if ((amgq = h2.c) == null) {
                amgq = amgq.a;
            }
            amgo amgo;
            if ((amgo = amgq.g) == null) {
                amgo = amgo.a;
            }
            ahik ahik;
            if ((ahik = amgo.b) == null) {
                ahik = ahik.a;
            }
            if ((ahik.b & 0x2) != 0x0) {
                final Object e = this.e;
                amgq amgq2;
                if ((amgq2 = h2.c) == null) {
                    amgq2 = amgq.a;
                }
                amgo amgo2;
                if ((amgo2 = amgq2.g) == null) {
                    amgo2 = amgo.a;
                }
                ahik ahik2;
                if ((ahik2 = amgo2.b) == null) {
                    ahik2 = ahik.a;
                }
                ((View)e).setContentDescription((CharSequence)ahik2.c);
            }
            else {
                ((View)this.e).setContentDescription(text);
            }
            this.h = h2;
            final ahab c = vyg.c(h2);
            if (!c.H()) {
                final Object g = this.g;
                if (g != null) {
                    ((wyw)g).t((wzz)new wyt(c), (alhi)null);
                }
            }
            return;
        }
        final gyx gyx = (gyx)o;
        this.h = ((tyv)this.g).g().af((asid)this.f).aH(new gyi(this, 3, null));
    }
    
    public final void onClick(final View view) {
        final int d = this.d;
        if (d == 0) {
            final Object h = this.h;
            if (h != null) {
                final anmm anmm = (anmm)h;
                if ((anmm.b & 0x20) != 0x0) {
                    ((wyw)this.c).J(3, (wzz)new wyt(anmm.f.I()), (alhi)null);
                }
                final anmm anmm2 = (anmm)this.h;
                if ((anmm2.b & 0x2) != 0x0) {
                    final Object g = this.g;
                    aiqj aiqj;
                    if ((aiqj = anmm2.d) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)g).c(aiqj, (Map)null);
                }
            }
            return;
        }
        if (d != 1) {
            final Object f = this.f;
            if (f != null) {
                ((acpm)f).a();
            }
            if (vyg.e((amgp)this.h) != null) {
                ((vcy)this.b).c(vyg.e((amgp)this.h), ((acpl)this.c).a());
                final ahab c = vyg.e((amgp)this.h).c;
                if (this.g != null && !c.H()) {
                    ((wyw)this.g).J(3, (wzz)new wyt(c), (alhi)null);
                }
            }
            else if (vyg.d((amgp)this.h) != null) {
                ((vcy)this.b).c(vyg.d((amgp)this.h), ((acpl)this.c).a());
            }
            return;
        }
        if (view == this.a) {
            final asht ar = ((gzs)this.b).a().K((asjs)fma.k).ar(1L);
            final Boolean value = false;
            ar.aE(value).B(new gyi(this, 4, null)).Z();
            ((gzs)this.b).b();
            ((uho)this.c).c().K((asjs)fma.l).ar(1L).aE(value).B(new gyi(this, 5, null)).Z();
        }
    }
}
