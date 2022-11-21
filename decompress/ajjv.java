// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjv
{
    public final vgx a;
    public final ajjz b;
    
    public ajjv(final ajjz b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static aefs a() {
        return new aefs((byte[])null, (byte[])null, (byte[])null, null, (byte[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajjv && this.b.equals(((ajjv)o).b);
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
