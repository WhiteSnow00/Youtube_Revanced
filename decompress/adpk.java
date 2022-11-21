import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpk extends adpt
{
    private static final afgh a;
    private final adgg b;
    private final aheu c;
    
    static {
        a = afgh.v(1000L, 5000L, 30000L, 60000L, 300000L);
    }
    
    public adpk(final arzb arzb, final aheu c, final adgg b, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(arzb, apki.p, adnd, b, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.c = c;
        this.b = b;
    }
    
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.ar) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture c(final adoj adoj, final boolean b) {
        this.c.p();
        int n2;
        int n = n2 = (((adoj.d & 0x4) != 0x0 && ((ume.T(new File(adoj.ap)) ? 1 : 0) ^ 0x1)) ? 1 : 0);
        if (adoj.X.size() != 0) {
            final Iterator<Object> iterator = ((List<Object>)adoj.X).iterator();
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
            final adgg e = this.e;
            final apkh g = apkh.g;
            adog adog;
            if ((adog = adoj.ar) == null) {
                adog = adog.a;
            }
            return afxr.l(((adrh)this).t(e.H(g, adog, (List)adpk.a, this.b), b));
        }
        return afxr.l(((adrh)this).t(this.e.n(), b));
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        return this.c(adoj, true);
    }
    
    public final ListenableFuture e(final String s, final admj admj) {
        return afxr.q((afvp)new jmi(this, admj, s, 14), afwd.a);
    }
    
    public final asme f() {
        return adlg.m;
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
    
    public final boolean j(final adoj adoj) {
        return true;
    }
    
    public final boolean k() {
        return true;
    }
}
