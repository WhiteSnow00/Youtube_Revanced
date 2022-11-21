// 
// Decompiled by Procyon v0.6.0
// 

public final class aiql
{
    public final vgx a;
    public final aipg b;
    
    public aiql(final aipg b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiql && ((ahcz)this.b).equals(((aiql)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CreatorMusicDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
