// 
// Decompiled by Procyon v0.6.0
// 

public final class aowf implements vfu
{
    public static final vfv a;
    private final aowg b;
    
    static {
        a = new aowe();
    }
    
    public aowf(final aowg b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aowd(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aowf && this.b.equals((Object)((aowf)o).b);
    }
    
    public Boolean getAllowAutoScroll() {
        return this.b.d;
    }
    
    public aovz getAutoScrollTrigger() {
        aovz aovz;
        if ((aovz = aovz.b(this.b.g)) == null) {
            aovz = aovz.a;
        }
        return aovz;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aowf.a;
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
