import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gro implements grd
{
    public static final eph a;
    public final Context b;
    public final atke c;
    public final Object d;
    public final arkg e;
    private final Executor f;
    
    static {
        a = eph.a;
    }
    
    public gro(final Context b, final atke c, final Executor f, final arkg e) {
        this.d = new Object();
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    public final ListenableFuture a(final grk grk) {
        return afnd.o((Callable)new grn(this, grk), this.f);
    }
}
