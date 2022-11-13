import j$.util.Optional;
import com.google.android.apps.youtube.app.ui.inline.spotlight.DefaultSpotlightModeControlsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivs implements trk
{
    public final Object a;
    private final int b;
    
    public ivs(final abbk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final abgy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final iuv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final ivi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final ivw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final iyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final jbb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final jbt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final kcn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final lfo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivs(final uvh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final int n, final toz toz) {
        final int b = this.b;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        final Boolean value = true;
        switch (b) {
            default: {
                final Object a = this.a;
                if (n == 2) {
                    ((abgy)a).b();
                    return;
                }
                break;
            }
            case 9: {
                ((abbk)this.a).oy(n);
                return;
            }
            case 8: {
                final uvh uvh = (uvh)this.a;
                if (uvh.e.cU()) {
                    if (n == 0) {
                        if (!uvh.K()) {
                            uvh.I(4);
                        }
                    }
                    else if (n == 2 && uvh.u()) {
                        uvh.I(2);
                    }
                }
                else if (n == 0) {
                    uvh.K();
                }
                return;
            }
            case 7: {
                if (n != 2 && n != 0) {
                    return;
                }
                toz.i((trk)this);
                final lfo lfo = (lfo)this.a;
                lfo.f(lfo.g, false, (trj)null);
                return;
            }
            case 6: {
                final Object a2 = this.a;
                if (n == 2) {
                    final kcn kcn = (kcn)a2;
                    kcn.x.tu((Object)value);
                    final DefaultSpotlightModeControlsController defaultSpotlightModeControlsController = (DefaultSpotlightModeControlsController)kcn.l;
                    defaultSpotlightModeControlsController.f.z(defaultSpotlightModeControlsController.i, Optional.empty());
                    defaultSpotlightModeControlsController.m.b(true);
                    return;
                }
                if (n == 0) {
                    ((kcn)a2).x.tu((Object)false);
                }
                return;
            }
            case 5: {
                final Object a3 = this.a;
                int n2 = n;
                if (n == 2) {
                    final jbt jbt = (jbt)a3;
                    final ajvv h = jbt.h;
                    if (h != null) {
                        jbt.a.t((wzz)new wyt(h.d.I()), (alhi)null);
                        jbt.a.t((wzz)new wyt(xaa.c(51992)), (alhi)null);
                    }
                    n2 = 2;
                }
                final jbt jbt2 = (jbt)a3;
                jbt2.c(n2, jbt2.c);
                return;
            }
            case 4: {
                final jbb jbb = (jbb)this.a;
                final atjm i = jbb.c.i;
                if (n != 0) {
                    b4 = true;
                }
                i.tu((Object)b4);
                if (n == 2) {
                    jbb.d.l((wzz)jbb.a);
                    return;
                }
                if (n == 0) {
                    jbb.d.o((wzz)jbb.a, (alhi)null);
                }
                return;
            }
            case 3: {
                final Object a4 = this.a;
                boolean b5 = b2;
                if (n != 0) {
                    b5 = true;
                }
                ((iuv)a4).h(b5);
                return;
            }
            case 2: {
                final Object a5 = this.a;
                if (n != 2 && n != 1) {
                    return;
                }
                ((iyb)a5).i.tu((Object)value);
                return;
            }
            case 1: {
                final iuv f = ((ivi)this.a).f;
                boolean b6 = b3;
                if (n != 0) {
                    b6 = true;
                }
                f.h(b6);
                return;
            }
            case 0: {
                final ivw ivw = (ivw)this.a;
                final ivu c = ivw.c;
                if (c == null) {
                    break;
                }
                if (ivw.a) {
                    break;
                }
                if (n == 0) {
                    c.h(false);
                    return;
                }
                if (n == 2 || n == 1) {
                    c.h(true);
                    break;
                }
                break;
            }
        }
    }
}
