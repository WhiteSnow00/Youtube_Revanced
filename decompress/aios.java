// 
// Decompiled by Procyon v0.6.0
// 

public final class aios
{
    public final vgx a;
    public final aiot b;
    
    public aios(final aiot b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aios && ((ahcz)this.b).equals(((aios)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ClientVeSpecModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
