// 
// Decompiled by Procyon v0.6.0
// 

public final class adem
{
    public Object a;
    public long b;
    public int c;
    
    public final zla a() {
        this.a.getClass();
        return new zla((ajqs)this.a, this.c, this.b);
    }
    
    public final void b(final fon fon) {
        ajdp ajdp;
        if ((ajdp = ajdp.b(((ajqs)this.a).e)) == null) {
            ajdp = ajdp.a;
        }
        final int g = fon.g(ajdp);
        this.c = g;
        this.b = fon.e(g);
    }
    
    public final void c(final ajqs ajqs, final fon fon) {
        final ahaz builder = ((ahbh)ajqs).toBuilder();
        builder.copyOnWrite();
        ajqs.a((ajqs)builder.instance);
        this.a = builder.build();
        this.b(fon);
    }
}
