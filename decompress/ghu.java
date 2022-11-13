import android.content.res.Configuration;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghu implements fxu
{
    public final ghk a;
    public final Handler b;
    public final Runnable c;
    public boolean d;
    public Integer e;
    public final vai f;
    
    public ghu(final ghk a, final Handler b, final vai f) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = new ght(this, 0);
    }
    
    public final int a() {
        return this.a.b.c;
    }
    
    public final int b() {
        return this.a.a();
    }
    
    public final void c(final int n) {
        this.e = n;
        if (this.d) {
            final Handler b = this.b;
            b.getClass();
            final Runnable c = this.c;
            c.getClass();
            b.post(c);
            return;
        }
        this.a.d(n);
    }
    
    @Override
    public final void j(final Configuration configuration) {
        this.a.j(configuration);
    }
}
