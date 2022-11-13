import java.util.Iterator;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.function.Function;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxb implements aezf
{
    public final Object a;
    private final int b;
    
    public hxb(final aaat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final hxi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final idm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final iee a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final ieg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final iei a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final iff a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final ifk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final ifl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final imw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final CharSequence a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final vfp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final vfw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxb(final xiz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                ((imw)a).b = aezp.k((Object)afeq.o((Collection)o));
                return a;
            }
            case 19: {
                return ((ifl)this.a).r((Set)o);
            }
            case 18: {
                return ifk.k((aaat)this.a, (Set)o);
            }
            case 17: {
                return ifk.k((aaat)this.a, (Set)o);
            }
            case 16: {
                return ifk.k((aaat)this.a, (Set)o);
            }
            case 15: {
                return Collection$_EL.stream((Collection)o).map((Function)new hra((ifk)this.a, 9)).flatMap((Function)ifj.a).collect(afci.a);
            }
            case 14: {
                return ifk.k((aaat)this.a, (Set)o);
            }
            case 13: {
                return ((iff)this.a).r((Set)o);
            }
            case 12: {
                ((Optional)o).ifPresent((Consumer)new iau((vfw)this.a, 9));
                return null;
            }
            case 11: {
                ((Optional)o).ifPresent((Consumer)new iau((vfw)this.a, 8));
                return null;
            }
            case 10: {
                return Collection$_EL.stream((Collection)Collection$_EL.stream((Collection)o).flatMap((Function)hvv.u).collect(Collectors.toCollection((Supplier)fdi.u))).filter((Predicate)hoi.t).map((Function)ifj.b).map((Function)new hra((vfp)this.a, 8)).collect(Collectors.toCollection((Supplier)fdi.u));
            }
            case 9: {
                return ((iei)this.a).r((Set)o);
            }
            case 8: {
                return ieg.l((String)this.a, (Set)o);
            }
            case 7: {
                final Object a2 = this.a;
                final Collection collection = (Collection)o;
                final afel d = afeq.d();
                for (final aaat aaat : collection) {
                    d.j((Iterable)ieg.k(aaat));
                    ((ieg)a2).a.put(aaat.a.a, new HashSet(aaat.b));
                }
                return d.g();
            }
            case 6: {
                return ieg.l((String)this.a, (Set)o);
            }
            case 5: {
                final Object a3 = this.a;
                final Collection collection2 = (Collection)o;
                final afel d2 = afeq.d();
                for (final aaat aaat2 : collection2) {
                    d2.h((Object)iee.k(aaat2));
                    ((iee)a3).l(aaat2.a);
                }
                return d2.g();
            }
            case 4: {
                final Object a4 = this.a;
                if (!(boolean)o || !((fmr)((idm)a4).c.a()).h()) {
                    final idm idm = (idm)a4;
                    idm.b();
                    idm.c();
                }
                return null;
            }
            case 3: {
                final Object a5 = this.a;
                final ahaz builder = ((ahbh)o).toBuilder();
                final String b = ((xjr)a5).b;
                builder.copyOnWrite();
                final aqac aqac = (aqac)builder.instance;
                final ahbx e = aqac.e;
                if (!e.c()) {
                    aqac.e = ahbh.mutableCopy(e);
                }
                aqac.e.add((Object)b);
                return builder.build();
            }
            case 2: {
                final Object a6 = this.a;
                final tqt tqt = (tqt)o;
                final hxi hxi = (hxi)a6;
                tqt.f = hxi.nZ().getString(2132017972);
                tqt.f(afft.s((Object)hxi.ak));
                return tqt;
            }
            case 1: {
                final Object a7 = this.a;
                final tqt tqt2 = (tqt)o;
                tqt2.d(1);
                tqt2.d = null;
                tqt2.f = ((hwl)a7).bG.d();
                return tqt2;
            }
            case 0: {
                final Object a8 = this.a;
                final tqt tqt3 = (tqt)o;
                tqt3.f = a8;
                tqt3.f((afft)afiq.a);
                return tqt3;
            }
        }
    }
}
