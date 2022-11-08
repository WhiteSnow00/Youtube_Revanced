// 
// Decompiled by Procyon v0.6.0
// 

public final class aosm
{
    private final aosn a;
    
    public aosm(final aosn a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aosm && this.a.equals(((aosm)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("TimedSyncDataItemModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
