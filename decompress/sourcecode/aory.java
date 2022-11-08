// 
// Decompiled by Procyon v0.6.0
// 

public final class aory
{
    public final vdo a;
    public final aorz b;
    
    public aory(final aorz b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aory && this.b.equals(((aory)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TimedListDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
