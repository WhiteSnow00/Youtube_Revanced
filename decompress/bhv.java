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
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import android.media.AudioAttributes$Builder;
import android.service.media.MediaBrowserService$Result;
import android.os.Messenger;
import android.media.AudioDeviceInfo;
import android.content.res.Configuration;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhv
{
    private static bhv b;
    public final Object a;
    
    public bhv() {
        this.a = new bas(10);
    }
    
    public bhv(final long n) {
        final ArrayList a = new ArrayList();
        this.a = a;
        final ArrayList list = a;
        a.add(n);
    }
    
    public bhv(final aeea a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public bhv(final Configuration a) {
        this.a = a;
        new abn(500);
    }
    
    public bhv(final AudioDeviceInfo a) {
        this.a = a;
    }
    
    public bhv(final Messenger a) {
        this.a = a;
    }
    
    public bhv(final MediaBrowserService$Result a) {
        this.a = a;
    }
    
    public bhv(final arwh a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public bhv(final atke a) {
        a.getClass();
        this.a = a;
    }
    
    public bhv(final axu axu) {
        final AudioAttributes$Builder setUsage = new AudioAttributes$Builder().setContentType(axu.b).setFlags(0).setUsage(axu.c);
        if (bax.a >= 29) {
            axs.a(setUsage, 1);
        }
        if (bax.a >= 32) {
            axt.a(setUsage, 0);
        }
        this.a = setUsage.build();
    }
    
    public bhv(final bbk a) {
        this.a = a;
    }
    
    public bhv(final dst dst) {
        this.a = new ArrayList();
        dst.q();
        this.n(new dts(System.currentTimeMillis(), 0L));
    }
    
    public bhv(final dva a) {
        this.a = a;
    }
    
    private bhv(final String a) {
        this.a = a;
    }
    
    public bhv(final String s, final int n, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(n);
        sb.append(s2);
        this.a = sb.toString();
    }
    
    public bhv(final tgd a) {
        this.a = a;
    }
    
    public bhv(final tmx a) {
        this.a = a;
    }
    
    public bhv(final tqf tqf, final hox hox, final lag lag, final byte[] array) {
        this.a = ashi.e((auke)tqf.c(), (auke)hox.f, (asji)new q(tqf, lag, 1));
    }
    
    public bhv(final vaf a) {
        this.a = a;
    }
    
    public bhv(final vai vai, final fjv fjv, final aun aun, final msr msr, final aanx aanx, final xnt xnt, final asid asid, final vai vai2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new for(aun, aanx, (byte[])null, (byte[])null);
        msr.Q((Callable)new foq(this, vai, asht.n((ashw)fjv.k(), (ashw)vai2.cn(), (asji)new gcv(xnt, 1)), asid, 0, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public bhv(final byte[] array) {
        this.a = new CopyOnWriteArrayList();
    }
    
    public bhv(final byte[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public bhv(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new ArrayList();
    }
    
    public bhv(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = new ArrayList();
    }
    
    public bhv(final byte[] array, final char[] array2) {
        this.a = new ConcurrentHashMap();
    }
    
    public bhv(final char[] array) {
        this.a = new HashMap();
    }
    
    public bhv(final short[] array) {
        this.a = afev.j(Arrays.asList(H("player_overlay_splash_screen", 1, -20), H("player_overlay_placeholder_image", 1, -15), H("player_overlay_lock_mode", 1, -12), H("player_overlay_paid_content", 1, -10), H("player_overlay_live", 1, -5), H("player_overlay_creator_endscreen", 1, 0), H("player_overlay_fullscreen_engagement", 1, 5), H("player_overlay_timed_reaction_live", 1, 10), H("player_overlay_caption", 5, -25), H("player_overlay_inline_muted_controls", 9, -25), H("player_overlay_player_autonav_endscreen", 9, -20), H("player_overlay_mdx_header_text", 9, -15), H("player_overlay_live_chat_fullscreen", 9, -10), H("player_overlay_live_chat_entry_point", 9, -5), H("player_overlay_ads_cta", 13, -35), H("player_overlay_playback_controls", 13, -30), H("player_overlay_inline_playback_control_buttons", 13, -28), H("player_overlay_player_seek_edu", 13, -27), H("player_overlay_markers_message", 13, -25), H("player_overlay_suggested_actions", 13, 25), H("player_overlay_nerd_stats", 17, -45), H("player_overlay_in_video_programming", 17, -40), H("player_overlay_player_info_card_drawer", 17, -35), H("player_overlay_info_card_teaser", 17, -30), H("player_overlay_player_trailer_label", 17, -25), H("player_overlay_rental_activation", 17, -20), H("player_overlay_inline_ad", 17, -15), H("player_overlay_text_banner", 17, -14), H("player_overlay_survey", 17, -10), H("player_overlay_endcap", 17, -5), H("player_overlay_elements_ad_video_end", 17, 0), H("player_overlay_mdx_ad", 17, 5), H("player_overlay_no_sound_memo", 17, 10), H("player_overlay_watch_in_vr", 17, 15), H("player_overlay_pip_ad", 17, 20), H("player_overlay_product_in_video", 17, 25), H("player_overlay_timed_reaction_animation", 17, 30), H("player_overlay_mdx_status", 17, 35), H("player_overlay_mdx_autoplay", 17, 40), H("player_overlay_fullscreen_engagement_panel_scrim", 17, 45), H("player_overlay_pip_paid_product_badge", 17, 46), H("player_overlay_mini_player_error", 17, 47), H("player_overlay_gated_actions", 17, 48)));
    }
    
    private static Map.Entry H(final String s, final int n, final int n2) {
        return Map$_CC.entry((Object)s, (Object)new giy(n, n2, null));
    }
    
    public static bhv h(final bas bas) {
        bas.H(2);
        final int i = bas.i();
        final int n = i >> 1;
        final int j = bas.i();
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
        final int n2 = j >> 3 | (i & 0x1) << 5;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        String s2 = ".0";
        sb.append(".0");
        sb.append(n);
        if (n2 >= 10) {
            s2 = ".";
        }
        sb.append(s2);
        sb.append(n2);
        return new bhv(sb.toString());
    }
    
    public static void i(final dun dun, final duv b, final dsx dsx) {
        dun.b = b;
        final Object[] d = dun.d;
        if (d != null) {
            d[0] = dsx;
        }
    }
    
    public static bhv u(final Configuration configuration) {
        synchronized (bhv.class) {
            final bhv b = bhv.b;
            if (b == null || !((Configuration)b.a).equals(configuration)) {
                bhv.b = new bhv(new Configuration(configuration));
            }
            return bhv.b;
        }
    }
    
    public static void w() {
        ttr.l("Error updating single loop edu triggers remaining.");
    }
    
    public static void x() {
        ttr.l("Error updating single loop edu triggers remaining.");
    }
    
    public static void y() {
        ttr.l("Error updating single loop snackbar triggers remaining.");
    }
    
    public final ListenableFuture A(final aezf aezf) {
        return ((tmx)this.a).b(aezf);
    }
    
    public final aezp B(final String s) {
        return aezp.j(((Map<K, Object>)this.a).get((Object)s));
    }
    
    public final void C(final String s) {
        ((Map<Object, Object>)this.a).remove(s);
    }
    
    public final void D(final String s, final Object o) {
        ((Map<String, Object>)this.a).put(s, o);
    }
    
    public final boolean E() {
        alxp alxp;
        if ((alxp = ((vaf)this.a).b().e) == null) {
            alxp = alxp.a;
        }
        return !alxp.aL;
    }
    
    public final int F() {
        alxp alxp;
        if ((alxp = ((vaf)this.a).b().e) == null) {
            alxp = alxp.a;
        }
        return alxp.bd;
    }
    
    public final void G(final wyw wyw, final akhz akhz) {
        if (akhz.j.H()) {
            if (((aeea)this.a).by((MessageLite)akhz)) {
                akia akia;
                if ((akia = akhz.f) == null) {
                    akia = akia.a;
                }
                akii a;
                if (akia.b == 58173949) {
                    a = (akii)akia.c;
                }
                else {
                    a = akii.a;
                }
                final akic akic = (akic)a.c.get(0);
                aorj a2;
                if (akic.b == 58174010) {
                    a2 = (aorj)akic.c;
                }
                else {
                    a2 = aorj.a;
                }
                aorf aorf;
                if ((aorf = a2.k) == null) {
                    aorf = aorf.a;
                }
                anyv anyv;
                if ((anyv = aorf.c) == null) {
                    anyv = anyv.a;
                }
                final aeea aeea = (aeea)this.a;
                adkp.H(aeea.by((MessageLite)akhz));
                wyw.D(xmm.ac(aeea.bz((MessageLite)akhz)));
                if ((akhz.b & 0x2) != 0x0) {
                    akhu akhu;
                    if ((akhu = akhz.d) == null) {
                        akhu = akhu.a;
                    }
                    Object o = null;
                    Label_1436: {
                        if (akhu != null) {
                            final int b = akhu.b;
                            if (b == 91395562) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 46407682) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 81531855) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 50236216) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 96706488) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 53272665) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 173693512) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 225413481) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 173602558) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 259982244) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 173690432) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 252479813) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 287582849) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 355720823) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 84636745) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 64375887) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 101397128) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 126869174) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 102284451) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 63832717) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 72757052) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 85538925) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 87361605) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 90074186) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 97168018) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 116164391) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 125787527) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 220023574) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 380650365) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 99965204) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 100402590) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 102883021) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 111153703) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 155144651) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 155554693) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 156098381) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 159058187) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 188799247) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 144757704) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 196904101) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 208257221) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 369918284) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 251530672) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 247977373) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 200097345) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 211108887) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 149687644) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 217771576) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 313670307) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 311386127) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 338099421) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 153515154) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 361905772) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 361650780) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 359119476) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 423195318) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 416861471) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 320273507) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 100977426) {
                                o = akhu.c;
                                break Label_1436;
                            }
                            if (b == 431580795) {
                                o = akhu.c;
                                break Label_1436;
                            }
                        }
                        o = null;
                    }
                    if (((aeea)this.a).by((MessageLite)o)) {
                        ((aeea)this.a).bx(wyw, (MessageLite)o, (MessageLite)akhz);
                    }
                }
                if (((aeea)this.a).by((MessageLite)a2)) {
                    ((aeea)this.a).bx(wyw, (MessageLite)a2, (MessageLite)akhz);
                }
                if (((aeea)this.a).by((MessageLite)anyv)) {
                    ((aeea)this.a).bx(wyw, (MessageLite)anyv, (MessageLite)a2);
                }
                final Iterator<Object> iterator = ((List<Object>)anyv.d).iterator();
                while (iterator.hasNext()) {
                    final MessageLite h = vxg.h((anyy)iterator.next());
                    if (((aeea)this.a).by(h)) {
                        ((aeea)this.a).bx(wyw, h, (MessageLite)anyv);
                    }
                    if (h instanceof ankm) {
                        final ankm ankm = (ankm)h;
                        for (final anko anko : ankm.d) {
                            Object o2 = null;
                            Label_1900: {
                                if (anko != null) {
                                    final int b2 = anko.b;
                                    if ((b2 & 0x1) != 0x0) {
                                        if ((o2 = anko.c) == null) {
                                            o2 = ankt.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x2) != 0x0) {
                                        if ((o2 = anko.d) == null) {
                                            o2 = apog.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x4) != 0x0) {
                                        if ((o2 = anko.e) == null) {
                                            o2 = ahxq.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x8) != 0x0) {
                                        if ((o2 = anko.f) == null) {
                                            o2 = ajab.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x10) != 0x0) {
                                        if ((o2 = anko.g) == null) {
                                            o2 = anrt.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x20) != 0x0) {
                                        if ((o2 = anko.h) == null) {
                                            o2 = aiyh.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x40) != 0x0) {
                                        if ((o2 = anko.i) == null) {
                                            o2 = amhi.a;
                                        }
                                        break Label_1900;
                                    }
                                    else if ((b2 & 0x80) != 0x0) {
                                        if ((o2 = anko.j) == null) {
                                            o2 = aoty.a;
                                        }
                                        break Label_1900;
                                    }
                                }
                                o2 = null;
                            }
                            if (((aeea)this.a).by(h)) {
                                ((aeea)this.a).bx(wyw, (MessageLite)o2, (MessageLite)ankm);
                            }
                        }
                    }
                }
                ((aeea)this.a).bA(wyw, (MessageLite)akhz);
            }
            return;
        }
        wyw.D((wzz)new wyt(akhz.j));
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
    
    public final void c(Object fromParcel) {
        final boolean b = fromParcel instanceof List;
        final Object o = null;
        if (b) {
            final Object a = this.a;
            final List list = (List)fromParcel;
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
            ((MediaBrowserService$Result)a).sendResult(o2);
            return;
        }
        if (fromParcel instanceof Parcel) {
            final Parcel parcel2 = (Parcel)fromParcel;
            parcel2.setDataPosition(0);
            final Object a2 = this.a;
            fromParcel = MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel2);
            ((MediaBrowserService$Result)a2).sendResult(fromParcel);
            parcel2.recycle();
            return;
        }
        ((MediaBrowserService$Result)this.a).sendResult((Object)null);
    }
    
    public final Metadata d(final btk btk, final bvk bvk) {
        Object c = null;
        int n = 0;
        while (true) {
            try {
                while (true) {
                    btk.j(((bas)this.a).a, 0, 10);
                    ((bas)this.a).G(0);
                    if (((bas)this.a).k() != 4801587) {
                        break;
                    }
                    ((bas)this.a).H(3);
                    final int h = ((bas)this.a).h();
                    final int n2 = h + 10;
                    if (c == null) {
                        c = new byte[n2];
                        System.arraycopy(((bas)this.a).a, 0, c, 0, 10);
                        btk.j((byte[])c, 10, h);
                        c = new bvl(bvk).c((byte[])c, n2);
                    }
                    else {
                        btk.g(h);
                    }
                    n += n2;
                }
                btk.l();
                btk.g(n);
                return (Metadata)c;
            }
            catch (final EOFException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void e(final Handler handler, final brd brd) {
        dk.d((Object)handler);
        dk.d((Object)brd);
        this.g(brd);
        ((CopyOnWriteArrayList<qv>)this.a).add(new qv(handler, brd));
    }
    
    public final void f(final int n, final long n2, final long n3) {
        for (final qv qv : (CopyOnWriteArrayList)this.a) {
            if (!qv.b) {
                ((Handler)qv.a).post((Runnable)new brc(qv, n, n2, n3, 0, (byte[])null));
            }
        }
    }
    
    public final void g(final brd brd) {
        for (final qv qv : (CopyOnWriteArrayList)this.a) {
            if (qv.c == brd) {
                qv.b = true;
                ((CopyOnWriteArrayList)this.a).remove(qv);
            }
        }
    }
    
    public final void j(final dsx dsx, final duv duv, final String s) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            final skt skt = ((Map<K, skt>)this.a).get(s);
            if (skt == null) {
                monitorexit(this);
                return;
            }
            skt.a = true;
            for (int c = ((abp)skt.b).c(), i = 0; i < c; ++i) {
                i((dun)((abp)skt.b).e(i), duv, dsx);
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
                final skt skt = ((Map<K, skt>)this.a).get(iterator.next());
                if (skt != null && skt.a) {
                    skt.a = false;
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
    
    public final void l(final String s, final dun dun) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            skt skt = ((Map<K, skt>)this.a).get(s);
            final dsx dsx = null;
            dun dun2;
            if (skt == null) {
                skt = new skt((short[])null);
                ((Map<String, skt>)this.a).put(s, skt);
                dun2 = null;
            }
            else {
                dun2 = (dun)((abp)skt.b).d(dun.c);
            }
            if (dun.c(dun2)) {
                final Object[] d = dun.d;
                dsx dsx2;
                if (d == null) {
                    dsx2 = dsx;
                }
                else {
                    dsx2 = (dsx)d[0];
                }
                i(dun2, dun.b, dsx2);
                return;
            }
            ((abp)skt.b).h(dun.c, dun);
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final dun m() {
        if (((dva)this.a).bh() != null) {
            return ((dva)this.a).bh().j;
        }
        return null;
    }
    
    public final void n(final dts dts) {
        ((List<dts>)this.a).add(dts);
    }
    
    public final dds o(final Class clazz) {
        monitorenter(this);
        try {
            for (int size = ((List)this.a).size(), i = 0; i < size; ++i) {
                final eab eab = ((List<eab>)this.a).get(i);
                if (((Class)eab.b).isAssignableFrom(clazz)) {
                    final Object a = eab.a;
                    monitorexit(this);
                    return (dds)a;
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
    
    public final void p(final Class clazz, final dds dds) {
        synchronized (this) {
            ((List<eab>)this.a).add(new eab(clazz, dds));
        }
    }
    
    public final List q() {
        synchronized (this) {
            return (List)this.a;
        }
    }
    
    public final void r(final dde dde) {
        synchronized (this) {
            ((List<dde>)this.a).add(dde);
        }
    }
    
    public final ddc s(final Class clazz) {
        monitorenter(this);
        try {
            for (eab eab : this.a) {
                if (((Class)eab.b).isAssignableFrom(clazz)) {
                    final Object a = eab.a;
                    monitorexit(this);
                    return (ddc)a;
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
    
    public final void t(final Class clazz, final ddc ddc) {
        synchronized (this) {
            ((List<eab>)this.a).add(new eab(clazz, ddc));
        }
    }
    
    public final frk v(final SwipeRefreshLayout swipeRefreshLayout) {
        final skt skt = (skt)((atke)this.a).a();
        skt.getClass();
        swipeRefreshLayout.getClass();
        return new frk(skt, swipeRefreshLayout, null, null, null);
    }
    
    public final long z() {
        if (((ArrayList)this.a).isEmpty()) {
            return 0L;
        }
        return ((ArrayList)this.a).get(0);
    }
}
