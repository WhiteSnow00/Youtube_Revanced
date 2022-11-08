// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import com.google.protos.youtube.api.innertube.SimpleAdBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

public abstract class VideoAd extends MediaAd
{
    protected VideoAd(final String s, final byte[] array, final String s2, final String s3, final boolean b, final PlayerConfigModel playerConfigModel, final String s4, final long n, final VideoAdTrackingModel videoAdTrackingModel) {
        super(s, array, s2, s3, b, playerConfigModel, s4, n, videoAdTrackingModel);
    }
    
    public final aioe I() {
        final aldr k = this.k();
        if (k != null && (k.b & 0x8) != 0x0) {
            anss anss;
            if ((anss = k.e) == null) {
                anss = anss.a;
            }
            final aibb aibb = (aibb)((agzd)anss).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
            if ((aibb.b & 0x8000) != 0x0) {
                aioe aioe;
                if ((aioe = aibb.o) == null) {
                    aioe = aioe.a;
                }
                return aioe;
            }
        }
        return null;
    }
    
    public final aofp J() {
        final aldr k = this.k();
        aofp aofp2;
        final aofp aofp = aofp2 = null;
        if (k != null) {
            aofp2 = aofp;
            if ((k.b & 0x1) != 0x0) {
                anss anss;
                if ((anss = k.c) == null) {
                    anss = anss.a;
                }
                aofp2 = (aofp)aaiy.w(anss, (agyr)SkipAdRendererOuterClass.skipAdRenderer);
            }
        }
        if (aofp2 == null) {
            return aofp.a;
        }
        return aofp2;
    }
    
    public final aoff ax() {
        final aldr k = this.k();
        if (k != null && (k.b & 0x20) != 0x0) {
            anss anss;
            if ((anss = k.f) == null) {
                anss = anss.a;
            }
            return (aoff)aaiy.w(anss, (agyr)SimpleAdBadgeRendererOuterClass.simpleAdBadgeRenderer);
        }
        return null;
    }
}
