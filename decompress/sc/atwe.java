// 
// Decompiled by Procyon v0.6.0
// 

public class atwe extends atpr implements atml
{
    public final atly e;
    
    public atwe(final atmd atmd, final atly e) {
        atmd.getClass();
        super(atmd);
        this.e = e;
    }
    
    @Override
    protected void d(final Object o) {
        final atly e = this.e;
        e.resumeWith(aumt.n(o, e));
    }
    
    public final atml getCallerFrame() {
        final atly e = this.e;
        if (e instanceof atml) {
            return (atml)e;
        }
        return null;
    }
    
    public final StackTraceElement getStackTraceElement() {
        return null;
    }
    
    protected final boolean l() {
        return true;
    }
    
    protected void tO(final Object o) {
        atvn.a(auac.d(this.e), aumt.n(o, this.e));
    }
}
