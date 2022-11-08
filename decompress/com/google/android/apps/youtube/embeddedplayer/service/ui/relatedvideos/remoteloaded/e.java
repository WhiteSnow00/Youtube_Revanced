// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.w;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

final class e extends nq
{
    private static final List f;
    public List a;
    public final AtomicBoolean e;
    private final b g;
    private final WeakReference h;
    private final boolean i;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e j;
    
    static {
        f = new ArrayList();
    }
    
    public e(final boolean i, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e j, final WeakReference h, final b g, final AtomicBoolean e) {
        this.a = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.e.f;
        this.i = i;
        this.j = j;
        this.h = h;
        this.g = g;
        this.e = e;
    }
    
    public final int a() {
        final List a = this.a;
        if (a != null) {
            return a.size();
        }
        return 0;
    }
    
    public final long mR(final int n) {
        final String h = this.a.get(n).h();
        if (h != null) {
            return h.hashCode();
        }
        return 0L;
    }
}
