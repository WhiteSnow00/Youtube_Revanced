import java.util.Set;
import java.util.Iterator;
import android.content.res.Resources;
import android.text.Spanned;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqz implements asjm
{
    public final Object a;
    private final int b;
    
    public fqz(final aels a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final DefaultPlayerViewModeMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final MainAppPlayerOverlayDataProvider a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final TrailerOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fju a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fsw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fud a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fvn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fwz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fqz(final fxt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object a) {
        final int b = this.b;
        long c = -1L;
        int n = 2;
        final int n2 = 0;
        boolean b2 = false;
        switch (b) {
            default: {
                final Object a2 = this.a;
                if (((aans)a).c() == abke.a) {
                    ((TrailerOverlayPresenter)a2).d.f();
                    return;
                }
                break;
            }
            case 19: {
                final Object a3 = this.a;
                final aano aano = (aano)a;
                final fxm d = ((TrailerOverlayPresenter)a3).d;
                d.b = aano.a();
                d.a = true;
                d.h();
                d.Z(1);
                return;
            }
            case 18: {
                final Object a4 = this.a;
                final aang aang = (aang)a;
                ((TrailerOverlayPresenter)a4).d.g(false);
                return;
            }
            case 17: {
                final Object a5 = this.a;
                if (((aanw)a).a() == 2) {
                    b2 = true;
                }
                final fxt fxt = (fxt)a5;
                fxt.b = b2;
                if (b2) {
                    fxt.a.j();
                }
                return;
            }
            case 16: {
                final Object a6 = this.a;
                final PlayerResponseModel b3 = ((aani)a).b();
                if (b3 != null) {
                    akwz akwz;
                    if ((akwz = b3.z().f) == null) {
                        akwz = akwz.a;
                    }
                    akxq akxq;
                    if ((akxq = akwz.n) == null) {
                        akxq = akxq.a;
                    }
                    apxm a7;
                    if (akxq.b == 86428467) {
                        a7 = (apxm)akxq.c;
                    }
                    else {
                        a7 = apxm.a;
                    }
                    if ((a7.b & 0x4) != 0x0) {
                        final fxt fxt2 = (fxt)a6;
                        if (!fxt2.b) {
                            final RentalActivationOverlay a8 = fxt2.a;
                            akxq akxq2;
                            if ((akxq2 = akwz.n) == null) {
                                akxq2 = akxq.a;
                            }
                            apxm a9;
                            if (akxq2.b == 86428467) {
                                a9 = (apxm)akxq2.c;
                            }
                            else {
                                a9 = apxm.a;
                            }
                            ajut ajut;
                            if ((ajut = a9.c) == null) {
                                ajut = ajut.a;
                            }
                            final Spanned b4 = acak.b(ajut);
                            if (a8.a == null) {
                                a8.a = (YouTubeTextView)LayoutInflater.from(a8.getContext()).inflate(2131625297, (ViewGroup)a8).findViewById(2131431146);
                                a8.k();
                            }
                            a8.a.setText((CharSequence)b4);
                            a8.k();
                        }
                    }
                }
                return;
            }
            case 15: {
                final Object a10 = this.a;
                final aang aang2 = (aang)a;
                ((fxt)a10).a.j();
                return;
            }
            case 14: {
                final Object a11 = this.a;
                final aanw aanw = (aanw)a;
                final fwz fwz = (fwz)a11;
                if (TextUtils.isEmpty((CharSequence)fwz.g)) {
                    return;
                }
                fwz.e = fwz.b();
                if (aanw.a() == 2) {
                    c = fwz.a.c();
                }
                fwz.f = c;
                fwz.f();
                return;
            }
            case 13: {
                final Object a12 = this.a;
                final aans aans = (aans)a;
                final PlayerResponseModel b5 = aans.b();
                if (aans.c() == abke.i && b5 != null) {
                    final String k = b5.K();
                    final fwz fwz2 = (fwz)a12;
                    fwz2.g = k;
                    if (!fwz2.g.equals(fwz2.h)) {
                        fwz2.e = 0L;
                        fwz2.h = fwz2.g;
                    }
                    fwz2.f();
                    return;
                }
                final fwz fwz3 = (fwz)a12;
                fwz3.g = null;
                fwz3.f = -1L;
                fwz3.g();
                return;
            }
            case 12: {
                final Object a13 = this.a;
                int b6 = n2;
                if (((fkr)a).m()) {
                    a = ((elx)((aels)a13).a).a;
                    if (a == null) {
                        b6 = n2;
                    }
                    else {
                        final kzk h = ((DefaultWatchPanelViewController)a).h;
                        if (h == null) {
                            b6 = n2;
                        }
                        else {
                            final Resources resources = ((kzb)h).c.getResources();
                            b6 = resources.getDimensionPixelSize(2131166494) + resources.getDimensionPixelOffset(2131166496);
                        }
                    }
                }
                final aels aels = (aels)a13;
                if (aels.b != b6) {
                    aels.b = b6;
                    if (!((Set)aels.c).isEmpty()) {
                        final Iterator<Object> iterator = ((Set<Object>)aels.c).iterator();
                        while (iterator.hasNext()) {
                            iterator.next().a(aels.b);
                        }
                    }
                }
                return;
            }
            case 11: {
                final Object a14 = this.a;
                final vft vft = (vft)a;
                if (vft.f == vfs.b) {
                    final String a15 = vft.a;
                    return;
                }
                final aonl aonl = (aonl)vft.c;
                if (aonl == null) {
                    ((fvn)a14).w = true;
                    return;
                }
                final boolean booleanValue = aonl.getSubscribed();
                final fvn fvn = (fvn)a14;
                fvn.u = booleanValue;
                fvn.n();
                return;
            }
            case 10: {
                final Object a16 = this.a;
                final Boolean b7 = (Boolean)a;
                final fud fud = (fud)a16;
                final ahaz g = fud.g;
                final boolean booleanValue2 = b7;
                g.copyOnWrite();
                final aikr aikr = (aikr)g.instance;
                final aikr a17 = aikr.a;
                aikr.b |= 0x100;
                aikr.i = booleanValue2;
                final gck b8 = fud.b;
                if (b7) {
                    n = 1;
                }
                b8.e(n, fud.h.r() ^ true);
                if (b7) {
                    fud.b.post((Runnable)new eym(fud, 11));
                }
                final aikr aikr2 = (aikr)fud.g.instance;
                if ((aikr2.b & 0x1000) != 0x0) {
                    fud.f.w((wzz)new wyt(aikr2.l.I()), fud.b((aikr)fud.g.build()));
                }
                return;
            }
            case 9: {
                final Object a18 = this.a;
                final Rect rect = (Rect)a;
                final MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider = (MainAppPlayerOverlayDataProvider)a18;
                if (mainAppPlayerOverlayDataProvider.a.equals((Object)rect)) {
                    return;
                }
                mainAppPlayerOverlayDataProvider.a.set(rect);
                mainAppPlayerOverlayDataProvider.g();
                return;
            }
            case 8: {
                final Object a19 = this.a;
                switch (((aanw)a).a()) {
                    default: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 1;
                        break;
                    }
                    case 9: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 6;
                        break;
                    }
                    case 8: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 8;
                        break;
                    }
                    case 5: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 5;
                        break;
                    }
                    case 4:
                    case 7: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 7;
                        break;
                    }
                    case 3: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 4;
                        break;
                    }
                    case 2: {
                        ((MainAppPlayerOverlayDataProvider)a19).f = 3;
                        break;
                    }
                }
                ((MainAppPlayerOverlayDataProvider)a19).g();
                return;
            }
            case 7: {
                final Object a20 = this.a;
                final ixf a21 = ((ixa)a).a;
                final boolean f = a21.f;
                final MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider2 = (MainAppPlayerOverlayDataProvider)a20;
                mainAppPlayerOverlayDataProvider2.b = f;
                mainAppPlayerOverlayDataProvider2.c = a21.e;
                mainAppPlayerOverlayDataProvider2.g();
                return;
            }
            case 6: {
                final Object a22 = this.a;
                final aamb aamb = (aamb)a;
                final String b9 = aamb.b();
                final MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider3 = (MainAppPlayerOverlayDataProvider)a22;
                mainAppPlayerOverlayDataProvider3.d = b9;
                final int n3 = (int)(aamb.a() * 100.0f);
                if (n3 != 25) {
                    if (n3 != 50) {
                        if (n3 != 75) {
                            if (n3 != 100) {
                                if (n3 != 125) {
                                    if (n3 != 150) {
                                        if (n3 != 175) {
                                            if (n3 != 200) {
                                                mainAppPlayerOverlayDataProvider3.e = 1;
                                            }
                                            else {
                                                mainAppPlayerOverlayDataProvider3.e = 9;
                                            }
                                        }
                                        else {
                                            mainAppPlayerOverlayDataProvider3.e = 8;
                                        }
                                    }
                                    else {
                                        mainAppPlayerOverlayDataProvider3.e = 7;
                                    }
                                }
                                else {
                                    mainAppPlayerOverlayDataProvider3.e = 6;
                                }
                            }
                            else {
                                mainAppPlayerOverlayDataProvider3.e = 5;
                            }
                        }
                        else {
                            mainAppPlayerOverlayDataProvider3.e = 4;
                        }
                    }
                    else {
                        mainAppPlayerOverlayDataProvider3.e = 3;
                    }
                }
                else {
                    mainAppPlayerOverlayDataProvider3.e = 2;
                }
                mainAppPlayerOverlayDataProvider3.g();
                return;
            }
            case 5: {
                final Object a23 = this.a;
                final aanf aanf = (aanf)a;
                if (aanf.b() == abka.d) {
                    if (aanf.a() != null) {
                        final PlayerResponseModel a24 = aanf.a();
                        a24.getClass();
                        if (a24.K() != null) {
                            final PlayerResponseModel a25 = aanf.a();
                            a25.getClass();
                            final String i = a25.K();
                            final fsw fsw = (fsw)a23;
                            if (i.equals(fsw.l)) {
                                fsw.m = aanf.d();
                                return;
                            }
                        }
                    }
                    ((fsw)a23).m = "";
                }
                return;
            }
            case 4: {
                final Object a26 = this.a;
                final int a27 = ((aanw)a).a();
                if (a27 == 2) {
                    ((fsw)a26).c(false);
                    return;
                }
                if (a27 != 3) {
                    return;
                }
                ((fsw)a26).c(true);
                return;
            }
            case 3: {
                final Object a28 = this.a;
                final aant aant = (aant)a;
                final fsw fsw2 = (fsw)a28;
                if (!TextUtils.equals((CharSequence)fsw2.m, (CharSequence)aant.i())) {
                    return;
                }
                fsw2.d = Math.max(aant.e(), fsw2.d);
                fsw2.b = aant.f();
                if (aant.j()) {
                    fsw2.c = fsw2.a();
                }
                fsw2.b();
                return;
            }
            case 2: {
                ((asiq)this.a).c((asir)a);
                return;
            }
            case 1: {
                final Object a29 = this.a;
                final List list = (List)a;
                ((fju)a29).oK((fkr)list.get(0), (fkr)list.get(1));
                return;
            }
            case 0: {
                ((DefaultPlayerViewModeMonitor)this.a).a = (fkr)a;
                break;
            }
        }
    }
}
