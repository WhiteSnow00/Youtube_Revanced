import android.view.View$OnClickListener;
import android.view.View;
import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ian implements xlt, iax
{
    public final acwi a;
    public final xmb b;
    public final aeea c;
    private final xji d;
    private final faq e;
    private final atke f;
    private Optional g;
    
    static {
        ttr.a("MDX.CastTooltip");
    }
    
    public ian(final xmb b, final xji d, final faq e, final atke f, final aeea c, final acwi a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = f;
        this.c = c;
        a.getClass();
        this.a = a;
        this.g = Optional.empty();
    }
    
    public final xji a() {
        return this.d;
    }
    
    public final xmb b() {
        return this.b;
    }
    
    public final void c() {
        this.g.ifPresent((Consumer)new hvr(this, 19));
    }
    
    public final void d(final Runnable runnable) {
        tbi.f();
        final Optional optional = (Optional)this.f.a();
        if (optional.isEmpty()) {
            return;
        }
        final acwj a = this.a.a();
        a.a = (View)optional.get();
        a.m(2);
        a.f(3);
        a.h(this.b.g);
        a.b = this.e.getString(2132017643);
        a.o(1);
        int n;
        if (this.d == xji.b) {
            n = 2900;
        }
        else {
            n = 9900;
        }
        a.k(n);
        a.f = (acvo)new hlc(this, runnable, 3);
        a.g = (View$OnClickListener)new ibb(this, 1);
        final Optional of = Optional.of((Object)a.c());
        this.g = of;
        this.a.c((acwk)of.get());
    }
    
    public final boolean e() {
        return ((Optional)this.f.a()).isPresent();
    }
    
    public final Optional f() {
        return (Optional)this.f.a();
    }
}
