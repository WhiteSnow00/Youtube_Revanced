import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxd implements Iterable
{
    final ashh a;
    final int b;
    
    public asxd(final ashh a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        final asxc asxc = new asxc(this.b);
        this.a.aJ((ashj)asxc);
        return (Iterator)asxc;
    }
}
