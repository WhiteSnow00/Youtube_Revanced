import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grh implements gqw
{
    public static final epe a;
    public final Context b;
    public final atjj c;
    public final Object d;
    public final arhr e;
    private final Executor f;
    
    static {
        a = epe.a;
    }
    
    public grh(final Context b, final atjj c, final Executor f, final arhr e) {
        this.d = new Object();
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    @Override
    public final ListenableFuture a(final grd grd) {
        return afld.k((Callable)new grg(this, grd), this.f);
    }
}
