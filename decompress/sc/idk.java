import com.google.protos.youtube.api.innertube.OfflineVideosEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import java.util.Iterator;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idk implements feu, flg
{
    private final ghb a;
    private final atke b;
    private final Set c;
    private final hzn d;
    private final hzn e;
    private final skt f;
    private final fzw g;
    
    public idk(final skt f, final ghb a, final atke b, final hzn e, final fzw g, final hzn d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = new HashSet();
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.g = g;
        this.d = d;
        f.j((feu)this);
    }
    
    private static void e(final acko acko, final boolean b) {
        final View a = acko.a();
        if (a != null) {
            a.setEnabled(true);
            if (a instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)a;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    viewGroup.getChildAt(i).setEnabled(true);
                }
            }
            float alpha;
            if (!b) {
                alpha = 0.4f;
            }
            else {
                alpha = 1.0f;
            }
            a.setAlpha(alpha);
        }
    }
    
    public final void a(final acko acko) {
        this.c(acko, null);
    }
    
    public final void b(final boolean b) {
        final PaneDescriptor d = this.a.d();
        if (d != null && (this.g.aw(d) || this.e.e(d) || this.d.c(d))) {
            final aiqj f = d.f();
            if (f != null) {
                if (((ahbc)f).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                    if ("FElibrary".equals(((aicj)((ahbc)f).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c)) {
                        final Iterator iterator = this.c.iterator();
                        while (iterator.hasNext()) {
                            e((acko)iterator.next(), b ^ true);
                        }
                    }
                }
            }
        }
    }
    
    public final void c(final acko acko, final aiqj aiqj) {
        if (aiqj != null && (((ahbc)aiqj).ry((ahaq)ApplicationHelpEndpointOuterClass.applicationHelpEndpoint) || ((ahbc)aiqj).ry((ahaq)ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint) || ((ahbc)aiqj).ry((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint) || ((ahbc)aiqj).ry((ahaq)OfflineVideosEndpointOuterClass.offlineVideosEndpoint) || flh.d(aiqj, this.b))) {
            return;
        }
        final Set c = this.c;
        acko.getClass();
        c.add(acko);
        e(acko, this.f.a ^ true);
    }
    
    public final void d(final acko acko) {
        acko.getClass();
        if (this.c.contains(acko)) {
            e(acko, true);
            this.c.remove(acko);
        }
    }
}
