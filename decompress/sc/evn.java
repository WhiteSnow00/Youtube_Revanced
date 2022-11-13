import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evn implements rzh, eul, eun
{
    final man a;
    private final atke b;
    
    public evn(final atke b, final ccb ccb, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = new man((byte[])null, (byte[])null, (byte[])null);
        ccb.p((eun)this);
    }
    
    public final void A(final shd shd) {
        final ArrayList list = new ArrayList();
        for (final sid sid : this.a.x()) {
            final sif b = sid.b;
            if (b instanceof shj) {
                final aezp b2 = ((shj)b).b;
                if (!b2.h() || !adkp.ae((Object)shd.a, (Object)((shd)b2.c()).a)) {
                    continue;
                }
                list.add(sid);
            }
        }
        if (!list.isEmpty()) {
            ((rzg)this.b.a()).r((List)list);
        }
    }
    
    public final void B(final she she) {
        final ArrayList list = new ArrayList();
        for (final sid sid : this.a.x()) {
            final sif b = sid.b;
            if (b instanceof shj) {
                final aezp c = ((shj)b).c;
                if (!c.h() || !adkp.ae((Object)she.a.e, (Object)((she)c.c()).a.e)) {
                    continue;
                }
                list.add(sid);
            }
        }
        if (!list.isEmpty()) {
            ((rzg)this.b.a()).r((List)list);
        }
    }
    
    public final void D() {
        final ArrayList list = new ArrayList();
        for (final sid sid : this.a.x()) {
            if (sid.b instanceof shf) {
                list.add(sid);
            }
        }
        if (!list.isEmpty()) {
            ((rzg)this.b.a()).r((List)list);
        }
    }
    
    public final void N(final int n, final sif sif, final shm shm, final sfw sfw) {
        if (this.a.z(sif.b())) {
            throw new ryg("Tried to register duplicate trigger for slot: ".concat(shm.a), 12);
        }
        if (!(sif instanceof shf) && !(sif instanceof shk) && !(sif instanceof shj)) {
            final String a = shm.a;
            final String name = sif.a().name();
            final StringBuilder sb = new StringBuilder("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(a);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in ReelsTriggerAdapter");
            throw new ryg(sb.toString(), 4);
        }
        this.a.y(sif.b(), new sid(n, sif, shm, sfw));
        if (sif instanceof shj) {
            final shj shj = (shj)sif;
            final aezp b = shj.b;
            if (b.h() && ((shd)b.c()).c != null) {
                ((rzg)this.b.a()).r((List)Arrays.asList(this.a.v(shj.a)));
                return;
            }
            final aezp c = shj.c;
            if (c.h() && ((she)c.c()).c != null) {
                ((rzg)this.b.a()).r((List)Arrays.asList(this.a.v(shj.a)));
            }
        }
    }
    
    public final void O(final sif sif) {
        this.a.w(sif.b());
    }
    
    public final void f(final shd shd, final String s) {
    }
    
    public final void h(final shd shd) {
        final ArrayList list = new ArrayList();
        for (final sid sid : this.a.x()) {
            final sif b = sid.b;
            if (b instanceof shk) {
                final aezp a = ((shk)b).a;
                if (!a.h() || !adkp.ae((Object)shd.a, (Object)((shd)a.c()).a)) {
                    continue;
                }
                list.add(sid);
            }
        }
        if (!list.isEmpty()) {
            ((rzg)this.b.a()).r((List)list);
        }
    }
    
    public final void i(final she she) {
        final ArrayList list = new ArrayList();
        for (final sid sid : this.a.x()) {
            final sif b = sid.b;
            if (b instanceof shk) {
                final aezp b2 = ((shk)b).b;
                if (!b2.h() || !adkp.ae((Object)she.a.e, (Object)((she)b2.c()).a.e)) {
                    continue;
                }
                list.add(sid);
            }
        }
        if (!list.isEmpty()) {
            ((rzg)this.b.a()).r((List)list);
        }
    }
    
    public final void j(final List list) {
    }
    
    public final void k(final shd shd) {
    }
    
    public final void l(final she she) {
    }
    
    public final void n(final List list) {
    }
    
    public final void o(final shd shd) {
    }
    
    public final void p(final she she) {
    }
    
    public final void q(final int n, final shd shd) {
    }
    
    public final void r(final int n, final she she) {
    }
    
    public final void s(final eum eum) {
        eum.a((eul)this);
    }
    
    public final void t(final euo euo) {
    }
    
    public final void x() {
    }
}
