import android.os.Build$VERSION;
import android.os.Debug;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgh extends Thread
{
    public volatile boolean a;
    final /* synthetic */ adgi b;
    private final Runnable c;
    
    public adgh(final adgi b) {
        this.b = b;
        super("ANRGuard-Thread");
        this.c = (Runnable)new adaj(this, 7);
        this.a = true;
    }
    
    @Override
    public final void run() {
        final int a = adgb.a;
        final Thread thread = ((Handler)this.b.c).getLooper().getThread();
        final Object b = this.b.b;
        if (((File)((adgd)b).g.b).exists()) {
            try {
                final ahsm ahsm = (ahsm)((agza)((agxk)((agzi)ahsm.a).createBuilder()).mergeFrom(afnj.d((File)((adgd)b).g.b), ExtensionRegistryLite.getGeneratedRegistry())).build();
                String.valueOf(ahsm);
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.bj((aklq)d.instance, ahsm);
                ((adgd)b).c.d((aklq)((agza)d).build());
                ((adgd)b).a();
            }
            catch (final IOException ex) {
                zjp.c(zjo.b, zjn.A, "Unable to flush ANR", (Throwable)ex);
            }
        }
        ((adgc)this.b.d).a();
        while (!Thread.interrupted()) {
            this.a = true;
            ((Handler)this.b.c).post(this.c);
            try {
                TimeUnit.MILLISECONDS.sleep(this.b.a);
                ((adgc)this.b.d).a();
                if (Debug.isDebuggerConnected()) {
                    ((adgd)this.b.b).a();
                    continue;
                }
                if (this.a) {
                    final adgi b2 = this.b;
                    final Object b3 = b2.b;
                    final long a2 = b2.a;
                    final ahsm f = ((adgd)b3).f;
                    agza agza;
                    if (f == null) {
                        agza = ((agzi)ahsm.a).createBuilder();
                        final long c = ((adgd)b3).b.c();
                        agza.copyOnWrite();
                        final ahsm ahsm2 = (ahsm)agza.instance;
                        ahsm2.b |= 0x8;
                        ahsm2.f = c - a2;
                    }
                    else {
                        agza = ((agzi)f).toBuilder();
                    }
                    ((adgd)b3).b(agza, a2);
                    final int d2 = ((adgd)b3).d;
                    if (d2 > 0) {
                        final StringBuilder sb = new StringBuilder();
                        final StackTraceElement[] stackTrace = thread.getStackTrace();
                        for (int length = stackTrace.length, i = 0; i < length; ++i) {
                            sb.append(stackTrace[i]);
                            sb.append("\n");
                        }
                        String e;
                        final String s = e = sb.toString();
                        if (sb.length() > d2) {
                            e = s.substring(0, d2);
                        }
                        agza.copyOnWrite();
                        final ahsm ahsm3 = (ahsm)agza.instance;
                        e.getClass();
                        ahsm3.b |= 0x4;
                        ahsm3.e = e;
                    }
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    agza.copyOnWrite();
                    final ahsm ahsm4 = (ahsm)agza.instance;
                    ahsm4.b |= 0x40;
                    ahsm4.i = sdk_INT;
                    final int a3 = tsi.a(((adgd)b3).a);
                    agza.copyOnWrite();
                    final ahsm ahsm5 = (ahsm)agza.instance;
                    ahsm5.b |= 0x80;
                    ahsm5.j = a3;
                    ((adgd)b3).f = (ahsm)agza.build();
                    try {
                        String.valueOf(((adgd)b3).f);
                        final sin g = ((adgd)b3).g;
                        final ahsm f2 = ((adgd)b3).f;
                        if (!g.a) {
                            g.a = true;
                            final File parentFile = ((File)g.b).getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        afnj.c(((agxl)f2).toByteArray(), (File)g.b);
                    }
                    catch (final IOException ex2) {
                        zjp.c(zjo.b, zjn.A, "Unable to record ANR", (Throwable)ex2);
                    }
                    continue;
                }
                final adgi b4 = this.b;
                final Object b5 = b4.b;
                final long a4 = b4.a;
                final ahsm f3 = ((adgd)b5).f;
                if (f3 != null) {
                    adgd adgd;
                    if (!((adgd)b5).e) {
                        adgd = (adgd)b5;
                    }
                    else {
                        final agza builder = ((agzi)f3).toBuilder();
                        builder.copyOnWrite();
                        ahsm.a((ahsm)builder.instance);
                        ((adgd)b5).b(builder, a4);
                        final int sdk_INT2 = Build$VERSION.SDK_INT;
                        builder.copyOnWrite();
                        final ahsm ahsm6 = (ahsm)builder.instance;
                        ahsm6.b |= 0x40;
                        ahsm6.i = sdk_INT2;
                        final int a5 = tsi.a(((adgd)b5).a);
                        builder.copyOnWrite();
                        final ahsm ahsm7 = (ahsm)builder.instance;
                        ahsm7.b |= 0x80;
                        ahsm7.j = a5;
                        String.valueOf(((adgd)b5).f = (ahsm)builder.build());
                        final aklo d3 = aklq.d();
                        final ahsm f4 = ((adgd)b5).f;
                        ((agza)d3).copyOnWrite();
                        aklq.bj((aklq)d3.instance, f4);
                        ((adgd)b5).c.d((aklq)((agza)d3).build());
                        adgd = (adgd)b5;
                    }
                    adgd.a();
                    continue;
                }
                continue;
            }
            catch (final InterruptedException ex3) {
                continue;
            }
            break;
        }
    }
}
