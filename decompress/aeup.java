import java.lang.ref.Reference;
import android.os.Build$VERSION;
import java.util.concurrent.atomic.AtomicReference;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeup implements aevk
{
    public final aevk a;
    public Thread b;
    private final aewu c;
    private final aeww d;
    
    private aeup(final aewu c, final aeup a) {
        this.c = c;
        this.d = a.d;
        this.a = a;
        this.b = Thread.currentThread();
    }
    
    public aeup(final aewu c, final aeww d) {
        this.c = c;
        this.d = d;
        this.a = null;
        this.b = Thread.currentThread();
    }
    
    @Override
    public final aevk a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.c.c;
    }
    
    @Override
    public final Thread c() {
        return this.b;
    }
    
    @Override
    public final void close() {
        this.b = null;
        aewp.j(this);
    }
    
    @Override
    public final UUID d() {
        return this.d.b;
    }
    
    public final int e() {
        return this.c.f;
    }
    
    public final aewg f() {
        return (aewg)this.d.b().d;
    }
    
    @Override
    public final aevb g() {
        return this.c.e;
    }
    
    @Override
    public final aevk h(final String s, aevb aevb, final aewo aewo) {
        final aeww d = this.d;
        aevb = (aevb)new aewu(this.c, s, d.a(), aevb);
    Label_0025:
        while (true) {
            final aewu aewu = d.d.get();
            final int n = aewu.f + 1;
            if (n >= d.a.f) {
                ((aewu)aevb).b(Integer.MIN_VALUE, null);
                synchronized (d) {
                    ++d.f;
                    break;
                }
            }
            ((aewu)aevb).b(n, aewu);
            final AtomicReference d2 = d.d;
            while (!d2.compareAndSet(aewu, aevb)) {
                if (d2.get() != aewu) {
                    continue Label_0025;
                }
            }
            break;
        }
        final aeup aeup = new aeup((aewu)aevb, this);
        this.c.h = aewp.l(aewo, aeup);
        return aeup;
    }
    
    @Override
    public final void i(final boolean b) {
        final long a = this.d.a();
        final aewu c = this.c;
        final long d = c.d;
        adme.T(c.c() ^ true);
        long n;
        if (!b) {
            n = 0L;
        }
        else {
            n = 4611686018427387904L;
        }
        c.i = ((a - d & 0x3FFFFFFFFFFFFFFFL) | (n | Long.MIN_VALUE));
        if (Build$VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence((Object)this);
        }
    }
    
    @Override
    public final void j() {
        this.c.j = 3;
    }
    
    @Override
    public final String toString() {
        return aewp.h(this);
    }
}
