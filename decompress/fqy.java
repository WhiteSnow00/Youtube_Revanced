import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqy
{
    public static final afeq a;
    
    static {
        a = afeq.u((Object)"snap_zoom_initially_zoomed", (Object)"video_zoom_user_education_shown", (Object)"inline_global_play_pause", (Object)"autonav_toggle_user_edu_triggers_remaining");
    }
    
    public static Uri a(final Context context) {
        return tfg.k(context, "watch", "watchstorage.pb");
    }
}
