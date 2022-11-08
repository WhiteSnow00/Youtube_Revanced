import androidx.preference.Preference;
import java.util.List;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityCheckBoxPreference;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrd
{
    public static final afcr a;
    public static final afcr b;
    public final tku c;
    public final oas d;
    public final asib e;
    public final wwv f;
    public boolean g;
    public boolean h;
    public final arud i;
    
    static {
        a = afcr.t((Object)"mobile_video_quality_auto_key", (Object)"mobile_video_quality_high_key", (Object)"mobile_video_quality_low_key");
        b = afcr.t((Object)"wifi_video_quality_auto_key", (Object)"wifi_video_quality_high_key", (Object)"wifi_video_quality_low_key");
    }
    
    public jrd(final tku c, final oas d, final arud i, final wwu wwu, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.i = i;
        this.f = wwu.n();
        this.e = new asib();
    }
    
    public static final wyb c(final String s) {
        int n = 0;
        Label_0153: {
            switch (s.hashCode()) {
                case 2069734704: {
                    if (s.equals("wifi_video_quality_high_key")) {
                        n = 1;
                        break Label_0153;
                    }
                    break;
                }
                case 898750141: {
                    if (s.equals("wifi_video_quality_auto_key")) {
                        n = 5;
                        break Label_0153;
                    }
                    break;
                }
                case 893580870: {
                    if (s.equals("wifi_video_quality_low_key")) {
                        n = 3;
                        break Label_0153;
                    }
                    break;
                }
                case 819494931: {
                    if (s.equals("mobile_video_quality_low_key")) {
                        n = 2;
                        break Label_0153;
                    }
                    break;
                }
                case -226929405: {
                    if (s.equals("mobile_video_quality_high_key")) {
                        n = 0;
                        break Label_0153;
                    }
                    break;
                }
                case -1397913968: {
                    if (s.equals("mobile_video_quality_auto_key")) {
                        n = 4;
                        break Label_0153;
                    }
                    break;
                }
            }
            n = -1;
        }
        int n2;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            n2 = 93930;
                            if (n != 5) {
                                final StringBuilder sb = new StringBuilder("Unknown preference key (");
                                sb.append(s);
                                sb.append(")! returning Visual Element VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_AUTO.");
                                trn.n(sb.toString(), (Throwable)new Exception());
                                n2 = n2;
                            }
                        }
                        else {
                            n2 = 93927;
                        }
                    }
                    else {
                        n2 = 93931;
                    }
                }
                else {
                    n2 = 93928;
                }
            }
            else {
                n2 = 93932;
            }
        }
        else {
            n2 = 93929;
        }
        return wya.c(n2);
    }
    
    public final void b(final cff cff, final afcr afcr, final aexg aexg) {
        final ArrayList list = new ArrayList();
        for (int c = ((afgh)afcr).c, i = 0; i < c; ++i) {
            final String s = ((List<String>)afcr).get(i);
            if (this.g) {
                this.f.l((wxz)new wws(c(s)));
            }
            final VideoQualityCheckBoxPreference videoQualityCheckBoxPreference = (VideoQualityCheckBoxPreference)cff.d((CharSequence)s);
            videoQualityCheckBoxPreference.getClass();
            ((Preference)videoQualityCheckBoxPreference).n = (cel)new jrc(this, videoQualityCheckBoxPreference);
            list.add(videoQualityCheckBoxPreference);
        }
        this.e.c(this.c.d().R().P(ashw.a()).al((asix)new jpm(aexg, list, 4)));
    }
}
