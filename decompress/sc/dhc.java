// 
// Decompiled by Procyon v0.6.0
// 

public final class dhc extends dpd
{
    public qcy a;
    
    public dhc(final long n) {
        super(n);
    }
    
    protected final /* bridge */ int a(final Object o) {
        final dfy dfy = (dfy)o;
        if (dfy == null) {
            return 1;
        }
        return dfy.a();
    }
    
    public final /* bridge */ dfy b(final ddk ddk) {
        return (dfy)super.h((Object)ddk);
    }
    
    protected final /* bridge */ void c(final Object o, final Object o2) {
        final ddk ddk = (ddk)o;
        final dfy dfy = (dfy)o2;
        final qcy a = this.a;
        if (a != null && dfy != null) {
            ((skt)a.a).m(dfy, true);
        }
    }
    
    public final /* bridge */ void d(final ddk ddk, final dfy dfy) {
        final dfy dfy2 = (dfy)super.g((Object)ddk, (Object)dfy);
    }
}
