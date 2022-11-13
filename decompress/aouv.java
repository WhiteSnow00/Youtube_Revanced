// 
// Decompiled by Procyon v0.6.0
// 

public final class aouv
{
    private final aouw a;
    
    public aouv(final aouw a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aouv && this.a.equals((Object)((aouv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("TimestampModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
