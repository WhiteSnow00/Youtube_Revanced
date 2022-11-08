// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import java.util.List;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.w;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.TextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b;

public final class f extends aazp implements b
{
    public final asic a;
    public boolean b;
    private FrameLayout c;
    private RecyclerView d;
    private GridLayoutManager e;
    private TextView f;
    private final AtomicBoolean g;
    private WeakReference h;
    private e i;
    private RelatedVideosScreen j;
    private com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b k;
    private boolean l;
    private com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e m;
    
    public f(final Context context) {
        super(context);
        this.k = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.b = true;
        this.g = new AtomicBoolean(false);
        this.a = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c((asix)new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.f(this, 2), (asjc)llz.j);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        if (!busSupported$Data.d().equals((Object)com.google.android.apps.youtube.embeddedplayer.service.model.b.i)) {
            return;
        }
        final RelatedVideosScreen j = (RelatedVideosScreen)busSupported$Data;
        final afcr c = j.c;
        if (c != null && !j.equals((Object)RelatedVideosScreen.a) && !((List)c).isEmpty() && !((List)c).get(0).equals(RelatedVideoItem.a)) {
            this.j = j;
            this.mm();
        }
        else {
            this.j = null;
            this.mk();
        }
        this.Y();
    }
    
    public final void d() {
    }
    
    public final void m(final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e m, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c c, final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b k) {
        this.h = new WeakReference((T)c);
        this.m = m;
        this.k = k;
    }
    
    public final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final boolean mn() {
        return this.l && super.mn();
    }
    
    public final boolean oU() {
        return this.j != null;
    }
    
    public final aazu ox() {
        return super.ox();
    }
}
