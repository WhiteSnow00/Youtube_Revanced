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

public final class acha extends oor
{
    public final xab a;
    public final xbe b;
    public final alji c;
    private final Map f;
    private final ArrayList g;
    private final oua h;
    private final ove i;
    
    public acha(final xab a, final alxw alxw, final alji c, final ots ots, final ove i) {
        super(ots);
        this.g = new ArrayList();
        a.getClass();
        this.a = a;
        final oua j = ots.i;
        j.getClass();
        this.h = j;
        this.i = i;
        alxw.getClass();
        this.b = (xbe)new wzy(alxw);
        this.c = c;
        this.f = new HashMap();
        if ((alxw.c & 0x40) != 0x0) {
            aqvj aqvj;
            if ((aqvj = alxw.i) == null) {
                aqvj = aqvj.a;
            }
            if ((aqvj.b & 0x1) != 0x0) {
                aqvl aqvl;
                if ((aqvl = aqvj.c) == null) {
                    aqvl = aqvl.a;
                }
                this.b(aqvl, "primary_fvl_spec");
            }
            if ((aqvj.b & 0x2) != 0x0) {
                aqvl aqvl2;
                if ((aqvl2 = aqvj.d) == null) {
                    aqvl2 = aqvl.a;
                }
                this.b(aqvl2, "secondary_fvl_spec");
            }
            return;
        }
        i.a(22, "Fvl Config is not available in LoggingDirectives", j, (Throwable)null);
    }
    
    private final void b(final aqvl aqvl, final String s) {
        if ((aqvl.b & 0x1) != 0x0) {
            aqvp aqvp;
            if ((aqvp = aqvl.c) == null) {
                aqvp = aqvp.a;
            }
            final int d = aqvp.d;
            if (d < 0) {
                final ove i = this.i;
                final StringBuilder sb = new StringBuilder("Invalid minimum visibility duration for FVL config: ");
                sb.append(d);
                i.a(22, sb.toString(), this.h, (Throwable)null);
            }
            float n = 0.0f;
            Label_0202: {
                if ((aqvp.b & 0x1) != 0x0) {
                    aqvn aqvn;
                    if ((aqvn = aqvp.c) == null) {
                        aqvn = aqvn.a;
                    }
                    if (((ahcu)aqvn).ry((ahci)aqjg.b)) {
                        final float c = ((aqjg)((ahcu)aqvn).rx((ahci)aqjg.b)).c;
                        if (c > 0.0f) {
                            n = c;
                            if (c <= 1.0f) {
                                break Label_0202;
                            }
                        }
                        final ove j = this.i;
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
                this.f.put(s, new acgz(aqvl, new AtomicInteger(0), intersectionCriteria, intersectionCriteria2, n2, new AtomicReference()));
            }
        }
    }
    
    public final Status criteriaMatched(final ArrayList list) {
        if (list.isEmpty()) {
            return Status.d;
        }
        for (final acgz acgz : this.f.values()) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final IntersectionCriteria intersectionCriteria = (IntersectionCriteria)list.get(i);
                if (aexq.c(intersectionCriteria, acgz.c)) {
                    if (acgz.b.compareAndSet(0, 1)) {
                        final asln ah = askp.av(acgz.e, TimeUnit.MILLISECONDS).aH(new achd(this, acgz, 1));
                        final asmq f = this.h.f;
                        if (f != null) {
                            f.c(ah);
                        }
                        acgz.f.set(ah);
                    }
                }
                else if (aexq.c(intersectionCriteria, acgz.d)) {
                    final asln asln = acgz.f.get();
                    if (asln != null) {
                        asln.dispose();
                    }
                    if (acgz.b.getAndSet(0) == 2) {
                        this.a.p(this.b, acgz.a, this.c);
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
