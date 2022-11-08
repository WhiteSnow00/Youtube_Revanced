// 
// Decompiled by Procyon v0.6.0
// 

public final class imj implements tec
{
    public final vbq a;
    public final vcf b;
    public final tcf c;
    public final uyi d;
    
    public imj(final vbq a, final vcf b, final uyi d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = new tcf();
        this.b();
    }
    
    public final aexq a() {
        try {
            this.c.acquire();
            this.c.release();
            return aexq.j((Object)this.a.b().f(gkt.bc()).j((Class)alwp.class).af());
        }
        catch (final InterruptedException ex) {
            return aewp.a;
        }
    }
    
    public final void b() {
        this.a.b().h(gkt.bn(), true).J((asjd)iie.k).ax().e().r((asix)hnn.p).D().V((asir)new erx(this.c, 19));
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
                this.c.a();
            }
            else {
                final zkv zkv = (zkv)o;
                this.b();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
