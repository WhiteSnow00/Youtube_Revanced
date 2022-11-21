import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acry extends acqk implements thj
{
    private final aclr a;
    public final acmr h;
    public final acmr m;
    
    public acry(final vnq vnq, final acrd acrd, final thg thg, final tre tre, final xab xab) {
        acrd.a();
        super(vnq, thg, tre, xab);
        acrd.b(anmt.class);
        thg.g((Object)this);
        final aclr a = new aclr();
        this.a = a;
        final acmr h = new acmr();
        this.h = h;
        final acmr m = new acmr();
        this.m = m;
        a.m(h);
        a.m(super.i);
        a.m(m);
    }
    
    private static afgh o(final anmt anmt) {
        if (anmt.e.size() == 0) {
            return afgh.q();
        }
        final ArrayList list = new ArrayList(anmt.e.size());
        for (final anmu anmu : anmt.e) {
            final int b = anmu.b;
            if ((b & 0x1) != 0x0) {
                amth amth;
                if ((amth = anmu.c) == null) {
                    amth = amth.a;
                }
                list.add(aamp.x(amth));
            }
            else {
                if ((b & 0x2) == 0x0) {
                    continue;
                }
                anph anph;
                if ((anph = anmu.d) == null) {
                    anph = anph.a;
                }
                list.add(aamp.x(anph));
            }
        }
        return afgh.o(list);
    }
    
    private final afgh p(final anmt anmt) {
        if (anmt.d.size() == 0) {
            return afgh.q();
        }
        final ArrayList list = new ArrayList(anmt.d.size());
        final Iterator<Object> iterator = ((List<Object>)anmt.d).iterator();
        while (iterator.hasNext()) {
            final ahcr builder = ((ahcz)iterator.next()).toBuilder();
            final anmv anmv = (anmv)builder.instance;
            final int b = anmv.b;
            if ((b & 0x1) != 0x0) {
                anna anna;
                if ((anna = anmv.c) == null) {
                    anna = anna.a;
                }
                final ahct ahct = (ahct)((ahcz)anna).toBuilder();
                ahct.e((ahci)anmx.b, (Object)anmt.f);
                builder.copyOnWrite();
                final anmv anmv2 = (anmv)builder.instance;
                final anna c = (anna)((ahcr)ahct).build();
                c.getClass();
                anmv2.c = c;
                anmv2.b |= 0x1;
                anna anna2;
                if ((anna2 = ((anmv)builder.instance).c) == null) {
                    anna2 = anna.a;
                }
                list.add(anna2);
            }
            else if ((b & 0x8) != 0x0) {
                ajbz ajbz;
                if ((ajbz = anmv.f) == null) {
                    ajbz = ajbz.a;
                }
                list.add(ajbz);
            }
            else {
                this.j(list, (anmv)builder.build());
            }
        }
        return afgh.o(list);
    }
    
    @Override
    protected final void F(final Object o, final int n) {
        this.h.add(n, o);
    }
    
    @Override
    public final void J(final Object o) {
        if (o != null) {
            this.h.remove(o);
        }
    }
    
    @Override
    public final acla a() {
        return (acla)this.a;
    }
    
    protected void f(final vwa vwa) {
        this.h.m((afbk)new qyf(vwa, 16));
    }
    
    protected void j(final List list, final anmv anmv) {
    }
    
    protected void l(final anmt anmt) {
    }
    
    protected final /* bridge */ Object lE(final anxa anxa) {
        if (anxa != null && ((ahcu)anxa).ry((ahci)anmt.b)) {
            return ((ahcu)anxa).rx((ahci)anmt.b);
        }
        return null;
    }
    
    public void m(final anmt anmt) {
        if (anmt == null) {
            super.qK();
            this.h.clear();
            this.m.clear();
            return;
        }
        this.lM(o(anmt));
        final afgh p = this.p(anmt);
        final int size = this.h.size();
        final Iterator<Object> iterator = p.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < size) {
                this.h.n(n, next);
            }
            else {
                this.h.add(n, next);
            }
            ++n;
        }
        if (n < size) {
            this.h.i(n, size - n);
        }
        this.l(anmt);
    }
    
    @Override
    public Class[] mr(final Class clazz, final Object o, final int n) {
        if (clazz == acry.class) {
            Class[] array;
            if (n != -1) {
                if (n != 0) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.f((vwa)o);
                array = null;
            }
            else {
                array = new Class[] { vwa.class };
            }
            return array;
        }
        return aamz.x(this, o, n);
    }
    
    protected final /* bridge */ void my(final Object o, final acbk acbk) {
        final anmt anmt = (anmt)o;
        super.my(anmt, acbk);
        if (anmt == null) {
            return;
        }
        if (acbk.a() == acbj.d) {
            this.m(anmt);
            return;
        }
        this.lM(o(anmt));
        this.h.addAll((Collection)this.p(anmt));
        this.l(anmt);
    }
}
