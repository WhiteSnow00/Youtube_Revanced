import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifo implements acvo
{
    public final Object a;
    private final int b;
    
    public ifo(final SingleLoopPlaybackMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final ifr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final jyl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final kzo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final qcy a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final qqr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final wqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifo(final wtm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static void c(final Throwable t) {
        ttr.d("Failed to update offline has shown 1080p tooltip.", t);
    }
    
    public final void a(Object o, final int n) {
        switch (this.b) {
            default: {
                final acwk acwk = (acwk)o;
                if (n != 4) {
                    o = this.a;
                    final wtm wtm = (wtm)o;
                    if (wtm.aS.y()) {
                        teu.n((aun)o, ((qqr)wtm.aX.a).b((aezf)new vev(18), (Executor)afum.a), (ttg)won.n, (ttg)won.o);
                        return;
                    }
                    wtm.aK.edit().putBoolean("HAS_SEEN_SCREENCAST_TOOLTIP", true).apply();
                }
                return;
            }
            case 6: {
                final acwk acwk2 = (acwk)o;
                if (n != 4) {
                    o = this.a;
                    final wqv wqv = (wqv)o;
                    if (wqv.av.y()) {
                        teu.n((aun)o, ((qqr)wqv.ay.a).b((aezf)new wpw(3), (Executor)afum.a), (ttg)won.k, (ttg)won.l);
                        return;
                    }
                    wqv.ak.edit().putBoolean("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", true).apply();
                }
                return;
            }
            case 5: {
                final acwd acwd = (acwd)o;
                ((SingleLoopPlaybackMonitor)this.a).a.o((wzz)new wyt(xaa.c(123602)), (alhi)null);
                ((SingleLoopPlaybackMonitor)this.a).c = false;
                return;
            }
            case 4: {
                final acwk acwk3 = (acwk)o;
                return;
            }
            case 3: {
                final acwk acwk4 = (acwk)o;
                return;
            }
            case 2: {
                final acwd acwd2 = (acwd)o;
                return;
            }
            case 1: {
                final acwd acwd3 = (acwd)o;
                return;
            }
            case 0: {
                final acwk acwk5 = (acwk)o;
            }
        }
    }
    
    public final void mv(final Object o) {
        switch (this.b) {
            default: {
                final acwk acwk = (acwk)o;
                return;
            }
            case 6: {
                final acwk acwk2 = (acwk)o;
                return;
            }
            case 5: {
                final acwd acwd = (acwd)o;
                ((SingleLoopPlaybackMonitor)this.a).a.l((wzz)new wyt(xaa.c(123602)));
                ((SingleLoopPlaybackMonitor)this.a).c = true;
                return;
            }
            case 4: {
                final acwk acwk3 = (acwk)o;
                final kzo kzo = (kzo)this.a;
                teu.n(kzo.d, ((tmx)kzo.f.a).b((aezf)new fmv(kzo.c.c(), 8)), (ttg)jqo.s, (ttg)teu.b);
                return;
            }
            case 3: {
                final acwk acwk4 = (acwk)o;
                final jyl jyl = (jyl)this.a;
                teu.n(jyl.e, jyl.d.b((aezf)new jpz(this, 13, (byte[])null)), (ttg)jqo.m, (ttg)teu.b);
                return;
            }
            case 2: {
                final acwd acwd2 = (acwd)o;
                final wyw pf = ((wyv)((qcy)this.a).b).pF();
                final InteractionLoggingScreen a = pf.a();
                if (a != null) {
                    final wzz wzz = new wzz(a, xaa.c(98969));
                    final wzz wzz2 = new wzz(a, xaa.c(98970));
                    pf.l(wzz);
                    pf.m(wzz2, wzz);
                }
                return;
            }
            case 1: {
                final acwd acwd3 = (acwd)o;
                final qqr qqr = (qqr)this.a;
                teu.n((aun)qqr.g, ((tmx)((aln)qqr.f).a).b((aezf)new fmv(((oby)qqr.h).c(), 3)), (ttg)etg.h, (ttg)teu.b);
                return;
            }
            case 0: {
                final acwk acwk5 = (acwk)o;
                teu.m(((tmx)((ifr)this.a).s.a).b((aezf)new fel(19)), (tes)ieq.e);
            }
        }
    }
}
