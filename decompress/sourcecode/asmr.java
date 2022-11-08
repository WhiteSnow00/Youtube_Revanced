import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmr implements Iterable
{
    final asgt a;
    final Object b;
    
    public asmr(final asgt a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        final atjh atjh = new atjh(this.b);
        this.a.ar((asgw)atjh);
        return new asmq(atjh);
    }
}
