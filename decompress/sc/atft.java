import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atft extends asie
{
    final asih a;
    final asid b;
    
    public atft(final asih a, final asid b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void af(final asif asif) {
        final atfs atfs = new atfs(asif, this.a);
        asif.d((asir)atfs);
        asjv.h((AtomicReference)atfs.b, this.b.f((Runnable)atfs));
    }
}
