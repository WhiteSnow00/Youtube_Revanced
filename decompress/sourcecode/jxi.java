// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jxi
{
    public static jxi e(final aexq aexq, final aexq aexq2, final aexq aexq3, final aexq aexq4) {
        return (jxi)new jxf(aexq, aexq2, aexq3, aexq4);
    }
    
    public abstract aexq a();
    
    public abstract aexq b();
    
    public abstract aexq c();
    
    public abstract aexq d();
    
    public boolean f() {
        return this.a().h() || this.b().h();
    }
    
    @Override
    public final String toString() {
        return String.format("{previousSelectedIndex=%s, currentSelectedIndex=%s, previousSelectedLayerableFilterFormData=%s currentSelectedLayerableFilterFormData=%s}", this.d(), this.a(), this.c(), this.b());
    }
}
