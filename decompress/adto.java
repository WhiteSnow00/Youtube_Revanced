import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adto
{
    public final afgm a;
    
    public adto() {
    }
    
    public adto(final afgm a) {
        this.a = a;
    }
    
    public static adto a(final afgm afgm) {
        return new adto(afgm);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof adto && agpx.L(this.a, ((adto)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("WatchingStateMetadata{intentCounterMap=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
