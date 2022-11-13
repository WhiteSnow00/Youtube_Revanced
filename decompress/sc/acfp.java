import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfp extends ooa
{
    public final wyw a;
    public final wzz b;
    public final alhi c;
    private final Map f;
    private final ArrayList g;
    private final oti h;
    private final oum i;
    
    public acfp(final wyw a, final alvw alvw, final alhi c, final ota ota, final oum i) {
        super(ota);
        this.g = new ArrayList();
        a.getClass();
        this.a = a;
        final oti j = ota.i;
        j.getClass();
        this.h = j;
        this.i = i;
        alvw.getClass();
        this.b = (wzz)new wyt(alvw);
        this.c = c;
        this.f = new HashMap();
        if ((alvw.c & 0x40) != 0x0) {
            aqsq aqsq;
            if ((aqsq = alvw.i) == null) {
                aqsq = aqsq.a;
            }
            if ((aqsq.b & 0x1) != 0x0) {
                aqss aqss;
                if ((aqss = aqsq.c) == null) {
                    aqss = aqss.a;
                }
                this.b(aqss, "primary_fvl_spec");
            }
            if ((aqsq.b & 0x2) != 0x0) {
                aqss aqss2;
                if ((aqss2 = aqsq.d) == null) {
                    aqss2 = aqss.a;
                }
                this.b(aqss2, "secondary_fvl_spec");
            }
            return;
        }
        i.a(22, "Fvl Config is not available in LoggingDirectives", j, (Throwable)null);
    }
    
    private final void b(final aqss aqss, final String s) {
        if ((aqss.b & 0x1) != 0x0) {
            aqsw aqsw;
            if ((aqsw = aqss.c) == null) {
                aqsw = aqsw.a;
            }
            final int d = aqsw.d;
            if (d < 0) {
                final oum i = this.i;
                final StringBuilder sb = new StringBuilder("Invalid minimum visibility duration for FVL config: ");
                sb.append(d);
                i.a(22, sb.toString(), this.h, (Throwable)null);
            }
            float n = 0.0f;
            Label_0202: {
                if ((aqsw.b & 0x1) != 0x0) {
                    aqsu aqsu;
                    if ((aqsu = aqsw.c) == null) {
                        aqsu = aqsu.a;
                    }
                    if (((ahbc)aqsu).ry((ahaq)aqgm.b)) {
                        final float c = ((aqgm)((ahbc)aqsu).rx((ahaq)aqgm.b)).c;
                        if (c > 0.0f) {
                            n = c;
                            if (c <= 1.0f) {
                                break Label_0202;
                            }
                        }
                        final oum j = this.i;
                        final StringBuilder sb2 = new StringBuilder("Invalid ratio for FVL config: ");
                        sb2.append(c);
                        j.a(22, sb2.toString(), this.h, (Throwable)null);
                    }
                }
                n = 0.0f;
            }
            final long n2 = d;
            if (n2 >= 0L && n > 0.0f && n <= 1.0f) {
                final IntersectionCriteria intersectionCriteria = new IntersectionCriteria(n, true);
                final IntersectionCriteria intersectionCriteria2 = new IntersectionCriteria(n, false);
                this.g.add(intersectionCriteria);
                this.g.add(intersectionCriteria2);
                this.f.put(s, new acfo(aqss, new AtomicInteger(0), intersectionCriteria, intersectionCriteria2, n2, new AtomicReference()));
            }
        }
    }
    
    public final Status criteriaMatched(final ArrayList list) {
        if (list.isEmpty()) {
            return Status.d;
        }
        for (final acfo acfo : this.f.values()) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final IntersectionCriteria intersectionCriteria = (IntersectionCriteria)list.get(i);
                if (adkp.ae((Object)intersectionCriteria, (Object)acfo.c)) {
                    if (acfo.b.compareAndSet(0, 1)) {
                        final asir ah = asht.av(acfo.e, TimeUnit.MILLISECONDS).aH(new acfs(this, acfo, 1));
                        final asju f = this.h.f;
                        if (f != null) {
                            f.c(ah);
                        }
                        acfo.f.set(ah);
                    }
                }
                else if (adkp.ae((Object)intersectionCriteria, (Object)acfo.d)) {
                    final asir asir = acfo.f.get();
                    if (asir != null) {
                        asir.dispose();
                    }
                    if (acfo.b.getAndSet(0) == 2) {
                        this.a.p(this.b, acfo.a, this.c);
                    }
                }
            }
        }
        return Status.OK;
    }
    
    public final ArrayList getCriteriaList() {
        return this.g;
    }
    
    public final String getGroupId() {
        return "";
    }
}
