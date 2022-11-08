// 
// Decompiled by Procyon v0.6.0
// 

public final class enj extends enu
{
    public enj(final emj emj, final agza agza, final int n) {
        super(emj, "Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", agza, n, 3);
    }
    
    protected final void a() {
        final elz elz = new elz((String)this.d.invoke(null, this.a.a, Boolean.valueOf((boolean)mcs.r.e())));
        synchronized (this.g) {
            final agza g = this.g;
            final long a = elz.a;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a2 = ehs.a;
            ehs.b |= 0x4;
            ehs.g = a;
            final agza g2 = this.g;
            final long b = elz.b;
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.c |= 0x400000;
            ehs2.T = b;
        }
    }
}
