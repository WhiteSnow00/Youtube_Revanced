import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ify implements ttg
{
    public static final ify a;
    public static final ify b;
    public static final ify c;
    public static final ify d;
    public static final ify e;
    public static final ify f;
    public static final ify g;
    public static final ify h;
    public static final ify i;
    public static final ify j;
    public static final ify k;
    public static final ify l;
    public static final ify m;
    public static final ify n;
    public static final ify o;
    public static final ify p;
    public static final ify q;
    public static final ify r;
    public static final ify s;
    public static final ify t;
    private final int u;
    
    static {
        t = new ify(20);
        s = new ify(19);
        r = new ify(18);
        q = new ify(17);
        p = new ify(16);
        o = new ify(15);
        n = new ify(14);
        m = new ify(13);
        l = new ify(12);
        k = new ify(11);
        j = new ify(10);
        i = new ify(9);
        h = new ify(8);
        g = new ify(7);
        f = new ify(6);
        e = new ify(5);
        d = new ify(3);
        c = new ify(2);
        b = new ify(1);
        a = new ify(0);
    }
    
    public ify(final int u) {
        this.u = u;
    }
    
    public final void a(final Object o) {
        switch (this.u) {
            default: {
                final Void void1 = (Void)o;
                return;
            }
            case 19: {
                final Throwable t = (Throwable)o;
                ttr.l("Error playing conversation audio");
                return;
            }
            case 18: {
                final Throwable t2 = (Throwable)o;
                final int ax = VoiceSearchActivity.ax;
                zlm.b(zll.b, zlk.y, "Failed to async read voiceConsentSnackbarImpressions proto after failed warmup");
                return;
            }
            case 17: {
                final Void void2 = (Void)o;
                final int ax2 = VoiceSearchActivity.ax;
                return;
            }
            case 16: {
                final Void void3 = (Void)o;
                final int ax3 = VoiceSearchActivity.ax;
                return;
            }
            case 15: {
                final Throwable t3 = (Throwable)o;
                final int ax4 = VoiceSearchActivity.ax;
                return;
            }
            case 14: {
                final Throwable t4 = (Throwable)o;
                final int ax5 = VoiceSearchActivity.ax;
                zlm.b(zll.b, zlk.y, "Failed to async read VoiceFeatureSettings proto after failed warmup");
                return;
            }
            case 13: {
                final Throwable t5 = (Throwable)o;
                final int ax6 = VoiceSearchActivity.ax;
                return;
            }
            case 12: {
                final Void void4 = (Void)o;
                final int ax7 = VoiceSearchActivity.ax;
                return;
            }
            case 11: {
                final Throwable t6 = (Throwable)o;
                ttr.l("Error stopping player on activity pause");
                return;
            }
            case 10: {
                final Throwable t7 = (Throwable)o;
                final int ax8 = VoiceSearchActivity.ax;
                return;
            }
            case 9: {
                final Throwable t8 = (Throwable)o;
                return;
            }
            case 8: {
                ttr.d("Failed to get bitmap from story board client: ", (Throwable)o);
                return;
            }
            case 7: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                return;
            }
            case 6: {
                ttr.d("Error getting accessibility settings", (Throwable)o);
                return;
            }
            case 5: {
                ttr.d("Failed to update pending delete video Id", (Throwable)o);
                return;
            }
            case 4: {
                final Throwable t9 = (Throwable)o;
                if (t9 instanceof InterruptedException) {
                    ttr.d("DownloadsElementsFactory interrupted when loading persisted FUT", t9);
                    return;
                }
                if (t9 instanceof ExecutionException) {
                    ttr.d("DownloadsElementsFactory crashed when loading persisted FUT", t9);
                    return;
                }
                if (t9 instanceof TimeoutException) {
                    ttr.d("DownloadsElementsFactory timed out when loading persisted FUT", t9);
                }
                return;
            }
            case 3: {
                ttr.d("Failed to get DownloadOptionsPickerDialogCommand", (Throwable)o);
                return;
            }
            case 2: {
                ttr.d("Failed to get DownloadOptionsPickerActionSheetCommand", (Throwable)o);
                return;
            }
            case 1: {
                ttr.d("Failed to update offline has shown download expiration disclaimer.", (Throwable)o);
                return;
            }
            case 0: {
                ttr.d("Failed to read offlineDisclaimerShown flag.", (Throwable)o);
            }
        }
    }
}
