import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afez extends affc
{
    final Iterable a;
    
    public afez(final Iterable iterable, final Iterable a) {
        this.a = a;
        super(iterable);
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
