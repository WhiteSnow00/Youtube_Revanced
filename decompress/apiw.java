// 
// Decompiled by Procyon v0.6.0
// 

public final class apiw implements vhc
{
    public static final vhd a;
    private final apix b;
    
    static {
        a = new apiv();
    }
    
    public apiw(final apix b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new apiu(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apiw && this.b.equals(((apiw)o).b);
    }
    
    public String getDeletedStatusMessage() {
        return this.b.d;
    }
    
    public String getHideOriginalContentMessage() {
        return this.b.g;
    }
    
    public Boolean getShouldShowOriginalContent() {
        return this.b.f;
    }
    
    public String getShowOriginalContentMessage() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apiw.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("UpdateLiveChatItemEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
