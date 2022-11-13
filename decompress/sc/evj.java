// 
// Decompiled by Procyon v0.6.0
// 

public final class evj implements ruw, eug, eun
{
    private final atke a;
    private euh b;
    private eum c;
    
    public evj(final atke a, final atke atke, final avu avu, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        avu.o((eug)this);
        ((ccb)atke.a()).p((eun)this);
    }
    
    public final rua a(final rtz rtz, final shm shm, final sfw sfw) {
        if (qdt.r((Class)evh.class, shm, sfw)) {
            final euh b = this.b;
            if (b == null) {
                throw new ruv("No elementsRenderingApiFactory set", 54);
            }
            if (this.c == null) {
                throw new ruv("No reelExternalApi set", 55);
            }
            final eup a = b.a();
            if (a instanceof hmk) {
                return (rua)new evh(a, (rtz)this.a.a(), shm, sfw, (ajmo)sfw.f((Class)sel.class), (shd)sfw.f((Class)sfc.class), (hmk)a, this.c, (akxi)shm.d((Class)sfa.class));
            }
            throw new ruv("ElementsRenderingApi didn't support page entry state updates", 60);
        }
        else {
            if (!qdt.r((Class)eve.class, shm, sfw)) {
                throw new ruv("SequenceItemInPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing", 52);
            }
            final euh b2 = this.b;
            if (b2 == null) {
                throw new ruv("No elementsRenderingApiFactory set", 54);
            }
            if (this.c == null) {
                throw new ruv("No reelExternalApi set", 55);
            }
            final eup a2 = b2.a();
            if (a2 instanceof hmk) {
                return (rua)new eve(a2, rtz, shm, sfw, (ajmo)sfw.f((Class)sel.class), (she)sfw.f((Class)sfd.class), (hmk)a2, this.c);
            }
            throw new ruv("ElementsRenderingApi didn't support page entry state updates", 60);
        }
    }
    
    public final void b(final euh b) {
        this.b = b;
    }
    
    public final void c() {
        this.b = null;
    }
    
    public final void s(final eum c) {
        this.c = c;
    }
    
    public final void t(final euo euo) {
    }
    
    public final void x() {
    }
}
