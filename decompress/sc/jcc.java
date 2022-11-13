import android.support.v7.widget.RecyclerView;
import j$.util.Optional;
import com.google.android.apps.youtube.app.watch.panel.ui.cinematics.WatchCinematicContainerVisibilityController;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcc implements asjg
{
    public final Object a;
    private final int b;
    
    public jcc(final abap a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final abem a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final WatchCinematicContainerVisibilityController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jcv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jcw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jcz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jdf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jdk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final jyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final kcc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final kcw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final kdb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final knz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final ksc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final lfy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcc(final xrm a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        switch (this.b) {
            default: {
                final abem abem = (abem)this.a;
                if (!abem.a) {
                    return;
                }
                ((lco)abem.b).l((laa)abem.c);
                abem.a = false;
                return;
            }
            case 19: {
                ((WatchCinematicContainerVisibilityController)this.a).l();
                return;
            }
            case 18: {
                ((WatchCinematicContainerVisibilityController)this.a).k(lgu.c);
                return;
            }
            case 17: {
                ((WatchCinematicContainerVisibilityController)this.a).k(lgu.c);
                return;
            }
            case 16: {
                final lfy lfy = (lfy)this.a;
                if (!lfy.g) {
                    return;
                }
                ((acns)lfy.a).l.remove(lfy.f);
                final RecyclerView n = lfy.a.N;
                n.X(lfy.e);
                n.aH(lfy.i);
                lfy.c.tu((Object)Optional.empty());
                lfy.g = false;
                return;
            }
            case 15: {
                ((asiq)this.a).b();
                return;
            }
            case 14: {
                ((xrm)this.a).f();
                return;
            }
            case 13: {
                ((ksc)this.a).run();
                return;
            }
            case 12: {
                final Object a = this.a;
                ttr.b("Could not get link status from entities");
                ((knz)a).a(false);
                return;
            }
            case 11: {
                ((ttk)this.a).sa();
                return;
            }
            case 10: {
                ((kdb)this.a).b.dispose();
                return;
            }
            case 9: {
                ((gek)this.a).k();
                return;
            }
            case 8: {
                ((gek)this.a).k();
                return;
            }
            case 7: {
                ((jyi)this.a).q(1);
                return;
            }
            case 6: {
                ((jdk)this.a).d.b();
                return;
            }
            case 5: {
                final Object a2 = this.a;
                final jdf jdf = (jdf)a2;
                jdf.a.m(a2);
                jdf.d = null;
                jdf.e = null;
                return;
            }
            case 4: {
                final jcz jcz = (jcz)this.a;
                jcz.a.n(jcz.h);
                jcz.b.f(jcz.f);
                jcz.c.removeOnLayoutChangeListener(jcz.g);
                jcz.l = null;
                jcz.m = null;
                return;
            }
            case 3: {
                final Object a3 = this.a;
                final jcw jcw = (jcw)a3;
                jcw.c.b();
                jcw.e = null;
                jcw.d = null;
                jcw.b.b((iuu)a3);
                return;
            }
            case 2: {
                final jcv jcv = (jcv)this.a;
                jcv.b.b();
                jcv.d = null;
                jcv.c = null;
                return;
            }
            case 1: {
                ((YouTubeControlsOverlay)this.a).b.d(iux.b);
                return;
            }
            case 0: {
                final abap abap = (abap)this.a;
                if (abap.m != null) {
                    abap.m = null;
                }
            }
        }
    }
}
