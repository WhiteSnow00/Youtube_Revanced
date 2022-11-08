import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class hf implements hk
{
    final /* synthetic */ hk a;
    final bkh b;
    private final Handler c;
    private final Runnable d;
    
    public hf(final hk a) {
        this.a = a;
        this.b = new bkh((byte[])null, (byte[])null, (byte[])null);
        this.c = new Handler(Looper.getMainLooper());
        this.d = (Runnable)new he(this);
    }
    
    public final void a(final hi hi) {
        this.b.l(hi);
        this.c.post(this.d);
    }
}
