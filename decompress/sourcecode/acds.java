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

public final class acds
{
    public final vax a;
    public final vdo b;
    public final Map c;
    public final atir d;
    public final String e;
    public final String f;
    public Optional g;
    public Optional h;
    public Optional i;
    public final adjo j;
    private final asho k;
    private asic l;
    
    public acds(final vax a, final vbq vbq, final zki zki, final asho k, final ajrk ajrk, final adjo j, final byte[] array, final byte[] array2) {
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.a = a;
        this.b = (vdo)vbq.a(zki.c());
        this.k = k;
        this.j = j;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = atir.aR(new Object());
        b(c, a(ajrk.e));
        this.e = ajrk.c;
        this.f = ajrk.f;
        if ((ajrk.b & 0x8) != 0x0) {
            aioe aioe;
            if ((aioe = ajrk.g) == null) {
                aioe = aioe.a;
            }
            this.g = Optional.of((Object)aioe);
        }
        aioe aioe2;
        if ((ajrk.b & 0x10) != 0x0) {
            if ((aioe2 = ajrk.h) == null) {
                aioe2 = aioe.a;
            }
        }
        else {
            aioe2 = null;
        }
        this.h = Optional.ofNullable((Object)aioe2);
    }
    
    public static List a(final List list) {
        return (List)Collection$_EL.stream((Collection)list).filter((Predicate)acbk.d).map((Function)zxk.s).collect(Collectors.toCollection((Supplier)acmb.b));
    }
    
    public static void b(final Map map, final List list) {
        for (final ajrt ajrt : list) {
            map.put(ajrt.c, ajrt);
        }
    }
    
    public final void c() {
        this.d();
        this.l = ashe.m((ashh)this.b.h(this.f, true).J((asjd)aawc.j), (ashh)this.d, (asit)uwa.r).W((asjc)aaza.n).k((Class)ajro.class).aa(this.k).W((asjc)aaza.o).aB((asix)new abtm(this, 13));
    }
    
    public final void d() {
        final asic l = this.l;
        if (l == null) {
            return;
        }
        asjg.b((AtomicReference)l);
        this.l = null;
    }
}
