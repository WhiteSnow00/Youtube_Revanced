import android.os.StrictMode;
import android.os.StrictMode$VmPolicy;
import android.os.StrictMode$ThreadPolicy;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auaq implements Closeable
{
    private final StrictMode$ThreadPolicy a;
    private final StrictMode$VmPolicy b;
    
    private auaq(final StrictMode$ThreadPolicy strictMode$ThreadPolicy) {
        this(strictMode$ThreadPolicy, null);
    }
    
    public auaq(final StrictMode$ThreadPolicy a, final StrictMode$VmPolicy b) {
        this.a = a;
        this.b = b;
    }
    
    public static auaq a() {
        return new auaq(StrictMode.allowThreadDiskReads());
    }
    
    public static auaq b() {
        return new auaq(StrictMode.allowThreadDiskWrites());
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
