// 
// Decompiled by Procyon v0.6.0
// 

public final class apeg implements vdt
{
    public static final vdu a;
    private final apeh b;
    
    static {
        a = new apef();
    }
    
    public apeg(final apeh b) {
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
        return o instanceof apeg && this.b.equals(((apeg)o).b);
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
    
    public vdu getType() {
        return apeg.a;
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
