import java.util.List;
import java.io.File;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpy extends adpt
{
    private static final afgh a;
    private final adgg b;
    
    static {
        a = afgh.v(1000L, 5000L, 30000L, 60000L, 300000L);
    }
    
    public adpy(final arzb arzb, final adgg b, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.t, adnd, b, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
    }
    
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.as) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        if (adme.B(adoj)) {
            return afxr.l(new adml(0));
        }
        return this.s(adoj, true);
    }
    
    public final ListenableFuture e(final String s, final admj admj) {
        return afxr.q((afvp)new jmi(this, admj, s, 18), afwd.a);
    }
    
    public final asme f() {
        return adlg.t;
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
    
    public final boolean j(final adoj adoj) {
        return true;
    }
    
    public final boolean k() {
        return true;
    }
    
    public final ListenableFuture s(final adoj adoj, final boolean b) {
        if ((adoj.d & 0x8) != 0x0) {
            final File file = new File(adoj.aq);
            if (!(ume.T(file) ^ true)) {
                final String parent = file.getParent();
                if (parent == null) {
                    return afxr.l(((adrh)this).t(this.e.n(), b));
                }
                final File file2 = new File(parent);
                if (!file2.exists() || !(file2.delete() ^ true)) {
                    return afxr.l(((adrh)this).t(this.e.n(), b));
                }
            }
            final adgg e = this.e;
            final apkh g = apkh.g;
            adog adog;
            if ((adog = adoj.as) == null) {
                adog = adog.a;
            }
            return afxr.l(((adrh)this).t(e.H(g, adog, (List)adpy.a, this.b), b));
        }
        return afxr.l(((adrh)this).t(this.e.n(), b));
    }
}
