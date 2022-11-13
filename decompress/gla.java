import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gla
{
    private static final afft a;
    
    static {
        a = afft.x((Object)"app_theme_appearance_edu_shown", (Object)"app_theme_not_match_system_edu_shown", (Object)"app_theme_dark", (Object)"app_theme_appearance", (Object)"auto_switch_theme_on_battery_saver", (Object)"auto_switch_theme_on_battery_saver_settings_toggle", (Object[])new String[0]);
    }
    
    public static tmx a(final Context context, final atke atke, final afvs afvs, final String s, final atke atke2) {
        return (tmx)tfg.v("theme_proto.pb", context, (qcy)atke.a(), afvs, s, (tci)fnh.g, (MessageLite)gkw.a, gla.a, (aujg)atke2.a(), true);
    }
    
    public static gkw b(final sqq sqq, final gkw gkw) {
        final ahaz builder = gkw.toBuilder();
        if (sqq.A("app_theme_appearance_edu_shown")) {
            final boolean u = tfg.u("app_theme_appearance_edu_shown", sqq);
            builder.copyOnWrite();
            final gkw gkw2 = (gkw)builder.instance;
            gkw2.b |= 0x1;
            gkw2.c = u;
        }
        if (sqq.A("app_theme_not_match_system_edu_shown")) {
            final boolean u2 = tfg.u("app_theme_not_match_system_edu_shown", sqq);
            builder.copyOnWrite();
            final gkw gkw3 = (gkw)builder.instance;
            gkw3.b |= 0x2;
            gkw3.d = u2;
        }
        if (sqq.A("app_theme_dark")) {
            final boolean u3 = tfg.u("app_theme_dark", sqq);
            builder.copyOnWrite();
            final gkw gkw4 = (gkw)builder.instance;
            gkw4.b |= 0x4;
            gkw4.e = u3;
        }
        if (sqq.A("app_theme_appearance")) {
            final String y = sqq.y("app_theme_appearance", "APPEARANCE_SYSTEM");
            builder.copyOnWrite();
            final gkw gkw5 = (gkw)builder.instance;
            y.getClass();
            gkw5.b |= 0x8;
            gkw5.f = y;
        }
        if (sqq.A("auto_switch_theme_on_battery_saver")) {
            final boolean u4 = tfg.u("auto_switch_theme_on_battery_saver", sqq);
            builder.copyOnWrite();
            final gkw gkw6 = (gkw)builder.instance;
            gkw6.b |= 0x10;
            gkw6.g = u4;
        }
        if (sqq.A("auto_switch_theme_on_battery_saver_settings_toggle")) {
            final boolean u5 = tfg.u("auto_switch_theme_on_battery_saver_settings_toggle", sqq);
            builder.copyOnWrite();
            final gkw gkw7 = (gkw)builder.instance;
            gkw7.b |= 0x20;
            gkw7.h = u5;
        }
        return (gkw)builder.build();
    }
}
