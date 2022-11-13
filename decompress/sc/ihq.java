import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihq implements aacc
{
    public final vef a;
    private final atke b;
    private final Executor c;
    
    public ihq(final atke b, final vef a, final Executor c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final aacb a(final amul amul) {
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final String i = vgl.i(amul.d);
        int cu;
        if ((cu = aqsx.cU(amul.c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            final vee a = this.a.a(zme);
            final zzu f = ((aabo)this.b.a()).a().f();
            ListenableFuture listenableFuture;
            if (f == null) {
                final aaby b = aabz.b.b();
                b.b = 26;
                listenableFuture = afwm.m((Object)b.a());
            }
            else {
                final aluz aluz = (aluz)((ahbc)amuj).rx((ahaq)aluz.b);
                final int d = aluz.d;
                if (d == 4) {
                    listenableFuture = aftq.f((ListenableFuture)afvk.m(tpe.cm(a.f((String)aluz.e).j(amar.class))), (aftz)new ihp(this, i, a, f, zme, 1), this.c);
                }
                else if (d == 1) {
                    listenableFuture = aftq.f((ListenableFuture)afvk.m(tpe.cm(a.f((String)aluz.e).j(apzm.class))), (aftz)new ihp(this, i, a, f, zme, 0), this.c);
                }
                else {
                    final aaby b2 = aabz.c.b();
                    b2.b = 18;
                    listenableFuture = afwm.m((Object)b2.a());
                }
            }
            return listenableFuture;
        }
        if (cu != 2) {
            final aaby b3 = aabz.c.b();
            b3.b = 23;
            return afwm.m((Object)b3.a());
        }
        final zzu f2 = ((aabo)this.b.a()).a().f();
        ListenableFuture listenableFuture2;
        if (f2 == null) {
            final aaby b4 = aabz.b.b();
            b4.b = 26;
            listenableFuture2 = afwm.m((Object)b4.a());
        }
        else {
            zzu.w(f2.j(i));
            listenableFuture2 = afwm.m((Object)aabz.a);
        }
        return listenableFuture2;
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        throw new UnsupportedOperationException();
    }
}
