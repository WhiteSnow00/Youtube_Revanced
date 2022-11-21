// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.d;
import android.content.Context;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;

public final class c
{
    public final DialogInterface$OnShowListener a;
    public final DialogInterface$OnDismissListener b;
    public Context c;
    public d d;
    public abfl e;
    public VideoQuality[] f;
    public int g;
    public int h;
    public boolean i;
    
    public c(final Context c, final DialogInterface$OnShowListener a, final DialogInterface$OnDismissListener b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
}
