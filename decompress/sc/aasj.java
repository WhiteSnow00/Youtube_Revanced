import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasj
{
    public final Handler a;
    public final aasi b;
    public float c;
    public float d;
    public final boolean e;
    public final yzz f;
    
    public aasj(final yzz f, final yzz yzz, final boolean e, final byte[] array) {
        this.f = f;
        this.e = e;
        final Handler a = new Handler(Looper.getMainLooper());
        this.a = a;
        if (e) {
            this.b = new aasi(a, yzz);
            return;
        }
        this.b = null;
    }
    
    public final void a() {
        if (this.e) {
            final aasi b = this.b;
            final Handler a = b.a;
            if (a != null) {
                a.removeCallbacks(b.g);
            }
            b.h = true;
            b.c(0L);
        }
    }
}
