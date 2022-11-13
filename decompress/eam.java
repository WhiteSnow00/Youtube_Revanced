import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eam extends dzt
{
    @dyi(a = 10)
    @dyj(a = dyk.a)
    dst m;
    
    private eam() {
        super("SingleComponentSection");
    }
    
    public static eal s(final dzu dzu) {
        final eal eal = new eal();
        final eam a = new eam();
        final eg j = ((dsx)dzu).j;
        eal.a = a;
        eal.b.clear();
        return eal;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dzt)o);
    }
    
    public final /* bridge */ dzt c(final boolean b) {
        final eam eam = (eam)super.c(b);
        final dst m = eam.m;
        dst j;
        if (m != null) {
            j = m.j();
        }
        else {
            j = null;
        }
        eam.m = j;
        return eam;
    }
    
    public final boolean f(final dzt dzt) {
        if (this == dzt) {
            return true;
        }
        if (dzt != null && this.getClass() == dzt.getClass()) {
            final eam eam = (eam)dzt;
            final dst m = this.m;
            if (m != null) {
                if (m.f(eam.m)) {
                    return true;
                }
            }
            else if (eam.m == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final boolean j() {
        return true;
    }
    
    protected final void m(final dzu dzu, final dzo dzo, final dzt dzt, final dzt dzt2) {
        final eam eam = (eam)dzt;
        final eam eam2 = (eam)dzt2;
        Object m;
        if (eam == null) {
            m = null;
        }
        else {
            m = eam.m;
        }
        final dub dub = new dub(m, eam2.m);
        final dub dub2 = new dub(null, null);
        final dub dub3 = new dub(null, null);
        final dub dub4 = new dub(null, null);
        final dub dub5 = new dub(null, null);
        final dub dub6 = new dub(null, null);
        final dub dub7 = new dub(null, null);
        final Object a = dub6.a;
        final Object b = dub6.b;
        final dst dst = (dst)dub.a;
        final dst dst2 = (dst)dub.b;
        if (dst != null || dst2 != null) {
            boolean b2 = false;
            if (dst != null && dst2 == null) {
                dzo.g(0, a);
                return;
            }
            final Object b3 = dub2.b;
            final boolean b4 = b3 != null && (boolean)b3;
            final Object b5 = dub3.b;
            int intValue;
            if (b5 != null) {
                intValue = (int)b5;
            }
            else {
                intValue = 1;
            }
            final Object b6 = dub4.b;
            final boolean b7 = b6 != null && (boolean)b6;
            if (dst == null) {
                final ebp r = ebr.r();
                bly.i(r, (Map)dub5.b, dub7);
                r.b = dst2;
                ((ebi)r).c(b4);
                ((ebi)r).d(intValue);
                ((ebi)r).b(b7);
                dzo.p(0, (eei)r.e(), ((dsx)dzu).p(), b);
                return;
            }
            final Object a2 = dub2.a;
            final boolean b8 = a2 != null && (boolean)a2;
            final Object a3 = dub3.a;
            int intValue2;
            if (a3 != null) {
                intValue2 = (int)a3;
            }
            else {
                intValue2 = 1;
            }
            final Object a4 = dub4.a;
            final boolean b9 = a4 != null && (boolean)a4;
            final Map map = (Map)dub5.a;
            final Map map2 = (Map)dub5.b;
            Label_0479: {
                Label_0374: {
                    if (map != map2) {
                        Label_0476: {
                            if (map != null) {
                                if (map2 == null) {
                                    break Label_0479;
                                }
                                if (map.size() == map2.size()) {
                                    for (final Map.Entry<K, Object> entry : map.entrySet()) {
                                        if (!com.j(entry.getValue(), map2.get(entry.getKey()))) {
                                            break Label_0476;
                                        }
                                    }
                                    break Label_0374;
                                }
                            }
                        }
                        b2 = false;
                        break Label_0479;
                    }
                }
                b2 = true;
            }
            if (b8 != b4 || intValue2 != intValue || b9 != b7 || !b2 || !dst.f(dst2)) {
                final ebp r2 = ebr.r();
                bly.i(r2, (Map)dub5.b, dub7);
                r2.b = dst2;
                ((ebi)r2).c(b4);
                ((ebi)r2).d(intValue);
                ((ebi)r2).b(b7);
                dzo.q(0, (eei)r2.e(), ((dsx)dzu).p(), a, b);
            }
        }
    }
}
