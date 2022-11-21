import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.File;
import java.util.Iterator;
import android.os.Environment;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Set;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaeo extends abmg
{
    private static final long m;
    private final atnb n;
    private final atnb o;
    private final atnb p;
    private zvm q;
    private final aaks r;
    private final oco s;
    private final arzb t;
    private final abwe u;
    private final adgg v;
    
    static {
        m = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public aaeo(final thg thg, final abms abms, final abnm abnm, final atnb n, final atnb o, final atnb p23, final Executor executor, final Executor executor2, final List list, final arzb t, final oco s, final adgg v, final aefs aefs, final abwe u, final aaks r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(thg, abms, abnm, executor, executor2, list, aefs, null, null, null, null, null, null, null, null);
        this.n = n;
        this.o = o;
        this.p = p23;
        this.t = t;
        this.v = v;
        this.u = u;
        this.r = r;
        this.s = s;
    }
    
    public aaeo(final thg thg, final abms abms, final abnm abnm, final atnb n, final atnb o, final atnb p25, final Executor executor, final Executor executor2, final Set set, final arzb t, final oco s, final adgg v, final aefs aefs, final abwe u, final aaks r, final absv absv, final abmq abmq, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(thg, abms, abnm, executor, executor2, set, s, t, absv, aefs, abmq, null, null, null, null, null, null, null, null);
        this.n = n;
        this.o = o;
        this.p = p25;
        this.t = t;
        this.v = v;
        this.u = u;
        this.r = r;
        this.s = s;
    }
    
    private final FormatStreamModel n(final String s, final long n, final FormatStreamModel formatStreamModel) {
        final aaks r = this.r;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)r.c.l(45368475L).aC(false).aa(new aaid(atomicBoolean, 4)));
        if (atomicBoolean.get()) {
            FormatStreamModel formatStreamModel2;
            if (formatStreamModel == null) {
                formatStreamModel2 = null;
            }
            else {
                final ajwl a = formatStreamModel.a;
                final Uri e = aamn.E((abpf)this.p.a(), s, a.d, a.q, a.p, a.o, this.s.d() + 18000000L);
                final ahct ahct = (ahct)((ahcz)a).toBuilder();
                String string;
                if (e == null) {
                    string = "";
                }
                else {
                    string = e.toString();
                }
                ((ahcr)ahct).copyOnWrite();
                final ajwl ajwl = (ajwl)ahct.instance;
                string.getClass();
                ajwl.c |= 0x2;
                ajwl.e = string;
                formatStreamModel2 = new FormatStreamModel((ajwl)((ahcr)ahct).build(), s, TimeUnit.SECONDS.toMillis(n));
            }
            if (formatStreamModel2 != null) {
                return formatStreamModel2;
            }
        }
        return formatStreamModel;
    }
    
    private final aadc o(final String s) {
        final ListenableFuture h = ((aadl)this.n.a()).a().l().h(s);
        try {
            final afbh afbh = (afbh)h.get(aaeo.m, TimeUnit.MILLISECONDS);
            if (afbh.h()) {
                return (aadc)afbh.c();
            }
            return null;
        }
        catch (final InterruptedException | ExecutionException | TimeoutException ex) {
            return null;
        }
    }
    
    private final boolean p(aacu a) {
        if (a != null) {
            final adgg v = this.v;
            final zvm q = this.q;
            final String f = a.f();
            if (q != null) {
                for (final lyf lyf : ((zvk)q).h()) {
                    if (lyf != null && lyf.h().contains(f)) {
                        int n;
                        if (!lyf.q(f, 0L, a.b())) {
                            a = null;
                            n = 2;
                        }
                        else {
                            a = (aacu)((aagq)v.a).a(a);
                            if (a != null && ((aagp)a).c.length != 0) {
                                n = 3;
                            }
                            else {
                                n = 1;
                            }
                        }
                        try {
                            final lyk c = lyf.c(f, 0L);
                            if (c != null) {
                                final File e = c.e;
                                if (e != null && e.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                                    Environment.isExternalStorageEmulated();
                                }
                            }
                        }
                        catch (final lyd lyd) {}
                        if (n == 3) {
                            a.getClass();
                            break;
                        }
                        if (n == 1) {
                            return true;
                        }
                        break;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    protected final PlayerResponseModel a(final String s, final PlayerResponseModel playerResponseModel) {
        if (this.u.i() && ((aadl)this.n.a()).h()) {
            final aadc o = this.o(s);
            if (o != null) {
                amwj amwj;
                if ((amwj = this.r.d.f().g) == null) {
                    amwj = amwj.a;
                }
                if (amwj.A) {
                    final aadb j = o.j;
                    if (j == null || !j.i()) {
                        return playerResponseModel;
                    }
                }
                final arzb t = this.t;
                if (t != null && t.f() != null) {
                    amwj amwj2;
                    if ((amwj2 = t.f().g) == null) {
                        amwj2 = amwj.a;
                    }
                    if (amwj2.h) {
                        final aowb i = o.j();
                        if (i != null) {
                            playerResponseModel.N(new vig(i));
                        }
                    }
                }
                final aacv n = o.n;
                final zvm c = ((aadl)this.n.a()).a().c();
                this.q = c;
                PlayerResponseModel playerResponseModel2;
                if (n != null && c != null) {
                    final FormatStreamModel n2 = this.n(playerResponseModel.K(), playerResponseModel.h(), n.d(c.i()));
                    final FormatStreamModel n3 = this.n(playerResponseModel.K(), playerResponseModel.h(), n.b(c.i()));
                    final arzb t2 = this.t;
                    final PlayerConfigModel m = playerResponseModel.m();
                    if (t2 != null && t2.f() != null) {
                        amwj amwj3;
                        if ((amwj3 = t2.f().g) == null) {
                            amwj3 = amwj.a;
                        }
                        if (amwj3.g && (m.aA() || this.p(n.a)) && this.p(n.b)) {
                            final vku vku = (vku)this.o.a();
                            final aaks r = this.r;
                            final long k = playerResponseModel.k();
                            akzm akzm;
                            if ((akzm = playerResponseModel.z().h) == null) {
                                akzm = akzm.b;
                            }
                            playerResponseModel2 = aamn.H(playerResponseModel, vku, n2, n3, k, akzm.d, false, r);
                            return playerResponseModel2;
                        }
                    }
                    final arzb t3 = this.t;
                    if (t3 != null && t3.f() != null) {
                        amwj amwj4;
                        if ((amwj4 = t3.f().g) == null) {
                            amwj4 = amwj.a;
                        }
                        if (amwj4.o && (this.p(n.a) || this.p(n.b))) {
                            final vku vku2 = (vku)this.o.a();
                            final aaks r2 = this.r;
                            final long l = playerResponseModel.k();
                            akzm akzm2;
                            if ((akzm2 = playerResponseModel.z().h) == null) {
                                akzm2 = akzm.b;
                            }
                            playerResponseModel2 = aamn.H(playerResponseModel, vku2, n2, n3, l, akzm2.d, true, r2);
                            return playerResponseModel2;
                        }
                    }
                    playerResponseModel2 = aamn.G(playerResponseModel, (vku)this.o.a(), n2, n3, this.r);
                }
                else {
                    playerResponseModel2 = playerResponseModel;
                }
                return playerResponseModel2;
            }
        }
        return playerResponseModel;
    }
}
