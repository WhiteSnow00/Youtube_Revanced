import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acju extends acjg
{
    public final acjn a;
    public final aezs b;
    public final ArrayList d;
    private final acjt e;
    
    public acju(final acjn a, final aezs b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.d = new ArrayList();
        a.qP((acjm)(this.e = new acjt(this)));
    }
    
    public final int a() {
        return this.d.size();
    }
    
    public final long b(final int n) {
        return n;
    }
    
    public final Object c(final int n) {
        return this.a.c(this.d.get(n));
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }
    
    public final void ni(final ackn ackn) {
        this.a.ni(ackn);
    }
    
    public final void oo(final ackm ackm, int intValue) {
        final acjn a = this.a;
        if (tpe.aP(intValue, 0, this.a())) {
            intValue = this.d.get(intValue);
        }
        else {
            intValue = -1;
        }
        a.oo(ackm, intValue);
    }
}
