import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.Collections;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odz
{
    private static final afik c;
    public final aexq a;
    public final oee b;
    private final boolean d;
    private final afts e;
    
    static {
        c = afik.m("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
    }
    
    public odz(final aexq a, final oee b, final aexq aexq, final afts e) {
        this.a = a;
        this.b = b;
        this.d = (boolean)aexq.e(false);
        this.e = e;
    }
    
    public static void b(final oea oea, ArrayList a, final RuntimeException ex) {
        if (((ArrayList)a).size() > 20) {
            for (int i = 0; i < 20; ++i) {
                Collections.swap((List<?>)a, i, ((Random)ThreadLocalRandom.current()).nextInt(((ArrayList)a).size() - i) + i);
            }
        }
        final int min = Math.min(((ArrayList)a).size(), 20);
        int ordinal = 0;
    Label_0136_Outer:
        while (true) {
            Label_0142: {
                if (ordinal >= min) {
                    break Label_0142;
                }
                final Thread thread = (Thread)((ArrayList)a).get(ordinal);
                final odj odj = new odj(thread);
                final RuntimeException a2 = aesr.a(thread);
                if (a2.getStackTrace().length > 0) {
                    odj.initCause(a2);
                }
                while (true) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(ex, odj);
                        ++ordinal;
                        continue Label_0136_Outer;
                        Label_0175: {
                            ((afii)((afii)((afii)((afig)odz.c).g()).i((Throwable)ex)).j("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", 391, "ThreadMonitoring.java")).p();
                        }
                        return;
                        while (true) {
                            iftrue(Label_0161:)(ordinal == 1);
                            return;
                            Label_0161:
                            qcj.u((Runnable)new nlk(ex, 15));
                            return;
                            a = oea.a;
                            ordinal = oea.ordinal();
                            iftrue(Label_0175:)(ordinal == 0);
                            continue;
                        }
                    }
                    catch (final Exception ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static boolean c() {
        return ((Random)ThreadLocalRandom.current()).nextInt(1000) <= 0;
    }
    
    public final ExecutorService a(final ody ody, final ExecutorService executorService, final odx odx) {
        return new odv((oea)this.a.c(), this.b, this.d, this.e, ody, executorService, odx);
    }
}
