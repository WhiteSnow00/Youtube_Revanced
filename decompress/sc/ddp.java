import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddp implements ddk
{
    private final abh b;
    
    public ddp() {
        this.b = (abh)new dov();
    }
    
    public final void a(final MessageDigest messageDigest) {
        int n = 0;
        while (true) {
            final abh b = this.b;
            if (n >= ((abo)b).d) {
                break;
            }
            final ddo ddo = (ddo)((abo)b).c(n);
            final Object f = ((abo)this.b).f(n);
            final ddn b2 = ddo.b;
            if (ddo.d == null) {
                ddo.d = ddo.c.getBytes(ddk.a);
            }
            b2.a(ddo.d, f, messageDigest);
            ++n;
        }
    }
    
    public final Object b(final ddo ddo) {
        Object o;
        if (((abo)this.b).containsKey(ddo)) {
            o = ((abo)this.b).get(ddo);
        }
        else {
            o = ddo.a;
        }
        return o;
    }
    
    public final void c(final ddp ddp) {
        ((abo)this.b).h((abo)ddp.b);
    }
    
    public final void d(final ddo ddo, final Object o) {
        ((abo)this.b).put(ddo, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ddp && ((abo)this.b).equals(((ddp)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((abo)this.b).hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("Options{values=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
