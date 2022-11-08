// 
// Decompiled by Procyon v0.6.0
// 

public final class imi implements tec
{
    public final aaam a;
    public final tdz b;
    public final vcf c;
    public final zki d;
    public final afqr e;
    public final alm f;
    private final asho g;
    private aexq h;
    
    public imi(final alm f, final aaam a, final tdz b, final vcf c, final zki d, final asho g, final afqr e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = aewp.a;
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final void a() {
        if (this.h.h()) {
            ((asic)this.h.c()).dispose();
            this.h = aewp.a;
        }
    }
    
    public final void b() {
        this.h = aexq.k((Object)this.f.E(this.d.c().b()).P(this.g).R().p().ay().al((asix)new ign(this, 7)));
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
                this.a();
            }
            else {
                final zkv zkv = (zkv)o;
                this.a();
                this.b();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
