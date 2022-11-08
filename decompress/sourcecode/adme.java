import java.util.List;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adme extends admd
{
    public final addp a;
    private final albc b;
    private final adjz c;
    private final adcr d;
    
    public adme(final arud arud, final albc b, final addp a, final adjz c, final adcr d, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.o, adjo, d, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public final adkb a(final adku adku) {
        return null;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.am) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        return afva.m(((adnr)this).t(this.e.t(), true));
    }
    
    public final ListenableFuture e(final String s, final adit adit) {
        return afva.r((afrx)new jkv(this, s, adit, 16), (Executor)afsl.a);
    }
    
    public final asit f() {
        return (asit)adhq.p;
    }
    
    public final String g() {
        return "DeleteVideoOnCancellationTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adku adku) {
        return (adku.b & 0x1) != 0x0 && (adku.c & 0x200000) != 0x0;
    }
    
    public final boolean k() {
        return true;
    }
    
    public final adkb l() {
        return (adkb)this.c;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.am) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.b.i, this.d), b);
        }
        return super.w(t, adku, b);
    }
}
