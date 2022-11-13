import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpe implements cpd, cpi
{
    public final cpc a;
    public final Object b;
    private final cpj[] c;
    
    public cpe(final des des, final cpc a, final byte[] array) {
        final cpg cpg = new cpg((cpw)des.b);
        final cph cph = new cph((cpr)des.c);
        final cpo cpo = new cpo((cpw)des.a);
        final cpk cpk = new cpk((cpw)des.d);
        final cpn cpn = new cpn((cpw)des.d);
        final cpm cpm = new cpm((cpw)des.d);
        final cpl cpl = new cpl((cpw)des.d);
        this.a = a;
        this.c = new cpj[] { cpg, cph, cpo, cpk, cpn, cpm, cpl };
        this.b = new Object();
    }
    
    @Override
    public final void a(final Iterable iterable) {
        iterable.getClass();
        final Object b = this.b;
        monitorenter(b);
        try {
            final cpj[] c = this.c;
            final int n = 0;
            for (int i = 0; i < 7; ++i) {
                c[i].d(null);
            }
            final cpj[] c2 = this.c;
            int j = 0;
            while (j < 7) {
                final cpj cpj = c2[j];
                cpj.b.clear();
                cpj.c.clear();
                final List b2 = cpj.b;
                for (final Object next : iterable) {
                    if (cpj.b((crh)next)) {
                        b2.add(next);
                    }
                }
                final List b3 = cpj.b;
                final List c3 = cpj.c;
                final Iterator iterator2 = b3.iterator();
                while (iterator2.hasNext()) {
                    c3.add(((crh)iterator2.next()).c);
                }
                Label_0351: {
                    if (cpj.b.isEmpty()) {
                        cpj.a.f(cpj);
                        break Label_0351;
                    }
                    final cpw a = cpj.a;
                    synchronized (a.b) {
                        if (a.c.add(cpj)) {
                            if (a.c.size() == 1) {
                                a.d = a.b();
                                cms.a();
                                final int a2 = cpx.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(a.getClass().getSimpleName());
                                sb.append(": initial state = ");
                                sb.append(a.d);
                                a.d();
                            }
                            cpj.a(a.d);
                        }
                        monitorexit(a.b);
                        cpj.e(cpj.e, cpj.d);
                        ++j;
                        continue;
                    }
                }
                break;
            }
            final cpj[] c4 = this.c;
            for (int k = n; k < 7; ++k) {
                c4[k].d(this);
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        final Object b = this.b;
        monitorenter(b);
        try {
            final cpj[] c = this.c;
            for (int i = 0; i < 7; ++i) {
                final cpj cpj = c[i];
                if (!cpj.b.isEmpty()) {
                    cpj.b.clear();
                    cpj.a.f(cpj);
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
            final cpj[] c = this.c;
            boolean b2 = false;
            while (true) {
                for (int i = 0; i < 7; ++i) {
                    final cpj cpj = c[i];
                    final Object d = cpj.d;
                    if (d != null && cpj.c(d) && cpj.c.contains(s)) {
                        final cpj cpj2 = cpj;
                        if (cpj2 != null) {
                            cms.a();
                            final int a = cpf.a;
                            cpj2.getClass().getSimpleName();
                        }
                        if (cpj2 == null) {
                            b2 = true;
                        }
                        monitorexit(b);
                        return b2;
                    }
                }
                final cpj cpj2 = null;
                continue;
            }
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
