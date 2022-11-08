import android.app.Activity;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adei
{
    public final atjj a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public adei(final adhe c, final adeh d, final atjj e, final atjj f, final atjj g, final atjj a, final Optional h) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = a;
        this.i = new afct();
        this.j = new afct();
        this.h = h;
    }
    
    public adei(final Activity d, final ggs j, final fjp c, final kbr e, final atjj a, final hyr h, final mrm g, final uyi f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = false;
        this.d = d;
        this.j = j;
        this.c = c;
        this.e = e;
        this.a = a;
        this.h = h;
        this.g = g;
        this.i = new ggx(d);
        this.f = f;
    }
    
    public final void a(final String s, final atjj atjj) {
        if (!this.b) {
            ((afct)this.j).g((Object)s, (Object)atjj);
            return;
        }
        throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
    }
    
    public final void b(final String s, final atjj atjj) {
        if (!this.b) {
            ((afct)this.i).g((Object)s, (Object)atjj);
            return;
        }
        throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
    }
}
