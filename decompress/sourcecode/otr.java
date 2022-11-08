// 
// Decompiled by Procyon v0.6.0
// 

public final class otr
{
    public final int a;
    public final float b;
    public final float c;
    public final boolean d;
    
    public otr() {
    }
    
    public otr(final int a, final float b, final float c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static otq a() {
        final otq otq = new otq();
        otq.a = 4;
        otq.c |= 0x1;
        otq.b(0.45f);
        otq.b = 0.5f;
        otq.c |= 0xC;
        otq.c(false);
        otq.c |= 0x20;
        return otq;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof otr) {
            final otr otr = (otr)o;
            if (this.a == otr.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(otr.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(otr.c) && this.d == otr.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int floatToIntBits = Float.floatToIntBits(this.b);
        final int floatToIntBits2 = Float.floatToIntBits(this.c);
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((((a ^ 0xF4243) * 1000003 ^ floatToIntBits) * 1000003 ^ floatToIntBits2) * 1000003 ^ 0x4D5) * 1525764945 ^ n) * 1000003 ^ 0x4D5;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final float b = this.b;
        final float c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder("RecyclerConfig{initRangeSize=");
        sb.append(a);
        sb.append(", collectionRangeRatio=");
        sb.append(b);
        sb.append(", binderRangeRatio=");
        sb.append(c);
        sb.append(", recyclerViewItemPrefetch=false, layoutHandlerFactory=null, changeSetExecutor=null, layoutInfo=null, useLegacyVisible=");
        sb.append(d);
        sb.append(", cleanupOnDetach=false}");
        return sb.toString();
    }
}
