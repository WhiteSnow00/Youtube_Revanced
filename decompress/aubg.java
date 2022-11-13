import android.os.StrictMode;
import android.os.StrictMode$VmPolicy;
import android.os.StrictMode$ThreadPolicy;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubg implements Closeable
{
    private final StrictMode$ThreadPolicy a;
    private final StrictMode$VmPolicy b;
    
    private aubg(final StrictMode$ThreadPolicy strictMode$ThreadPolicy) {
        this(strictMode$ThreadPolicy, null);
    }
    
    public aubg(final StrictMode$ThreadPolicy a, final StrictMode$VmPolicy b) {
        this.a = a;
        this.b = b;
    }
    
    public static aubg a() {
        return new aubg(StrictMode.allowThreadDiskReads());
    }
    
    public static aubg b() {
        return new aubg(StrictMode.allowThreadDiskWrites());
    }
    
    @Override
    public final void close() {
        final StrictMode$ThreadPolicy a = this.a;
        if (a != null) {
            StrictMode.setThreadPolicy(a);
        }
        final StrictMode$VmPolicy b = this.b;
        if (b != null) {
            StrictMode.setVmPolicy(b);
        }
    }
}
