import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Handler;
import java.io.EOFException;
import androidx.media3.common.Metadata;
import android.media.browse.MediaBrowser$MediaItem;
import android.os.Parcel;
import java.util.List;
import android.os.Message;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import com.google.protobuf.MessageLite;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map$_CC;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import android.media.AudioAttributes$Builder;
import android.service.media.MediaBrowserService$Result;
import android.os.Messenger;
import android.media.AudioDeviceInfo;
import android.content.res.Configuration;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhu
{
    private static bhu b;
    public final Object a;
    
    public bhu() {
        this.a = new bar(10);
    }
    
    public bhu(final long n) {
        final ArrayList a = new ArrayList();
        this.a = a;
        final ArrayList list = a;
        a.add(n);
    }
    
    public bhu(final adcr a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public bhu(final Configuration a) {
        this.a = a;
        new abm(500);
    }
    
    public bhu(final AudioDeviceInfo a) {
        this.a = a;
    }
    
    public bhu(final Messenger a) {
        this.a = a;
    }
    
    public bhu(final MediaBrowserService$Result a) {
        this.a = a;
    }
    
    public bhu(final arud a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public bhu(final atjj a) {
        a.getClass();
        this.a = a;
    }
    
    public bhu(final axt axt) {
        final AudioAttributes$Builder setUsage = new AudioAttributes$Builder().setContentType(axt.b).setFlags(0).setUsage(axt.c);
        if (baw.a >= 29) {
            axr.a(setUsage, 1);
        }
        if (baw.a >= 32) {
            axs.a(setUsage, 0);
        }
        this.a = setUsage.build();
    }
    
    public bhu(final bbj a) {
        this.a = a;
    }
    
    public bhu(final dss dss) {
        this.a = new ArrayList();
        dss.q();
        this.n(new dtr(System.currentTimeMillis(), 0L));
    }
    
    public bhu(final duz a) {
        this.a = a;
    }
    
    private bhu(final String a) {
        this.a = a;
    }
    
    public bhu(final String s, final int n, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(n);
        sb.append(s2);
        this.a = sb.toString();
    }
    
    public bhu(final tku a) {
        this.a = a;
    }
    
    public bhu(final tmj a) {
        this.a = a;
    }
    
    public bhu(final toa toa, final hob hob, final kzd kzd, final byte[] array) {
        this.a = asgt.e((aujo)toa.c(), (aujo)hob.f, (asit)new r(toa, kzd, 1));
    }
    
    public bhu(final uyf a) {
        this.a = a;
    }
    
    public bhu(final uyi uyi, final fjp fjp, final aum aum, final mrm mrm, final aamd aamd, final xlv xlv, final asho asho, final uyi uyi2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new fom(aum, aamd, null);
        mrm.A((Callable)new fol(this, uyi, ashe.m((ashh)fjp.k(), (ashh)uyi2.cm(), (asit)new gcn(xlv, 1)), asho, 0, null, null, null));
    }
    
    public bhu(final byte[] array) {
        this.a = new CopyOnWriteArrayList();
    }
    
    public bhu(final byte[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public bhu(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new ArrayList();
    }
    
    public bhu(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = new ArrayList();
    }
    
    public bhu(final byte[] array, final char[] array2) {
        this.a = new ConcurrentHashMap();
    }
    
    public bhu(final char[] array) {
        this.a = new HashMap();
    }
    
    public bhu(final short[] array) {
        this.a = afcw.j((Iterable)Arrays.asList(H("player_overlay_splash_screen", 1, -20), H("player_overlay_placeholder_image", 1, -15), H("player_overlay_paid_content", 1, -10), H("player_overlay_live", 1, -5), H("player_overlay_creator_endscreen", 1, 0), H("player_overlay_fullscreen_engagement", 1, 5), H("player_overlay_timed_reaction_live", 1, 10), H("player_overlay_caption", 5, -25), H("player_overlay_inline_muted_controls", 9, -25), H("player_overlay_player_autonav_endscreen", 9, -20), H("player_overlay_mdx_header_text", 9, -15), H("player_overlay_live_chat_fullscreen", 9, -10), H("player_overlay_live_chat_entry_point", 9, -5), H("player_overlay_ads_cta", 13, -35), H("player_overlay_playback_controls", 13, -30), H("player_overlay_inline_playback_control_buttons", 13, -28), H("player_overlay_player_seek_edu", 13, -27), H("player_overlay_markers_message", 13, -25), H("player_overlay_suggested_actions", 13, 25), H("player_overlay_nerd_stats", 17, -45), H("player_overlay_in_video_programming", 17, -40), H("player_overlay_player_info_card_drawer", 17, -35), H("player_overlay_info_card_teaser", 17, -30), H("player_overlay_player_trailer_label", 17, -25), H("player_overlay_rental_activation", 17, -20), H("player_overlay_inline_ad", 17, -15), H("player_overlay_text_banner", 17, -14), H("player_overlay_survey", 17, -10), H("player_overlay_endcap", 17, -5), H("player_overlay_elements_ad_video_end", 17, 0), H("player_overlay_mdx_ad", 17, 5), H("player_overlay_no_sound_memo", 17, 10), H("player_overlay_watch_in_vr", 17, 15), H("player_overlay_pip_ad", 17, 20), H("player_overlay_product_in_video", 17, 25), H("player_overlay_timed_reaction_animation", 17, 30), H("player_overlay_mdx_status", 17, 35), H("player_overlay_mdx_autoplay", 17, 40), H("player_overlay_fullscreen_engagement_panel_scrim", 17, 45), H("player_overlay_pip_paid_product_badge", 17, 46), H("player_overlay_mini_player_error", 17, 47), H("player_overlay_gated_actions", 17, 48)));
    }
    
    private static Map.Entry H(final String s, final int n, final int n2) {
        return Map$_CC.entry((Object)s, (Object)new giq(n, n2, (byte[])null));
    }
    
    public static bhu h(final bar bar) {
        bar.H(2);
        final int i = bar.i();
        final int n = i >> 1;
        final int n2 = bar.i() >> 3 | (i & 0x1) << 5;
        String s;
        if (n != 4 && n != 5 && n != 7) {
            if (n == 8) {
                s = "hev1";
            }
            else {
                if (n != 9) {
                    return null;
                }
                s = "avc3";
            }
        }
        else {
            s = "dvhe";
        }
        String s2;
        if (n2 < 10) {
            s2 = ".0";
        }
        else {
            s2 = ".";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(".0");
        sb.append(n);
        sb.append(s2);
        sb.append(n2);
        return new bhu(sb.toString());
    }
    
    public static void i(final dum dum, final duu b, final dsw dsw) {
        dum.b = b;
        final Object[] d = dum.d;
        if (d != null) {
            d[0] = dsw;
        }
    }
    
    public static bhu u(final Configuration configuration) {
        synchronized (bhu.class) {
            final bhu b = bhu.b;
            if (b == null || !((Configuration)b.a).equals(configuration)) {
                bhu.b = new bhu(new Configuration(configuration));
            }
            return bhu.b;
        }
    }
    
    public final ListenableFuture A(final aexg aexg) {
        return ((tku)this.a).b(aexg);
    }
    
    public final aexq B(final String s) {
        return aexq.j(((Map<K, Object>)this.a).get((Object)s));
    }
    
    public final void C(final String s) {
        ((Map<Object, Object>)this.a).remove(s);
    }
    
    public final void D(final String s, final Object o) {
        ((Map<String, Object>)this.a).put(s, o);
    }
    
    public final boolean E() {
        alvl alvl;
        if ((alvl = ((uyf)this.a).b().e) == null) {
            alvl = alvl.a;
        }
        return !alvl.aL;
    }
    
    public final int F() {
        alvl alvl;
        if ((alvl = ((uyf)this.a).b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bd;
    }
    
    public final void G(final wwv wwv, final akfw akfw) {
        if (akfw.j.H()) {
            if (((adcr)this.a).aG((MessageLite)akfw)) {
                akfx akfx;
                if ((akfx = akfw.f) == null) {
                    akfx = akfx.a;
                }
                akgf a;
                if (akfx.b == 58173949) {
                    a = (akgf)akfx.c;
                }
                else {
                    a = akgf.a;
                }
                final akfz akfz = a.c.get(0);
                aopg a2;
                if (akfz.b == 58174010) {
                    a2 = (aopg)akfz.c;
                }
                else {
                    a2 = aopg.a;
                }
                aopc aopc;
                if ((aopc = a2.k) == null) {
                    aopc = aopc.a;
                }
                anws anws;
                if ((anws = aopc.c) == null) {
                    anws = anws.a;
                }
                final adcr adcr = (adcr)this.a;
                agot.u(adcr.aG((MessageLite)akfw));
                wwv.D(xkm.aq(adcr.aH((MessageLite)akfw)));
                if ((akfw.b & 0x2) != 0x0) {
                    akfr akfr;
                    if ((akfr = akfw.d) == null) {
                        akfr = akfr.a;
                    }
                    Object o = null;
                    Label_1489: {
                        if (akfr != null) {
                            final int b = akfr.b;
                            if (b == 91395562) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 46407682) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 81531855) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 50236216) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 96706488) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 53272665) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 173693512) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 225413481) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 173602558) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 259982244) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 173690432) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 252479813) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 287582849) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 355720823) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 84636745) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 64375887) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 101397128) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 126869174) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 102284451) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 63832717) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 72757052) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 85538925) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 87361605) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 90074186) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 97168018) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 116164391) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 125787527) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 220023574) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 380650365) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 99965204) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 100402590) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 102883021) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 111153703) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 155144651) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 155554693) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 156098381) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 159058187) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 188799247) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 144757704) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 196904101) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 208257221) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 369918284) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 251530672) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 247977373) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 200097345) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 211108887) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 149687644) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 217771576) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 313670307) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 311386127) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 338099421) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 153515154) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 361905772) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 361650780) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 359119476) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 423195318) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 416861471) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 320273507) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 100977426) {
                                o = akfr.c;
                                break Label_1489;
                            }
                            if (b == 431580795) {
                                o = akfr.c;
                                break Label_1489;
                            }
                        }
                        o = null;
                    }
                    if (((adcr)this.a).aG((MessageLite)o)) {
                        ((adcr)this.a).aF(wwv, (MessageLite)o, (MessageLite)akfw);
                    }
                }
                if (((adcr)this.a).aG((MessageLite)a2)) {
                    ((adcr)this.a).aF(wwv, (MessageLite)a2, (MessageLite)akfw);
                }
                if (((adcr)this.a).aG((MessageLite)anws)) {
                    ((adcr)this.a).aF(wwv, (MessageLite)anws, (MessageLite)a2);
                }
                final Iterator<Object> iterator = anws.d.iterator();
                while (iterator.hasNext()) {
                    final MessageLite q = whx.Q((anwv)iterator.next());
                    if (((adcr)this.a).aG(q)) {
                        ((adcr)this.a).aF(wwv, q, (MessageLite)anws);
                    }
                    if (q instanceof anii) {
                        final anii anii = (anii)q;
                        for (final anik anik : anii.d) {
                            Object o2 = null;
                            Label_1958: {
                                if (anik != null) {
                                    final int b2 = anik.b;
                                    if ((b2 & 0x1) != 0x0) {
                                        if ((o2 = anik.c) == null) {
                                            o2 = anip.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x2) != 0x0) {
                                        if ((o2 = anik.d) == null) {
                                            o2 = apmc.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x4) != 0x0) {
                                        if ((o2 = anik.e) == null) {
                                            o2 = ahvs.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x8) != 0x0) {
                                        if ((o2 = anik.f) == null) {
                                            o2 = aixw.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x10) != 0x0) {
                                        if ((o2 = anik.g) == null) {
                                            o2 = anpq.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x20) != 0x0) {
                                        if ((o2 = anik.h) == null) {
                                            o2 = aiwc.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x40) != 0x0) {
                                        if ((o2 = anik.i) == null) {
                                            o2 = amfe.a;
                                        }
                                        break Label_1958;
                                    }
                                    else if ((b2 & 0x80) != 0x0) {
                                        if ((o2 = anik.j) == null) {
                                            o2 = aorv.a;
                                        }
                                        break Label_1958;
                                    }
                                }
                                o2 = null;
                            }
                            if (((adcr)this.a).aG(q)) {
                                ((adcr)this.a).aF(wwv, (MessageLite)o2, (MessageLite)anii);
                            }
                        }
                    }
                }
                ((adcr)this.a).aI(wwv, (MessageLite)akfw);
            }
            return;
        }
        wwv.D((wxz)new wws(akfw.j));
    }
    
    public final IBinder a() {
        return ((Messenger)this.a).getBinder();
    }
    
    public final void b(final int what, final Bundle data) {
        final Message obtain = Message.obtain();
        obtain.what = what;
        obtain.arg1 = 2;
        obtain.setData(data);
        ((Messenger)this.a).send(obtain);
    }
    
    public final void c(Object a) {
        final boolean b = a instanceof List;
        final Object o = null;
        if (b) {
            final Object a2 = this.a;
            final List list = (List)a;
            Object o2;
            if (list == null) {
                o2 = o;
            }
            else {
                final ArrayList list2 = new ArrayList(list.size());
                final Iterator iterator = list.iterator();
                while (true) {
                    o2 = list2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final Parcel parcel = (Parcel)iterator.next();
                    parcel.setDataPosition(0);
                    list2.add((Object)MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            ((MediaBrowserService$Result)a2).sendResult(o2);
            return;
        }
        if (a instanceof Parcel) {
            final Parcel parcel2 = (Parcel)a;
            parcel2.setDataPosition(0);
            a = this.a;
            ((MediaBrowserService$Result)a).sendResult(MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
            return;
        }
        ((MediaBrowserService$Result)this.a).sendResult((Object)null);
    }
    
    public final Metadata d(final btj btj, final bvj bvj) {
        Object c = null;
        int n = 0;
        while (true) {
            try {
                while (true) {
                    btj.j(((bar)this.a).a, 0, 10);
                    ((bar)this.a).G(0);
                    if (((bar)this.a).k() != 4801587) {
                        break;
                    }
                    ((bar)this.a).H(3);
                    final int h = ((bar)this.a).h();
                    final int n2 = h + 10;
                    if (c == null) {
                        c = new byte[n2];
                        System.arraycopy(((bar)this.a).a, 0, c, 0, 10);
                        btj.j((byte[])c, 10, h);
                        c = new bvk(bvj).c((byte[])c, n2);
                    }
                    else {
                        btj.g(h);
                    }
                    n += n2;
                }
                btj.l();
                btj.g(n);
                return (Metadata)c;
            }
            catch (final EOFException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void e(final Handler handler, final brc brc) {
        dk.d((Object)handler);
        dk.d((Object)brc);
        this.g(brc);
        ((CopyOnWriteArrayList<qv>)this.a).add(new qv(handler, brc));
    }
    
    public final void f(final int n, final long n2, final long n3) {
        for (final qv qv : (CopyOnWriteArrayList)this.a) {
            if (!qv.b) {
                ((Handler)qv.a).post((Runnable)new brb(qv, n, n2, n3, 0, (byte[])null));
            }
        }
    }
    
    public final void g(final brc brc) {
        for (final qv qv : (CopyOnWriteArrayList)this.a) {
            if (qv.c == brc) {
                qv.b = true;
                ((CopyOnWriteArrayList)this.a).remove(qv);
            }
        }
    }
    
    public final void j(final dsw dsw, final duu duu, final String s) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            final sin sin = ((Map<K, sin>)this.a).get(s);
            if (sin == null) {
                monitorexit(this);
                return;
            }
            sin.a = true;
            for (int c = ((abo)sin.b).c(), i = 0; i < c; ++i) {
                i((dum)((abo)sin.b).e(i), duu, dsw);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void k() {
        monitorenter(this);
        try {
            final Iterator<Object> iterator = ((Map<Object, V>)this.a).keySet().iterator();
            while (iterator.hasNext()) {
                final sin sin = ((Map<K, sin>)this.a).get(iterator.next());
                if (sin != null && sin.a) {
                    sin.a = false;
                }
                else {
                    iterator.remove();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void l(final String s, final dum dum) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            sin sin = ((Map<K, sin>)this.a).get(s);
            final dsw dsw = null;
            dum dum2;
            if (sin == null) {
                sin = new sin((short[])null);
                ((Map<String, sin>)this.a).put(s, sin);
                dum2 = null;
            }
            else {
                dum2 = (dum)((abo)sin.b).d(dum.c);
            }
            if (dum.c(dum2)) {
                final Object[] d = dum.d;
                dsw dsw2;
                if (d == null) {
                    dsw2 = dsw;
                }
                else {
                    dsw2 = (dsw)d[0];
                }
                i(dum2, dum.b, dsw2);
                return;
            }
            ((abo)sin.b).h(dum.c, (Object)dum);
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final dum m() {
        if (((duz)this.a).bh() != null) {
            return ((duz)this.a).bh().j;
        }
        return null;
    }
    
    public final void n(final dtr dtr) {
        ((List<dtr>)this.a).add(dtr);
    }
    
    public final ddr o(final Class clazz) {
        monitorenter(this);
        try {
            for (int size = ((List)this.a).size(), i = 0; i < size; ++i) {
                final eaa eaa = ((List<eaa>)this.a).get(i);
                if (((Class)eaa.b).isAssignableFrom(clazz)) {
                    final Object a = eaa.a;
                    monitorexit(this);
                    return (ddr)a;
                }
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void p(final Class clazz, final ddr ddr) {
        synchronized (this) {
            ((List<eaa>)this.a).add(new eaa(clazz, ddr));
        }
    }
    
    public final List q() {
        synchronized (this) {
            return (List)this.a;
        }
    }
    
    public final void r(final ddd ddd) {
        synchronized (this) {
            ((List<ddd>)this.a).add(ddd);
        }
    }
    
    public final ddb s(final Class clazz) {
        monitorenter(this);
        try {
            for (eaa eaa : this.a) {
                if (((Class)eaa.b).isAssignableFrom(clazz)) {
                    final Object a = eaa.a;
                    monitorexit(this);
                    return (ddb)a;
                }
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void t(final Class clazz, final ddb ddb) {
        synchronized (this) {
            ((List<eaa>)this.a).add(new eaa(clazz, ddb));
        }
    }
    
    public final frb v(final SwipeRefreshLayout swipeRefreshLayout) {
        final sin sin = (sin)((atjj)this.a).a();
        sin.getClass();
        swipeRefreshLayout.getClass();
        return new frb(sin, swipeRefreshLayout, null, null, null);
    }
    
    public final long z() {
        if (((ArrayList)this.a).isEmpty()) {
            return 0L;
        }
        return ((ArrayList)this.a).get(0);
    }
}
