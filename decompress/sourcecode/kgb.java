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

public final class kgb implements View$OnClickListener, acil
{
    public final View a;
    public final Object b;
    public final Object c;
    private final /* synthetic */ int d;
    private final Object e;
    private final Object f;
    private final Object g;
    private Object h;
    
    public kgb(final Context e, final aceo f, final vax g, final wwu wwu, final int d) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.c = wwu.n();
        final View inflate = LayoutInflater.from(e).inflate(2131625063, (ViewGroup)null);
        (this.a = inflate).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(e.getResources().getDimensionPixelSize(2131168597), -2));
        inflate.setOnClickListener((View$OnClickListener)this);
        this.b = inflate.findViewById(2131430533);
    }
    
    public kgb(final Context context, final vax b, final acnh c, final acni f, final int d) {
        this.d = d;
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = f;
        this.g = tmy.O(c.a(), (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class);
        final View inflate = View.inflate(context, 2131624292, (ViewGroup)null);
        this.e = inflate;
        final View view = inflate;
        inflate.setOnClickListener((View$OnClickListener)this);
        final View view2 = inflate;
        final TextView a = (TextView)inflate.findViewById(2131431950);
        this.a = (View)a;
        final TextView textView = a;
        a.setImportantForAccessibility(2);
    }
    
    public kgb(final ufk c, final gzb b, final two g, final asho f, final ViewGroup viewGroup, final int d) {
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
    
    public final void c(final acir acir) {
        final int d = this.d;
        if (d == 0) {
            this.h = null;
            return;
        }
        if (d != 1) {
            return;
        }
        asjg.b((AtomicReference)this.h);
    }
    
    public final void onClick(final View view) {
        final int d = this.d;
        if (d == 0) {
            final Object h = this.h;
            if (h != null) {
                final ankj ankj = (ankj)h;
                if ((ankj.b & 0x20) != 0x0) {
                    ((wwv)this.c).J(3, (wxz)new wws(ankj.f.I()), (alff)null);
                }
                final ankj ankj2 = (ankj)this.h;
                if ((ankj2.b & 0x2) != 0x0) {
                    final Object g = this.g;
                    aioe aioe;
                    if ((aioe = ankj2.d) == null) {
                        aioe = aioe.a;
                    }
                    ((vax)g).c(aioe, (Map)null);
                }
            }
            return;
        }
        if (d != 1) {
            final Object f = this.f;
            if (f != null) {
                ((acni)f).a();
            }
            if (vwh.c((amel)this.h) != null) {
                ((vax)this.b).c(vwh.c((amel)this.h), ((acnh)this.c).a());
                final agyc c = vwh.c((amel)this.h).c;
                if (this.g != null && !c.H()) {
                    ((wwv)this.g).J(3, (wxz)new wws(c), (alff)null);
                }
            }
            else if (vwh.b((amel)this.h) != null) {
                ((vax)this.b).c(vwh.b((amel)this.h), ((acnh)this.c).a());
            }
            return;
        }
        if (view == this.a) {
            final ashe al = ((gzb)this.b).a().J((asjd)flu.k).al(1L);
            final Boolean value = false;
            al.ay((Object)value).B((asix)new gxt(this, 4, (byte[])null)).Y();
            ((gzb)this.b).b();
            ((ufk)this.c).c().J((asjd)flu.l).al(1L).ay((Object)value).B((asix)new gxt(this, 5, (byte[])null)).Y();
        }
    }
}
