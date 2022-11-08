// 
// Decompiled by Procyon v0.6.0
// 

public final class aoum implements vdt
{
    public static final vdu a;
    private final aoun b;
    
    static {
        a = new aoul();
    }
    
    public aoum(final aoun b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoum && this.b.equals(((aoum)o).b);
    }
    
    public Boolean getHighlighted() {
        return this.b.d;
    }
    
    public vdu getType() {
        return aoum.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TranscriptSegmentEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
