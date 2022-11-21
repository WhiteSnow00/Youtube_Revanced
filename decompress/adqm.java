// 
// Decompiled by Procyon v0.6.0
// 

final class adqm extends aqvr
{
    final adqn a;
    private final String d;
    private long e;
    private long f;
    private long g;
    
    public adqm(final adqn a, final String d) {
        this.a = a;
        this.d = d;
        this.e = -1L;
    }
    
    private final void A(final aqzv aqzv) {
        final aqzg c = aqzv.c();
        final long c2 = this.a.b.c();
        final long g = this.g;
        double n2;
        if (c != null) {
            final double n = (double)c.e();
            Double.isNaN(n);
            n2 = n / 1048576.0;
        }
        else {
            n2 = 0.0;
        }
        final double n3 = (double)(c2 - g);
        final StringBuilder sb = new StringBuilder("Transferred ");
        sb.append(n2);
        sb.append("MB in ");
        Double.isNaN(n3);
        final double n4 = n3 / 1000.0;
        sb.append(n4);
        sb.append("s (");
        sb.append(n2 * 8.0 / n4);
        sb.append(" MBit/s)");
        tut.g(sb.toString());
    }
    
    public final void a(final aqzv aqzv) {
        final long c = this.a.b.c();
        final long e = this.e;
        double n = Double.NaN;
        final long n2 = 0L;
        if (e != -1L) {
            final aqzg c2 = aqzv.c();
            long e2;
            if (c2 != null) {
                e2 = c2.e();
            }
            else {
                e2 = 0L;
            }
            final long n3 = e2 - this.e;
            if (n3 != 0L) {
                long a;
                if (c2 != null) {
                    a = c2.a();
                }
                else {
                    a = 0L;
                }
                if (a != -1L) {
                    final long f = this.f;
                    final double n4 = (double)n3;
                    final double n5 = (double)(a - e2);
                    Double.isNaN(n5);
                    Double.isNaN(n4);
                    final double n6 = n5 / n4;
                    final double n7 = (double)(c - f);
                    Double.isNaN(n7);
                    n = n6 * n7 / 1000.0;
                }
            }
        }
        if (this.e == -1L) {
            final aqzg c3 = aqzv.c();
            long e3 = n2;
            if (c3 != null) {
                e3 = c3.e();
            }
            this.e = e3;
            this.f = c;
        }
        this.a.s(this.d, aqzv, n);
    }
    
    public final void b(final aqzv aqzv) {
        this.A(aqzv);
    }
    
    public final void c(final aqzv aqzv) {
        this.A(aqzv);
    }
    
    public final void d() {
        this.g = this.a.b.c();
    }
}
