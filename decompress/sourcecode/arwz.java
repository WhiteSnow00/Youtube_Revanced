import android.os.Parcel;
import android.os.Binder;
import java.util.concurrent.Executor;
import android.os.IBinder;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arwz
{
    public static final Logger a;
    protected final IBinder b;
    
    static {
        a = Logger.getLogger(arwz.class.getName());
    }
    
    public arwz(final IBinder b) {
        this.b = b;
    }
    
    public static arwz b(final IBinder binder, final Executor executor) {
        Object o;
        if (binder instanceof Binder) {
            o = new arwx(binder, executor);
        }
        else {
            o = new arwy(binder);
        }
        return (arwz)o;
    }
    
    public abstract void a(final int p0, final arxd p1);
    
    public final boolean c(final int n, final Parcel parcel) {
        try {
            return this.b.transact(n, parcel, (Parcel)null, 1);
        }
        finally {
            parcel.recycle();
        }
    }
}
