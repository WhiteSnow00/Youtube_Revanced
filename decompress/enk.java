// 
// Decompiled by Procyon v0.6.0
// 

public final class enk extends env
{
    public enk(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", ahaz, n, 3);
    }
    
    protected final void a() {
        final ema ema = new ema((String)this.d.invoke(null, this.a.a, Boolean.valueOf((boolean)mdx.r.e())));
        synchronized (this.g) {
            final ahaz g = this.g;
            final long a = ema.a;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a2 = eht.a;
            eht.b |= 0x4;
            eht.g = a;
            final ahaz g2 = this.g;
            final long b = ema.b;
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            eht2.c |= 0x400000;
            eht2.T = b;
        }
    }
}
