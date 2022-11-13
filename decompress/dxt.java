// 
// Decompiled by Procyon v0.6.0
// 

public final class dxt extends dst
{
    @dyj
    dst a;
    
    private dxt() {
        super("Wrapper");
    }
    
    public static dxs b(final dsx dsx) {
        final dxs dxs = new dxs();
        dxs.d(dxs, dsx, new dxt());
        return dxs;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final dst c(final dsx dsx) {
        return this;
    }
    
    protected final dva d(final dsx dsx) {
        final dst a = this.a;
        if (a == null) {
            return dsx.a;
        }
        return dvc.a(dsx, a);
    }
    
    protected final boolean e() {
        return true;
    }
    
    public final boolean f(dst a) {
        if (this == a) {
            return true;
        }
        if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        final dxt dxt = (dxt)a;
        if (super.j == dxt.j) {
            return true;
        }
        a = this.a;
        if (a != null) {
            if (a.f(dxt.a)) {
                return true;
            }
        }
        else if (dxt.a == null) {
            return true;
        }
        return false;
    }
    
    protected final dst i() {
        return this.a;
    }
}
