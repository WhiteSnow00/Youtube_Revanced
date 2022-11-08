import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezo extends acja
{
    public final Context a;
    public final View b;
    public final GradientDrawable c;
    public final vax d;
    public final thh e;
    public final vbq f;
    public final alff g;
    public final alff h;
    public acie i;
    public wwv j;
    public aigc k;
    public ezn l;
    private final aceo m;
    private final acts n;
    private final acek o;
    private final View p;
    private final ImageView q;
    private final TextView r;
    private final arhr s;
    private final View t;
    private asic u;
    
    public ezo(final Context a, final aceo m, final vax d, final acts n, final thh e, final vbq f, final adcr adcr, final arhr s, final byte[] array) {
        a.getClass();
        this.a = a;
        m.getClass();
        this.m = m;
        n.getClass();
        this.n = n;
        this.d = d;
        this.e = e;
        this.f = f;
        s.getClass();
        this.s = s;
        d.getClass();
        final View inflate = LayoutInflater.from(a).inflate(2131624158, (ViewGroup)null);
        this.p = inflate;
        this.r = (TextView)inflate.findViewById(2131428092);
        this.q = (ImageView)inflate.findViewById(2131428086);
        final View viewById = inflate.findViewById(2131428141);
        this.b = viewById;
        this.c = (GradientDrawable)viewById.getBackground();
        this.t = inflate.findViewById(2131428123);
        final acej a2 = acek.a();
        a2.b(2131232282);
        this.o = a2.a();
        this.l = ezn.a;
        this.g = l(2);
        this.h = l(3);
        adcr.b(inflate, adcr.a(inflate, (Drawable)null));
    }
    
    private final void g() {
        final aigc k = this.k;
        if (k != null && (k.b & 0x400) != 0x0) {
            ((acuj)this.s.a()).g(this.k.k);
        }
        this.j = null;
        this.k = null;
        final asic u = this.u;
        if (u != null) {
            asjg.b((AtomicReference)u);
            this.u = null;
        }
    }
    
    private static boolean h(final aigc aigc) {
        if (((agzd)aigc).rs((agyr)aiga.b)) {
            final int ai = aety.aI(((aigd)((agzd)aigc).rr((agyr)aiga.b)).b);
            if (ai != 0) {
                if (ai == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean j(final aigc aigc) {
        if (((agzd)aigc).rs((agyr)aiga.b)) {
            final int ai = aety.aI(((aigd)((agzd)aigc).rr((agyr)aiga.b)).b);
            if (ai != 0) {
                if (ai == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static alff l(final int n) {
        final agza builder = ((agzi)alff.a).createBuilder();
        final agza builder2 = ((agzi)aleu.a).createBuilder();
        builder2.copyOnWrite();
        final aleu aleu = (aleu)builder2.instance;
        aleu.c = n - 1;
        aleu.b |= 0x1;
        builder.copyOnWrite();
        final alff alff = (alff)builder.instance;
        final aleu n2 = (aleu)builder2.build();
        n2.getClass();
        alff.n = n2;
        alff.b |= 0x8000;
        return (alff)builder.build();
    }
    
    public final View a() {
        return this.p;
    }
    
    public final void c(final acir acir) {
        this.g();
    }
    
    public final boolean f(final ezn l) {
        if (l == this.l) {
            return false;
        }
        final ezn a = ezn.a;
        final int ordinal = l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.t.setAlpha(0.3f);
                    this.t.setBackground((Drawable)null);
                }
            }
            else {
                this.t.setAlpha(1.0f);
                this.t.setBackgroundColor(actf.a(this.a, aoqb.J, 0));
            }
        }
        else {
            this.t.setAlpha(1.0f);
            this.t.setBackground((Drawable)null);
        }
        this.l = l;
        return true;
    }
}
