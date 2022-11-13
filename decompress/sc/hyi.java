import android.view.ViewGroup$LayoutParams;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.function.Function;
import android.view.View$OnLayoutChangeListener;
import j$.util.Optional;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyi
{
    public final asht a;
    public final int b;
    public final int c;
    public final hyg d;
    public final afaq e;
    public int f;
    public int g;
    public int h;
    public int i;
    private final atjm j;
    private final Context k;
    private final ViewGroup l;
    private final View m;
    private final View n;
    private final View o;
    private final int p;
    private int q;
    private Optional r;
    
    public hyi(final Context k, final hzn hzn, final msr msr, final ViewGroup l, final int b, final int c, final int n, final hyg d, final afaq e, final Optional optional, final Optional optional2, final byte[] array, final byte[] array2, final byte[] array3) {
        final atjm e2 = atjm.e();
        this.j = e2;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.k = k;
        this.b = b;
        this.c = c;
        this.l = l;
        this.m = l.findViewById(b);
        this.n = l.findViewById(n);
        this.o = l.findViewById(c);
        this.d = d;
        this.e = e;
        this.r = optional;
        this.p = tpe.aZ(k.getResources().getDisplayMetrics(), 320);
        l.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(this, 13));
        this.r = optional;
        this.q = (int)optional2.map((Function)hvv.k).orElse((Object)0);
        this.a = asht.n((ashw)((asht)e2).A(), (ashw)((asht)hzn.a).A(), (asji)new gcv(this, 5));
        msr.Q((Callable)new hvu(this, 3));
    }
    
    public static void b(final Context context, final br br, int n) {
        if (br instanceof ghw) {
            final float n2 = (float)tpe.aZ(context.getResources().getDisplayMetrics(), 720);
            final float n3 = (float)n;
            if (n3 < n2) {
                n = 0;
            }
            else {
                final double n4 = n3 - n2;
                Double.isNaN(n4);
                n = (int)(n4 / 2.0);
            }
            ((ghw)br).be(n);
        }
    }
    
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        bundle.putInt("active_panel_on_single_panel_mode_key", this.q);
        return bundle;
    }
    
    public final void c() {
        this.f(this.l.getWidth(), true);
    }
    
    public final void d() {
        this.q = 2;
        if (this.h()) {
            return;
        }
        this.e();
    }
    
    public final void e() {
        if (this.q == 0) {
            int q;
            if (this.r.isPresent()) {
                q = ((hyh)this.r.get()).q();
            }
            else if (((Optional)this.e.a()).isEmpty()) {
                q = 0;
            }
            else {
                q = 1;
            }
            this.q = q;
        }
        final int f = this.f;
        final int i = this.i;
        int p;
        if (this.g()) {
            if ((p = i) <= 0) {
                p = this.p;
            }
        }
        else if (!this.g() && ((Optional)this.e.a()).isPresent() && this.q == 1) {
            p = f;
        }
        else {
            p = 0;
        }
        final aezq a = aezq.a((Object)p, (Object)(f - p));
        this.g = (int)a.a;
        this.h = (int)a.b;
        if (this.g()) {
            this.m.setVisibility(0);
            tpe.aF(this.m, tpe.aD(this.g), (Class)ViewGroup$LayoutParams.class);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
        }
        else {
            if (this.q == 1) {
                this.m.setVisibility(0);
                tpe.aF(this.m, tpe.aD(this.g), (Class)ViewGroup$LayoutParams.class);
                this.o.setVisibility(8);
            }
            else {
                this.m.setVisibility(8);
                this.o.setVisibility(0);
            }
            this.n.setVisibility(8);
        }
        this.d.aL();
    }
    
    public final void f(final int n, final boolean b) {
        this.j.tu((Object)aezq.a((Object)n, (Object)b));
    }
    
    public final boolean g() {
        return !((Optional)this.e.a()).isEmpty() && this.f >= tpe.aZ(this.k.getResources().getDisplayMetrics(), 640);
    }
    
    public final boolean h() {
        return this.o.getVisibility() == 0;
    }
    
    public final boolean i() {
        return this.m.getVisibility() == 0;
    }
    
    public final boolean j() {
        if (((Optional)this.e.a()).isEmpty()) {
            return false;
        }
        if (!this.g() && this.m.getVisibility() == 8) {
            this.q = 1;
            this.e();
            return true;
        }
        return false;
    }
}
