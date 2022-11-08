// 
// Decompiled by Procyon v0.6.0
// 

public final class agys
{
    private final Object a;
    private final int b;
    
    public agys(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof agys)) {
            return false;
        }
        final agys agys = (agys)o;
        return this.a == agys.a && this.b == agys.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}
