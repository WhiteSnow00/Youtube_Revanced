import java.util.List;
import java.io.File;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admi extends admd
{
    private static final afcr a;
    private final adcr b;
    
    static {
        a = afcr.v((Object)1000L, (Object)5000L, (Object)30000L, (Object)60000L, (Object)300000L);
    }
    
    public admi(final arud arud, final adcr b, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3) {
        super(arud, apfs.t, adjo, b, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
    }
    
    public final adkb a(final adku adku) {
        return null;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.as) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        if (adml.c(adku)) {
            return afva.m(new adiv(0));
        }
        return this.s(adku, true);
    }
    
    public final ListenableFuture e(final String s, final adit adit) {
        return afva.r((afrx)new jkv(this, adit, s, 17), (Executor)afsl.a);
    }
    
    public final asit f() {
        return (asit)adhq.r;
    }
    
    public final String g() {
        return "FinalCleanupTask";
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
    
    public final ListenableFuture s(final adku adku, final boolean b) {
        if ((adku.d & 0x8) != 0x0) {
            final File file = new File(adku.aq);
            if (!(uji.W(file) ^ true)) {
                final String parent = file.getParent();
                if (parent == null) {
                    return afva.m(((adnr)this).t(this.e.t(), b));
                }
                final File file2 = new File(parent);
                if (!file2.exists() || !(file2.delete() ^ true)) {
                    return afva.m(((adnr)this).t(this.e.t(), b));
                }
            }
            final adcr e = this.e;
            final apfr g = apfr.g;
            adkr adkr;
            if ((adkr = adku.as) == null) {
                adkr = adkr.a;
            }
            return afva.m(((adnr)this).t(e.I(g, adkr, (List)admi.a, this.b), b));
        }
        return afva.m(((adnr)this).t(this.e.t(), b));
    }
}
