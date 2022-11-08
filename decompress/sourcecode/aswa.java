import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aswa extends asgy
{
    final long a;
    final TimeUnit b;
    final asho c;
    
    public aswa(final long a, final TimeUnit b, final asho c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected final void ah(final asgz asgz) {
        final asvz asvz = new asvz(asgz);
        asgz.d((asic)asvz);
        asjg.h(asvz, this.c.c((Runnable)asvz, this.a, this.b));
    }
}
