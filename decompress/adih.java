import java.util.List;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adih extends adia
{
    static final long a;
    long b;
    private boolean c;
    private final zmd d;
    private final oco e;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(2L);
    }
    
    public adih(final zmd d, final oco e) {
        this.c = false;
        this.d = d;
        this.e = e;
    }
    
    public final void f(final aotm aotm) {
        if (aotm != null && (aotm.b & 0x100) != 0x0) {
            aote aote;
            if ((aote = aotm.g) == null) {
                aote = aote.a;
            }
            this.c = aote.b;
            aote aote2;
            if ((aote2 = aotm.g) == null) {
                aote2 = aote.a;
            }
            final long n = aote2.c;
            final long a = adih.a;
            long b;
            if (n <= a) {
                b = TimeUnit.SECONDS.toMillis(a);
            }
            else {
                final TimeUnit seconds = TimeUnit.SECONDS;
                aote aote3;
                if ((aote3 = aotm.g) == null) {
                    aote3 = aote.a;
                }
                b = seconds.toMillis(aote3.c);
            }
            this.b = b;
        }
    }
    
    public final boolean g() {
        return this.c;
    }
    
    public final boolean h(final Context context, final ahcr ahcr) {
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
                ahcr.copyOnWrite();
                final aosv aosv = (aosv)ahcr.instance;
                final aosv a = aosv.a;
                aosv.h = aosv.emptyProtobufList();
                ahcr.bM((Iterable)c2);
                b4 = true;
            }
        }
        return b4;
    }
}
