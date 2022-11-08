// 
// Decompiled by Procyon v0.6.0
// 

public final class adck
{
    public Object a;
    public long b;
    public int c;
    
    public final zjd a() {
        this.a.getClass();
        return new zjd((ajon)this.a, this.c, this.b);
    }
    
    public final void b(final foi foi) {
        ajbl ajbl;
        if ((ajbl = ajbl.b(((ajon)this.a).e)) == null) {
            ajbl = ajbl.a;
        }
        final int g = foi.g(ajbl);
        this.c = g;
        this.b = foi.e(g);
    }
    
    public final void c(final ajon ajon, final foi foi) {
        final agza builder = ajon.toBuilder();
        builder.copyOnWrite();
        ajon.a((ajon)builder.instance);
        this.a = builder.build();
        this.b(foi);
    }
}
