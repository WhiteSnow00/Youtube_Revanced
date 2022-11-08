// 
// Decompiled by Procyon v0.6.0
// 

public final class irc implements abnq
{
    public final Object a;
    private final /* synthetic */ int b;
    
    public irc(final aanf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irc(final aeim a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public final asic[] lX(final abns abns) {
        final int b = this.b;
        if (b == 0) {
            return new asic[] { abns.R().am((asix)new iqv(this, 3), (asix)irb.a) };
        }
        if (b != 1) {
            return new asic[] { ((asgt)abns.q().d).B((asjd)aawc.b).R().am((asix)new aaml(this, 10, (byte[])null), (asix)aamk.d) };
        }
        return new asic[] { ((asgt)abns.q().c).am((asix)new ign(this, 18, (byte[])null), (asix)hnn.s) };
    }
}
