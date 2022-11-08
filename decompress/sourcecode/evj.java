import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evj implements rxc, eui, euk
{
    final rhz a;
    private final atjj b;
    
    public evj(final atjj b, final cca cca, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = new rhz((char[])null);
        cca.p((euk)this);
    }
    
    public final void A(final sey sey) {
        final ArrayList list = new ArrayList();
        for (final sfy sfy : this.a.r()) {
            final sga b = sfy.b;
            if (b instanceof sfe) {
                final aexq b2 = ((sfe)b).b;
                if (!b2.h() || !aeda.v(sey.a, ((sey)b2.c()).a)) {
                    continue;
                }
                list.add(sfy);
            }
        }
        if (!list.isEmpty()) {
            ((rxb)this.b.a()).r((List)list);
        }
    }
    
    public final void B(final sez sez) {
        final ArrayList list = new ArrayList();
        for (final sfy sfy : this.a.r()) {
            final sga b = sfy.b;
            if (b instanceof sfe) {
                final aexq c = ((sfe)b).c;
                if (!c.h() || !aeda.v(sez.a.e, ((sez)c.c()).a.e)) {
                    continue;
                }
                list.add(sfy);
            }
        }
        if (!list.isEmpty()) {
            ((rxb)this.b.a()).r((List)list);
        }
    }
    
    public final void D() {
        final ArrayList list = new ArrayList();
        for (final sfy sfy : this.a.r()) {
            if (sfy.b instanceof sfa) {
                list.add(sfy);
            }
        }
        if (!list.isEmpty()) {
            ((rxb)this.b.a()).r((List)list);
        }
    }
    
    public final void N(final int n, final sga sga, final sfh sfh, final sdr sdr) {
        if (this.a.t(sga.b())) {
            throw new rwb("Tried to register duplicate trigger for slot: ".concat(sfh.a), 12);
        }
        if (!(sga instanceof sfa) && !(sga instanceof sff) && !(sga instanceof sfe)) {
            final String a = sfh.a;
            final String name = sga.a().name();
            final StringBuilder sb = new StringBuilder("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(a);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in ReelsTriggerAdapter");
            throw new rwb(sb.toString(), 4);
        }
        this.a.s(sga.b(), new sfy(n, sga, sfh, sdr));
        if (sga instanceof sfe) {
            final sfe sfe = (sfe)sga;
            final aexq b = sfe.b;
            if (b.h() && ((sey)b.c()).c != null) {
                ((rxb)this.b.a()).r((List)Arrays.asList(this.a.p(sfe.a)));
                return;
            }
            final aexq c = sfe.c;
            if (c.h() && ((sez)c.c()).c != null) {
                ((rxb)this.b.a()).r((List)Arrays.asList(this.a.p(sfe.a)));
            }
        }
    }
    
    public final void O(final sga sga) {
        this.a.q(sga.b());
    }
    
    public final void h(final sey sey) {
        final ArrayList list = new ArrayList();
        for (final sfy sfy : this.a.r()) {
            final sga b = sfy.b;
            if (b instanceof sff) {
                final aexq a = ((sff)b).a;
                if (!a.h() || !aeda.v(sey.a, ((sey)a.c()).a)) {
                    continue;
                }
                list.add(sfy);
            }
        }
        if (!list.isEmpty()) {
            ((rxb)this.b.a()).r((List)list);
        }
    }
    
    public final void i(final sez sez) {
        final ArrayList list = new ArrayList();
        for (final sfy sfy : this.a.r()) {
            final sga b = sfy.b;
            if (b instanceof sff) {
                final aexq b2 = ((sff)b).b;
                if (!b2.h() || !aeda.v(sez.a.e, ((sez)b2.c()).a.e)) {
                    continue;
                }
                list.add(sfy);
            }
        }
        if (!list.isEmpty()) {
            ((rxb)this.b.a()).r((List)list);
        }
    }
    
    public final void s(final euj euj) {
        euj.a(this);
    }
    
    public final void t(final eul eul) {
    }
    
    public final void x() {
    }
}
