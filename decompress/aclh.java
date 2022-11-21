import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aclh extends ackt
{
    public final acla a;
    public final afbk b;
    public final ArrayList d;
    private final aclg e;
    
    public aclh(final acla a, final afbk b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.d = new ArrayList();
        a.qO((ackz)(this.e = new aclg(this)));
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
    
    public final void nf(final acma acma) {
        this.a.nf(acma);
    }
    
    public final void ok(final aclz aclz, int intValue) {
        final acla a = this.a;
        if (tqf.aP(intValue, 0, this.a())) {
            intValue = this.d.get(intValue);
        }
        else {
            intValue = -1;
        }
        a.ok(aclz, intValue);
    }
}
