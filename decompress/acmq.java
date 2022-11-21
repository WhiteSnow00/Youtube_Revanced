// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acmq implements acmb
{
    public arzb w;
    
    protected abstract byte[] d(final Object p0);
    
    protected abstract void lR(final aclz p0, final Object p1);
    
    protected boolean lS() {
        final arzb w = this.w;
        if (w == null) {
            return false;
        }
        alxy alxy;
        if ((alxy = w.f().m) == null) {
            alxy = alxy.a;
        }
        alkv alkv;
        if ((alkv = alxy.d) == null) {
            alkv = alkv.a;
        }
        return alkv.i;
    }
    
    @Override
    public final void mK(final aclz aclz, final Object o) {
        final byte[] d = this.d(o);
        if (d != null && d.length > 0) {
            final wzy wzy = new wzy(d);
            if (this.lS()) {
                this.a().setTag(2131432390, (Object)new wzx((xbe)wzy, this.pW()));
            }
            else {
                aclz.a.t((xbe)wzy, (alji)null);
            }
        }
        this.lR(aclz, o);
    }
    
    protected boolean pW() {
        return false;
    }
}
