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

public final class aamp
{
    public static twp A(final acax acax) {
        acax.getClass();
        return (twp)new uwl(acax, 7);
    }
    
    public static twp B(final absl absl) {
        absl.getClass();
        return (twp)new uwl(absl, 8);
    }
    
    public static twp C(final xbt xbt) {
        return (twp)new abkj(xbt);
    }
    
    public static abxi D() {
        return new abxi();
    }
    
    public static PlayerResponseModel E(final acav acav) {
        return acav.o().c;
    }
    
    public static PlaybackStartDescriptor F(final acav acav) {
        return acav.o().a;
    }
    
    public static abla G(final acav acav) {
        return acav.o().b;
    }
    
    public static void H(final int n, final int n2, final akyz akyz, final wza wza) {
        final ahcr builder = akcz.a.createBuilder();
        builder.copyOnWrite();
        final akcz akcz = (akcz)builder.instance;
        akcz.c = n - 1;
        akcz.b |= 0x1;
        builder.copyOnWrite();
        final akcz akcz2 = (akcz)builder.instance;
        akcz2.d = n2 - 1;
        akcz2.b |= 0x2;
        if (akyz != null) {
            final ahbt q = akyz.q;
            builder.copyOnWrite();
            final akcz akcz3 = (akcz)builder.instance;
            q.getClass();
            akcz3.b |= 0x4;
            akcz3.e = q;
        }
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.n((akpu)d.instance, (akcz)builder.build());
        wza.d((akpu)((ahcr)d).build());
    }
    
    public static float I(final PlayerConfigModel playerConfigModel, final abkq abkq) {
        if (absp.u(playerConfigModel, abkq)) {
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
            return abkq.a();
        }
        return c * abkq.a();
    }
    
    public static int J(final acav acav) {
        if (acav != null) {
            return acav.o().k;
        }
        return 4;
    }
    
    public static long K(final acav acav) {
        return acav.o().h;
    }
    
    public static long L(final acav acav) {
        return acav.o().e;
    }
    
    public static long M(final ypn ypn) {
        return Math.max(ypn.m().b, 0L);
    }
    
    public static void N(final acav acav, final long h) {
        acav.o().h = h;
    }
    
    public static void O(final acav acav, final long e) {
        acav.o().e = e;
    }
    
    public static void P(final acav acav, final int k) {
        acav.o().k = k;
    }
    
    public static boolean Q(final acav acav) {
        final PlayerResponseModel c = acav.c();
        return c != null && c.m().ak();
    }
    
    public static boolean R(final acav acav) {
        final PlayerResponseModel c = acav.c();
        VideoStreamingData n;
        if (c == null) {
            n = null;
        }
        else {
            n = c.n();
        }
        return n != null && n.u();
    }
    
    public static boolean S(final acav acav) {
        return acav.o().k == 9;
    }
    
    public static boolean T(final abkq abkq, final PlayerResponseModel playerResponseModel) {
        return abkq.h && !aamz.f(playerResponseModel);
    }
    
    public static boolean U(final acav acav) {
        final PlaybackStartDescriptor g = acav.g();
        final PlayerResponseModel c = acav.c();
        VideoStreamingData n;
        if (c != null) {
            n = c.n();
        }
        else {
            n = null;
        }
        return g != null && g.s() && n != null && !n.p();
    }
    
    public static eg V(final Context context) {
        return new eg(context, "YouTube playerlib", new ComponentName(context.getPackageName(), MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver.class.getName()), (PendingIntent)null);
    }
    
    public static int[] W() {
        return new int[] { 16777217, 16777216, 1, 16711681, 16776961, 65281, 65536, 256, 16711936 };
    }
    
