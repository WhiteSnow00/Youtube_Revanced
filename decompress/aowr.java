// 
// Decompiled by Procyon v0.6.0
// 

public final class aowr
{
    public final vfp a;
    public final aowv b;
    
    public aowr(final aowv b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aowr && this.b.equals((Object)((aowr)o).b);
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
