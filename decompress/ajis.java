// 
// Decompiled by Procyon v0.6.0
// 

public final class ajis
{
    public final vgx a;
    public final ajiw b;
    
    public ajis(final ajiw b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static agpd a() {
        return new agpd((short[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajis && this.b.equals(((ajis)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CollageThumbnailModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
