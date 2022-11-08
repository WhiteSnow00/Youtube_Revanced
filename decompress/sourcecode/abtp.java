import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtp
{
    public final Runnable a;
    public final Handler b;
    public final oas c;
    public long d;
    public long e;
    public boolean f;
    public final arud g;
    
    public abtp(final oas c, final arud g, final Handler b, final atjj atjj, final byte[] array, final byte[] array2) {
        this.c = c;
        this.g = g;
        this.b = b;
        this.a = (Runnable)new aban(this, atjj, 20);
    }
    
    final void a() {
        this.b.removeCallbacks(this.a);
        this.e = 0L;
        this.b.post(this.a);
    }
    
    final void b() {
        this.b.removeCallbacks(this.a);
    }
}
