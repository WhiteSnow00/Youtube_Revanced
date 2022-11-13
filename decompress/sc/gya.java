import android.os.Handler;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gya
{
    final View a;
    public final Handler b;
    public final Runnable c;
    public final Runnable d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    
    public gya(final View a) {
        this.e = false;
        this.f = false;
        this.g = false;
        this.a = a;
        this.b = new Handler();
        this.c = new gwk(this, a, 3);
        this.d = new gwk(this, a, 4);
    }
    
    public final void a() {
        this.b.removeCallbacks(this.c);
        this.b.removeCallbacks(this.d);
        this.f = false;
        this.g = false;
        this.e = false;
        gxv.d(this.a);
    }
    
    public final void b() {
        if (this.e) {
            this.b.removeCallbacks(this.d);
            this.g = false;
            return;
        }
        if (!this.f) {
            this.f = true;
            this.b.postDelayed(this.c, 300L);
        }
    }
}
