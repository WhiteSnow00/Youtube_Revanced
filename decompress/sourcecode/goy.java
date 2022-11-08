import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class goy implements adap
{
    final /* synthetic */ anua a;
    final /* synthetic */ Map b;
    final /* synthetic */ goz c;
    
    public goy(final goz c, final anua a, final Map b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        final goz c = this.c;
        final anua a = this.a;
        final boolean b = (a.b & 0x80) != 0x0;
        aioe aioe;
        if ((aioe = a.j) == null) {
            aioe = aioe.a;
        }
        c.b(b, aioe, this.b);
    }
    
    @Override
    public final void c() {
        this.c.b.execute(new gox(this, this.a, this.b, 0));
    }
}
