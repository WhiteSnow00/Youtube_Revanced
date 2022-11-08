// 
// Decompiled by Procyon v0.6.0
// 

public final class aomh implements vdt
{
    public static final vdu a;
    private final aome b;
    
    static {
        a = new aomg();
    }
    
    public aomh(final aome b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aomh && this.b.equals((Object)((aomh)o).b);
    }
    
    public String getText() {
        return this.b.d;
    }
    
    public vdu getType() {
        return aomh.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SuperVodEditableCommentEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
