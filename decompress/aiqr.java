// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqr
{
    private final aiqb a;
    
    public aiqr(final aiqb a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqr && this.a.equals(((aiqr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("NotificationMetadataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
