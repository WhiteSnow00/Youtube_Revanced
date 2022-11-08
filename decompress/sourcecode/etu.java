// 
// Decompiled by Procyon v0.6.0
// 

public final class etu implements rsr
{
    public ets a;
    private final atjj b;
    
    public etu(final atjj b) {
        b.getClass();
        this.b = b;
    }
    
    public final rrv a(final rru rru, final sfh sfh, final sdr sdr) {
        if (sfh.c() != ahnh.h) {
            throw new rsq("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported slot", 51);
        }
        if (!qcm.j((Class)ett.class, sfh, sdr)) {
            throw new rsq("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported metadata", 52);
        }
        final ets a = this.a;
        if (a != null) {
            return (rrv)new ett(a, (rru)this.b.a(), sfh, sdr);
        }
        throw new rsq("FullscreenEngagementLayoutRenderingAdapterFactory has no controller registered yet.", 53);
    }
}
