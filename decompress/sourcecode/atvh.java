// 
// Decompiled by Procyon v0.6.0
// 

public class atvh extends atow implements atlq
{
    public final atld e;
    
    public atvh(final atli atli, final atld e) {
        atli.getClass();
        super(atli);
        this.e = e;
    }
    
    @Override
    protected void d(final Object o) {
        final atld e = this.e;
        e.resumeWith(aulo.k(o, e));
    }
    
    @Override
    public final atlq getCallerFrame() {
        final atld e = this.e;
        if (e instanceof atlq) {
            return (atlq)e;
        }
        return null;
    }
    
    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }
    
    protected final boolean l() {
        return true;
    }
    
    protected void tL(final Object o) {
        atuq.a(atza.e(this.e), aulo.k(o, this.e));
    }
}
