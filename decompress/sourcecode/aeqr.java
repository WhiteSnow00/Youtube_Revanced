import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeqr extends aeqh implements aeqf
{
    private final Exception a;
    private final boolean b;
    
    public aeqr(final String s, final aeqf aeqf, final aeri aeri, final boolean b) {
        super(s, (aerr)aeqf, aeri);
        this.a = aeqf.f();
        this.b = b;
    }
    
    public aeqr(final String s, final aeri aeri, final boolean b) {
        super(s, aeqk.a.b(), aeri);
        this.a = (Exception)aeqq.a;
        this.b = b;
    }
    
    public final aerr e(final String s, final aeri aeri, final boolean b) {
        if (b && !this.b) {
            final WeakHashMap a = aesw.a;
        }
        final boolean b2 = true;
        if (b) {
            final boolean b3 = b2;
            if (!this.b) {
                return (aerr)new aeqr(s, (aeqf)this, aeri, b3);
            }
        }
        final boolean b3 = this.b && b2;
        return (aerr)new aeqr(s, (aeqf)this, aeri, b3);
    }
    
    public final Exception f() {
        return this.a;
    }
    
    public final aerr h(final String s, final aeri aeri, final aesv aesv) {
        return this.e(s, aeri, true);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j() {
    }
}
