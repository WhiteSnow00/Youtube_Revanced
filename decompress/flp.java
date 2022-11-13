// 
// Decompiled by Procyon v0.6.0
// 

public final class flp implements asjr
{
    public final int a;
    private final int b;
    
    public flp(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final int b = this.b;
        boolean b2 = false;
        if (b == 0) {
            final int a = this.a;
            final afeq afeq = (afeq)o;
            final int size = afeq.size();
            afeq b3 = afeq;
            if (a != -1) {
                b3 = afeq.b(0, Math.min(a, afeq.size()));
            }
            return flm.a(size, b3);
        }
        if (b == 1) {
            return ezx.f(this.a, ((ezv)o).a());
        }
        if (b == 2) {
            final int a2 = this.a;
            final afft afft = (afft)o;
            final int e = ikx.e;
            return a2 - afft.size();
        }
        if (b == 3) {
            if ((int)o == this.a) {
                b2 = true;
            }
            return b2;
        }
        if (b != 4) {
            return (int)o - this.a;
        }
        return tpe.cT((long)o, this.a);
    }
}
