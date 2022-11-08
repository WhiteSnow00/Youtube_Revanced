import java.util.AbstractMap;
import com.google.android.apps.youtube.app.settings.offline.SmartDownloadsPrefsFragment;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityPrefsFragment;
import com.google.android.apps.youtube.app.settings.ThirdPartyPrefsFragment;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jni
{
    public static final Map a;
    
    static {
        final afct h = afcw.h();
        h.i(a(10009, AboutPrefsFragment.class));
        h.i(a(10014, OfflinePrefsFragment.class));
        h.i(a(10001, NotificationPrefsFragment.class));
        h.i(a(10029, PrivacyPrefsFragment.class));
        h.i(a(10034, LiveChatFragment.class));
        h.i(a(10048, BillingsAndPaymentsPrefsFragment.class));
        h.i(a(10050, GeneralPrefsFragment.class));
        h.i(a(10058, AutoplayPrefsFragment.class));
        h.i(a(10039, ThirdPartyPrefsFragment.class));
        h.i(a(10100, VideoQualityPrefsFragment.class));
        h.i(a(10113, DataSavingPrefsFragment.class));
        h.i(a(10030, SmartDownloadsPrefsFragment.class));
        a = (Map)h.c();
    }
    
    private static Map.Entry a(final int n, final Class clazz) {
        return (Map.Entry)new AbstractMap.SimpleImmutableEntry(String.valueOf(n - 1), clazz.getName());
    }
}
