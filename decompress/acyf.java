import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyf implements acyc
{
    public final acyg a;
    public final acxx b;
    
    public acyf(final acyg a, final acxx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final int n) {
        final acyg a = this.a;
        final acxx b = this.b;
        a.d.e();
        final acxb o = b.o;
        if (o != null) {
            o.a(b, n);
        }
        a.c.a();
        final Iterator iterator = a.b.iterator();
        while (iterator.hasNext()) {
            ((acxb)iterator.next()).a(b, n);
        }
    }
}
