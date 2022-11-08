import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkq implements acwx
{
    private final Context a;
    private final atjj b;
    private final uyi c;
    private final arud d;
    private final adcr e;
    
    public jkq(final arud d, final Context a, final atjj b, final adcr e, final uyi c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public final int a() {
        if (!gkt.aL(this.d)) {
            return -1;
        }
        int n;
        if (gkt.ak(this.d) == 4) {
            n = 36;
        }
        else {
            n = 32;
        }
        return tmy.aZ(this.a.getResources().getDisplayMetrics(), n);
    }
    
    @Override
    public final int b() {
        if (!gkt.aL(this.d)) {
            return -1;
        }
        int n;
        if (gkt.ak(this.d) == 4) {
            n = 64;
        }
        else {
            n = 56;
        }
        return tmy.aZ(this.a.getResources().getDisplayMetrics(), n);
    }
    
    @Override
    public final boolean c() {
        if (!gkt.aL(this.d)) {
            return false;
        }
        if (!this.e.bx()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjg.b((AtomicReference)this.c.l(45358430L).aw((Object)false).Z((asix)new jcp(atomicBoolean, 10)));
            if (!atomicBoolean.get()) {
                return true;
            }
            final amoo b = ((adbr)this.b.a()).b();
            if (b != amoo.c && b != amoo.d && b != amoo.e) {
                if (b != amoo.b) {
                    return true;
                }
            }
        }
        return false;
    }
}
