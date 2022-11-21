import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import android.app.Application;
import java.util.concurrent.Executor;
import java.io.File;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Set;
import j$.util.Optional;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnl implements afci
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public bnl(final aapu b, final afci a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final aerj a, final LayoutInflater b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final aevk b, final afci a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final goc a, final gab b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final Class a, final bbm b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final ScheduledExecutorService a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final mek a, final mej b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final nab b, final afbh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final pfb b, final atnb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final qab a, final dna b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final qdk b, final arna a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final qdx a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final qev b, final atnb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final ubo a, final bbm b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bnl(final yom b, final Optional a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final zbk b, final ansx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final zkt b, final atnb a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bnl(final zqn a, final aefs b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object a() {
        final int c = this.c;
        int n = 1;
        Application application = null;
        switch (c) {
            default: {
                final Object b = this.b;
                final afac afac = (afac)((alo)((afci)this.a).a()).h((Class)afac.class);
                afac.d = (aezw)((aapu)b).b;
                return afac;
            }
            case 19: {
                final Object b2 = this.b;
                final Object a = this.a;
                final aewo g = aewp.g();
                final aevk e = aewp.e(g, (aevk)b2);
                try {
                    final Object a2 = ((afci)a).a();
                    aewp.e(g, e);
                    return a2;
                }
                finally {
                    try {
                        final Throwable t;
                        aeua.a(t);
                    }
                    finally {
                        aewp.e(g, e);
                    }
                }
            }
            case 18: {
                return ((LayoutInflater)this.b).cloneInContext((Context)this.a);
            }
            case 17: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final zqn zqn = (zqn)a3;
                zqi zqi;
                if (((Optional)zqn.a.a()).isPresent()) {
                    ajtp ajtp;
                    if ((ajtp = ((anyb)((Optional)zqn.a.a()).get()).f) == null) {
                        ajtp = ajtp.a;
                    }
                    zqi = ((aefs)b3).aG(ajtp);
                }
                else {
                    zqi = ((aefs)b3).aG(zqi.a);
                }
                return zqi;
            }
            case 16: {
                final Object b4 = this.b;
                final int ch = aqvq.ch(((ansx)this.a).f);
                if (ch != 0) {
                    n = ch;
                }
                String s;
                if (n == 2) {
                    s = ((zbk)b4).e.k();
                    if (s == null) {
                        return "fake_session_content_binding";
                    }
                }
                else {
                    if (n != 3) {
                        return "fake_session_content_binding";
                    }
                    final zbk zbk = (zbk)b4;
                    if (zbk.e.t() && zbk.e.c() != null) {
                        s = zbk.e.c().b();
                    }
                    else {
                        s = zbk.e.k();
                    }
                    if (s == null) {
                        return "fake_session_content_binding";
                    }
                }
                return s;
            }
            case 15: {
                final Object b5 = this.b;
                final Object a4 = this.a;
                synchronized (b5) {
                    zfa.a((Object)((yom)b5).h);
                    return ((zqj)((Optional)a4).get()).a(aqfd.a, ((yom)b5).f, ((yom)b5).h.a.toString());
                }
            }
            case 14: {
                final Object b6 = this.b;
                final Object a5 = this.a;
                final zkt zkt = (zkt)b6;
                return new wwr((mtf)((afci)zkt.c).a(), (Set)((atnb)a5).a(), (vxu)zkt.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 13: {
                final Object b7 = this.b;
                final Object a6 = this.a;
                aqfi aqfi;
                try {
                    if ((((pfb)b7).b & 0x100) != 0x0) {
                        ahbg ahbg;
                        if ((ahbg = ((pfb)b7).m) == null) {
                            ahbg = ahbg.a;
                        }
                        aqfi = (aqfi)ahcz.parseFrom((ahcz)aqfi.a, ahbg.c, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    else {
                        aqfi = aqfi.a;
                    }
                }
                catch (final ahds ahds) {
                    ((aefs)((atnb)a6).a()).bR(ajdx.h, ((pfb)b7).c);
                    tut.b("Failed to initialize FileGroup manifest.");
                    aqfi = aqfi.a;
                }
                return aqfi;
            }
            case 12: {
                final Object b8 = this.b;
                final Object a7 = this.a;
                final int a8 = qgu.a;
                return ((qdk)b8).a(((qgs)((arna)a7).a()).a);
            }
            case 11: {
                return ((qev)this.b).e((atnb)this.a);
            }
            case 10: {
                final Object a9 = this.a;
                final Object b9 = this.b;
                synchronized (a9) {
                    final String a10 = qct.a();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a10);
                    sb.append(".trace");
                    final String string = sb.toString();
                    final File filesDir = ((Context)b9).getFilesDir();
                    final StringBuilder sb2 = new StringBuilder("primes_profiling_");
                    sb2.append(a10);
                    final File file = new File(filesDir, sb2.toString());
                    afbh afbh;
                    if (!file.exists() && !file.mkdir()) {
                        ((afly)((afly)((aflw)qdx.a).c()).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "lambda$new$0", 117, "CpuProfilingService.java")).r("Could not create directory");
                        afbh = afag.a;
                        monitorexit(a9);
                    }
                    else {
                        final File file2 = new File(file, string);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                        catch (final RuntimeException ex) {
                            c.i(((aflw)qdx.a).c(), "Exception when clearing trace file.", "com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", '\u0170', "CpuProfilingService.java", ex);
                        }
                        afbh = afbh.k(file2);
                    }
                    return afbh;
                }
            }
            case 9: {
                final Object a11 = this.a;
                final Object b10 = this.b;
                final qab qab = (qab)a11;
                final Context applicationContext = qab.a.getApplicationContext();
                final ExecutorService b11 = qab.b;
                applicationContext.getClass();
                b11.getClass();
                final aunx aunx = new aunx((byte[])null, (char[])null);
                aunx.a = 641;
                kht.aN(true, (Object)"Must provide valid client application ID!");
                final nlp nlp = new nlp(aunx, (byte[])null, (byte[])null, (byte[])null);
                return new qax((qaa)new qar(applicationContext, nlq.b(applicationContext, nlp), nlq.a(applicationContext, nlp), nlq.c(applicationContext, nlp), (pzv)new pzw(applicationContext, b11), (Executor)b11, mqj.a), 2, (dna)b10, applicationContext.getPackageName(), 0, (byte[])null, (byte[])null);
            }
            case 8: {
                final Object a12 = this.a;
                final Object b12 = this.b;
                final qsn qsn = new qsn((Context)b12, "STREAMZ_ONEGOOGLE_ANDROID");
                if (b12 instanceof Application) {
                    application = (Application)b12;
                }
                return new qdr((ScheduledExecutorService)a12, (qsx)qsn, application);
            }
            case 7: {
                final Object b13 = this.b;
                final afbh afbh2 = (afbh)this.a;
                ListenableFuture listenableFuture;
                if (afbh2.h()) {
                    listenableFuture = ((nab)b13).b(mzz.d((GmsDeviceComplianceResponse)afbh2.c()));
                }
                else {
                    listenableFuture = afxr.l(afag.a);
                }
                return listenableFuture;
            }
            case 6: {
                return ((mej)this.b).c(((mek)this.a).e);
            }
            case 5: {
                return ((gab)this.b).D((fcp)new gob(0));
            }
            case 4: {
                return ((gab)this.b).D((fcp)new gob(1));
            }
            case 3: {
                return new bot((bbm)this.b, (btq)((ubo)this.a).c);
            }
            case 2: {
                return bnm.b((Class)this.a, (bbm)this.b);
            }
            case 1: {
                return bnm.b((Class)this.a, (bbm)this.b);
            }
            case 0: {
                return bnm.b((Class)this.a, (bbm)this.b);
            }
        }
    }
}
