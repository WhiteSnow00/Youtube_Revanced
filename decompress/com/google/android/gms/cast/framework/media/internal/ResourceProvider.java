// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cast.framework.media.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ResourceProvider
{
    private static final Map a;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", 2131231143);
        hashMap.put("stopLiveStreamDrawableResId", 2131231144);
        hashMap.put("pauseDrawableResId", 2131231136);
        hashMap.put("playDrawableResId", 2131231137);
        hashMap.put("skipNextDrawableResId", 2131231141);
        hashMap.put("skipPrevDrawableResId", 2131231142);
        hashMap.put("forwardDrawableResId", 2131231132);
        hashMap.put("forward10DrawableResId", 2131231133);
        hashMap.put("forward30DrawableResId", 2131231134);
        hashMap.put("rewindDrawableResId", 2131231138);
        hashMap.put("rewind10DrawableResId", 2131231139);
        hashMap.put("rewind30DrawableResId", 2131231140);
        hashMap.put("disconnectDrawableResId", 2131231131);
        hashMap.put("notificationImageSizeDimenResId", 2131165717);
        hashMap.put("castingToDeviceStringResId", 2132017620);
        hashMap.put("stopLiveStreamStringResId", 2132017662);
        hashMap.put("pauseStringResId", 2132017653);
        hashMap.put("playStringResId", 2132017654);
        hashMap.put("skipNextStringResId", 2132017659);
        hashMap.put("skipPrevStringResId", 2132017660);
        hashMap.put("forwardStringResId", 2132017636);
        hashMap.put("forward10StringResId", 2132017637);
        hashMap.put("forward30StringResId", 2132017638);
        hashMap.put("rewindStringResId", 2132017655);
        hashMap.put("rewind10StringResId", 2132017656);
        hashMap.put("rewind30StringResId", 2132017657);
        hashMap.put("disconnectStringResId", 2132017626);
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public static Integer findResourceByName(final String s) {
        if (s == null) {
            return null;
        }
        return ResourceProvider.a.get(s);
    }
}
