// 
// Decompiled by Procyon v0.6.0
// 

public final class aqql
{
    private final aqqm a;
    
    public aqql(final aqqm a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqql && this.a.equals(((aqql)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MentionRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
