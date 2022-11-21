// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MobileV2UserFeedEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import java.util.List;
import java.util.Map;
import android.content.Context;

public final class e implements veh
{
    private final Context a;
    private final veh b;
    private final veh c;
    private final c d;
    private final b e;
    private final hzb f;
    private final sqw g;
    
    public e(final Context a, final veh b, final veh c, final hzb f, final c d, final b e, final sqw g, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = g;
    }
    
    public final void a(final aisc aisc) {
        this.c(aisc, null);
    }
    
    public final void b(final List list) {
        veg.b((veh)this, list);
    }
    
    public final void c(final aisc aisc, final Map map) {
        if (aisc != null) {
            try {
                if (((ahcu)aisc).ry((ahci)ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint)) {
                    throw new d("Settings not supported");
                }
                if (((ahcu)aisc).ry((ahci)BrowseEndpointOuterClass.browseEndpoint)) {
                    throw new d("Browse not supported");
                }
                if (((ahcu)aisc).ry((ahci)InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)) {
                    this.c.c(aisc, map);
                    return;
                }
                if (((ahcu)aisc).ry((ahci)MobileV2UserFeedEndpointOuterClass.mobileV2UserFeedEndpoint)) {
                    throw new d("Feed not supported");
                }
                if (((ahcu)aisc).ry((ahci)OfflineEndpointOuterClass.offlineEndpoint)) {
                    throw new d("Offline not supported");
                }
                if (((ahcu)aisc).ry((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                    throw new d("Offline Watch not supported");
                }
                if (((ahcu)aisc).ry((ahci)SearchEndpointOuterClass.searchEndpoint)) {
                    throw new d("Search not supported");
                }
                if (((ahcu)aisc).ry((ahci)SignInEndpointOuterClass.signInEndpoint)) {
                    throw new d("Sign in not supported");
                }
                if (((ahcu)aisc).ry((ahci)UrlEndpointOuterClass.urlEndpoint)) {
                    tdk.f(this.a, tqf.cL(((aple)((ahcu)aisc).rx((ahci)UrlEndpointOuterClass.urlEndpoint)).c));
                    return;
                }
                if (((ahcu)aisc).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                    this.b.c(aisc, (Map)null);
                    return;
                }
                if (((ahcu)aisc).ry((ahci)WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint)) {
                    throw new d("Watch Playlist not supported");
                }
                if (((ahcu)aisc).ry((ahci)AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint)) {
                    this.d.a(aisc);
                    return;
                }
                if (((ahcu)aisc).ry((ahci)AddToToastActionOuterClass$AddToToastAction.addToToastAction)) {
                    this.f.sb(aisc, map);
                    return;
                }
                if (((ahcu)aisc).ry((ahci)AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
                    this.e.a(aisc);
                    return;
                }
                if (((ahcu)aisc).ry((ahci)PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint)) {
                    return;
                }
                if (!((ahcu)aisc).ry((ahci)RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand)) {
                    throw new d("Unknown Navigation");
                }
                final sqw g = this.g;
                if (g != null) {
                    g.sb(aisc, map);
                    return;
                }
                throw new d("Attestation not supported for non-sign-in supported apps.");
            }
            catch (final d d) {
                znh.c(zng.b, znf.d, "Unsupported command: ".concat(String.valueOf(d.getMessage())), (Throwable)d);
            }
        }
    }
    
    public final void d(final List list, final Map map) {
        veg.c((veh)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        veg.d((veh)this, list, o);
    }
}
