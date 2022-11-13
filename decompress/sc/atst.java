// 
// Decompiled by Procyon v0.6.0
// 

public final class atst extends atwe
{
    private final ThreadLocal b;
    
    public atst(final atmd atmd, final atly atly) {
        atmd.getClass();
        atmd plus;
        if (atmd.get((atmb)atsu.a) == null) {
            plus = atmd.plus((atmd)atsu.a);
        }
        else {
            plus = atmd;
        }
        super(plus, atly);
        this.b = new ThreadLocal();
        if (!(atly.getContext().get((atmb)atlz.a) instanceof atqp)) {
            final Object b = atwj.b(atmd, (Object)null);
            atwj.c(atmd, b);
            this.L(atmd, b);
        }
    }
    
    public final void L(final atmd atmd, final Object o) {
        this.b.set(arva.k((Object)atmd, o));
    }
    
    public final boolean M() {
        if (this.b.get() == null) {
            return false;
        }
        this.b.set(null);
        return true;
    }
    
    @Override
    protected final void d(Object c) {
        final atkk atkk = this.b.get();
        final Object o = null;
        if (atkk != null) {
            atwj.c((atmd)atkk.a, atkk.b);
            this.b.set(null);
        }
        final Object n = aumt.n(c, this.e);
        final atly e = this.e;
        final atmd context = e.getContext();
        final Object b = atwj.b(context, (Object)null);
        c = o;
        if (b != atwj.a) {
            c = atqo.c(e, context, b);
        }
        try {
            this.e.resumeWith(n);
            if (c != null && !((atst)c).M()) {
                return;
            }
            atwj.c(context, b);
        }
        finally {
            if (c == null || ((atst)c).M()) {
                atwj.c(context, b);
            }
        }
    }
}
