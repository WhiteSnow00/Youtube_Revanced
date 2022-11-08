import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class adnz extends admd
{
    private final ScheduledExecutorService a;
    
    public adnz(final arud arud, final ScheduledExecutorService a, final adjo adjo, final adcr adcr, final adcr adcr2, final byte[] array, final byte[] array2, final byte[] array3) {
        super(arud, apfs.a, adjo, adcr, adcr2, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
    }
    
    public final adkb a(final adku adku) {
        return null;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.P) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(final String s, final adit adit, final adku adku) {
        return this.s(s, adit);
    }
    
    public final asit f() {
        return (asit)adna.d;
    }
    
    public final String g() {
        return "WaitForScottyResourceIdTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        return (adku.c & 0x40) != 0x0;
    }
    
    public final ListenableFuture s(final String s, final adit adit) {
        final adku b = adit.b(s);
        if (b == null) {
            throw adim.a(apfr.s);
        }
        if ((b.c & 0x80) != 0x0) {
            return afva.m(((adnr)this).t(this.e.t(), true));
        }
        adkr adkr;
        if ((adkr = b.N) == null) {
            adkr = adkr.a;
        }
        if (adcr.z(adkr)) {
            return afva.m(((adnr)this).t(this.e.s(apfr.t), true));
        }
        return afva.o((afrx)new jkv(this, s, adit, 19), 10000L, TimeUnit.MILLISECONDS, this.a);
    }
}
