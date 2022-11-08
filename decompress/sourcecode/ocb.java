import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;
import android.content.Context;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ocb
{
    private static Optional a;
    
    static {
        ocb.a = Optional.empty();
    }
    
    public static ocb c(final Context context, final Supplier supplier, final oby oby) {
        synchronized (ocb.class) {
            if (!ocb.a.isPresent()) {
                ocb.a = Optional.of((Object)new oce(context, (oca)supplier.get(), oby));
            }
            return (ocb)ocb.a.get();
        }
    }
    
    public abstract oax b();
    
    public abstract ListenableFuture d(final obc p0);
    
    public abstract ListenableFuture e();
    
    public abstract void f(final agsd p0);
}
