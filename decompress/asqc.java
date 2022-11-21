import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asqc implements Iterable
{
    final aske a;
    final Object b;
    
    public asqc(final aske a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        final atmz atmz = new atmz(this.b);
        this.a.as((askh)atmz);
        return new asqb(atmz);
    }
}
