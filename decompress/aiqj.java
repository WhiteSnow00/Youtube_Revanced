// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqj
{
    public final aipe a;
    
    public aiqj(final aipe a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqj && ((ahcz)this.a).equals(((aiqj)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("CreatorDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
