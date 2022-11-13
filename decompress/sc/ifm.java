// 
// Decompiled by Procyon v0.6.0
// 

public final class ifm extends zte implements tgg
{
    public final tgd a;
    public final atke b;
    public final atke c;
    public final atke d;
    public final lgj e;
    public final lnv f;
    public final aln g;
    private final ztd j;
    
    public ifm(final oby oby, final ttd ttd, final adfq adfq, final ztd j, final acid acid, final tgd a, final atke b, final atke c, final atke d, final aln g, final lgj e, final lnv f, final zuz zuz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(oby, ttd, adfq, j, acid, zuz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public final int a(final String s, final aaeh aaeh) {
        synchronized (this) {
            if (!((idl)this.b.a()).c()) {
                this.j.a(s);
                return 0;
            }
            return super.a(s, aaeh);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zms zms = (zms)o;
            this.f.a();
            ((idm)this.c.a()).a();
            array = null;
        }
        else {
            array = new Class[] { zms.class };
        }
        return array;
    }
}
