// 
// Decompiled by Procyon v0.6.0
// 

public final class aoss
{
    private final aost a;
    
    public aoss(final aost a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoss && this.a.equals(((aoss)o).a);
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
