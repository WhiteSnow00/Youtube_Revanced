import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpd implements cpc, cph
{
    public final cpb a;
    public final Object b;
    private final cpi[] c;
    
    public cpd(final der der, final cpb a, final byte[] array) {
        final cpf cpf = new cpf((cpv)der.b);
        final cpg cpg = new cpg((cpq)der.c);
        final cpn cpn = new cpn((cpv)der.a);
        final cpj cpj = new cpj((cpv)der.d);
        final cpm cpm = new cpm((cpv)der.d);
        final cpl cpl = new cpl((cpv)der.d);
        final cpk cpk = new cpk((cpv)der.d);
        this.a = a;
        this.c = new cpi[] { cpf, cpg, cpn, cpj, cpm, cpl, cpk };
        this.b = new Object();
    }
    
    public final void a(final Iterable iterable) {
        iterable.getClass();
        final Object b = this.b;
        monitorenter(b);
        try {
            final cpi[] c = this.c;
            final int n = 0;
            for (int i = 0; i < 7; ++i) {
                c[i].d(null);
            }
            final cpi[] c2 = this.c;
            int j = 0;
            while (j < 7) {
                final cpi cpi = c2[j];
                cpi.b.clear();
                cpi.c.clear();
                final List b2 = cpi.b;
                for (final Object next : iterable) {
                    if (cpi.b((crg)next)) {
                        b2.add(next);
                    }
                }
                final List b3 = cpi.b;
                final List c3 = cpi.c;
                final Iterator iterator2 = b3.iterator();
                while (iterator2.hasNext()) {
                    c3.add(((crg)iterator2.next()).c);
                }
                Label_0352: {
                    if (cpi.b.isEmpty()) {
                        cpi.a.f((coz)cpi);
                        break Label_0352;
                    }
                    final cpv a = cpi.a;
                    synchronized (a.b) {
                        if (a.c.add(cpi)) {
                            if (a.c.size() == 1) {
                                a.d = a.b();
                                cmr.a();
                                final int a2 = cpw.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(a.getClass().getSimpleName());
                                sb.append(": initial state = ");
                                sb.append(a.d);
                                a.d();
                            }
                            ((coz)cpi).a(a.d);
                        }
                        monitorexit(a.b);
                        cpi.e(cpi.e, cpi.d);
                        ++j;
                        continue;
                    }
                }
                break;
            }
            final cpi[] c4 = this.c;
            for (int k = n; k < 7; ++k) {
                c4[k].d((cph)this);
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void b() {
        final Object b = this.b;
        monitorenter(b);
        try {
            final cpi[] c = this.c;
            for (int i = 0; i < 7; ++i) {
                final cpi cpi = c[i];
                if (!cpi.b.isEmpty()) {
                    cpi.b.clear();
                    cpi.a.f((coz)cpi);
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final boolean c(final String s) {
        final Object b = this.b;
        monitorenter(b);
        try {
            final cpi[] c = this.c;
            boolean b2 = false;
            while (true) {
                for (int i = 0; i < 7; ++i) {
                    final cpi cpi = c[i];
                    final Object d = cpi.d;
                    if (d != null && cpi.c(d) && cpi.c.contains(s)) {
                        final cpi cpi2 = cpi;
                        if (cpi2 != null) {
                            cmr.a();
                            final int a = cpe.a;
                            cpi2.getClass().getSimpleName();
                        }
                        if (cpi2 == null) {
                            b2 = true;
                        }
                        monitorexit(b);
                        return b2;
                    }
                }
                final cpi cpi2 = null;
                continue;
            }
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
