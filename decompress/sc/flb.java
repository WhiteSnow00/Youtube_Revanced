import java.util.concurrent.Callable;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flb implements fxv, zrf
{
    public final Set a;
    public ListenableFuture b;
    private final Context c;
    private final zqe d;
    private final Executor e;
    
    public flb(final Context c, final Executor e, final zrg zrg, final zqe d) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.b = d.b(c);
        zrg.b((zrf)this);
    }
    
    public static void b(final Throwable t) {
        ttr.d("Failed to read notification settings.", t);
    }
    
    private final void e() {
        final ListenableFuture b = this.d.b(this.c);
        teu.k(afwm.L(new ListenableFuture[] { b, this.b }).j((Callable)new exo(this, b, 2), (Executor)afum.a), this.e, (tes)etj.k, (tet)new esc(this, 8));
    }
    
    public final void a() {
    }
    
    public final void c() {
        this.e();
    }
    
    public final void d() {
        this.e();
    }
}
