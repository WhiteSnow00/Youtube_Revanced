import android.os.CancellationSignal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajk
{
    public static CancellationSignal a() {
        return new CancellationSignal();
    }
    
    public static void b(final Object o) {
        ((CancellationSignal)o).cancel();
    }
}
