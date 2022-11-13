import android.app.Activity;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgk
{
    public final atke a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public adgk(final adjh c, final adgj d, final atke e, final atke f, final atke g, final atke a, final Optional h) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = a;
        this.i = new afes();
        this.j = new afes();
        this.h = h;
    }
    
    public adgk(final Activity d, final ghb j, final fjv c, final kcq e, final atke a, final hzn h, final msr g, final vai f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = false;
        this.d = d;
        this.j = j;
        this.c = c;
        this.e = e;
        this.a = a;
        this.h = h;
        this.g = g;
        this.i = new ghg(d);
        this.f = f;
    }
    
    public final void a(final String s, final atke atke) {
        if (!this.b) {
            ((afes)this.j).g(s, atke);
            return;
        }
        throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
    }
    
    public final void b(final String s, final atke atke) {
        if (!this.b) {
            ((afes)this.i).g(s, atke);
            return;
        }
        throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
    }
}
