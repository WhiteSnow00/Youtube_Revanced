// 
// Decompiled by Procyon v0.6.0
// 

public final class aolm
{
    public final aoln a;
    
    public aolm(final aoln a) {
        this.a = a;
    }
    
    public static final afft a() {
        return new affr().g();
    }
    
    public static aeea b(final aoln aoln) {
        return new aeea(aoln.toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aolm && this.a.equals((Object)((aolm)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("StreamProgressModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
