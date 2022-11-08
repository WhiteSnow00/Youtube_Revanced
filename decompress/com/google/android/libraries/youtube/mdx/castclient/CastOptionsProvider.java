// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.castclient;

import com.google.android.gms.cast.framework.media.CastMediaOptions;
import android.os.IBinder;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.ArrayList;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.List;
import android.content.Context;

public class CastOptionsProvider implements mjl
{
    public String castAppId;
    public wzw mdxConfig;
    public xfa mdxMediaTransferReceiverEnabler;
    public xbz mdxModuleConfig;
    
    public List getAdditionalSessionProviders(final Context context) {
        return null;
    }
    
    public CastOptions getCastOptions(final Context context) {
        ((xbp)ahbz.az(context, xbp.class)).wB(this);
        final ArrayList list = new ArrayList();
        new LaunchOptions();
        final ArrayList list2 = new ArrayList();
        final String castAppId = this.castAppId;
        final boolean b = this.mdxMediaTransferReceiverEnabler.b();
        final boolean b2 = this.mdxMediaTransferReceiverEnabler.b();
        final LaunchOptions launchOptions = new LaunchOptions();
        final wzw mdxConfig = this.mdxConfig;
        final boolean aj = mdxConfig.aj;
        boolean a = false;
        if (!aj) {
            a = a;
            if (this.mdxModuleConfig.f != 1) {
                a = true;
            }
        }
        launchOptions.a = a;
        launchOptions.c = mdxConfig.n;
        new NotificationOptions((List)NotificationOptions.a, NotificationOptions.b, 10000L, (String)null, mlc.l("smallIconDrawableResId"), mlc.l("stopLiveStreamDrawableResId"), mlc.l("pauseDrawableResId"), mlc.l("playDrawableResId"), mlc.l("skipNextDrawableResId"), mlc.l("skipPrevDrawableResId"), mlc.l("forwardDrawableResId"), mlc.l("forward10DrawableResId"), mlc.l("forward30DrawableResId"), mlc.l("rewindDrawableResId"), mlc.l("rewind10DrawableResId"), mlc.l("rewind30DrawableResId"), mlc.l("disconnectDrawableResId"), mlc.l("notificationImageSizeDimenResId"), mlc.l("castingToDeviceStringResId"), mlc.l("stopLiveStreamStringResId"), mlc.l("pauseStringResId"), mlc.l("playStringResId"), mlc.l("skipNextStringResId"), mlc.l("skipPrevStringResId"), mlc.l("forwardStringResId"), mlc.l("forward10StringResId"), mlc.l("forward30StringResId"), mlc.l("rewindStringResId"), mlc.l("rewind10StringResId"), mlc.l("rewind30StringResId"), mlc.l("disconnectStringResId"), (IBinder)null, false, false);
        return new CastOptions(castAppId, (List)list, false, launchOptions, true, (CastMediaOptions)aexq.j(new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", (String)null, (IBinder)null, (NotificationOptions)null, false, true)).f(), true, 0.05000000074505806, false, false, b, (List)list2, b2, 0);
    }
}
