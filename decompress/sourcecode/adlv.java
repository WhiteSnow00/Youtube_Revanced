import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlv extends admd
{
    private static final afcr a;
    private final adcr b;
    private final aeim c;
    
    static {
        a = afcr.v((Object)1000L, (Object)5000L, (Object)30000L, (Object)60000L, (Object)300000L);
    }
    
    public adlv(final arud arud, final aeim c, final adcr b, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.p, adjo, b, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.c = c;
        this.b = b;
    }
    
    public final adkb a(final adku adku) {
        return null;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.ar) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture c(final adku adku, final boolean b) {
        this.c.h();
        int n2;
        int n = n2 = (((adku.d & 0x4) != 0x0 && ((uji.W(new File(adku.ap)) ? 1 : 0) ^ 0x1)) ? 1 : 0);
        if (adku.X.size() != 0) {
            final Iterator<Object> iterator = ((List<Object>)adku.X).iterator();
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final File file = new File(iterator.next());
                if (!file.exists() || file.delete()) {
                    continue;
                }
                file.toString();
                n = 1;
            }
        }
        if (n2 != 0) {
            final adcr e = this.e;
            final apfr g = apfr.g;
            adkr adkr;
            if ((adkr = adku.ar) == null) {
                adkr = adkr.a;
            }
            return afva.m(((adnr)this).t(e.I(g, adkr, (List)adlv.a, this.b), b));
        }
        return afva.m(((adnr)this).t(this.e.t(), b));
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        return this.c(adku, true);
    }
    
    public final ListenableFuture e(final String s, final adit adit) {
        return afva.r((afrx)new jkv(this, adit, s, 13), (Executor)afsl.a);
    }
    
    public final asit f() {
        return (asit)adhq.k;
    }
    
    public final String g() {
        return "CacheCleanupTask";
    }
    
    public final boolean h() {
        return true;
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        return true;
    }
    
    public final boolean k() {
        return true;
    }
}
