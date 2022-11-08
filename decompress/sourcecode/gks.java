import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gks
{
    private static final afdu a;
    
    static {
        a = afdu.x((Object)"app_theme_appearance_edu_shown", (Object)"app_theme_not_match_system_edu_shown", (Object)"app_theme_dark", (Object)"app_theme_appearance", (Object)"auto_switch_theme_on_battery_saver", (Object)"auto_switch_theme_on_battery_saver_settings_toggle", (Object[])new String[0]);
    }
    
    public static tku a(final Context context, final atjj atjj, final aftr aftr, final String s, final atjj atjj2) {
        return (tku)tdb.v("theme_proto.pb", context, (qbo)atjj.a(), aftr, s, (tad)fnb.g, (MessageLite)gkn.a, gks.a, (auip)atjj2.a(), true);
    }
    
    public static gkn b(final tdg tdg, final gkn gkn) {
        final agza builder = gkn.toBuilder();
        if (tdg.I("app_theme_appearance_edu_shown")) {
            final boolean u = tdb.u("app_theme_appearance_edu_shown", tdg);
            builder.copyOnWrite();
            final gkn gkn2 = (gkn)builder.instance;
            gkn2.b |= 0x1;
            gkn2.c = u;
        }
        if (tdg.I("app_theme_not_match_system_edu_shown")) {
            final boolean u2 = tdb.u("app_theme_not_match_system_edu_shown", tdg);
            builder.copyOnWrite();
            final gkn gkn3 = (gkn)builder.instance;
            gkn3.b |= 0x2;
            gkn3.d = u2;
        }
        if (tdg.I("app_theme_dark")) {
            final boolean u3 = tdb.u("app_theme_dark", tdg);
            builder.copyOnWrite();
            final gkn gkn4 = (gkn)builder.instance;
            gkn4.b |= 0x4;
            gkn4.e = u3;
        }
        if (tdg.I("app_theme_appearance")) {
            final String g = tdg.G("app_theme_appearance", "APPEARANCE_SYSTEM");
            builder.copyOnWrite();
            final gkn gkn5 = (gkn)builder.instance;
            g.getClass();
            gkn5.b |= 0x8;
            gkn5.f = g;
        }
        if (tdg.I("auto_switch_theme_on_battery_saver")) {
            final boolean u4 = tdb.u("auto_switch_theme_on_battery_saver", tdg);
            builder.copyOnWrite();
            final gkn gkn6 = (gkn)builder.instance;
            gkn6.b |= 0x10;
            gkn6.g = u4;
        }
        if (tdg.I("auto_switch_theme_on_battery_saver_settings_toggle")) {
            final boolean u5 = tdb.u("auto_switch_theme_on_battery_saver_settings_toggle", tdg);
            builder.copyOnWrite();
            final gkn gkn7 = (gkn)builder.instance;
            gkn7.b |= 0x20;
            gkn7.h = u5;
        }
        return (gkn)builder.build();
    }
}
