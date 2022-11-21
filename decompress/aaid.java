import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.content.Intent;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaid implements asmi
{
    public final Object a;
    private final int b;
    
    public aaid(final aagu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final aaie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final aail a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final aamh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final aand a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final OfflineTransferService a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaid(final AtomicBoolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        boolean b2 = false;
        boolean h = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final aaos aaos = (aaos)o;
                final aand aand = (aand)a;
                if (aand.b.a() != null) {
                    aand.d(aaos);
                    aand.d(aaop.c(aaos));
                    return;
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                final aaoc aaoc = (aaoc)o;
                ((aand)a2).c();
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final tgk tgk = (tgk)o;
                final aand aand2 = (aand)a3;
                final xbt xbt = (xbt)aand2.b.a();
                if (xbt != null && (tgk instanceof aaoj || tgk instanceof aaoo)) {
                    xbt.c(tgk.f());
                    aand2.e();
                }
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final aaon aaon = (aaon)o;
                final aand aand3 = (aand)a4;
                final xbt xbt2 = (xbt)aand3.b.a();
                final int g = (int)aand3.a.f();
                if (xbt2 != null && !aand3.d) {
                    aand3.d(aaon);
                    aand3.d = true;
                    if (g > 0) {
                        final ahcr builder = aloj.a.createBuilder();
                        final ahcr builder2 = alol.a.createBuilder();
                        builder2.copyOnWrite();
                        final alol alol = (alol)builder2.instance;
                        alol.b |= 0x40;
                        alol.g = g;
                        builder.copyOnWrite();
                        final aloj aloj = (aloj)builder.instance;
                        final alol l = (alol)builder2.build();
                        l.getClass();
                        aloj.L = l;
                        aloj.c |= 0x1000000;
                        xbt2.a((aloj)builder.build());
                    }
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final aapv aapv = (aapv)o;
                final aand aand4 = (aand)a5;
                aand4.c();
                aand4.a.g();
                final acav a6 = aapv.a();
                if (a6 != null) {
                    aand4.b = a6.b();
                    return;
                }
                aand4.b = (twp)aamw.c;
                return;
            }
            case 15: {
                final Object a7 = this.a;
                final aaoi aaoi = (aaoi)o;
                final aand aand5 = (aand)a7;
                if (aand5.b.a() != null) {
                    aand5.d(aaoi);
                }
                return;
            }
            case 14: {
                final Object a8 = this.a;
                final aapp aapp = (aapp)o;
                final xbt xbt3 = (xbt)((aand)a8).b.a();
                final String e = aapp.e();
                final PlayerResponseModel b3 = aapp.b();
                if (aapp.c() == abll.c && xbt3 != null && e != null && b3 != null) {
                    xbt3.c("gv");
                    final ahcr builder3 = aloj.a.createBuilder();
                    builder3.copyOnWrite();
                    final aloj aloj2 = (aloj)builder3.instance;
                    aloj2.b |= 0x1000;
                    aloj2.n = e;
                    if (!b3.K().isEmpty()) {
                        final String k = b3.K();
                        builder3.copyOnWrite();
                        final aloj aloj3 = (aloj)builder3.instance;
                        k.getClass();
                        aloj3.b |= 0x4000000;
                        aloj3.w = k;
                    }
                    xbt3.a((aloj)builder3.build());
                }
                return;
            }
            case 13: {
                final Object a9 = this.a;
                final aanx aanx = (aanx)o;
                ((aand)a9).e();
                return;
            }
            case 12: {
                final Object a10 = this.a;
                final yre yre = (yre)o;
                FormatStreamModel formatStreamModel;
                if ((formatStreamModel = yre.f()) == null) {
                    formatStreamModel = yre.e();
                }
                final xbt xbt4 = (xbt)((aand)a10).b.a();
                if (formatStreamModel != null && xbt4 != null) {
                    final ahcr builder4 = aloj.a.createBuilder();
                    final ahcr builder5 = alol.a.createBuilder();
                    final int e2 = formatStreamModel.e();
                    builder5.copyOnWrite();
                    final alol alol2 = (alol)builder5.instance;
                    alol2.b |= 0x1;
                    alol2.c = e2;
                    builder4.copyOnWrite();
                    final aloj aloj4 = (aloj)builder4.instance;
                    final alol i = (alol)builder5.build();
                    i.getClass();
                    aloj4.L = i;
                    aloj4.c |= 0x1000000;
                    xbt4.a((aloj)builder4.build());
                }
                return;
            }
            case 11: {
                final Object a11 = this.a;
                final aapv aapv2 = (aapv)o;
                final aand aand6 = (aand)a11;
                final xbt a12 = aand6.a();
                if (a12 != null && !aand6.e) {
                    final ahcr builder6 = aloj.a.createBuilder();
                    final String aa = aapv2.a().aa();
                    builder6.copyOnWrite();
                    final aloj aloj5 = (aloj)builder6.instance;
                    aa.getClass();
                    aloj5.b |= 0x8000;
                    aloj5.p = aa;
                    final PlayerResponseModel c = aapv2.a().c();
                    if (c != null) {
                        final String j = c.K();
                        builder6.copyOnWrite();
                        final aloj aloj6 = (aloj)builder6.instance;
                        j.getClass();
                        aloj6.b |= 0x10000000;
                        aloj6.y = j;
                    }
                    a12.a((aloj)builder6.build());
                    aand6.e = true;
                }
                final acav a13 = aapv2.a();
                final aapa c2 = aand6.c;
                if (c2 != null && TextUtils.equals((CharSequence)a13.aa(), (CharSequence)c2.b())) {
                    final xbt xbt5 = (xbt)a13.b().a();
                    if (xbt5 != null) {
                        xbt5.f(c2.a());
                    }
                }
                aand6.c = null;
                return;
            }
            case 10: {
                ((aand)this.a).c = (aapa)o;
                return;
            }
            case 9: {
                final Object a14 = this.a;
                if (((aaoe)o).d() == ablc.h) {
                    h = true;
                }
                ((aamh)a14).h = h;
                return;
            }
            case 8: {
                final Object a15 = this.a;
                final aapl aapl = (aapl)o;
                ((aamh)a15).i = true;
                return;
            }
            case 7: {
                final Object a16 = this.a;
                final aapv aapv3 = (aapv)o;
                final aamh aamh = (aamh)a16;
                final boolean m = aamh.i;
                if (aapv3.a().a() == 3) {
                    b2 = true;
                }
                aamh.i = (m | b2);
                return;
            }
            case 6: {
                final Object a17 = this.a;
                final aapv aapv4 = (aapv)o;
                ((aamh)a17).i = false;
                return;
            }
            case 5: {
                final Object a18 = this.a;
                if (((aapp)o).c() == abll.j) {
                    final aamh aamh2 = (aamh)a18;
                    if (!aamh2.i && !((aami)aamh2.f.a()).b() && !aamh2.h) {
                        if (aamz.c(((aami)aamh2.f.a()).c(abpx.c))) {
                            final xbt g2 = (xbt)aamh2.b.a();
                            final abpw c3 = abpw.c;
                            final abkz a19 = abla.a();
                            a19.g = g2;
                            aamh2.a.execute(new aaii(aamh2, new abpx(c3, (PlaybackStartDescriptor)null, a19.a()), 10));
                            return;
                        }
                        ((auna)aamh2.j.a).tt(new aapd(true));
                    }
                }
                return;
            }
            case 4: {
                ((AtomicBoolean)this.a).set((boolean)o);
                return;
            }
            case 3: {
                ((OfflineTransferService)this.a).p();
                return;
            }
            case 2: {
                ((aail)this.a).b();
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final apqb apqb = (apqb)((vhb)o).c;
                if (apqb != null) {
                    final String videoId = apqb.getVideoId();
                    final long longValue = apqb.getLastPlaybackPositionSeconds();
                    final aagj l2 = ((aadl)((aagu)a20).e.a()).a().l();
                    final aadc e3 = l2.e(videoId);
                    if (e3 != null && e3.h != longValue) {
                        l2.z(videoId, longValue);
                    }
                }
                return;
            }
            case 0: {
                final Object a21 = this.a;
                if (!(boolean)o) {
                    break;
                }
                final aaie aaie = (aaie)a21;
                final String a22 = aaie.a();
                if (a22 != null) {
                    final Intent intent = new Intent();
                    intent.setClassName(aaie.a, a22);
                    intent.setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
                    aakw.a(aaie.a, intent);
                    break;
                }
                break;
            }
        }
    }
}
