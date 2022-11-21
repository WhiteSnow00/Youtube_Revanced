// 
// Decompiled by Procyon v0.6.0
// 

public final class apjg implements vhc
{
    public static final vhd a;
    public final apjh b;
    
    static {
        a = new apjf();
    }
    
    public apjg(final apjh b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new apje(this.b.toBuilder());
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
        return o instanceof apjg && this.b.equals(((apjg)o).b);
    }
    
    public String getProcessedVideoPath() {
        return this.b.f;
    }
    
    public Integer getProgress() {
        return this.b.e;
    }
    
    public apji getState() {
        apji apji;
        if ((apji = apji.b(this.b.d)) == null) {
            apji = apji.a;
        }
        return apji;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apjg.a;
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
