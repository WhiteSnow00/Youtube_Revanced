// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsp
{
    public final vfp a;
    public final aqsq b;
    
    public aqsp(final aqsq b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqsp && this.b.equals((Object)((aqsp)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FocusVisibilityLoggingConfigModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
