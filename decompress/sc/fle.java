// 
// Decompiled by Procyon v0.6.0
// 

public final class fle implements tgg
{
    public final tgd a;
    public final tnu b;
    public final fmm c;
    public final asiq d;
    private final zmf e;
    private final aln f;
    
    public fle(final tgd a, final tnu b, final aln f, final zmf e, final fmm c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = new asiq();
        this.a = a;
        this.b = b;
        this.f = f;
        this.e = e;
        this.c = c;
    }
    
    public final void a() {
        this.d.c(this.f.E(this.e.c().b()).p().am((asjm)new fcx(this, 13)));
        this.d.c(this.f.D().p().am((asjm)new fcx(this, 14)));
        this.d.c(((tmv)((atke)this.f.c).a()).b.L((asjr)new fdg(this.e.c().b(), 16)).p().am((asjm)new fcx(this, 12)));
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
                final zmu zmu = (zmu)o;
                final aels q = this.b.q(5);
                q.e(tnu.w, false);
                q.e(tnu.y, false);
                q.e(tnu.x, false);
                q.e(tnu.z, false);
                q.c(tnu.au, 0L);
                q.b();
                this.d.b();
            }
            else {
                final zms zms = (zms)o;
                this.a();
            }
        }
        else {
            array = new Class[] { zms.class, zmu.class };
        }
        return array;
    }
}
