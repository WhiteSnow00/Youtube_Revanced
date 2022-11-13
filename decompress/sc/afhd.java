import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import java.util.concurrent.TimeUnit;
import j$.util.Optional;
import java.util.Locale;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.view.View$OnFocusChangeListener;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.Toast;
import android.util.Log;
import org.json.JSONObject;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import androidx.preference.ListPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afhd
{
    public final Object a;
    
    public afhd() {
    }
    
    public afhd(final aalh a) {
        this.a = a;
    }
    
    public afhd(final aaur a) {
        this.a = a;
    }
    
    public afhd(final aaus a) {
        this.a = a;
    }
    
    public afhd(final aawr a) {
        this.a = a;
    }
    
    public afhd(final abdr a) {
        this.a = a;
    }
    
    public afhd(final abgg a) {
        this.a = a;
    }
    
    public afhd(final aboh a) {
        this.a = a;
    }
    
    public afhd(final abpq a) {
        this.a = a;
    }
    
    public afhd(final abve a) {
        this.a = a;
    }
    
    public afhd(final acnz a) {
        this.a = a;
    }
    
    public afhd(final adcp a) {
        this.a = a;
    }
    
    public afhd(final adet a, final byte[] array) {
        this.a = a;
    }
    
    public afhd(final adlp a, final byte[] array) {
        this.a = a;
    }
    
    public afhd(final adlp a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public afhd(final adyh a) {
        this.a = a;
    }
    
    public afhd(final adzf a) {
        this.a = a;
    }
    
    public afhd(final aeam a) {
        this.a = a;
    }
    
    public afhd(final aezf a) {
        this.a = a;
    }
    
    public afhd(final afhd a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public afhd(final aglu a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public afhd(final ahdc a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public afhd(final ListPreference a) {
        this.a = a;
    }
    
    public afhd(final asiq a) {
        this.a = a;
    }
    
    public afhd(final atke a) {
        this.a = a;
    }
    
    public afhd(final ScreencastHostService a) {
        this.a = a;
    }
    
    public afhd(final ScreencastHostService a, final byte[] array) {
        this.a = a;
    }
    
    public afhd(final LiveCreationActivity a) {
        this.a = a;
    }
    
    public afhd(final RemotePlaybackControlsService a) {
        this.a = a;
    }
    
    public afhd(final MaterialButtonToggleGroup a) {
        this.a = a;
    }
    
    public afhd(final FloatingActionButton a) {
        this.a = a;
    }
    
    public afhd(final Object a) {
        this.a = a;
    }
    
    public afhd(final Runnable a) {
        this.a = a;
    }
    
    public afhd(final jyb a) {
        this.a = a;
    }
    
    public afhd(final kcn a) {
        this.a = a;
    }
    
    public afhd(final nq a) {
        this.a = a;
    }
    
    public afhd(final wky a) {
        this.a = a;
    }
    
    public afhd(final wky a, final byte[] array) {
        this.a = a;
    }
    
    public afhd(final wov a) {
        this.a = a;
    }
    
    public afhd(final wpu a) {
        this.a = a;
    }
    
    public afhd(final wsr a) {
        this.a = a;
    }
    
    public afhd(final wtm a) {
        this.a = a;
    }
    
    public afhd(final wwc a) {
        this.a = a;
    }
    
    public afhd(final wwc a, final byte[] array) {
        this.a = a;
    }
    
    public afhd(final wwq a) {
        this.a = a;
    }
    
    public afhd(final wws a) {
        this.a = a;
    }
    
    public afhd(final xby a) {
        this.a = a;
    }
    
    public afhd(final xfx a) {
        this.a = a;
    }
    
    public afhd(final xhp a) {
        this.a = a;
    }
    
    public afhd(final xip a) {
        this.a = a;
    }
    
    public afhd(final xkf a) {
        this.a = a;
    }
    
    public afhd(final xle a) {
        this.a = a;
    }
    
    public afhd(final xop a) {
        this.a = a;
    }
    
    public afhd(final xov a) {
        this.a = a;
    }
    
    public afhd(final xoy a) {
        this.a = a;
    }
    
    public afhd(final xph a) {
        this.a = a;
    }
    
    public static final String C(final JSONObject jsonObject) {
        return jsonObject.optString("listId", xne.a.g);
    }
    
    public static final String D(final JSONObject jsonObject) {
        final String b = xne.a.b;
        String s;
        if (jsonObject.has("videoId")) {
            s = jsonObject.optString("videoId", b);
        }
        else {
            s = jsonObject.optString("video_id", b);
        }
        return s;
    }
    
    public static void E() {
        ttr.b("Failed to recordNotificationsShown");
    }
    
    private static final int K(final JSONObject jsonObject) {
        return jsonObject.optInt("currentIndex", xne.a.h);
    }
    
    public final void A(final JSONObject jsonObject) {
        if (jsonObject.has("currentTime")) {
            ((xop)this.a).W = jsonObject.getInt("currentTime") * 1000L;
        }
        else if (jsonObject.has("current_time")) {
            ((xop)this.a).W = jsonObject.getInt("current_time") * 1000L;
        }
        else {
            ((xop)this.a).W = 0L;
        }
        ((xop)this.a).ac = jsonObject.has("liveIngestionTime");
        final xop xop = (xop)this.a;
        if (xop.ac) {
            xop.Y = jsonObject.optInt("seekableEndTime", 0) * 1000L;
        }
        else {
            xop.Y = jsonObject.optInt("duration", 0) * 1000L;
        }
        if (((xop)this.a).ac && jsonObject.has("seekableStartTime")) {
            ((xop)this.a).Z = jsonObject.getInt("seekableStartTime") * 1000L;
        }
        else {
            ((xop)this.a).Z = -1L;
        }
        if (jsonObject.has("liveIngestionTime")) {
            ((xop)this.a).aa = jsonObject.getInt("liveIngestionTime") * 1000L;
        }
        else {
            ((xop)this.a).aa = -1L;
        }
        final xop xop2 = (xop)this.a;
        xop2.V = xop2.j.d();
        xop.z((xop)this.a);
    }
    
    public final void B(final JSONObject jsonObject) {
        final Object a = this.a;
        final int optInt = jsonObject.optInt("state", xnf.a.o);
        while (true) {
            for (final xnf a2 : xnf.values()) {
                if (a2.o == optInt) {
                    ((xop)a).r(a2, false);
                    return;
                }
            }
            xnf a2 = xnf.a;
            continue;
        }
    }
    
    public final void F() {
        ((wwq)this.a).a();
    }
    
    public final void G(final Exception ex) {
        final Object a = this.a;
        Log.e("SelfViewWindow", "Camera preview failed", (Throwable)ex);
        final wpu wpu = (wpu)a;
        final String string = wpu.f.getResources().getString(2132017601);
        final wps p = wpu.p;
        if (p != null) {
            Log.e("ScreencastControls", "Disabling camera preview support due to camera error.");
            ((wpp)p).c.l(false);
        }
        else {
            Toast.makeText(wpu.f, (CharSequence)string, 0).show();
        }
        wpu.e(false, (Runnable)null);
        final wov t = wpu.t;
        if (t != null) {
            t.k();
            wpu.t.b();
        }
    }
    
    public final boolean H() {
        return ((ScreencastHostService)this.a).l.c.I;
    }
    
    public final void I(final String s) {
        final ScreencastHostService screencastHostService = (ScreencastHostService)this.a;
        ((qsa)screencastHostService.i.g.a()).b(new Object[] { s });
        if (!s.equals("SUCCESS") && screencastHostService.q.q() > 0) {
            screencastHostService.j();
            screencastHostService.l.i(2132019545);
        }
    }
    
    public final void J(final boolean b) {
        final Object a = this.a;
        if (b) {
            ((wky)a).i.g(14);
            return;
        }
        final wky wky = (wky)a;
        wky.i(26, (String)null, wky.s ^ true);
    }
    
    public final Object a(final Object o) {
        return ((aezf)this.a).apply(o);
    }
    
    public final void b(final TextInputLayout textInputLayout) {
        final aeam aeam = (aeam)this.a;
        final EditText j = aeam.j;
        if (j == textInputLayout.c) {
            return;
        }
        if (j != null) {
            j.removeTextChangedListener(aeam.k);
            if (((aeam)this.a).j.getOnFocusChangeListener() == ((aeam)this.a).b().d()) {
                ((aeam)this.a).j.setOnFocusChangeListener((View$OnFocusChangeListener)null);
            }
        }
        final Object a = this.a;
        final EditText c = textInputLayout.c;
        final aeam aeam2 = (aeam)a;
        aeam2.j = c;
        final EditText i = aeam2.j;
        if (i != null) {
            i.addTextChangedListener(aeam2.k);
        }
        ((aeam)this.a).b().g(((aeam)this.a).j);
        final aeam aeam3 = (aeam)this.a;
        aeam3.o(aeam3.b());
    }
    
    public final void c(final View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((adzf)this.a).e(0);
    }
    
    public final void d(final Drawable drawable) {
        if (drawable != null) {
            FloatingActionButton.c((FloatingActionButton)this.a, drawable);
        }
    }
    
    public final boolean e() {
        return ((FloatingActionButton)this.a).b;
    }
    
    public final asht f(final String s) {
        return ((asht)((adet)this.a).a).K((asjs)new ush(s, 11)).Z((asjr)ablr.j);
    }
    
    public final void g() {
        final adcp adcp = (adcp)this.a;
        int height = adcp.ak.getHeight();
        for (int i = 0; i < adcp.al.getChildCount(); ++i) {
            height += adcp.al.getChildAt(i).getHeight();
        }
        final AnchorableTopPeekingScrollView ai = adcp.ai;
        if (!ai.n) {
            return;
        }
        ai.p = height;
        final int k = ((TopPeekingScrollView)ai).k;
        final int min = Math.min(height + (k + k) - ai.o, k);
        ((tqx)ai).b(min, min);
        ((tqx)ai).c(min);
    }
    
    public final void h(final int n) {
        final acnz acnz = (acnz)this.a;
        acnz.j = acnz.n(n);
        acnz.w();
        acnz.p();
        acnz.q();
    }
    
    public final abke i() {
        return ((abve)this.a).k;
    }
    
    public final abzl j() {
        return ((abve)this.a).s();
    }
    
    public final void k(final boolean b) {
        final abve abve = (abve)this.a;
        final abvu h = abve.h;
        if (h != null) {
            aakt.N(h.a, 0L);
            if (!aakt.P(abve.s())) {
                h.a.i().j();
            }
            abve.aA(abka.h, h.a);
        }
        if (abve.g == null && !abrj.ah(abve.q, aakt.Q(abve.s()), aakt.P(abve.s()))) {
            if (!aakt.P(abve.s())) {
                final kkg p = abve.p;
                if (!p.a) {
                    p.a = true;
                    zlm.b(zll.b, zlk.j, "got onInterstitialVideoEnded without a savedContentVideoState. This should not happen");
                }
            }
        }
        else {
            abve.R();
            if (b) {
                final abzi n = abve.f.a.n();
                final abzg e = n.e;
                if (e != null) {
                    final tan c = e.c;
                    if (c != null) {
                        n.a((Runnable)new abuv(c, 3, null, null));
                    }
                }
            }
            else {
                final abzi n2 = abve.f.a.n();
                final abzg e2 = n2.e;
                if (e2 != null) {
                    final tan c2 = e2.c;
                    if (c2 != null) {
                        n2.a((Runnable)new abuv(c2, 2, null, null));
                    }
                }
            }
            if (abrj.ah(abve.q, aakt.Q(abve.s()), aakt.P(abve.s())) && !abve.al().f()) {
                abke abke;
                if (abve.n) {
                    abke = abke.j;
                }
                else {
                    abke = abke.g;
                }
                abve.ao(abke);
            }
        }
    }
    
    public final void l(final abke abke) {
        ((abve)this.a).ao(abke);
    }
    
    public final void m(final abvu abvu) {
        ((abve)this.a).ap(abvu);
    }
    
    public final void n(final abzl abzl, final int n, final long n2, final long n3, final long n4, final long n5) {
        ((abve)this.a).az(abzl, n, n2, n3, n4, n5);
    }
    
    public final void o(final int o) {
        ((abve)this.a).o = o;
    }
    
    public final void p(final abzl abzl, final int n) {
        ((abve)this.a).ax(abzl, n, 0);
    }
    
    public final void q(final abkh abkh) {
        ((abve)this.a).ay(abkh, 4);
    }
    
    public final void r(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final boolean b) {
        tbi.f();
        ((abpq)this.a).q.g();
        if (b) {
            ((abpq)this.a).n.b();
            ((abpq)this.a).m.e();
        }
        if (tum.g(((abpq)this.a).a)) {
            ((abpq)this.a).i.c();
        }
        final Object a = ((abpq)this.a).u.a;
        if (a != null && ((abvb)a).U(playbackStartDescriptor, abjt)) {
            return;
        }
        ((abpq)this.a).o.e(playbackStartDescriptor, abjt);
    }
    
    public final void s() {
        ((aboh)this.a).a();
    }
    
    public final void t() {
        ((aaus)((adlp)this.a).a).c();
    }
    
    public final void u(final long n) {
        final aaus aaus = (aaus)this.a;
        aaus.a.post((Runnable)new ypp(aaus, n, 4));
        aaus.c();
    }
    
    public final void v(final int n, final int n2, final int n3) {
        ((xoy)this.a).q = n3 + 1;
        xmx xmx;
        if (n2 != 0) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        xmx = xmx.h;
                    }
                    else {
                        xmx = xmx.f;
                    }
                }
                else {
                    xmx = xmx.d;
                }
            }
            else {
                xmx = xmx.d;
            }
        }
        else {
            xmx = xmx.b;
        }
        ttr.c(xoy.a, String.format(Locale.US, "Could not find cloud screen corresponding to DIAL device %s, %s", ((xoy)this.a).k, xmx));
        final Object a = this.a;
        ames ames;
        if (n2 != 0) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        ames = ames.a;
                    }
                    else {
                        ames = ames.K;
                    }
                }
                else {
                    ames = ames.E;
                }
            }
            else {
                ames = ames.n;
            }
        }
        else {
            ames = ames.m;
        }
        ((xoy)a).ao(xmx, ames, Optional.of((Object)n));
    }
    
    public final xne w(final JSONObject jsonObject) {
        if (((xop)this.a).F.i(D(jsonObject))) {
            final xnd c = xne.c();
            c.d(C(jsonObject));
            c.g(D(jsonObject));
            c.e(xne.a(K(jsonObject)));
            final xne f = ((xop)this.a).F;
            c.c = f.i;
            c.d = f.j;
            c.b(f.e);
            String.format("Parsing Playback results in MdxPlaybackDescriptor=%s", c.a());
            return c.a();
        }
        final xnd c2 = xne.c();
        c2.d(C(jsonObject));
        c2.g(D(jsonObject));
        c2.e(xne.a(K(jsonObject)));
        final boolean has = jsonObject.has("params");
        final String s = null;
        String string;
        if (has) {
            string = jsonObject.getString("params");
        }
        else {
            string = null;
        }
        c2.c = string;
        String string2 = s;
        if (jsonObject.has("playerParams")) {
            string2 = jsonObject.getString("playerParams");
        }
        c2.d = string2;
        return c2.a();
    }
    
    public final void x(final JSONObject jsonObject, final boolean b) {
        if (((xop)this.a).O != null && jsonObject.has("adState")) {
            final Object a = this.a;
            final int int1 = jsonObject.getInt("adState");
            xnf xnf;
            if (int1 == xnf.a.o) {
                xnf = xnf.g;
            }
            else if (int1 == xnf.b.o) {
                xnf = xnf.j;
            }
            else {
                xnf = xnf.i;
                if (int1 != xnf.o) {
                    if (int1 == xnf.c.o) {
                        xnf = xnf.h;
                    }
                    else if (int1 == xnf.d.o) {
                        xnf = xnf.k;
                    }
                    else if (int1 == xnf.e.o) {
                        xnf = xnf.l;
                    }
                    else {
                        final String n = xnf.n;
                        final StringBuilder sb = new StringBuilder("YouTube MDx: invalid ad state code ");
                        sb.append(int1);
                        sb.append(".");
                        ttr.c(n, sb.toString());
                        xnf = xnf.g;
                    }
                }
            }
            ((xop)a).r(xnf, b);
        }
    }
    
    public final void y(final JSONObject jsonObject) {
        if (((xop)this.a).O != null) {
            jsonObject.optInt("podPosition", 0);
            jsonObject.optInt("podLength", 0);
            jsonObject.optLong("podRemainingTime", 0L);
            ((xop)this.a).j.d();
        }
    }
    
    public final void z(final JSONObject jsonObject) {
        if (((xop)this.a).O != null && jsonObject.has("currentTime")) {
            ((xop)this.a).W = TimeUnit.SECONDS.toMillis(jsonObject.getInt("currentTime"));
            final xop xop = (xop)this.a;
            xop.V = xop.j.d();
            xop.z((xop)this.a);
        }
    }
}
