// 
// Decompiled by Procyon v0.6.0
// 

public final class flc implements tec
{
    public final tdz a;
    public asgn b;
    public asgn c;
    private final vbq d;
    private final zki e;
    
    public flc(final vbq d, final zki e, final tdz a) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = this.b().e();
        this.c = this.a().e();
    }
    
    public final asgn a() {
        return this.d.a(this.e.c()).h(gkt.bn(), true).J((asjd)exd.m).ax().e();
    }
    
    public final asgn b() {
        return this.d.a(this.e.c()).h(gkt.bm(), true).J((asjd)exd.n).ax().e();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zkv zkv = (zkv)o;
            this.b = this.b().e();
            this.c = this.a().e();
            array = null;
        }
        else {
            array = new Class[] { zkv.class };
        }
        return array;
    }
}
