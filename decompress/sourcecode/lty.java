// 
// Decompiled by Procyon v0.6.0
// 

final class lty
{
    public final lua a;
    public final lwg b;
    public int c;
    public long d;
    private final nsa e;
    
    public lty() {
        this.a = new lua();
        this.b = new lwg(282);
        this.e = new nsa();
        this.c = -1;
    }
    
    public final boolean a(final lsh lsh, final lwg lwg) {
        jfi.U(true);
        int n2;
        for (int i = 0; i == 0; i = n2) {
            int c;
            if ((c = this.c) < 0) {
                if (!lub.b(lsh, this.a, this.b, true)) {
                    return false;
                }
                final lua a = this.a;
                int d = a.d;
                if ((a.a & 0x1) == 0x1 && lwg.b == 0) {
                    lub.d(a, 0, this.e);
                    final nsa e = this.e;
                    c = e.b;
                    d += e.a;
                }
                else {
                    c = 0;
                }
                lsh.i(d);
                this.c = c;
            }
            lub.d(this.a, c, this.e);
            final int c2 = this.c;
            final nsa e2 = this.e;
            final int n = c2 + e2.b;
            final int a2 = e2.a;
            n2 = i;
            if (a2 > 0) {
                lsh.g((byte[])lwg.c, lwg.b, a2);
                lwg.w(lwg.b + this.e.a);
                if (((int[])this.a.f)[n - 1] != 255) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
            }
            int c3;
            if ((c3 = n) == this.a.c) {
                c3 = -1;
            }
            this.c = c3;
        }
        return true;
    }
}
