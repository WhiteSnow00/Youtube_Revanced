// 
// Decompiled by Procyon v0.6.0
// 

public final class isa implements abps
{
    public final Object a;
    private final int b;
    
    public isa(final aanx a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public isa(final aapa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        final int b = this.b;
        if (b == 0) {
            return new asir[] { abpu.Q().an((asjm)new irw(this, 2), (asjm)ise.b) };
        }
        if (b != 1) {
            return new asir[] { ((ashi)abpu.p().d).B((asjs)aada.d).R().an((asjm)new aaoe(this, 15, null), (asjm)aaof.d) };
        }
        return new asir[] { ((ashi)abpu.p().c).an((asjm)new ihl(this, 17, (byte[])null), (asjm)hot.r) };
    }
}
