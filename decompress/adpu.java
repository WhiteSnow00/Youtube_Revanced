import java.util.List;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpu extends adpt
{
    public final adhd a;
    private final alff b;
    private final adno c;
    private final adgg d;
    
    public adpu(final arzb arzb, final alff b, final adhd a, final adno c, final adgg d, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.o, adnd, d, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.am) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        return afxr.l(((adrh)this).t(this.e.n(), true));
    }
    
    public final ListenableFuture e(final String s, final admj admj) {
        return afxr.q((afvp)new jmi(this, s, admj, 17), afwd.a);
    }
    
    public final asme f() {
        return adlg.r;
    }
    
    public final String g() {
        return "DeleteVideoOnCancellationTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adoj adoj) {
        return (adoj.b & 0x1) != 0x0 && (adoj.c & 0x200000) != 0x0;
    }
    
    public final boolean k() {
        return true;
    }
    
    public final adnq l() {
        return (adnq)this.c;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.am) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.b.i, this.d), b);
        }
        return super.w(t, adoj, b);
    }
}
