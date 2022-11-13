import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxb implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aaxb(final aaxc a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final aaxc b, final wzz a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final abat a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final abij a, final abik b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final abiq a, final apvt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final ablu b, final WatchNextResponseModel a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final ablu b, final PlayerResponseModel a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final ablu a, final Throwable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final abqo b, final vwa a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final abqw b, final abkh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final abra b, final TrackingUrlModel a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final abvb b, final PlayerResponseModel a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final LiveOverlayPresenter a, final alun b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final LiveOverlayPresenter b, final Bitmap a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaxb(final LiveOverlayPresenter a, final aotp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final tcc a, final PlayerResponseModel b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final tcc a, final Exception b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final tce a, final PlayerResponseModel b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaxb(final tce a, final Exception b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        final ajut ajut = null;
        switch (c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final abra abra = (abra)b;
                abra.b((TrackingUrlModel)a, abra.f);
                return;
            }
            case 19: {
                ((abqw)this.b).c.e((abkh)this.a);
                return;
            }
            case 18: {
                ((abqo)this.b).b((vwa)this.a);
                return;
            }
            case 17: {
                ((abvb)this.b).B(this.a, (PlaybackStartDescriptor)null);
                return;
            }
            case 16: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final ablu ablu = (ablu)b2;
                if (ablu.h) {
                    return;
                }
                ablu.e.d((PlayerResponseModel)a2);
                return;
            }
            case 15: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final ablu ablu2 = (ablu)b3;
                if (ablu2.h) {
                    return;
                }
                ablu2.e.c((PlayerResponseModel)a3);
                return;
            }
            case 14: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                final ablu ablu3 = (ablu)b4;
                if (ablu3.h) {
                    return;
                }
                ablu3.e.g((WatchNextResponseModel)a4, ablu3.c);
                return;
            }
            case 13: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final ablu ablu4 = (ablu)a5;
                if (ablu4.h) {
                    return;
                }
                final ablt e = ablu4.e;
                final tqd f = ablu4.f;
                final Throwable t = (Throwable)b5;
                e.f(new abkh(12, true, f.b(t), t));
                return;
            }
            case 12: {
                final Object a6 = this.a;
                final Object b6 = this.b;
                final ablu ablu5 = (ablu)a6;
                if (ablu5.h) {
                    return;
                }
                final ablt e2 = ablu5.e;
                final tqd f2 = ablu5.f;
                final Throwable t2 = (Throwable)b6;
                e2.b(new abkh(4, true, 1, f2.b(t2), t2, ablu5.a.k()));
                return;
            }
            case 11: {
                ((tce)this.a).sd((Object)null, (Exception)this.b);
                return;
            }
            case 10: {
                ((tce)this.a).b((Object)null, this.b);
                return;
            }
            case 9: {
                final Object a7 = this.a;
                final Object b7 = this.b;
                final byte[] a8 = abkz.a;
                ((tcc)a7).b((Object)null, b7);
                return;
            }
            case 8: {
                final Object a9 = this.a;
                final Object b8 = this.b;
                final byte[] a10 = abkz.a;
                ((tcc)a9).sd((Object)null, (Exception)b8);
                return;
            }
            case 7: {
                final Object a11 = this.a;
                final Object b9 = this.b;
                final abiq abiq = (abiq)a11;
                abiq.g = null;
                final apvt apvt = (apvt)b9;
                if (!((List)apvt.o).isEmpty()) {
                    abiq.e.b((List)apvt.o);
                    abiq.f(apvt);
                    return;
                }
                final ojg l = abiq.l;
                final ioc a12 = new ioc(abiq, apvt, 2);
                final zgi zgi = new zgi(abiq, apvt, 6);
                final Object a13 = l.a;
                final gbv d = gbx.d();
                d.j();
                d.c(-2);
                ajut ajut2;
                if ((apvt.b & 0x1000) != 0x0) {
                    if ((ajut2 = apvt.l) == null) {
                        ajut2 = ajut.a;
                    }
                }
                else {
                    ajut2 = null;
                }
                d.k((CharSequence)acak.b(ajut2));
                aida aida;
                if ((aida = apvt.k) == null) {
                    aida = aida.a;
                }
                aicz aicz;
                if ((aicz = aida.c) == null) {
                    aicz = aicz.a;
                }
                ajut ajut3 = ajut;
                if ((aicz.b & 0x200) != 0x0) {
                    aida aida2;
                    if ((aida2 = apvt.k) == null) {
                        aida2 = aida.a;
                    }
                    aicz aicz2;
                    if ((aicz2 = aida2.c) == null) {
                        aicz2 = aicz.a;
                    }
                    if ((ajut3 = aicz2.i) == null) {
                        ajut3 = ajut.a;
                    }
                }
                ((acwc)d).m((CharSequence)acak.b(ajut3), (View$OnClickListener)zgi);
                d.a = (acvo)a12;
                ((acwb)a13).n((acwd)d.a());
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final Object b10 = this.b;
                synchronized (a14) {
                    final Iterator iterator = ((abij)a14).c.iterator();
                    while (iterator.hasNext()) {
                        ((abii)iterator.next()).j((abik)b10);
                    }
                    final xan o = ((abij)a14).o;
                    if (o != null) {
                        o.c("thsb0_fr");
                        ((abij)a14).o = null;
                    }
                }
            }
            case 5: {
                ((LiveOverlayPresenter)this.a).y((aotp)this.b);
                return;
            }
            case 4: {
                final Object a15 = this.a;
                aotp aotp;
                if ((aotp = ((alun)this.b).f) == null) {
                    aotp = aotp.a;
                }
                ((LiveOverlayPresenter)a15).y(aotp);
                return;
            }
            case 3: {
                ((LiveOverlayPresenter)this.b).a.p((Bitmap)this.a);
                return;
            }
            case 2: {
                ((abat)this.a).a.g((String)this.b, true);
                return;
            }
            case 1: {
                ((aaxc)this.b).a.D((wzz)this.a);
                return;
            }
            case 0: {
                ((aaxc)this.a).c.add(this.b);
            }
        }
    }
}
