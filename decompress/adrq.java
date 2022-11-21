import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class adrq extends adpt
{
    private final ScheduledExecutorService a;
    
    public adrq(final arzb arzb, final ScheduledExecutorService a, final adnd adnd, final adgg adgg, final adgg adgg2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.a, adnd, adgg, adgg2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
    }
    
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.P) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        return this.s(s, admj);
    }
    
    public final asme f() {
        return adqi.f;
    }
    
    public final String g() {
        return "WaitForScottyResourceIdTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        return (adoj.c & 0x40) != 0x0;
    }
    
    public final ListenableFuture s(final String s, final admj admj) {
        final adoj b = admj.b(s);
        if (b == null) {
            throw admc.a(apkh.s);
        }
        if ((b.c & 0x80) != 0x0) {
            return afxr.l(((adrh)this).t(this.e.n(), true));
        }
        adog adog;
        if ((adog = b.N) == null) {
            adog = adog.a;
        }
        if (adgg.t(adog)) {
            return afxr.l(((adrh)this).t(this.e.m(apkh.t), true));
        }
        return afxr.n((afvp)new jmi(this, s, admj, 20), 10000L, TimeUnit.MILLISECONDS, this.a);
    }
}
