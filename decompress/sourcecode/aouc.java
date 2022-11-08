// 
// Decompiled by Procyon v0.6.0
// 

public final class aouc implements vdt
{
    public static final vdu a;
    private final aoud b;
    
    static {
        a = new aoub();
    }
    
    public aouc(final aoud b) {
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
        return o instanceof aouc && this.b.equals(((aouc)o).b);
    }
    
    public Boolean getAllowAutoScroll() {
        return this.b.d;
    }
    
    public aotw getAutoScrollTrigger() {
        aotw aotw;
        if ((aotw = aotw.b(this.b.g)) == null) {
            aotw = aotw.a;
        }
        return aotw;
    }
    
    public vdu getType() {
        return aouc.a;
    }
    
    public Integer getUserScrollCounter() {
        return this.b.e;
    }
    
    public Boolean getUserScrollInProgress() {
        return this.b.f;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TranscriptScrollStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
