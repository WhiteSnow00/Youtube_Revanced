// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.libraries.lidar.VisibilityChangeEventData;

public final class ApiPlayerService$$ExternalSyntheticLambda29 implements Runnable
{
    public final ApiPlayerService a;
    public final VisibilityChangeEventData b;
    
    public ApiPlayerService$$ExternalSyntheticLambda29(final ApiPlayerService a, final VisibilityChangeEventData b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.a.s(this.b);
    }
}
