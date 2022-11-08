// 
// Decompiled by Procyon v0.6.0
// 

public final class fkx implements tec
{
    public final tdz a;
    public final tlq b;
    public final fmg c;
    public final asib d;
    private final zki e;
    private final alm f;
    
    public fkx(final tdz a, final tlq b, final alm f, final zki e, final fmg c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = new asib();
        this.a = a;
        this.b = b;
        this.f = f;
        this.e = e;
        this.c = c;
    }
    
    public final void a() {
        this.d.c(this.f.E(this.e.c().b()).p().al((asix)new fcs(this, 13)));
        this.d.c(this.f.D().p().al((asix)new fcs(this, 14)));
        this.d.c(((tks)((atjj)this.f.c).a()).b.L((asjc)new fdc(this.e.c().b(), 15)).p().al((asix)new fcs(this, 12)));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zkx zkx = (zkx)o;
                final aejr q = this.b.q(5);
                q.e(tlq.w, false);
                q.e(tlq.y, false);
                q.e(tlq.x, false);
                q.e(tlq.z, false);
                q.c(tlq.at, 0L);
                q.b();
                this.d.b();
            }
            else {
                final zkv zkv = (zkv)o;
                this.a();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
