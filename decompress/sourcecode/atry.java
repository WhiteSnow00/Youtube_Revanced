// 
// Decompiled by Procyon v0.6.0
// 

public final class atry extends atvh
{
    private final ThreadLocal b;
    
    public atry(final atli atli, final atld atld) {
        atli.getClass();
        atli plus;
        if (atli.get((atlg)atrz.a) == null) {
            plus = atli.plus((atli)atrz.a);
        }
        else {
            plus = atli;
        }
        super(plus, atld);
        this.b = new ThreadLocal();
        if (!(atld.getContext().get(atle.a) instanceof atpu)) {
            final Object b = atvm.b(atli, (Object)null);
            atvm.c(atli, b);
            this.L(atli, b);
        }
    }
    
    public final void L(final atli atli, final Object o) {
        this.b.set(aqql.t((Object)atli, o));
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
        final atjp atjp = this.b.get();
        final Object o = null;
        if (atjp != null) {
            atvm.c((atli)atjp.a, atjp.b);
            this.b.set(null);
        }
        final Object k = aulo.k(c, this.e);
        final atld e = this.e;
        final atli context = e.getContext();
        final Object b = atvm.b(context, (Object)null);
        c = o;
        if (b != atvm.a) {
            c = atpt.c(e, context, b);
        }
        try {
            this.e.resumeWith(k);
            if (c != null && !((atry)c).M()) {
                return;
            }
            atvm.c(context, b);
        }
        finally {
            if (c == null || ((atry)c).M()) {
                atvm.c(context, b);
            }
        }
    }
}