    public static List X(final PlayerResponseModel playerResponseModel, final int n) {
        final ArrayList list = new ArrayList();
        for (final FormatStreamModel formatStreamModel : playerResponseModel.n().o) {
            if (formatStreamModel.e() == n) {
                final abur o = SubtitleTrack.o();
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
                    aigf aigf;
                    if ((aigf = formatStreamModel.a.C) == null) {
                        aigf = aigf.a;
                    }
                    o.l(aigf.d);
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
    
    public static atzq Y(final ypn ypn, final PlayerResponseModel playerResponseModel) {
        atzq l;
        if (playerResponseModel != null && playerResponseModel.n() != null && playerResponseModel.m() != null) {
            final VideoStreamingData n = playerResponseModel.n();
            final PlayerConfigModel m = playerResponseModel.m();
            final zar d = ypn.d;
            zfa.a((Object)n);
            zfa.a((Object)m);
            l = new atzq(d.b(n, m));
        }
        else {
            l = ypn.l;
        }
        return l;
    }
    
    public static dvx Z(final Context context, final onm onm, final ahbt ahbt, final xab xab, final Object o, final ajon ajon, final aslm aslm, final aheu aheu) {
        final dvx a = new dvx(context);
        final dta l = a.l;
        final otz a2 = oua.a();
        a2.a = (View)a;
        a2.i(false);
        a2.h(afgh.r(aamr.A(o)));
        final ouj ouj = null;
        Object u;
        if (xab != null) {
            u = aheu.U(xab, ajon);
        }
        else {
            u = null;
        }
        a2.g((ovh)u);
        final oua a3 = a2.a();
        final byte[] i = ahbt.I();
        ouj j = ouj;
        if (xab != null) {
            j = acet.I(xab);
        }
        final dtj b = ComponentTree.b(a.l, onm.a(l, a3, i, j, aslm));
        b.d = false;
        a.B(b.a());
        return a;
    }
    
    public static aies a(final anin anin) {
        if (anin != null) {
            anik anik;
            if ((anik = anin.g) == null) {
                anik = anik.a;
            }
            if ((anik.b & 0x1) != 0x0) {
                anik anik2;
                if ((anik2 = anin.g) == null) {
                    anik2 = anik.a;
                }
                aies aies;
                if ((aies = anik2.c) == null) {
                    aies = aies.a;
                }
                return aies;
            }
        }
        return null;
    }
    
    public static aies b(final anin anin) {
        if (anin != null) {
            aniq aniq;
            if ((aniq = anin.i) == null) {
                aniq = aniq.a;
            }
            if ((aniq.b & 0x1) != 0x0) {
                aniq aniq2;
                if ((aniq2 = anin.i) == null) {
                    aniq2 = aniq.a;
                }
                aies aies;
                if ((aies = aniq2.c) == null) {
                    aies = aies.a;
                }
                return aies;
            }
        }
        return null;
    }
    
    public static Optional c(final WatchNextResponseModel watchNextResponseModel) {
        final Object o = null;
        anis i;
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
                anxb anxb;
                if ((anxb = i.k) == null) {
                    anxb = anxb.a;
                }
                if (!((ahcu)anxb).ry((ahci)AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer)) {
                    o2 = o;
                }
                else {
                    anxb anxb2;
                    if ((anxb2 = i.k) == null) {
                        anxb2 = anxb.a;
                    }
                    o2 = ((ahcu)anxb2).rx((ahci)AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer);
                }
            }
        }
        return Optional.ofNullable(o2);
    }
    
    public static Uri d(final Context context) {
        return tgj.l(context, "player", "features/backup.pb");
    }
    
    public static aqtx e() {
        final ahcr builder = aqtx.a.createBuilder();
        final Duration ofSeconds = Duration.ofSeconds(10L);
        ofSeconds.getClass();
        final ahcf as = adzw.as(ofSeconds);
        builder.copyOnWrite();
        final aqtx aqtx = (aqtx)builder.instance;
        as.getClass();
        aqtx.c = as;
        aqtx.b |= 0x1;
        return (aqtx)builder.build();
    }
    
    public static boolean f(final aisc aisc, final aisc aisc2) {
        return g(aisc, aisc2, false);
    }
    
    public static boolean g(final aisc aisc, final aisc aisc2, final boolean b) {
        if (aisc2 == null) {
            return false;
        }
        if (b || aisc.c.equals((Object)aisc2.c)) {
            final String d = ((apuw)((ahcu)aisc).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).d;
            final String d2 = ((apuw)((ahcu)aisc2).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).d;
            final String h = ((apuw)((ahcu)aisc).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).h;
            final String h2 = ((apuw)((ahcu)aisc2).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).h;
            if (d.equals(d2) && h.equals(h2)) {
                return true;
            }
        }
        return false;
    }
    
    public static final Class[] h(final abfn abfn, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { yre.class };
        }
        if (n == 0) {
            abfn.j((yre)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static aenv i(final Context context, final String c, final afxj afxj, final qdr qdr) {
        final aqtx e = e();
        final qqv d = qqx.d(context, (Executor)afxj);
        d.b();
        d.c = c;
        d.d(new String[] { "double_tap_skip_duration", "nerd_stats_enabled", "autonav" });
        d.e((qqw)new fqx(e, 7));
        final qqx a = d.a();
        final qqt a2 = qqu.a();
        a2.f(d(context));
        a2.e((MessageLite)e);
        a2.b((qqq)a);
        return mtf.f(qdr.c(a2.a()));
    }
    
    public static boolean j(final int n) {
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
    
    public static final Class[] k(final abef abef, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aape.class };
        }
        if (n == 0) {
            final aape aape = (aape)o;
            abef.f();
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static String l(final FormatStreamModel formatStreamModel) {
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
    
    public static boolean m(final long n, final long n2) {
        return n2 - 15000L <= n;
    }
    
    public static final void n(final alji alji, final alxw alxw, final ots ots) {
        final afbh s = aamr.s(ots);
        if (s.h()) {
            ((xab)s.c()).w((xbe)new wzy(alxw), alji);
        }
    }
    
    public static final void o(int n, final ahbt ahbt, final ots ots) {
        final afbh s = aamr.s(ots);
        if (s.h()) {
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
                ((xab)s.c()).J(n, (xbe)new wzy(ahbt), (alji)null);
            }
        }
    }
    
    public static aies p(final aizd aizd) {
        if ((aizd.b & 0x80) != 0x0) {
            aiet aiet;
            if ((aiet = aizd.i) == null) {
                aiet = aiet.a;
            }
            aies aies;
            if ((aies = aiet.c) == null) {
                aies = aies.a;
            }
            return aies;
        }
        return null;
    }
    
    public static aies q(final aizd aizd) {
        if ((aizd.b & 0x40) != 0x0) {
            aiet aiet;
            if ((aiet = aizd.h) == null) {
                aiet = aiet.a;
            }
            aies aies;
            if ((aies = aiet.c) == null) {
                aies = aies.a;
            }
            return aies;
        }
        return null;
    }
    
    public static CharSequence r(final aizd aizd) {
        final aies p = p(aizd);
        Spanned spanned;
        if (p != null) {
            ajws ajws;
            if ((ajws = p.i) == null) {
                ajws = ajws.a;
            }
            spanned = acbu.b(ajws);
        }
        else {
            ajws ajws2;
            if ((aizd.b & 0x4000000) != 0x0) {
                if ((ajws2 = aizd.r) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            spanned = acbu.b(ajws2);
        }
        return (CharSequence)spanned;
    }
    
    public static CharSequence s(final aizd aizd) {
        final aies q = q(aizd);
        Spanned spanned;
        if (q != null) {
            ajws ajws;
            if ((ajws = q.i) == null) {
                ajws = ajws.a;
            }
            spanned = acbu.b(ajws);
        }
        else {
            ajws ajws2;
            if ((aizd.b & 0x2000000) != 0x0) {
                if ((ajws2 = aizd.q) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            spanned = acbu.b(ajws2);
        }
        return (CharSequence)spanned;
    }
    
    public static CharSequence t(final aizd aizd, final veh veh) {
        final int size = aizd.g.size();
        final CharSequence charSequence = null;
        CharSequence[] array2;
        if (size != 0) {
            final CharSequence[] array = new CharSequence[aizd.g.size()];
            int n = 0;
            while (true) {
                array2 = array;
                if (n >= aizd.g.size()) {
                    break;
                }
                array[n] = (CharSequence)ven.a((ajws)aizd.g.get(n), veh, false);
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
    
    public static MessageLite u(final anxb anxb) {
        Label_0041: {
            if (anxb == null) {
                break Label_0041;
            }
            if (((ahcz)anxb).equals(((ahcz)anxb).getDefaultInstanceForType())) {
                break Label_0041;
            }
            try {
                return (MessageLite)((ahcu)anxb).rx((ahci)ExtensionRegistryLite.getGeneratedRegistry().b((MessageLite)anxb.a, agsk.i((ahcu)anxb)));
                return null;
            }
            catch (final Exception ex) {
                return null;
            }
        }
    }
    
    public static Object v(final anxb anxb, final ahci ahci) {
        if (anxb != null && ((ahcu)anxb).ry(ahci)) {
            return ((ahcu)anxb).rx(ahci);
        }
        return null;
    }
    
    public static final acbs w(final Context context, final ajws ajws, final acbp acbp) {
        return new acbs(context, ajws, acbp);
    }
    
    public static acbk x(final Object o) {
        byte[] array = new byte[0];
        final acbj a = acbj.a;
        acbj acbj = null;
        byte[] array2 = null;
        String s = null;
        boolean e2 = false;
        boolean f = false;
        Label_0542: {
            if (o instanceof amth) {
                final amth amth = (amth)o;
                final String e = amth.e;
                if ((amth.b & 0x4) != 0x0) {
                    array = amth.f.I();
                }
                acbj = acbj.b;
                array2 = array;
                s = e;
                e2 = false;
                f = true;
            }
            else {
                Label_0120: {
                    String s2;
                    if (o instanceof amtj) {
                        final amtj amtj = (amtj)o;
                        s2 = amtj.c;
                        if ((amtj.b & 0x2) != 0x0) {
                            array = amtj.d.I();
                        }
                        acbj = acbj.h;
                    }
                    else if (o instanceof anph) {
                        final anph anph = (anph)o;
                        s2 = anph.c;
                        if ((anph.b & 0x2) != 0x0) {
                            array = anph.d.I();
                        }
                        acbj = acbj.c;
                    }
                    else {
                        if (o instanceof anwr) {
                            final anwr anwr = (anwr)o;
                            final String d = anwr.d;
                            if ((anwr.c & 0x40) != 0x0) {
                                array = anwr.g.I();
                            }
                            acbj = acbj.d;
                            e2 = anwr.e;
                            f = anwr.f;
                            array2 = array;
                            s = d;
                            break Label_0542;
                        }
                        if (o instanceof aowm) {
                            final aowm aowm = (aowm)o;
                            s2 = aowm.d;
                            if ((aowm.b & 0x4) != 0x0) {
                                array = aowm.e.I();
                            }
                            acbj = acbj.e;
                        }
                        else if (o instanceof ahls) {
                            final ahls ahls = (ahls)o;
                            s2 = ahls.d;
                            if ((ahls.b & 0x4) != 0x0) {
                                array = ahls.c.I();
                            }
                            acbj = acbj.g;
                        }
                        else {
                            if (!(o instanceof allj)) {
                                String s3;
                                if (o instanceof amzm) {
                                    final amzm amzm = (amzm)o;
                                    s3 = amzm.c;
                                    if ((amzm.b & 0x2) != 0x0) {
                                        array = amzm.d.I();
                                        s3 = s3;
                                    }
                                }
                                else if (o instanceof anjj) {
                                    final anjj anjj = (anjj)o;
                                    final String s4 = s3 = anjj.c;
                                    if ((anjj.b & 0x2) != 0x0) {
                                        array = anjj.d.I();
                                        s3 = s4;
                                    }
                                }
                                else {
                                    if (!(o instanceof alud)) {
                                        return null;
                                    }
                                    final alud alud = (alud)o;
                                    final String s5 = s3 = alud.d;
                                    if ((alud.b & 0x4) != 0x0) {
                                        array = alud.e.I();
                                        s3 = s5;
                                    }
                                }
                                array2 = array;
                                s = s3;
                                acbj = a;
                                break Label_0120;
                            }
                            final allj allj = (allj)o;
                            s2 = allj.e;
                            if ((allj.b & 0x40) != 0x0) {
                                array = allj.f.I();
                            }
                            acbj = acbj.f;
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
        acbj.getClass();
        return (acbk)new acbm(s, array2, acbj, o, e2, f);
    }
    
    public static Object y(final acbk acbk, final Class clazz) {
        if (acbk instanceof acbm) {
            final acbm acbm = (acbm)acbk;
            if (clazz.isAssignableFrom(acbm.c.getClass())) {
                return acbm.c;
            }
        }
        return null;
    }
    
    public static twp z(final acax acax) {
        acax.getClass();
        return (twp)new uwl(acax, 6);
    }
}
