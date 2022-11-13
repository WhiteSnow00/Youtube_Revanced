import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlr implements acyz
{
    private final Context a;
    private final atke b;
    private final vai c;
    private final arwh d;
    private final aeea e;
    
    public jlr(final arwh d, final Context a, final atke b, final aeea e, final vai c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    public final int a() {
        if (!fbu.bd(this.d)) {
            return -1;
        }
        int n;
        if (fbu.aD(this.d) == 4) {
            n = 36;
        }
        else {
            n = 32;
        }
        return tpe.aZ(this.a.getResources().getDisplayMetrics(), n);
    }
    
    public final int b() {
        if (!fbu.bd(this.d)) {
            return -1;
        }
        int n;
        if (fbu.aD(this.d) == 4) {
            n = 64;
        }
        else {
            n = 56;
        }
        return tpe.aZ(this.a.getResources().getDisplayMetrics(), n);
    }
    
    public final boolean c() {
        if (!fbu.bd(this.d)) {
            return false;
        }
        if (!this.e.cd()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjv.b((AtomicReference)this.c.l(45358430L).aC(false).aa((asjm)new jdq(atomicBoolean, 12)));
            if (!atomicBoolean.get()) {
                return true;
            }
            final amqs b = ((addu)this.b.a()).b();
            if (b != amqs.c && b != amqs.d && b != amqs.e) {
                if (b != amqs.b) {
                    return true;
                }
            }
        }
        return false;
    }
}
