// 
// Decompiled by Procyon v0.6.0
// 

public final class evg implements rsr, eud, euk
{
    private final atjj a;
    private eue b;
    private euj c;
    
    public evg(final atjj a, final atjj atjj, final avt avt, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        avt.o((eud)this);
        ((cca)atjj.a()).p((euk)this);
    }
    
    public final rrv a(final rru rru, final sfh sfh, final sdr sdr) {
        if (qcm.j((Class)eve.class, sfh, sdr)) {
            final eue b = this.b;
            if (b == null) {
                throw new rsq("No elementsRenderingApiFactory set", 54);
            }
            if (this.c == null) {
                throw new rsq("No reelExternalApi set", 55);
            }
            final eum a = b.a();
            if (a instanceof hlo) {
                return (rrv)new eve(a, (rru)this.a.a(), sfh, sdr, (ajkj)sdr.f((Class)scg.class), (sey)sdr.f((Class)scx.class), (hlo)a, this.c, (akve)sfh.d((Class)scv.class));
            }
            throw new rsq("ElementsRenderingApi didn't support page entry state updates", 60);
        }
        else {
            if (!qcm.j((Class)evb.class, sfh, sdr)) {
                throw new rsq("SequenceItemInPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing", 52);
            }
            final eue b2 = this.b;
            if (b2 == null) {
                throw new rsq("No elementsRenderingApiFactory set", 54);
            }
            if (this.c == null) {
                throw new rsq("No reelExternalApi set", 55);
            }
            final eum a2 = b2.a();
            if (a2 instanceof hlo) {
                return (rrv)new evb(a2, rru, sfh, sdr, (ajkj)sdr.f((Class)scg.class), (sez)sdr.f((Class)scy.class), (hlo)a2, this.c);
            }
            throw new rsq("ElementsRenderingApi didn't support page entry state updates", 60);
        }
    }
    
    public final void b(final eue b) {
        this.b = b;
    }
    
    public final void c() {
        this.b = null;
    }
    
    public final void s(final euj c) {
        this.c = c;
    }
    
    public final void t(final eul eul) {
    }
    
    public final void x() {
    }
}
