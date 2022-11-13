import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atfw extends asie
{
    final asih a;
    final long b;
    final TimeUnit c;
    final asid d;
    final asih e;
    
    public atfw(final asih a, final long b, final TimeUnit c, final asid d, final asih e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    protected final void af(final asif asif) {
        final atfv atfv = new atfv(asif, this.e, this.b, this.c);
        asif.d((asir)atfv);
        asjv.h(atfv.b, this.d.c((Runnable)atfv, this.b, this.c));
        this.a.ae((asif)atfv);
    }
}
