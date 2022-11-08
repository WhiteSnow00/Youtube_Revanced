// 
// Decompiled by Procyon v0.6.0
// 

final class edh
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ eea d;
    
    public edh(final eea d, final int a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final int n) {
        final eea d = this.d;
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        monitorenter(d);
        try {
            boolean b2;
            if (c != d.b.size()) {
                monitorexit(d);
                b2 = false;
            }
            else {
                final ebs ebs = d.b.get(n);
                if (ebs.d().l()) {
                    monitorexit(d);
                }
                else {
                    final int q = d.q(ebs);
                    final int p = d.p(ebs);
                    monitorexit(d);
                    if ((n >= a || ebs.d().j()) && n <= b) {
                        if (!ebs.r(q, p)) {
                            ebs.g(d.g, q, p);
                            return true;
                        }
                    }
                    else if (bkv.f()) {
                        eea.A(ebs, d.k);
                    }
                    else {
                        d.h.post((Runnable)new cog(d, ebs, 16));
                    }
                }
                b2 = true;
            }
            return b2;
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
}
