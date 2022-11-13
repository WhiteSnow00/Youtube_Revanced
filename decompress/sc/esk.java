import android.os.Bundle;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esk implements Runnable
{
    public final esm a;
    
    public esk(final esm a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final esm a = this.a;
        amjm amjm;
        if ((amjm = a.bP.b().m) == null) {
            amjm = amjm.a;
        }
        if (amjm.i) {
            amjm amjm2;
            if ((amjm2 = a.bP.b().m) == null) {
                amjm2 = amjm.a;
            }
            if (amjm2.j) {
                final fks fks = (fks)a.ap.a();
                fks.b.b();
                fks.a.set(0);
                fks.b.c(fks.c.P(atjj.b(fks.d)).am((asjm)new fcx(fks, 9)));
                fks.f = fks.e.d();
                final ajb ajb = (ajb)a.aq.a();
                final vaf vaf = (vaf)ajb.a;
                amjm amjm3;
                if ((amjm3 = vaf.b().m) == null) {
                    amjm3 = amjm.a;
                }
                if (amjm3.i) {
                    amjm amjm4;
                    if ((amjm4 = vaf.b().m) == null) {
                        amjm4 = amjm.a;
                    }
                    if (amjm4.j) {
                        final TimeUnit minutes = TimeUnit.MINUTES;
                        amjm amjm5;
                        if ((amjm5 = ((vaf)ajb.a).b().m) == null) {
                            amjm5 = amjm.a;
                        }
                        final long seconds = minutes.toSeconds(amjm5.k);
                        if (seconds >= 1L) {
                            ((tcq)ajb.b).c("NetworkQualityLogger", seconds + 5L, 5L, true, 0, false, (Bundle)null, (ypi)null);
                        }
                    }
                }
                final fzw fzw = (fzw)a.ao.a();
                amjm amjm6;
                if ((amjm6 = ((vaf)fzw.a).b().m) == null) {
                    amjm6 = amjm.a;
                }
                if (amjm6.j) {
                    amjm amjm7;
                    if ((amjm7 = ((vaf)fzw.a).b().m) == null) {
                        amjm7 = amjm.a;
                    }
                    if (amjm7.i) {
                        final TimeUnit minutes2 = TimeUnit.MINUTES;
                        amjm amjm8;
                        if ((amjm8 = ((vaf)fzw.a).b().m) == null) {
                            amjm8 = amjm.a;
                        }
                        final long seconds2 = minutes2.toSeconds(amjm8.l);
                        if (seconds2 >= 1L) {
                            ((tcq)fzw.b).c("NetworkStatusReporter", seconds2 + 5L, seconds2, true, 0, false, (Bundle)null, (ypi)null);
                        }
                    }
                }
                return;
            }
        }
        aoqn aoqn;
        if ((aoqn = a.bP.b().s) == null) {
            aoqn = aoqn.a;
        }
        if (aoqn.f) {
            a.aq.a();
            return;
        }
        ((tcq)a.at.a()).b("NetworkQualityLogger");
        ((tcq)a.at.a()).b("NetworkStatusReporter");
    }
}
