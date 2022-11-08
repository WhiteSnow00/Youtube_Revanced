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

public final class aaax extends abjf
{
    private static final long m;
    private final atjj n;
    private final atjj o;
    private final atjj p;
    private zrx q;
    private final aaha r;
    private final oas s;
    private final aamd t;
    private final arud u;
    private final aeby v;
    
    static {
        m = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public aaax(final tdz tdz, final abjm abjm, final abke abke, final atjj n, final atjj o, final atjj p22, final Executor executor, final Executor executor2, final List list, final arud u, final oas s, final aeby v, final avt avt, final aamd t, final aaha r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(tdz, abjm, abke, executor, executor2, list, avt, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.n = n;
        this.o = o;
        this.p = p22;
        this.u = u;
        this.v = v;
        this.t = t;
        this.r = r;
        this.s = s;
    }
    
    public aaax(final tdz tdz, final abjm abjm, final abke abke, final atjj n, final atjj o, final atjj p24, final Executor executor, final Executor executor2, final Set set, final arud u, final oas s, final aeby v, final avt avt, final aamd t, final aaha r, final abpj abpj, final abjk abjk, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(tdz, abjm, abke, executor, executor2, set, s, u, abpj, avt, abjk, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.n = n;
        this.o = o;
        this.p = p24;
        this.u = u;
        this.v = v;
        this.t = t;
        this.r = r;
        this.s = s;
    }
    
    private final FormatStreamModel m(final String s, final long n, final FormatStreamModel formatStreamModel) {
        final aaha r = this.r;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)r.c.l(45368475L).aw((Object)false).Z((asix)new zsv(atomicBoolean, 16)));
        if (atomicBoolean.get()) {
            FormatStreamModel formatStreamModel2;
            if (formatStreamModel == null) {
                formatStreamModel2 = null;
            }
            else {
                final ajsj a = formatStreamModel.a;
                final Uri e = aaiw.E((ably)this.p.a(), s, a.d, a.q, a.p, a.o, this.s.d() + 18000000L);
                final agzc agzc = (agzc)((agzi)a).toBuilder();
                String string;
                if (e == null) {
                    string = "";
                }
                else {
                    string = e.toString();
                }
                agzc.copyOnWrite();
                final ajsj ajsj = (ajsj)agzc.instance;
                string.getClass();
                ajsj.c |= 0x2;
                ajsj.e = string;
                formatStreamModel2 = new FormatStreamModel((ajsj)agzc.build(), s, TimeUnit.SECONDS.toMillis(n));
            }
            if (formatStreamModel2 != null) {
                return formatStreamModel2;
            }
        }
        return formatStreamModel;
    }
    
    private final zzl n(final String s) {
        final ListenableFuture h = ((zzu)this.n.a()).a().l().h(s);
        try {
            final aexq aexq = (aexq)h.get(aaax.m, TimeUnit.MILLISECONDS);
            if (aexq.h()) {
                return (zzl)aexq.c();
            }
            return null;
        }
        catch (final InterruptedException | ExecutionException | TimeoutException ex) {
            return null;
        }
    }
    
    private final boolean o(zzd a) {
        if (a != null) {
            final aeby v = this.v;
            final zrx q = this.q;
            final String f = a.f();
            if (q != null) {
                for (final lwm lwm : ((zrv)q).h()) {
                    if (lwm != null && lwm.h().contains(f)) {
                        int n;
                        if (!lwm.q(f, 0L, a.b())) {
                            n = 2;
                            a = null;
                        }
                        else {
                            a = (zzd)((aacw)v.a).a(a);
                            if (a != null && ((aacv)a).c.length != 0) {
                                n = 3;
                            }
                            else {
                                n = 1;
                            }
                        }
                        try {
                            final lwr c = lwm.c(f, 0L);
                            if (c != null) {
                                final File e = c.e;
                                if (e != null && e.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                                    Environment.isExternalStorageEmulated();
                                }
                            }
                        }
                        catch (final lwk lwk) {}
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
    
    protected final PlayerResponseModel a(final String s, final PlayerResponseModel playerResponseModel) {
        if (this.t.c() && ((zzu)this.n.a()).h()) {
            final zzl n = this.n(s);
            if (n != null) {
                amrz amrz;
                if ((amrz = this.r.d.f().g) == null) {
                    amrz = amrz.a;
                }
                if (amrz.A) {
                    final zzk j = n.j;
                    if (j == null || !j.i()) {
                        return playerResponseModel;
                    }
                }
                final arud u = this.u;
                if (u != null && u.f() != null) {
                    amrz amrz2;
                    if ((amrz2 = u.f().g) == null) {
                        amrz2 = amrz.a;
                    }
                    if (amrz2.h) {
                        final aorm i = n.j();
                        if (i != null) {
                            playerResponseModel.N(new vey(i));
                        }
                    }
                }
                final zze n2 = n.n;
                final zrx c = ((zzu)this.n.a()).a().c();
                this.q = c;
                PlayerResponseModel playerResponseModel2;
                if (n2 != null && c != null) {
                    final FormatStreamModel m = this.m(playerResponseModel.K(), playerResponseModel.h(), n2.d(c.i()));
                    final FormatStreamModel k = this.m(playerResponseModel.K(), playerResponseModel.h(), n2.b(c.i()));
                    final arud u2 = this.u;
                    final PlayerConfigModel l = playerResponseModel.m();
                    if (u2 != null && u2.f() != null) {
                        amrz amrz3;
                        if ((amrz3 = u2.f().g) == null) {
                            amrz3 = amrz.a;
                        }
                        if (amrz3.g && (l.aA() || this.o(n2.a)) && this.o(n2.b)) {
                            final vhm vhm = (vhm)this.o.a();
                            final aaha r = this.r;
                            final long k2 = playerResponseModel.k();
                            akvi akvi;
                            if ((akvi = playerResponseModel.z().h) == null) {
                                akvi = akvi.b;
                            }
                            playerResponseModel2 = aaiw.H(playerResponseModel, vhm, m, k, k2, akvi.d, false, r);
                            return playerResponseModel2;
                        }
                    }
                    final arud u3 = this.u;
                    if (u3 != null && u3.f() != null) {
                        amrz amrz4;
                        if ((amrz4 = u3.f().g) == null) {
                            amrz4 = amrz.a;
                        }
                        if (amrz4.o && (this.o(n2.a) || this.o(n2.b))) {
                            final vhm vhm2 = (vhm)this.o.a();
                            final aaha r2 = this.r;
                            final long k3 = playerResponseModel.k();
                            akvi akvi2;
                            if ((akvi2 = playerResponseModel.z().h) == null) {
                                akvi2 = akvi.b;
                            }
                            playerResponseModel2 = aaiw.H(playerResponseModel, vhm2, m, k, k3, akvi2.d, true, r2);
                            return playerResponseModel2;
                        }
                    }
                    playerResponseModel2 = aaiw.G(playerResponseModel, (vhm)this.o.a(), m, k, this.r);
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
