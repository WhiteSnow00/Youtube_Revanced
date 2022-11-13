import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.HashMap;
import j$.util.Optional;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfw
{
    public final vcy a;
    public final vfp b;
    public final Map c;
    public final atjm d;
    public final String e;
    public final String f;
    public Optional g;
    public Optional h;
    public Optional i;
    public final adlp j;
    private final asid k;
    private asir l;
    
    public acfw(final vcy a, final vdr vdr, final zmf zmf, final asid k, final ajtn ajtn, final adlp j, final byte[] array, final byte[] array2) {
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.a = a;
        this.b = (vfp)vdr.a(zmf.c());
        this.k = k;
        this.j = j;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = atjm.aW(new Object());
        b(c, a((List)ajtn.e));
        this.e = ajtn.c;
        this.f = ajtn.f;
        if ((ajtn.b & 0x8) != 0x0) {
            aiqj aiqj;
            if ((aiqj = ajtn.g) == null) {
                aiqj = aiqj.a;
            }
            this.g = Optional.of((Object)aiqj);
        }
        aiqj aiqj2;
        if ((ajtn.b & 0x10) != 0x0) {
            if ((aiqj2 = ajtn.h) == null) {
                aiqj2 = aiqj.a;
            }
        }
        else {
            aiqj2 = null;
        }
        this.h = Optional.ofNullable((Object)aiqj2);
    }
    
    public static List a(final List list) {
        return (List)Collection$_EL.stream((Collection)list).filter((Predicate)acdl.d).map((Function)zze.s).collect(Collectors.toCollection((Supplier)acoe.b));
    }
    
    public static void b(final Map map, final List list) {
        for (final ajtw ajtw : list) {
            map.put(ajtw.c, ajtw);
        }
    }
    
    public final void c() {
        this.d();
        this.l = asht.n(this.b.h(this.f, true).K((asjs)aada.q), (ashw)this.d, (asji)uxv.r).Z((asjr)ablr.h).l(ajtr.class).af(this.k).Z((asjr)ablr.i).aH(new absa(this, 19));
    }
    
    public final void d() {
        final asir l = this.l;
        if (l == null) {
            return;
        }
        asjv.b((AtomicReference)l);
        this.l = null;
    }
}
