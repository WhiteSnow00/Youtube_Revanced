import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekf extends ekg
{
    public ekf() {
        this.a.add(ekr.e);
        this.a.add(ekr.f);
        this.a.add(ekr.g);
        this.a.add(ekr.h);
        this.a.add(ekr.i);
        this.a.add(ekr.j);
        this.a.add(ekr.k);
    }
    
    public final eka a(final String s, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        switch (epf.r(s).ordinal()) {
            default: {
                return super.b(s);
            }
            case 10: {
                epf.u(ekr.k, 2, list);
                return (eka)new ejt((double)(epf.p((double)hyx.w(list.get(0)).h()) ^ epf.p((double)hyx.w(list.get(1)).h())));
            }
            case 9: {
                epf.u(ekr.j, 2, list);
                return (eka)new ejt(Double.valueOf(epf.q((double)hyx.w(list.get(0)).h()) >>> (int)(epf.q((double)hyx.w(list.get(1)).h()) & 0x1FL)));
            }
            case 8: {
                epf.u(ekr.i, 2, list);
                return (eka)new ejt((double)(epf.p((double)hyx.w(list.get(0)).h()) >> (int)(epf.q((double)hyx.w(list.get(1)).h()) & 0x1FL)));
            }
            case 7: {
                epf.u(ekr.h, 2, list);
                return (eka)new ejt((double)(epf.p((double)hyx.w(list.get(0)).h()) | epf.p((double)hyx.w(list.get(1)).h())));
            }
            case 6: {
                epf.u(ekr.g, 1, list);
                return (eka)new ejt((double)~epf.p((double)hyx.w(list.get(0)).h()));
            }
            case 5: {
                epf.u(ekr.f, 2, list);
                return (eka)new ejt((double)(epf.p((double)hyx.w(list.get(0)).h()) << (int)(epf.q((double)hyx.w(list.get(1)).h()) & 0x1FL)));
            }
            case 4: {
                epf.u(ekr.e, 2, list);
                return (eka)new ejt((double)(epf.p((double)hyx.w(list.get(0)).h()) & epf.p((double)hyx.w(list.get(1)).h())));
            }
        }
    }
}
