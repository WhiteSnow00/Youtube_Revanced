// 
// Decompiled by Procyon v0.6.0
// 

public final class anjl
{
    private final anjm a;
    
    public anjl(final anjm a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anjl && this.a.equals(((anjl)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("PostCreationDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
