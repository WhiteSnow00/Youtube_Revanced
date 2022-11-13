import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avd implements aun
{
    public static final avd a;
    public int b;
    public int c;
    public boolean d;
    public Handler e;
    public final auo f;
    public final Runnable g;
    final pvh h;
    private boolean i;
    
    static {
        a = new avd();
    }
    
    private avd() {
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.i = true;
        this.f = new auo((aun)this);
        this.g = (Runnable)new aus(this, 2);
        this.h = new pvh(this);
    }
    
    final void a() {
        final int c = this.c + 1;
        this.c = c;
        if (c == 1) {
            if (this.d) {
                this.f.e(aug.ON_RESUME);
                this.d = false;
                return;
            }
            this.e.removeCallbacks(this.g);
        }
    }
    
    final void b() {
        final int b = this.b + 1;
        this.b = b;
        if (b == 1 && this.i) {
            this.f.e(aug.ON_START);
            this.i = false;
        }
    }
    
    final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(aug.ON_STOP);
            this.i = true;
        }
    }
    
    public final aui getLifecycle() {
        return this.f;
    }
}
