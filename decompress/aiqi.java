// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqi
{
    public final aipz a;
    
    public aiqi(final aipz a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqi && this.a.equals(((aiqi)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ComponentPayloadModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
