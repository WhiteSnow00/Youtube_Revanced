// 
// Decompiled by Procyon v0.6.0
// 

public final class ajep
{
    public final vdo a;
    public final ajet b;
    
    public ajep(final ajet b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    public static aglk a() {
        return new aglk((byte[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajep && this.b.equals(((ajep)o).b);
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
