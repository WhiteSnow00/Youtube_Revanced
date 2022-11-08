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

public final class acdm extends omu
{
    public final wwv a;
    public final wxz b;
    public final alff c;
    private final Map f;
    private final ArrayList g;
    private final orz h;
    private final otd i;
    
    public acdm(final wwv a, final alts alts, final alff c, final orr orr, final otd i) {
        super(orr);
        this.g = new ArrayList();
        a.getClass();
        this.a = a;
        final orz j = orr.i;
        j.getClass();
        this.h = j;
        this.i = i;
        alts.getClass();
        this.b = (wxz)new wws(alts);
        this.c = c;
        this.f = new HashMap();
        if ((alts.c & 0x40) != 0x0) {
            aqqe aqqe;
            if ((aqqe = alts.i) == null) {
                aqqe = aqqe.a;
            }
            if ((aqqe.b & 0x1) != 0x0) {
                aqqg aqqg;
                if ((aqqg = aqqe.c) == null) {
                    aqqg = aqqg.a;
                }
                this.b(aqqg, "primary_fvl_spec");
            }
            if ((aqqe.b & 0x2) != 0x0) {
                aqqg aqqg2;
                if ((aqqg2 = aqqe.d) == null) {
                    aqqg2 = aqqg.a;
                }
                this.b(aqqg2, "secondary_fvl_spec");
            }
            return;
        }
        i.a(22, "Fvl Config is not available in LoggingDirectives", j, null);
    }
    
    private final void b(final aqqg aqqg, final String s) {
        if ((aqqg.b & 0x1) != 0x0) {
            aqqk aqqk;
            if ((aqqk = aqqg.c) == null) {
                aqqk = aqqk.a;
            }
            final int d = aqqk.d;
            if (d < 0) {
                final otd i = this.i;
                final StringBuilder sb = new StringBuilder("Invalid minimum visibility duration for FVL config: ");
                sb.append(d);
                i.a(22, sb.toString(), this.h, null);
            }
            final long n = d;
            float n2 = 0.0f;
            Label_0198: {
                if ((aqqk.b & 0x1) != 0x0) {
                    aqqi aqqi;
                    if ((aqqi = aqqk.c) == null) {
                        aqqi = aqqi.a;
                    }
                    if (((agzd)aqqi).rs((agyr)aqea.b)) {
                        final float c = ((aqea)((agzd)aqqi).rr((agyr)aqea.b)).c;
                        if (c > 0.0f) {
                            n2 = c;
                            if (c <= 1.0f) {
                                break Label_0198;
                            }
                        }
                        final otd j = this.i;
                        final StringBuilder sb2 = new StringBuilder("Invalid ratio for FVL config: ");
                        sb2.append(c);
                        j.a(22, sb2.toString(), this.h, null);
                    }
                }
                n2 = 0.0f;
            }
            if (n >= 0L && n2 > 0.0f && n2 <= 1.0f) {
                final IntersectionCriteria intersectionCriteria = new IntersectionCriteria(n2, true);
                final IntersectionCriteria intersectionCriteria2 = new IntersectionCriteria(n2, false);
                this.g.add(intersectionCriteria);
                this.g.add(intersectionCriteria2);
                this.f.put(s, new acdl(aqqg, new AtomicInteger(0), intersectionCriteria, intersectionCriteria2, n, new AtomicReference()));
            }
        }
    }
    
    public final Status criteriaMatched(final ArrayList list) {
        if (list.isEmpty()) {
            return Status.d;
        }
        for (final acdl acdl : this.f.values()) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final IntersectionCriteria intersectionCriteria = (IntersectionCriteria)list.get(i);
                if (aeda.v((Object)intersectionCriteria, (Object)acdl.c)) {
                    if (acdl.b.compareAndSet(0, 1)) {
                        final asic ab = ashe.ap(acdl.e, TimeUnit.MILLISECONDS).aB((asix)new uqp(this, acdl, 15));
                        final asjf f = this.h.f;
                        if (f != null) {
                            f.c(ab);
                        }
                        acdl.f.set(ab);
                    }
                }
                else if (aeda.v((Object)intersectionCriteria, (Object)acdl.d)) {
                    final asic asic = acdl.f.get();
                    if (asic != null) {
                        asic.dispose();
                    }
                    if (acdl.b.getAndSet(0) == 2) {
                        this.a.p(this.b, acdl.a, this.c);
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
