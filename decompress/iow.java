// 
// Decompiled by Procyon v0.6.0
// 

public final class iow implements fmd
{
    public final Object a;
    private final int b;
    
    public iow(final iou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iow(final iox a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final zyo zyo) {
        if (this.b != 0) {
            final iou iou = (iou)this.a;
            if (!aezr.f(iou.s) && iou.s.equals(zyo.a.a())) {
                iou.b();
            }
            return;
        }
        final iox iox = (iox)this.a;
        iox.e.d().J((asjr)new iov(iox, zyo, 0)).aa((asjm)new ihl(iox, 7));
    }
}
