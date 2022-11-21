import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adrh
{
    public final apki j;
    private final adnd q;
    private final adgg r;
    
    public adrh(final apki j, final adnd q, final adgg r, final byte[] array, final byte[] array2) {
        this.j = j;
        this.q = q;
        this.r = r;
    }
    
    public abstract adnq a(final adoj p0);
    
    public abstract adog b(final adoj p0);
    
    public ListenableFuture e(final String s, final admj admj) {
        return afxr.l(this.t(this.r.n(), false));
    }
    
    public abstract asme f();
    
    public abstract String g();
    
    public abstract boolean i();
    
    public boolean k() {
        return false;
    }
    
    public adnq l() {
        return null;
    }
    
    public abstract admm m(final Throwable p0, final String p1, final admj p2, final boolean p3);
    
    public abstract ListenableFuture p(final String p0, final admj p1);
    
    public void r(final long n, final adoj adoj) {
    }
    
    public final admm t(final adog adog, final boolean b) {
        return this.u(adog, b, null);
    }
    
    public final admm u(final adog adog, final boolean b, final asmi asmi) {
        final asme f = this.f();
        if (f != null) {
            return (admm)new adrg(this, this.q, adog, asmi, adog, b, f);
        }
        throw new IllegalStateException("Only GarbageCollection has a null setState func and should not call createJobUpdater");
    }
}
