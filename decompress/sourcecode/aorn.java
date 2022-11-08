// 
// Decompiled by Procyon v0.6.0
// 

public final class aorn
{
    public final aorj a;
    
    public aorn(final aorj a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aorn && this.a.equals(((aorn)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("LowResThumbnailModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
