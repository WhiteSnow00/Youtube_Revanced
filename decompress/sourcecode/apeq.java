// 
// Decompiled by Procyon v0.6.0
// 

public final class apeq implements vdt
{
    public static final vdu a;
    public final aper b;
    
    static {
        a = new apep();
    }
    
    public apeq(final aper b) {
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
        return o instanceof apeq && this.b.equals(((apeq)o).b);
    }
    
    public String getProcessedVideoPath() {
        return this.b.f;
    }
    
    public Integer getProgress() {
        return this.b.e;
    }
    
    public apes getState() {
        apes apes;
        if ((apes = apes.b(this.b.d)) == null) {
            apes = apes.a;
        }
        return apes;
    }
    
    public vdu getType() {
        return apeq.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("UploadClientSideRenderingStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
