// 
// Decompiled by Procyon v0.6.0
// 

public final class aouo
{
    public final vdo a;
    public final aous b;
    
    public aouo(final aous b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aouo && this.b.equals(((aouo)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TranscriptSegmentDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
