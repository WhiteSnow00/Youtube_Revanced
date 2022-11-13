import android.os.SystemClock;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auax
{
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    
    public auax(final String c, final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Process.myTid();
        this.e = System.nanoTime();
        this.f = SystemClock.currentThreadTimeMillis();
    }
}
