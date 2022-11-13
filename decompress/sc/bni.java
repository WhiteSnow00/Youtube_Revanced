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

public final class bni implements afaq
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public bni(final aepq a, final LayoutInflater b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final aets b, final afaq a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final aujg b, final afaq a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final gnw a, final fzw b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final Class a, final bbk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final ScheduledExecutorService a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final mdw a, final mdv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final mzl b, final aezp a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final pek b, final atke a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final pzj a, final dmx b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final qcr b, final arkg a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final qde a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final qec b, final atke a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final uak a, final bbk b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bni(final ymo b, final Optional a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final yzl b, final anqr a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final ziy b, final atke a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bni(final zor a, final adet b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        final int c = this.c;
        int n = 1;
        Application application = null;
        switch (c) {
            default: {
                final Object b = this.b;
                final aeyk aeyk = (aeyk)((aln)((afaq)this.a).a()).h((Class)aeyk.class);
                aeyk.d = (aeyf)((aujg)b).c;
                return aeyk;
            }
            case 19: {
                final Object b2 = this.b;
                final Object a = this.a;
                final aeuw g = aeux.g();
                final aets e = aeux.e(g, (aets)b2);
                try {
                    final Object a2 = ((afaq)a).a();
                    aeux.e(g, e);
                    return a2;
                }
                finally {
                    try {
                        final Throwable t;
                        aesh.a(t);
                    }
                    finally {
                        aeux.e(g, e);
                    }
                }
            }
            case 18: {
                return ((LayoutInflater)this.b).cloneInContext((Context)this.a);
            }
            case 17: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final zor zor = (zor)a3;
                zom zom;
                if (((Optional)zor.a.a()).isPresent()) {
                    ajrq ajrq;
                    if ((ajrq = ((anvv)((Optional)zor.a.a()).get()).f) == null) {
                        ajrq = ajrq.a;
                    }
                    zom = ((adet)b3).af(ajrq);
                }
                else {
                    zom = ((adet)b3).af(zom.a);
                }
                return zom;
            }
            case 16: {
                final Object b4 = this.b;
                final int cp = aqsx.cp(((anqr)this.a).f);
                if (cp != 0) {
                    n = cp;
                }
                String s;
                if (n == 2) {
                    s = ((yzl)b4).e.k();
                    if (s == null) {
                        return "fake_session_content_binding";
                    }
                }
                else {
                    if (n != 3) {
                        return "fake_session_content_binding";
                    }
                    final yzl yzl = (yzl)b4;
                    if (yzl.e.t() && yzl.e.c() != null) {
                        s = yzl.e.c().b();
                    }
                    else {
                        s = yzl.e.k();
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
                    zdf.a((Object)((ymo)b5).h);
                    return ((zon)((Optional)a4).get()).a(aqci.a, ((ymo)b5).f, ((ymo)b5).h.a.toString());
                }
            }
            case 14: {
                final Object b6 = this.b;
                final Object a5 = this.a;
                final ziy ziy = (ziy)b6;
                return new wvl((nns)((afaq)ziy.c).a(), (Set)((atke)a5).a(), (vwa)ziy.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 13: {
                final Object b7 = this.b;
                final Object a6 = this.a;
                aqco aqco;
                try {
                    if ((((pek)b7).b & 0x100) != 0x0) {
                        agzo agzo;
                        if ((agzo = ((pek)b7).m) == null) {
                            agzo = agzo.a;
                        }
                        aqco = (aqco)ahbh.parseFrom((ahbh)aqco.a, agzo.c, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    else {
                        aqco = aqco.a;
                    }
                }
                catch (final ahca ahca) {
                    ((aeea)((atke)a6).a()).ci(ajbz.h, ((pek)b7).c);
                    ttr.b("Failed to initialize FileGroup manifest.");
                    aqco = aqco.a;
                }
                return aqco;
            }
            case 12: {
                final Object b8 = this.b;
                final Object a7 = this.a;
                final int a8 = qgc.a;
                return ((qcr)b8).a(((qga)((arkg)a7).a()).a);
            }
            case 11: {
                return ((qec)this.b).e((atke)this.a);
            }
            case 10: {
                final Object a9 = this.a;
                final Object b9 = this.b;
                synchronized (a9) {
                    final String a10 = qca.a();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a10);
                    sb.append(".trace");
                    final String string = sb.toString();
                    final File filesDir = ((Context)b9).getFilesDir();
                    final StringBuilder sb2 = new StringBuilder("primes_profiling_");
                    sb2.append(a10);
                    final File file = new File(filesDir, sb2.toString());
                    Object o;
                    if (!file.exists() && !file.mkdir()) {
                        ((afki)((afki)((afkg)qde.a).c()).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "lambda$new$0", 117, "CpuProfilingService.java")).r("Could not create directory");
                        o = aeyo.a;
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
                            c.i(((afkg)qde.a).c(), "Exception when clearing trace file.", "com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", '\u0170', "CpuProfilingService.java", (Throwable)ex);
                        }
                        o = aezp.k((Object)file2);
                    }
                    return o;
                }
            }
            case 9: {
                final Object a11 = this.a;
                final Object b10 = this.b;
                final pzj pzj = (pzj)a11;
                final Context applicationContext = pzj.a.getApplicationContext();
                final ExecutorService b11 = pzj.b;
                applicationContext.getClass();
                b11.getClass();
                final aulc aulc = new aulc((byte[])null, (char[])null);
                aulc.a = 641;
                khl.aR(true, "Must provide valid client application ID!");
                final nky nky = new nky(aulc, (byte[])null, (byte[])null, (byte[])null);
                return new qag((pzi)new qaa(applicationContext, nkz.b(applicationContext, nky), nkz.a(applicationContext, nky), nkz.c(applicationContext, nky), (pzc)new pze(applicationContext, b11), (Executor)b11, mpv.a), 2, (dmx)b10, applicationContext.getPackageName(), 0, (byte[])null, (byte[])null);
            }
            case 8: {
                final Object a12 = this.a;
                final Object b12 = this.b;
                final qrv qrv = new qrv((Context)b12, "STREAMZ_ONEGOOGLE_ANDROID");
                if (b12 instanceof Application) {
                    application = (Application)b12;
                }
                return new qcy((ScheduledExecutorService)a12, (qsf)qrv, application);
            }
            case 7: {
                final Object b13 = this.b;
                final aezp aezp = (aezp)this.a;
                ListenableFuture listenableFuture;
                if (aezp.h()) {
                    listenableFuture = ((mzl)b13).b(mzj.d((GmsDeviceComplianceResponse)aezp.c()));
                }
                else {
                    listenableFuture = afwm.m((Object)aeyo.a);
                }
                return listenableFuture;
            }
            case 6: {
                return ((mdv)this.b).c(((mdw)this.a).e);
            }
            case 5: {
                return ((fzw)this.b).z((fcm)new gnv(0));
            }
            case 4: {
                return ((fzw)this.b).z((fcm)new gnv(1));
            }
            case 3: {
                return new boq((bbk)this.b, (btn)((uak)this.a).c);
            }
            case 2: {
                return bnj.b((Class)this.a, (bbk)this.b);
            }
            case 1: {
                return bnj.b((Class)this.a, (bbk)this.b);
            }
            case 0: {
                return bnj.b((Class)this.a, (bbk)this.b);
            }
        }
    }
}
