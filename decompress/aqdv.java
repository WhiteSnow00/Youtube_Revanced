// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdv
{
    public final aqed a;
    
    public aqdv(final aqed a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqdv && this.a.equals((Object)((aqdv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("IosDynamicFontSpecModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
