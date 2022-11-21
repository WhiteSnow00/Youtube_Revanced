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

public final class achi
{
    public final veh a;
    public final vgx b;
    public final Map c;
    public final atmj d;
    public final String e;
    public final String f;
    public Optional g;
    public Optional h;
    public Optional i;
    public final adnd j;
    private final askz k;
    private asln l;
    
    public achi(final veh a, final vey vey, final zoa zoa, final askz k, final ajvm ajvm, final adnd j, final byte[] array, final byte[] array2) {
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.a = a;
        this.b = (vgx)vey.a(zoa.c());
        this.k = k;
        this.j = j;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = atmj.aW(new Object());
        b(c, a((List)ajvm.e));
        this.e = ajvm.c;
        this.f = ajvm.f;
        if ((ajvm.b & 0x8) != 0x0) {
            aisc aisc;
            if ((aisc = ajvm.g) == null) {
                aisc = aisc.a;
            }
            this.g = Optional.of((Object)aisc);
        }
        aisc aisc2;
        if ((ajvm.b & 0x10) != 0x0) {
            if ((aisc2 = ajvm.h) == null) {
                aisc2 = aisc.a;
            }
        }
        else {
            aisc2 = null;
        }
        this.h = Optional.ofNullable((Object)aisc2);
    }
    
    public static List a(final List list) {
        return (List)Collection$_EL.stream((Collection)list).filter((Predicate)acey.d).map((Function)acdy.d).collect(Collectors.toCollection((Supplier)achh.a));
    }
    
    public static void b(final Map map, final List list) {
        for (final ajvv ajvv : list) {
            map.put(ajvv.c, ajvv);
        }
    }
    
    public final void c() {
        this.d();
        this.l = askp.n(this.b.i(this.f, true).K((asmo)aaex.q), (asks)this.d, (asme)uzd.r).Z(abmy.i).l(ajvq.class).af(this.k).Z(abmy.j).aH((asmi)new acbf(this, 3));
    }
    
    public final void d() {
        final asln l = this.l;
        if (l == null) {
            return;
        }
        asmr.b((AtomicReference)l);
        this.l = null;
    }
}
