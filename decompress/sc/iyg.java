import j$.util.function.Consumer$_CC;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyg implements Consumer
{
    public final boolean a;
    private final int b;
    
    public iyg(final boolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final int b = this.b;
        if (b != 0) {
            if (b == 1) {
                final boolean a = this.a;
                final gdn gdn = (gdn)o;
                final int cu = hwl.cU;
                gdn.a = a;
                return;
            }
            if (b != 2) {
                if (b == 3) {
                    ((fpn)o).s(this.a);
                    return;
                }
                if (b != 4) {
                    final boolean a2 = this.a;
                    final udp udp = (udp)o;
                    udp.b = (a2 ^ true);
                    udp.a();
                    return;
                }
                ((fpn)o).setClickable(this.a);
            }
            else {
                final boolean a3 = this.a;
                final abgw abgw = (abgw)o;
                if (abgw.h == null) {
                    return;
                }
                final qv i = abgw.i;
                if (i.b) {
                    final TimelineMarker[] n = ((abap)i.a).n(abea.f);
                    if (n != null && n.length != 0) {
                        abgw.h.f(a3, 1);
                        return;
                    }
                }
                abgw.h.e(a3);
                if (a3) {
                    abgw.a.t((wzz)new wyt(xaa.c(28244)), (alhi)null);
                    return;
                }
                abgw.a.o((wzz)new wyt(xaa.c(28244)), (alhi)null);
            }
        }
        else {
            final boolean a4 = this.a;
            final xah xah = (xah)o;
            if (a4) {
                xah.t((wzz)new wyt(xaa.c(119372)), (alhi)null);
                return;
            }
            xah.o((wzz)new wyt(xaa.c(119372)), (alhi)null);
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        final int b = this.b;
        if (b == 0) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b == 1) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b == 2) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b == 3) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b != 4) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
