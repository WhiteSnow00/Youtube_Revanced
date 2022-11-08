import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftv implements acil
{
    public static final afcr a;
    public final gcd b;
    public View$OnClickListener c;
    public acie d;
    public boolean e;
    public wwv f;
    public agza g;
    public final kct h;
    private final aceo i;
    private final acng j;
    private final acih k;
    private final acts l;
    private final arhr m;
    private asic n;
    
    static {
        a = afcr.t((Object)aiiu.k, (Object)aiiu.m, (Object)aiiu.n);
    }
    
    public ftv(final Context context, final vax vax, final aceo i, final acng j, final acts l, final kct h, final arhr m, final byte[] array, final byte[] array2, final byte[] array3) {
        vax.getClass();
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        l.getClass();
        this.l = l;
        h.getClass();
        this.h = h;
        m.getClass();
        this.m = m;
        final gcd b = new gcd(context, h.f() ^ true);
        this.b = b;
        this.k = new acih(vax, (View)b, (acie)new inr(this, 1));
        this.f = wwv.k;
    }
    
    public static alff b(final aiit aiit) {
        final agza builder = ((agzi)alff.a).createBuilder();
        final agza builder2 = ((agzi)aleu.a).createBuilder();
        int n;
        if (!aiit.i) {
            n = 3;
        }
        else {
            n = 2;
        }
        builder2.copyOnWrite();
        final aleu aleu = (aleu)builder2.instance;
        aleu.c = n - 1;
        aleu.b |= 0x1;
        final aleu n2 = (aleu)builder2.build();
        builder.copyOnWrite();
        final alff alff = (alff)builder.instance;
        n2.getClass();
        alff.n = n2;
        alff.b |= 0x8000;
        return (alff)builder.build();
    }
    
    public static void d(final acij acij, final ashe ashe) {
        acij.f("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY", (Object)ashe);
    }
    
    public static void f(final acij acij, final acie acie) {
        acie.getClass();
        acij.f("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT", (Object)acie);
    }
    
    public static void g(final acij acij, final View$OnClickListener view$OnClickListener) {
        acij.f("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER", (Object)view$OnClickListener);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        this.f = wwv.k;
        this.c = null;
        this.e = false;
        this.k.c();
        final asic n = this.n;
        if (n != null) {
            asjg.b((AtomicReference)n);
            this.n = null;
        }
    }
    
    public final void h() {
        final agza g = this.g;
        if (g != null) {
            final aiit aiit = (aiit)g.instance;
            if ((aiit.b & 0x8000) != 0x0) {
                final int af = aety.aF(aiit.n);
                if (af != 0) {
                    if (af == 2) {
                        return;
                    }
                }
            }
        }
        if (g != null) {
            final wwv f = this.f;
            if (f != null) {
                f.J(3, (wxz)new wws(((aiit)g.instance).l), b((aiit)this.g.build()));
            }
        }
    }
}
