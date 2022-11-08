import java.util.List;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ades extends adel
{
    static final long a;
    long b;
    private boolean c;
    private final zil d;
    private final oas e;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(2L);
    }
    
    public ades(final zil d, final oas e) {
        this.c = false;
        this.d = d;
        this.e = e;
    }
    
    public final void d(final aoox aoox) {
        if (aoox != null && (aoox.b & 0x100) != 0x0) {
            aooq aooq;
            if ((aooq = aoox.g) == null) {
                aooq = aooq.a;
            }
            this.c = aooq.b;
            aooq aooq2;
            if ((aooq2 = aoox.g) == null) {
                aooq2 = aooq.a;
            }
            final long n = aooq2.c;
            final long a = ades.a;
            long b;
            if (n <= a) {
                b = TimeUnit.SECONDS.toMillis(a);
            }
            else {
                final TimeUnit seconds = TimeUnit.SECONDS;
                aooq aooq3;
                if ((aooq3 = aoox.g) == null) {
                    aooq3 = aooq.a;
                }
                b = seconds.toMillis(aooq3.c);
            }
            this.b = b;
        }
    }
    
    public final boolean e() {
        return this.c;
    }
    
    public final boolean f(final Context context, final agza agza) {
        final long c = this.e.c();
        final long b = this.d.b();
        final long b2 = this.b;
        final boolean b3 = false;
        if (c - b < b2) {
            return false;
        }
        final List c2 = this.d.c(c);
        boolean b4 = b3;
        if (c2 != null) {
            if (c2.isEmpty()) {
                b4 = b3;
            }
            else {
                agza.copyOnWrite();
                final aooh aooh = (aooh)agza.instance;
                final aooh a = aooh.a;
                aooh.h = aooh.emptyProtobufList();
                agza.bK((Iterable)c2);
                b4 = true;
            }
        }
        return b4;
    }
}
