import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgv extends aflu
{
    final Iterator a;
    Iterator b;
    final afgz c;
    
    public afgv(final afgz c) {
        this.c = c;
        this.a = (Iterator)c.map.e().k();
        this.b = (Iterator)afid.a;
    }
    
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }
    
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = (Iterator)this.a.next().k();
        }
        return this.b.next();
    }
}
