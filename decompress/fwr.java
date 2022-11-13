import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import com.google.protos.youtube.api.innertube.CoWatchCommandOuterClass$CoWatchCommand;
import java.util.Map;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import android.app.ProgressDialog;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwr implements tes
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public fwr(final abrj a, final vpl b, final ahaz c, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final acid c, final adhp b, final Bundle a, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fwr(final adjv b, final acc a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fwr(final ProgressDialog a, final tcc b, final aujg c, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final ProgressDialog a, final tcc b, final aujg c, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final SfvAudioItemPlaybackController a, final ahab c, final PlaybackStartDescriptor b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public fwr(final fcz a, final ahaz b, final albk c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final fwt a, final aiqj b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final tag a, final CoWatchCommandOuterClass$CoWatchCommand b, final Map c, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final wjq a, final Object c, final aiqj b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public fwr(final xkf a, final afeq b, final String c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fwr(final ypw b, final String c, final wxx a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.d) {
            default: {
                this.b((Throwable)o);
                return;
            }
            case 10: {
                this.b((Throwable)o);
                return;
            }
            case 9: {
                this.b((Throwable)o);
                return;
            }
            case 8: {
                this.b((Throwable)o);
                return;
            }
            case 7: {
                this.b((Throwable)o);
                return;
            }
            case 6: {
                this.b((Throwable)o);
                return;
            }
            case 5: {
                this.b((Throwable)o);
                return;
            }
            case 4: {
                this.b((Throwable)o);
                return;
            }
            case 3: {
                this.b((Throwable)o);
                return;
            }
            case 2: {
                this.b((Throwable)o);
                return;
            }
            case 1: {
                this.b((Throwable)o);
                return;
            }
            case 0: {
                this.b((Throwable)o);
            }
        }
    }
    
    public final void b(final Throwable c) {
        switch (this.d) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final Object c2 = this.c;
                ((acc)a).d(c);
                final adjv adjv = (adjv)b;
                final admj admj = (admj)adjv.h.a();
                final Executor d = admj.d;
                final String s = (String)c2;
                d.execute((Runnable)new adfy(admj, s, 13));
                apho apho = apho.d;
                if (c instanceof TimeoutException) {
                    apho = apho.j;
                }
                adjv.J(s, apho, "Failed to confirm upload.", c);
                if (adjv.n) {
                    final adjz adjz = adjv.q.get(c2);
                    if (adjz != null) {
                        final Map q = adjv.q;
                        final adjy b2 = adjz.b();
                        b2.b(false);
                        q.put(c2, b2.a());
                    }
                }
                adjv.r.remove(c2);
                adjv.D(s, false);
                return;
            }
            case 10: {
                final Object c3 = this.c;
                final Object b3 = this.b;
                final Object a2 = this.a;
                ttr.d("Failed to execute all psd fillers.", c);
                ((acid)c3).j((adhp)b3, (Bundle)a2);
                return;
            }
            case 9: {
                final Object a3 = this.a;
                final Object b4 = this.b;
                final Object c4 = this.c;
                final ProgressDialog progressDialog = (ProgressDialog)a3;
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                if (c instanceof Exception) {
                    ((tcc)b4).sd(c4, (Exception)c);
                    return;
                }
                ((tcc)b4).sd(c4, (Exception)new RuntimeException(c));
                return;
            }
            case 8: {
                final Object a4 = this.a;
                final Object b5 = this.b;
                final Object c5 = this.c;
                final ProgressDialog progressDialog2 = (ProgressDialog)a4;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                if (c instanceof Exception) {
                    ((tcc)b5).sd(c5, (Exception)c);
                    return;
                }
                ((tcc)b5).sd(c5, (Exception)new RuntimeException(c));
                return;
            }
            case 7: {
                final Object b6 = this.b;
                final Object c6 = this.c;
                final Object a5 = this.a;
                if (b6 != null && !(b6 instanceof ypv)) {
                    final zbo zbo = new zbo("executor", 0L);
                    zbo.b = (String)c6;
                    zbo.c = c;
                    ((ypw)b6).j(zbo.a());
                    return;
                }
                if (a5 != null) {
                    ((wxx)a5).d(ycc.l(c, 3, 4, (String)c6));
                }
                return;
            }
            case 6: {
                final Object a6 = this.a;
                final Object b7 = this.b;
                final Object c7 = this.c;
                ttr.d("Failed to red the lastTimeShownTimestamp from disk.", c);
                ((xkf)a6).i((afeq)b7, (String)c7, 0L);
                return;
            }
            case 5: {
                ((wjq)this.a).c((wls)this.c, (aiqj)this.b, (aplf)null);
                return;
            }
            case 4: {
                final Object a7 = this.a;
                final Object b8 = this.b;
                final Object c8 = this.c;
                final CoWatchCommandOuterClass$CoWatchCommand coWatchCommandOuterClass$CoWatchCommand = (CoWatchCommandOuterClass$CoWatchCommand)b8;
                if ((coWatchCommandOuterClass$CoWatchCommand.b & 0x8) != 0x0) {
                    final Object a8 = ((tag)a7).a;
                    aiqj aiqj;
                    if ((aiqj = coWatchCommandOuterClass$CoWatchCommand.f) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)a8).c(aiqj, (Map)c8);
                }
                return;
            }
            case 3: {
                final Object a9 = this.a;
                final Object b9 = this.b;
                final Object c9 = this.c;
                if (b9 == null) {
                    final apzt apzt = (apzt)((ahaz)c9).instance;
                    if (apzt.b == 1) {
                        final apzu apzu = (apzu)apzt.c;
                        if ((apzu.b & 0x10) != 0x0) {
                            final Object c10 = ((abrj)a9).c;
                            aiqj aiqj2;
                            if ((aiqj2 = apzu.e) == null) {
                                aiqj2 = aiqj.a;
                            }
                            ((vcy)c10).a(aiqj2);
                        }
                    }
                    return;
                }
                ((vpl)b9).e(c);
                return;
            }
            case 2: {
                final Object a10 = this.a;
                final Object c11 = this.c;
                final Object b10 = this.b;
                zlm.b(zll.b, zlk.x, "GetShortsSourceVideo returns error");
                final ahab ahab = (ahab)c11;
                final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = (SfvAudioItemPlaybackController)a10;
                sfvAudioItemPlaybackController.i(ahab, null);
                sfvAudioItemPlaybackController.d.d((PlaybackStartDescriptor)b10);
                return;
            }
            case 1: {
                ((fcz)this.a).f.s(wxd.e(wxe.c, (albj)((ahaz)this.b).build(), (albk)this.c, c));
                return;
            }
            case 0: {
                ((fwt)this.a).b((aiqj)this.b, (Map)this.c, true);
            }
        }
    }
}
