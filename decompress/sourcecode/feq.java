import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import com.google.protobuf.ExtensionRegistryLite;
import android.text.Spanned;
import android.text.Html;
import android.text.TextUtils;
import android.content.Context;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public class feq
{
    @Backup
    public static final String AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING = "autonav_toggle_user_edu_triggers_remaining";
    @Backup
    public static final String COUNTRY = "country";
    @SubstringBackup
    public static final String HINT_ID_PREFIX = "hint_id_prefix";
    @SubstringBackup
    public static final String HINT_LAST_SHOWN = "hint_last_shown";
    @Backup
    public static final String MOVING_THUMBNAILS_FIRST_ADD_TOOLTIP = "moving_thumbnails_first_add_tooltip";
    @Backup
    public static final String PIP_POLICY = "background_pip_policy_v2";
    @Backup
    public static final String RATE_LIMIT_PROMO_LAST_ALLOWED = "rate_limit_promo_last_allowed";
    @Backup
    public static final String RATE_LIMIT_SHOW_AUTOCONNECT_PROMPT_LAST_ALLOWED = "rate_limit_show_autoconnect_prompt_last_allowed";
    @Backup
    public static final String RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED = "rate_limit_show_interstitial_promo_last_allowed";
    @Backup
    public static final String SHOW_ACCOUNT_TAB_TUTORIAL = "show_accounts_tab_tutorial";
    @Backup
    public static final String SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL = "show_channels_notifications_tutorial";
    @Backup
    public static final String SHOW_SUBSCRIBERS_TAB_TUTORIAL = "show_subscribers_tab_tutorial";
    @Backup
    public static final String SHOW_SUBS_CHANNELS_TUTORIAL = "show_subs_channels_tutorial";
    @Backup
    public static final String SHOW_TRENDING_TAB_TUTORIAL = "show_trending_tab_tutorial";
    @Backup
    public static final String TIME_FUSION_ENABLED = "time_fusion_enabled";
    @Backup
    public static final String TIME_LAST_BROWSE_CLING_SHOWN = "time_last_browse_cling_shown";
    @Backup
    public static final String TIME_LAST_WATCH_TUTORIAL_SHOWN = "time_last_watch_tutorial_shown";
    @Backup
    public static final String UPLOAD_PRIVACY = "upload_privacy";
    @Backup
    public static final String VIDEO_ZOOM_USER_EDUCATION_SHOWN = "video_zoom_user_education_shown";
    
    public static amwd b(final aokb aokb) {
        aokh aokh;
        if ((aokh = aokb.r) == null) {
            aokh = aokh.a;
        }
        if ((aokh.b & 0x1) != 0x0) {
            aokh aokh2;
            if ((aokh2 = aokb.r) == null) {
                aokh2 = aokh.a;
            }
            amwd amwd;
            if ((amwd = aokh2.c) == null) {
                amwd = amwd.a;
            }
            return amwd;
        }
        return null;
    }
    
    public static void c(final Context context, final agza agza, final CharSequence charSequence) {
        if (agza != null && b((aokb)agza.build()) == null) {
            if (!TextUtils.isEmpty(charSequence)) {
                final Spanned fromHtml = Html.fromHtml(context.getString(2132020017, new Object[] { charSequence }));
                final String string = context.getString(17039370);
                final String string2 = context.getString(17039360);
                final agza builder = ((agzi)amwd.a).createBuilder();
                final ajsq h = abyh.h(fromHtml.toString());
                builder.copyOnWrite();
                final amwd amwd = (amwd)builder.instance;
                h.getClass();
                amwd.d = h;
                amwd.b |= 0x2;
                final ajsq h2 = abyh.h(string.toString());
                builder.copyOnWrite();
                final amwd amwd2 = (amwd)builder.instance;
                h2.getClass();
                amwd2.g = h2;
                amwd2.b |= 0x10;
                final ajsq h3 = abyh.h(string2.toString());
                builder.copyOnWrite();
                final amwd amwd3 = (amwd)builder.instance;
                h3.getClass();
                amwd3.e = h3;
                amwd3.b |= 0x4;
                builder.copyOnWrite();
                final amwd amwd4 = (amwd)builder.instance;
                amwd4.b |= 0x8;
                amwd4.f = true;
                final amwd c = (amwd)builder.build();
                final agza builder2 = ((agzi)aokh.a).createBuilder();
                builder2.copyOnWrite();
                final aokh aokh = (aokh)builder2.instance;
                c.getClass();
                aokh.c = c;
                aokh.b |= 0x1;
                agza.copyOnWrite();
                final aokb aokb = (aokb)agza.instance;
                final aokh r = (aokh)builder2.build();
                final aokb a = aokb.a;
                r.getClass();
                aokb.r = r;
                aokb.b |= 0x20000;
            }
        }
    }
    
    public static void d(final Context context, final agza agza, final CharSequence charSequence) {
        agza.copyOnWrite();
        final aokb aokb = (aokb)agza.instance;
        final aokb a = aokb.a;
        aokb.r = null;
        aokb.b &= 0xFFFDFFFF;
        c(context, agza, charSequence);
    }
    
    public static ahmf g(final alvs alvs) {
        ahmg ahmg;
        if ((ahmg = alvs.t) == null) {
            ahmg = ahmg.a;
        }
        ahmf ahmf;
        if ((ahmf = ahmg.d) == null) {
            ahmf = ahmf.a;
        }
        return ahmf;
    }
    
    public static boolean h(final alvs alvs) {
        if ((alvs.b & 0x40) != 0x0) {
            ahmg ahmg;
            if ((ahmg = alvs.t) == null) {
                ahmg = ahmg.a;
            }
            if ((ahmg.b & 0x4) != 0x0) {
                return true;
            }
        }
        return false;
    }
    
    public static iqf i(final int n, final boolean b) {
        return new iqf(n, b);
    }
    
    public static aqcu j(final abzh abzh) {
        final byte[] array = abzh.c;
        try {
            aqez aqez;
            if ((aqez = ((aqdk)agzi.parseFrom((agzi)aqdk.a, array, ExtensionRegistryLite.getGeneratedRegistry())).c) == null) {
                aqez = aqez.a;
            }
            aqcu aqcu;
            if ((aqcu = ((aqcp)aqez.rr((agyr)aqcp.b)).e) == null) {
                aqcu = aqcu.a;
            }
            return aqcu;
        }
        catch (final ahab ahab) {
            return null;
        }
    }
    
    public static void k(final Optional optional, final amuv amuv, final amva amva, final wwv wwv, final Optional optional2, final Optional optional3) {
        agot.v(!optional2.isPresent() || !optional3.isPresent(), (Object)"videoId and playlistId cannot both be present.");
        amqw amqw;
        if (optional.isPresent()) {
            amqw = (amqw)optional.filter((Predicate)ifl.d).map((Function)iem.o).orElse((Object)amqw.a);
        }
        else if (amuv != amuv.a) {
            amqw = amqw.e;
        }
        else {
            amqw = amqw.a;
        }
        aaiw.t(amva, wwv, (String)optional2.orElse((Object)null), (String)optional3.orElse((Object)null), amuv, amqw == amqw.e, zzf.a, amqw);
    }
    
    public static ilf l(final Class clazz, final Class clazz2) {
        return (ilf)new ikt(clazz, clazz2);
    }
    
    public static int[] m() {
        return new int[] { 1, 2 };
    }
    
    public static aexq n(final eg eg, final aexq aexq, int a, final uyi uyi, final fzo fzo) {
        if (!aexq.h()) {
            return (aexq)aewp.a;
        }
        final agza builder = ((agzi)ajhd.a).createBuilder();
        final aqcz au = fzo.au();
        builder.copyOnWrite();
        final ajhd ajhd = (ajhd)builder.instance;
        au.getClass();
        ajhd.d = au;
        ajhd.c |= 0x2;
        final alyn b = ((ipx)aexq.c()).b;
        final agzc agzc = (agzc)((agzi)apng.a).createBuilder();
        final String i = vek.i(b.e());
        agzc.copyOnWrite();
        final apng apng = (apng)agzc.instance;
        apng.b |= 0x1;
        apng.c = i;
        agzc.copyOnWrite();
        final apng apng2 = (apng)agzc.instance;
        apng2.b |= 0x2;
        apng2.d = 261;
        final String bf = gkt.bf((apng)agzc.build());
        builder.copyOnWrite();
        final ajhd ajhd2 = (ajhd)builder.instance;
        bf.getClass();
        ajhd2.c |= 0x4;
        ajhd2.e = bf;
        final int a2 = ((ipx)aexq.c()).a;
        builder.copyOnWrite();
        final ajhd ajhd3 = (ajhd)builder.instance;
        ajhd3.c |= 0x80;
        ajhd3.h = a2;
        final agza builder2 = ((agzi)ailc.a).createBuilder();
        builder2.copyOnWrite();
        final ailc ailc = (ailc)builder2.instance;
        ailc.b |= 0x1;
        ailc.c = a;
        a = ((ipx)aexq.c()).a;
        builder2.copyOnWrite();
        final ailc ailc2 = (ailc)builder2.instance;
        ailc2.b |= 0x4;
        ailc2.e = a;
        final agza builder3 = ((agzi)aild.a).createBuilder();
        final agza builder4 = ((agzi)ailk.a).createBuilder();
        final agyc c = vek.c(((ipx)aexq.c()).b.e());
        builder4.copyOnWrite();
        final ailk ailk = (ailk)builder4.instance;
        c.getClass();
        ailk.b |= 0x1;
        ailk.c = c;
        builder3.copyOnWrite();
        final aild aild = (aild)builder3.instance;
        final ailk d = (ailk)builder4.build();
        d.getClass();
        aild.d = d;
        aild.b |= 0x2;
        builder2.copyOnWrite();
        final ailc ailc3 = (ailc)builder2.instance;
        final aild f = (aild)builder3.build();
        f.getClass();
        ailc3.f = f;
        ailc3.b |= 0x8;
        builder.copyOnWrite();
        final ajhd ajhd4 = (ajhd)builder.instance;
        final ailc f2 = (ailc)builder2.build();
        f2.getClass();
        ajhd4.f = f2;
        ajhd4.c |= 0x20;
        final agza builder5 = ((agzi)ajhc.a).createBuilder();
        final boolean az = uyi.az();
        builder5.copyOnWrite();
        final ajhc ajhc = (ajhc)builder5.instance;
        ajhc.b |= 0x4;
        ajhc.d = az;
        final boolean af = uyi.af();
        builder5.copyOnWrite();
        final ajhc ajhc2 = (ajhc)builder5.instance;
        ajhc2.b |= 0x2;
        ajhc2.c = af;
        builder.copyOnWrite();
        final ajhd ajhd5 = (ajhd)builder.instance;
        final ajhc g = (ajhc)builder5.build();
        g.getClass();
        ajhd5.g = g;
        ajhd5.c |= 0x40;
        return eg.P(2131951655, (agyr)ajhd.b, (Object)builder.build());
    }
    
    public void e() {
    }
    
    public void f(final aibk aibk) {
    }
}
