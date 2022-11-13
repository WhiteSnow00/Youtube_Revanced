import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Iterator;
import android.graphics.Rect;
import android.text.Spanned;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavc implements Runnable
{
    final Object a;
    private final int b;
    
    public aavc(final aave a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final aavq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final aawy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final aaxc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final aayn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final aazi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final abbp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final abbt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final abbv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final abej a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final CreatorEndscreenOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final LiveOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavc(final SubtitlesOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        final ajut ajut = null;
        final ajut ajut2 = null;
        int i = 0;
        switch (b) {
            default: {
                ((abej)this.a).tf(true);
                return;
            }
            case 19: {
                ((SubtitlesOverlayPresenter)this.a).j();
                return;
            }
            case 18: {
                ((LiveOverlayPresenter)this.a).p();
                return;
            }
            case 17: {
                ((LiveOverlayPresenter)this.a).o();
                return;
            }
            case 16: {
                ((LiveOverlayPresenter)this.a).v();
                return;
            }
            case 15: {
                final LiveOverlayPresenter liveOverlayPresenter = (LiveOverlayPresenter)this.a;
                final alun h = liveOverlayPresenter.h;
                if (h != null) {
                    ajut ajut3;
                    if ((0x4 & h.b) != 0x0) {
                        if ((ajut3 = h.d) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    Object o;
                    final Spanned spanned = (Spanned)(o = acak.b(ajut3));
                    if ((h.b & 0x2) != 0x0) {
                        final long max = Math.max(0L, h.c - TimeUnit.MILLISECONDS.toSeconds(liveOverlayPresenter.g.c()));
                        final String b2 = liveOverlayPresenter.c.b(String.format(Locale.getDefault(), "%02d:%02d", TimeUnit.SECONDS.toMinutes(max), max % 60L));
                        if (liveOverlayPresenter.k) {
                            o = String.valueOf(spanned.toString().split("\\d", -1)[0]).concat(String.valueOf(b2));
                        }
                        else {
                            o = liveOverlayPresenter.b.getString(2132018382, new Object[] { b2 });
                        }
                    }
                    final aidi z = LiveOverlayPresenter.z(h);
                    if (z != null) {
                        final abcg a = liveOverlayPresenter.a;
                        ajut ajut4;
                        if ((h.b & 0x8) != 0x0) {
                            if ((ajut4 = h.e) == null) {
                                ajut4 = ajut.a;
                            }
                        }
                        else {
                            ajut4 = null;
                        }
                        final Spanned b3 = acak.b(ajut4);
                        final boolean e = z.e;
                        ajut ajut5;
                        if ((z.b & 0x40) != 0x0) {
                            if ((ajut5 = z.h) == null) {
                                ajut5 = ajut.a;
                            }
                        }
                        else {
                            ajut5 = null;
                        }
                        final Spanned b4 = acak.b(ajut5);
                        akdi akdi;
                        if ((akdi = z.g) == null) {
                            akdi = akdi.a;
                        }
                        final int l = LiveOverlayPresenter.l(akdi);
                        ajut ajut6 = ajut2;
                        if ((z.b & 0x2000) != 0x0 && (ajut6 = z.n) == null) {
                            ajut6 = ajut.a;
                        }
                        final Spanned b5 = acak.b(ajut6);
                        akdi akdi2;
                        if ((akdi2 = z.m) == null) {
                            akdi2 = akdi.a;
                        }
                        a.t((CharSequence)o, (CharSequence)b3, e, (CharSequence)b4, l, (CharSequence)b5, LiveOverlayPresenter.l(akdi2));
                    }
                    else {
                        ajut ajut7;
                        if ((h.b & 0x8) != 0x0) {
                            if ((ajut7 = h.e) == null) {
                                ajut7 = ajut.a;
                            }
                        }
                        else {
                            ajut7 = null;
                        }
                        final Spanned b6 = acak.b(ajut7);
                        liveOverlayPresenter.a.t((CharSequence)o, (CharSequence)b6, false, (CharSequence)null, 0, (CharSequence)null, 0);
                        final aicz a2 = LiveOverlayPresenter.A(h);
                        if (a2 != null) {
                            final abcg a3 = liveOverlayPresenter.a;
                            ajut ajut8 = ajut;
                            if ((a2.b & 0x200) != 0x0 && (ajut8 = a2.i) == null) {
                                ajut8 = ajut.a;
                            }
                            a3.v((CharSequence)o, (CharSequence)b6, (CharSequence)acak.b(ajut8));
                        }
                    }
                    liveOverlayPresenter.j = true;
                }
                return;
            }
            case 14: {
                final Object a4 = this.a;
                final abbt abbt = (abbt)a4;
                Object o2 = ((abbv)abbt.c).Q;
                synchronized (o2) {
                    final FormatStreamModel[] r = ((abbv)((abbt)a4).c).R;
                    monitorexit(o2);
                    if (r != null) {
                        long min = -1L;
                        while (i < r.length) {
                            o2 = r[i];
                            final long d = ((abbv)abbt.c).x.d((FormatStreamModel)o2, TimeUnit.MILLISECONDS.toMicros(((abbv)abbt.c).K));
                            if (min < 0L) {
                                min = d;
                            }
                            else {
                                min = Math.min(min, d);
                            }
                            ++i;
                        }
                        o2 = abbt.c;
                        ((abbv)o2).P = TimeUnit.MICROSECONDS.toMillis(min);
                        o2 = abbt.c;
                        ((abbv)o2).z.execute(new aavc((abbv)o2, 13));
                        o2 = abbt.c;
                        if (((abbv)o2).P >= ((abbv)o2).N) {
                            abbt.a();
                        }
                        return;
                    }
                    abbt.a();
                }
            }
            case 13: {
                ((abbv)this.a).f();
                return;
            }
            case 12: {
                final Object a5 = this.a;
                try {
                    final boolean ov = ((abbo)((abbp)a5).b).oV();
                    if (!((abbp)a5).j() && !ov) {
                        return;
                    }
                    ((abbp)a5).c();
                    if (((abbp)a5).d && !((abbp)a5).m()) {
                        if (((abbp)a5).j()) {
                            ((abbp)a5).f();
                        }
                        return;
                    }
                    final boolean h2 = ((abbp)a5).h(4);
                    final boolean h3 = ((abbp)a5).h(2);
                    Label_1280: {
                        if (ov) {
                            if (h3) {
                                ((abbo)((abbp)a5).b).e(((abbp)a5).a, ((abbp)a5).e);
                                ((abbp)a5).a(2);
                                ((abbp)a5).f = 0;
                            }
                        }
                        else if (((abbp)a5).k()) {
                            ((abbp)a5).a(8);
                            if (((abbp)a5).c > 0L && !h2) {
                                ((abbp)a5).g(16);
                            }
                            ((abbp)a5).g(4);
                            break Label_1280;
                        }
                        if (!ov || !h2) {
                            return;
                        }
                    }
                    if (((abbp)a5).j()) {
                        ((abbp)a5).h.l(((abbp)a5).h(8), ((abbp)a5).h(16));
                        ((abbp)a5).a(28);
                    }
                    ((abbp)a5).a(4);
                }
                finally {
                    ((abbp)a5).a(32);
                }
            }
            case 11: {
                final aazi aazi = (aazi)this.a;
                if (aazi.p && aazi.q) {
                    aazi.q = false;
                }
                aazi.i();
                return;
            }
            case 10: {
                final abpq c = ((aayn)this.a).a.c;
                c.Z(c.j());
                return;
            }
            case 9: {
                ((View)((CreatorEndscreenOverlayPresenter)this.a).l.b.b).sendAccessibilityEvent(8);
                return;
            }
            case 8: {
                if (((CreatorEndscreenOverlayPresenter)this.a).x()) {
                    final Rect n = ((CreatorEndscreenOverlayPresenter)this.a).w.n();
                    final int width = n.width();
                    final int height = n.height();
                    final aayl f = ((CreatorEndscreenOverlayPresenter)this.a).f;
                    tpe.aG((View)f, (atke)new aavb(f, 5), tpe.aE(width, height), (Class)ViewGroup$LayoutParams.class);
                    for (final aayr aayr : ((CreatorEndscreenOverlayPresenter)this.a).g) {
                        final ajpc b7 = aayr.b;
                        final float j = b7.i;
                        final float n2 = (float)width;
                        final float n3 = j * n2;
                        final float n4 = n3 / b7.k;
                        final int paddingLeft = aayr.c().getPaddingLeft();
                        final int paddingRight = aayr.c().getPaddingRight();
                        final int paddingTop = aayr.c().getPaddingTop();
                        tpe.aF(aayr.c(), tpe.an(new tut[] { tpe.au(Math.round(aayr.b.h * n2) - paddingLeft), tpe.aB(Math.round(aayr.b.j * height) - paddingTop), tpe.aE(Math.round(n3) + paddingLeft + paddingRight, Math.round(n4) + paddingTop + aayr.c().getPaddingBottom()) }), (Class)ViewGroup$MarginLayoutParams.class);
                        final TextView g = aayr.g;
                        if (g != null) {
                            int maxLines;
                            if (n4 > aayr.k) {
                                maxLines = 2;
                            }
                            else {
                                maxLines = 1;
                            }
                            g.setMaxLines(maxLines);
                        }
                        final boolean k = ((CreatorEndscreenOverlayPresenter)this.a).k;
                        if (aayr.j != k) {
                            aayr.j = k;
                            if (!aayr.o.aS()) {
                                continue;
                            }
                            final FrameLayout e2 = aayr.e;
                            if (e2 == null || aayr.f == null || aayr.h == null || aayr.i == null) {
                                continue;
                            }
                            int backgroundResource;
                            if (k) {
                                backgroundResource = 2131231314;
                            }
                            else {
                                backgroundResource = 2131231313;
                            }
                            e2.setBackgroundResource(backgroundResource);
                            final FrameLayout f2 = aayr.f;
                            int backgroundResource2;
                            if (!k) {
                                backgroundResource2 = 2131233409;
                            }
                            else {
                                backgroundResource2 = 2131233410;
                            }
                            f2.setBackgroundResource(backgroundResource2);
                            final View h4 = aayr.h;
                            int backgroundResource3;
                            if (!k) {
                                backgroundResource3 = 2131231317;
                            }
                            else {
                                backgroundResource3 = 2131231318;
                            }
                            h4.setBackgroundResource(backgroundResource3);
                            final View m = aayr.i;
                            int backgroundResource4;
                            if (!k) {
                                backgroundResource4 = 2131231320;
                            }
                            else {
                                backgroundResource4 = 2131231321;
                            }
                            m.setBackgroundResource(backgroundResource4);
                        }
                    }
                    final aazc l2 = ((CreatorEndscreenOverlayPresenter)this.a).l;
                    if (l2 != null) {
                        l2.c();
                    }
                }
                return;
            }
            case 7: {
                ((aaxc)this.a).A();
                return;
            }
            case 6: {
                ((aaxc)this.a).C();
                return;
            }
            case 5: {
                ((aawy)this.a).s(aaxu.c);
                return;
            }
            case 4: {
                ((aawy)this.a).s(aaxu.d);
                return;
            }
            case 3: {
                final aavq aavq = (aavq)this.a;
                final Iterator iterator2 = aavq.a.iterator();
                while (iterator2.hasNext()) {
                    ((aaoc)iterator2.next()).u(false);
                }
                aavq.mk();
                return;
            }
            case 2: {
                final aavq aavq2 = (aavq)this.a;
                final Iterator iterator3 = aavq2.a.iterator();
                while (iterator3.hasNext()) {
                    ((aaoc)iterator3.next()).t();
                }
                aavq2.b = null;
                aavq2.mk();
                return;
            }
            case 1: {
                ((abde)((aave)this.a).k).f();
                return;
            }
            case 0: {
                final aave aave = (aave)this.a;
                aave.j.removeView((View)aave.k);
            }
        }
    }
}
