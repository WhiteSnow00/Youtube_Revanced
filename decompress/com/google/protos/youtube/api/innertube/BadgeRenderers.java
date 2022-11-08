// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class BadgeRenderers
{
    public static final agzg standaloneCollectionBadgeRenderer;
    public static final agzg standaloneRedBadgeRenderer;
    public static final agzg standaloneYpcBadgeRenderer;
    public static final agzg unifiedVerifiedBadgeRenderer;
    
    static {
        standaloneYpcBadgeRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)ahyu.a, (MessageLite)ahyu.a, (agzn)null, 91394106, ahcm.k, (Class)ahyu.class);
        standaloneRedBadgeRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)ahys.a, (MessageLite)ahys.a, (agzn)null, 104364901, ahcm.k, (Class)ahys.class);
        standaloneCollectionBadgeRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)ahyr.a, (MessageLite)ahyr.a, (agzn)null, 104416691, ahcm.k, (Class)ahyr.class);
        unifiedVerifiedBadgeRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)ahyy.a, (MessageLite)ahyy.a, (agzn)null, 278471019, ahcm.k, (Class)ahyy.class);
    }
    
    private BadgeRenderers() {
    }
}
