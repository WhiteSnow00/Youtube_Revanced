import android.app.Activity;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhx
{
    public final atnb a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public adhx(final adkx c, final adhw d, final atnb e, final atnb f, final atnb g, final atnb a, final Optional h) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = a;
        this.i = new afgj();
        this.j = new afgj();
        this.h = h;
    }
    
    public adhx(final Activity d, final ghf j, final fjy c, final kdb e, final atnb a, final hzw h, final mtf g, final vbs f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = false;
        this.d = d;
        this.j = j;
        this.c = c;
        this.e = e;
        this.a = a;
        this.h = h;
        this.g = g;
        this.i = new ghk(d);
        this.f = f;
    }
    
    public final void a(final String s, final atnb atnb) {
        if (!this.b) {
            ((afgj)this.j).g(s, atnb);
            return;
        }
        throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
    }
    
    public final void b(final String s, final atnb atnb) {
        if (!this.b) {
            ((afgj)this.i).g(s, atnb);
            return;
        }
        throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
    }
}
