import android.view.View;
import com.google.protobuf.ExtensionRegistryLite;
import android.text.TextUtils;
import android.text.Spanned;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.time.Duration;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.AutoplaySwitchButtonRendererOuterClass;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.facebook.litho.ComponentTree;
import java.util.Iterator;
import java.util.Locale;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.List;
import android.app.PendingIntent;
import android.content.ComponentName;
import com.google.android.libraries.youtube.player.ui.mediasession.MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakt
{
    public static tvn A(final abqz abqz) {
        abqz.getClass();
        return (tvn)new uvf(abqz, 7);
    }
    
    public static tvn B(final xan xan) {
        return (tvn)new abjc((Object)xan);
    }
    
    public static abvz C() {
        return new abvz();
    }
    
    public static PlayerResponseModel D(final abzl abzl) {
        return abzl.o().c;
    }
    
    public static PlaybackStartDescriptor E(final abzl abzl) {
        return abzl.o().a;
    }
    
    public static abjt F(final abzl abzl) {
        return abzl.o().b;
    }
    
    public static void G(final int n, final int n2, final akwz akwz, final wxx wxx) {
        final ahaz builder = ((ahbh)akay.a).createBuilder();
        builder.copyOnWrite();
        final akay akay = (akay)builder.instance;
        akay.c = n - 1;
        akay.b |= 0x1;
        builder.copyOnWrite();
        final akay akay2 = (akay)builder.instance;
        akay2.d = n2 - 1;
        akay2.b |= 0x2;
        if (akwz != null) {
            final ahab q = akwz.q;
            builder.copyOnWrite();
            final akay akay3 = (akay)builder.instance;
            q.getClass();
            akay3.b |= 0x4;
            akay3.e = q;
        }
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.n((aknt)d.instance, (akay)builder.build());
        wxx.d((aknt)((ahaz)d).build());
    }
    
    public static float H(final PlayerConfigModel playerConfigModel, final abjj abjj) {
        if (abrd.u(playerConfigModel, abjj)) {
            return 0.0f;
        }
        float c;
        if (playerConfigModel == null) {
            c = 1.0f;
        }
        else {
            c = playerConfigModel.c();
        }
        if (playerConfigModel != null && playerConfigModel.W()) {
            return abjj.a();
        }
        return c * abjj.a();
    }
    
    public static int I(final abzl abzl) {
        if (abzl != null) {
            return abzl.o().k;
        }
        return 4;
    }
    
    public static long J(final abzl abzl) {
        return abzl.o().h;
    }
    
    public static long K(final abzl abzl) {
        return abzl.o().e;
    }
    
    public static long L(final ynp ynp) {
        return Math.max(ynp.m().b, 0L);
    }
    
    public static void M(final abzl abzl, final long h) {
        abzl.o().h = h;
    }
    
    public static void N(final abzl abzl, final long e) {
        abzl.o().e = e;
    }
    
    public static void O(final abzl abzl, final int k) {
        abzl.o().k = k;
    }
    
    public static boolean P(final abzl abzl) {
        final PlayerResponseModel c = abzl.c();
        return c != null && c.m().ak();
    }
    
    public static boolean Q(final abzl abzl) {
        final PlayerResponseModel c = abzl.c();
        VideoStreamingData n;
        if (c == null) {
            n = null;
        }
        else {
            n = c.n();
        }
        return n != null && n.u();
    }
    
    public static boolean R(final abzl abzl) {
        return abzl.o().k == 9;
    }
    
    public static boolean S(final abjj abjj, final PlayerResponseModel playerResponseModel) {
        return abjj.h && !aald.f(playerResponseModel);
    }
    
    public static boolean T(final abzl abzl) {
        final PlaybackStartDescriptor g = abzl.g();
        final PlayerResponseModel c = abzl.c();
        VideoStreamingData n;
        if (c != null) {
            n = c.n();
        }
        else {
            n = null;
        }
        return g != null && g.s() && n != null && !n.p();
    }
    
    public static eg U(final Context context) {
        return new eg(context, "YouTube playerlib", new ComponentName(context.getPackageName(), MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver.class.getName()), (PendingIntent)null);
    }
    
    public static int[] V() {
        return new int[] { 16777217, 16777216, 1, 16711681, 16776961, 65281, 65536, 256, 16711936 };
    }
    
    public static List W(final PlayerResponseModel playerResponseModel, final int n) {
        final ArrayList list = new ArrayList();
        for (final FormatStreamModel formatStreamModel : playerResponseModel.n().o) {
            if (formatStreamModel.e() == n) {
                final abth o = SubtitleTrack.o();
                final String b = formatStreamModel.b;
                if (b != null) {
                    o.k(b);
                }
                SubtitleTrack subtitleTrack;
                if (formatStreamModel.s().isEmpty()) {
                    final String displayName = new Locale("en").getDisplayName(Locale.getDefault());
                    o.f("en");
                    o.l(".en");
                    o.j("");
                    o.g((String)(o.b = displayName));
                    o.i("");
                    o.c(formatStreamModel.e());
                    o.h(formatStreamModel.e);
                    subtitleTrack = o.a();
                }
                else {
                    o.f(formatStreamModel.s());
                    aiem aiem;
                    if ((aiem = formatStreamModel.a.C) == null) {
                        aiem = aiem.a;
                    }
                    o.l(aiem.d);
                    o.j("");
                    o.b = formatStreamModel.r();
                    o.g(new Locale(formatStreamModel.s()).getDisplayName(Locale.getDefault()));
                    o.i(formatStreamModel.r());
                    o.c(formatStreamModel.e());
                    o.h(formatStreamModel.e);
                    subtitleTrack = o.a();
                }
                list.add(subtitleTrack);
            }
        }
        return list;
    }
    
    public static atwt X(final ynp ynp, final PlayerResponseModel playerResponseModel) {
        atwt l;
        if (playerResponseModel != null && playerResponseModel.n() != null && playerResponseModel.m() != null) {
            final VideoStreamingData n = playerResponseModel.n();
            final PlayerConfigModel m = playerResponseModel.m();
            final yys d = ynp.d;
            zdf.a((Object)n);
            zdf.a((Object)m);
            l = new atwt(d.b(n, m));
        }
        else {
            l = ynp.l;
        }
        return l;
    }
    
    public static dvu Y(final Context context, final omw omw, final ahab ahab, final wyw wyw, final Object o, final ajmo ajmo, final asiq asiq, final aekp aekp) {
        final dvu a = new dvu(context);
        final dsx l = a.l;
        final oth a2 = oti.a();
        a2.a = (View)a;
        a2.i(false);
        a2.h(afeq.r((Object)aakv.B(o)));
        final otr otr = null;
        Object m;
        if (wyw != null) {
            m = aekp.M(wyw, ajmo);
        }
        else {
            m = null;
        }
        a2.g((oup)m);
        final oti a3 = a2.a();
        final byte[] i = ahab.I();
        otr j = otr;
        if (wyw != null) {
            j = acdg.I(wyw);
        }
        final dtg b = ComponentTree.b(a.l, omw.a(l, a3, i, j, asiq));
        b.d = false;
        a.B(b.a());
        return a;
    }
    
    public static aicz a(final angg angg) {
        if (angg != null) {
            angd angd;
            if ((angd = angg.g) == null) {
                angd = angd.a;
            }
            if ((angd.b & 0x1) != 0x0) {
                angd angd2;
                if ((angd2 = angg.g) == null) {
                    angd2 = angd.a;
                }
                aicz aicz;
                if ((aicz = angd2.c) == null) {
                    aicz = aicz.a;
                }
                return aicz;
            }
        }
        return null;
    }
    
    public static aicz b(final angg angg) {
        if (angg != null) {
            angj angj;
            if ((angj = angg.i) == null) {
                angj = angj.a;
            }
            if ((angj.b & 0x1) != 0x0) {
                angj angj2;
                if ((angj2 = angg.i) == null) {
                    angj2 = angj.a;
                }
                aicz aicz;
                if ((aicz = angj2.c) == null) {
                    aicz = aicz.a;
                }
                return aicz;
            }
        }
        return null;
    }
    
    public static Optional c(final WatchNextResponseModel watchNextResponseModel) {
        final Object o = null;
        angl i;
        if (watchNextResponseModel == null) {
            i = null;
        }
        else {
            i = watchNextResponseModel.i;
        }
        Object o2 = o;
        if (i != null) {
            o2 = o;
            if ((i.b & 0x8000) != 0x0) {
                anuv anuv;
                if ((anuv = i.k) == null) {
                    anuv = anuv.a;
                }
                if (!((ahbc)anuv).ry((ahaq)AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer)) {
                    o2 = o;
                }
                else {
                    anuv anuv2;
                    if ((anuv2 = i.k) == null) {
                        anuv2 = anuv.a;
                    }
                    o2 = ((ahbc)anuv2).rx((ahaq)AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer);
                }
            }
        }
        return Optional.ofNullable(o2);
    }
    
    public static Uri d(final Context context) {
        return tfg.k(context, "player", "features/backup.pb");
    }
    
    public static aqre e() {
        final ahaz builder = aqre.a.createBuilder();
        final Duration ofSeconds = Duration.ofSeconds(10L);
        ofSeconds.getClass();
        final ahan ao = adyf.ao(ofSeconds);
        builder.copyOnWrite();
        final aqre aqre = (aqre)builder.instance;
        ao.getClass();
        aqre.c = ao;
        aqre.b |= 0x1;
        return (aqre)builder.build();
    }
    
    public static boolean f(final aiqj aiqj, final aiqj aiqj2) {
        return g(aiqj, aiqj2, false);
    }
    
    public static boolean g(final aiqj aiqj, final aiqj aiqj2, final boolean b) {
        if (aiqj2 == null) {
            return false;
        }
        if (b || aiqj.c.equals((Object)aiqj2.c)) {
            final String d = ((apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).d;
            final String d2 = ((apsk)((ahbc)aiqj2).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).d;
            final String h = ((apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).h;
            final String h2 = ((apsk)((ahbc)aiqj2).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).h;
            if (d.equals(d2) && h.equals(h2)) {
                return true;
            }
        }
        return false;
    }
    
    public static final Class[] h(final abeh abeh, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { ypj.class };
        }
        if (n == 0) {
            abeh.j((ypj)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static boolean i(final int n) {
        if (n != 79 && n != 130 && n != 126 && n != 127) {
            switch (n) {
                default: {
                    return false;
                }
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91: {
                    break;
                }
            }
        }
        return true;
    }
    
    public static final Class[] j(final abcz abcz, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aanh.class };
        }
        if (n == 0) {
            final aanh aanh = (aanh)o;
            abcz.f();
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static String k(final FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            return "N/A";
        }
        final String t = formatStreamModel.t();
        final int n = t.indexOf("codecs=\"") + 8;
        final int min = Math.min(t.indexOf("\"", n + 1), n + 4);
        final StringBuilder sb = new StringBuilder(formatStreamModel.e);
        if (n >= 8 && min >= 0) {
            sb.append(' ');
            sb.append(t, n, min);
        }
        if (formatStreamModel.P()) {
            sb.append(' ');
            sb.append(formatStreamModel.i());
            sb.append('x');
            sb.append(formatStreamModel.d());
            final int c = formatStreamModel.c();
            if (c > 0) {
                sb.append('@');
                sb.append(c);
            }
        }
        if (formatStreamModel.L()) {
            sb.append(" otf");
        }
        return sb.toString();
    }
    
    public static boolean l(final long n, final long n2) {
        return n2 - 15000L <= n;
    }
    
    public static aemc m(final Context context, final String c, final afvs afvs, final qcy qcy) {
        final aqre e = e();
        final qqb d = qqd.d(context, (Executor)afvs);
        d.b();
        d.c = c;
        d.d(new String[] { "double_tap_skip_duration", "nerd_stats_enabled", "autonav" });
        d.e((qqc)new fqv(e, 7));
        final qqd a = d.a();
        final qpz a2 = qqa.a();
        a2.f(d(context));
        a2.e((MessageLite)e);
        a2.b((qpw)a);
        return nns.o(qcy.C(a2.a()));
    }
    
    public static final void n(final alhi alhi, final alvw alvw, final ota ota) {
        final aezp z = aald.Z(ota);
        if (z.h()) {
            ((wyw)z.c()).w((wzz)new wyt(alvw), alhi);
        }
    }
    
    public static final void o(int n, final ahab ahab, final ota ota) {
        final aezp z = aald.Z(ota);
        if (z.h()) {
            switch (n - 1) {
                default: {
                    n = 1;
                    break;
                }
                case 6: {
                    n = 8193;
                    break;
                }
                case 5: {
                    n = 4097;
                    break;
                }
                case 4: {
                    n = 65;
                    break;
                }
                case 3: {
                    n = 9;
                    break;
                }
                case 2: {
                    n = 1025;
                    break;
                }
                case 1: {
                    n = 3;
                    break;
                }
            }
            if (n != 1) {
                ((wyw)z.c()).J(n, (wzz)new wyt(ahab), (alhi)null);
            }
        }
    }
    
    public static aicz p(final aixf aixf) {
        if ((aixf.b & 0x80) != 0x0) {
            aida aida;
            if ((aida = aixf.i) == null) {
                aida = aida.a;
            }
            aicz aicz;
            if ((aicz = aida.c) == null) {
                aicz = aicz.a;
            }
            return aicz;
        }
        return null;
    }
    
    public static aicz q(final aixf aixf) {
        if ((aixf.b & 0x40) != 0x0) {
            aida aida;
            if ((aida = aixf.h) == null) {
                aida = aida.a;
            }
            aicz aicz;
            if ((aicz = aida.c) == null) {
                aicz = aicz.a;
            }
            return aicz;
        }
        return null;
    }
    
    public static CharSequence r(final aixf aixf) {
        final aicz p = p(aixf);
        Spanned spanned;
        if (p != null) {
            ajut ajut;
            if ((ajut = p.i) == null) {
                ajut = ajut.a;
            }
            spanned = acak.b(ajut);
        }
        else {
            ajut ajut2;
            if ((aixf.b & 0x2000000) != 0x0) {
                if ((ajut2 = aixf.r) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            spanned = acak.b(ajut2);
        }
        return (CharSequence)spanned;
    }
    
    public static CharSequence s(final aixf aixf) {
        final aicz q = q(aixf);
        Spanned spanned;
        if (q != null) {
            ajut ajut;
            if ((ajut = q.i) == null) {
                ajut = ajut.a;
            }
            spanned = acak.b(ajut);
        }
        else {
            ajut ajut2;
            if ((aixf.b & 0x1000000) != 0x0) {
                if ((ajut2 = aixf.q) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            spanned = acak.b(ajut2);
        }
        return (CharSequence)spanned;
    }
    
    public static CharSequence t(final aixf aixf, final vcy vcy) {
        final int size = aixf.g.size();
        final CharSequence charSequence = null;
        CharSequence[] array2;
        if (size != 0) {
            final CharSequence[] array = new CharSequence[aixf.g.size()];
            int n = 0;
            while (true) {
                array2 = array;
                if (n >= aixf.g.size()) {
                    break;
                }
                array[n] = (CharSequence)vde.a((ajut)aixf.g.get(n), vcy, false);
                ++n;
            }
        }
        else {
            array2 = null;
        }
        if (array2 == null) {
            return null;
        }
        final CharSequence concat = TextUtils.concat(new CharSequence[] { System.getProperty("line.separator"), System.getProperty("line.separator") });
        int i = 0;
        CharSequence concat2 = charSequence;
        while (i < array2.length) {
            final CharSequence charSequence2 = array2[i];
            if (concat2 == null) {
                concat2 = charSequence2;
            }
            else {
                concat2 = TextUtils.concat(new CharSequence[] { concat2, concat, charSequence2 });
            }
            ++i;
        }
        return concat2;
    }
    
    public static MessageLite u(final anuv anuv) {
        Label_0041: {
            if (anuv == null) {
                break Label_0041;
            }
            if (((ahbh)anuv).equals((Object)((ahbh)anuv).getDefaultInstanceForType())) {
                break Label_0041;
            }
            try {
                return (MessageLite)((ahbc)anuv).rx((ahaq)ExtensionRegistryLite.getGeneratedRegistry().b((MessageLite)anuv.a, agqs.k((ahbc)anuv)));
                return null;
            }
            catch (final Exception ex) {
                return null;
            }
        }
    }
    
    public static Object v(final anuv anuv, final ahaq ahaq) {
        if (anuv != null && ((ahbc)anuv).ry(ahaq)) {
            return ((ahbc)anuv).rx(ahaq);
        }
        return null;
    }
    
    public static final acai w(final Context context, final ajut ajut, final acaf acaf) {
        return new acai(context, ajut, acaf);
    }
    
    public static acaa x(final Object o) {
        byte[] array = new byte[0];
        final abzz a = abzz.a;
        abzz abzz = null;
        byte[] array2 = null;
        String s = null;
        boolean e2 = false;
        boolean f = false;
        Label_0542: {
            if (o instanceof amrc) {
                final amrc amrc = (amrc)o;
                final String e = amrc.e;
                if ((amrc.b & 0x4) != 0x0) {
                    array = amrc.f.I();
                }
                abzz = abzz.b;
                array2 = array;
                s = e;
                e2 = false;
                f = true;
            }
            else {
                Label_0120: {
                    String s2;
                    if (o instanceof amre) {
                        final amre amre = (amre)o;
                        s2 = amre.c;
                        if ((amre.b & 0x2) != 0x0) {
                            array = amre.d.I();
                        }
                        abzz = abzz.h;
                    }
                    else if (o instanceof annb) {
                        final annb annb = (annb)o;
                        s2 = annb.c;
                        if ((annb.b & 0x2) != 0x0) {
                            array = annb.d.I();
                        }
                        abzz = abzz.c;
                    }
                    else {
                        if (o instanceof anul) {
                            final anul anul = (anul)o;
                            final String d = anul.d;
                            if ((anul.c & 0x40) != 0x0) {
                                array = anul.g.I();
                            }
                            abzz = abzz.d;
                            e2 = anul.e;
                            f = anul.f;
                            array2 = array;
                            s = d;
                            break Label_0542;
                        }
                        if (o instanceof aoua) {
                            final aoua aoua = (aoua)o;
                            s2 = aoua.d;
                            if ((aoua.b & 0x4) != 0x0) {
                                array = aoua.e.I();
                            }
                            abzz = abzz.e;
                        }
                        else if (o instanceof ahkb) {
                            final ahkb ahkb = (ahkb)o;
                            s2 = ahkb.d;
                            if ((ahkb.b & 0x4) != 0x0) {
                                array = ahkb.c.I();
                            }
                            abzz = abzz.g;
                        }
                        else {
                            if (!(o instanceof aljj)) {
                                String s3;
                                if (o instanceof amxh) {
                                    final amxh amxh = (amxh)o;
                                    s3 = amxh.c;
                                    if ((amxh.b & 0x2) != 0x0) {
                                        array = amxh.d.I();
                                        s3 = s3;
                                    }
                                }
                                else if (o instanceof anhc) {
                                    final anhc anhc = (anhc)o;
                                    final String s4 = s3 = anhc.c;
                                    if ((anhc.b & 0x2) != 0x0) {
                                        array = anhc.d.I();
                                        s3 = s4;
                                    }
                                }
                                else {
                                    if (!(o instanceof alsd)) {
                                        return null;
                                    }
                                    final alsd alsd = (alsd)o;
                                    final String s5 = s3 = alsd.d;
                                    if ((alsd.b & 0x4) != 0x0) {
                                        array = alsd.e.I();
                                        s3 = s5;
                                    }
                                }
                                array2 = array;
                                s = s3;
                                abzz = a;
                                break Label_0120;
                            }
                            final aljj aljj = (aljj)o;
                            s2 = aljj.e;
                            if ((aljj.b & 0x40) != 0x0) {
                                array = aljj.f.I();
                            }
                            abzz = abzz.f;
                        }
                    }
                    final String s6 = s2;
                    array2 = array;
                    s = s6;
                }
                e2 = false;
                f = false;
            }
        }
        o.getClass();
        abzz.getClass();
        return (acaa)new acac(s, array2, abzz, o, e2, f);
    }
    
    public static Object y(final acaa acaa, final Class clazz) {
        if (acaa instanceof acac) {
            final acac acac = (acac)acaa;
            if (clazz.isAssignableFrom(acac.c.getClass())) {
                return acac.c;
            }
        }
        return null;
    }
    
    public static tvn z(final abzo abzo) {
        abzo.getClass();
        return (tvn)new uvf(abzo, 6);
    }
}
