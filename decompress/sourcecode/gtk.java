import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtk extends nq implements gtj
{
    public long a;
    public long e;
    public int f;
    private final int g;
    private final gte h;
    private final atjj i;
    private int j;
    private long k;
    private asic l;
    private final boolean m;
    private final asho n;
    
    public gtk(final Context context, final gte h, final atjj i, final atjj atjj, final atjj atjj2) {
        this.h = h;
        this.g = gsy.a(context);
        this.i = i;
        this.n = (asho)atjj.a();
        this.m = ((uyi)atjj2.a()).bA();
    }
    
    private final void y() {
        final asic l = this.l;
        if (l != null && !l.tx()) {
            asjg.b((AtomicReference)this.l);
        }
    }
    
    public final int a() {
        return this.f + 2;
    }
    
    public final int b() {
        return this.j * this.f;
    }
    
    public final int c() {
        final int j = this.j;
        final int a = this.a();
        final int g = this.g;
        return j * (a - 2) + (g + g);
    }
    
    public final int d(final int n) {
        if (n != 0 && n != this.a() - 1) {
            return 0;
        }
        return 1;
    }
    
    public final int e() {
        return this.j;
    }
    
    public final int f() {
        return this.g;
    }
    
    public final void j(final long a, final long e, final long k) {
        this.a = a;
        this.e = e;
        this.k = k;
        this.f = this.x();
    }
    
    public final void p(final RecyclerView recyclerView) {
        if (this.m) {
            this.y();
            this.h.c();
            final asic l = this.l;
            if (l == null || l.tx()) {
                this.l = ((ashe)this.h.a).aa(this.n).aC((asix)new grs(this, 8), (asix)gpa.l);
            }
        }
    }
    
    public final void u() {
        if (this.m) {
            this.y();
            this.h.f();
        }
    }
    
    public final int x() {
        return (int)(this.a / (float)this.e * 6.0f);
    }
}
