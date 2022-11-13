// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
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
    
    public final /* bridge */ on g(ViewGroup viewGroup, int b) {
        final boolean i = this.i;
        final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e j = this.j;
        final WeakReference h = this.h;
        b = d.B;
        Label_0120: {
            if (i) {
                try {
                    viewGroup = (ViewGroup)LayoutInflater.from(viewGroup.getContext()).inflate(2131625293, viewGroup, false);
                    break Label_0120;
                }
                catch (final RuntimeException ex) {
                    c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Error inflating related videos", (Throwable)ex);
                    afse.o("Error inflating related videos: ".concat(ex.toString()));
                    return new d(viewGroup.getContext(), new View(viewGroup.getContext()), j, h);
                }
            }
            viewGroup = (ViewGroup)LayoutInflater.from(viewGroup.getContext()).inflate(2131625293, viewGroup, false);
        }
        final d d2 = new d((View)viewGroup, j, h);
        ((View)viewGroup).setOnClickListener((View$OnClickListener)new v(d2, 8));
        return d2;
    }
    
    public final long mR(final int n) {
        final String h = this.a.get(n).h();
        if (h != null) {
            return h.hashCode();
        }
        return 0L;
    }
    
    public final /* bridge */ void q(final on on, final int n) {
        final d d = (d)on;
        final RelatedVideoItem relatedVideoItem = this.a.get(n);
        final TextView v = d.v;
        final String s = "";
        CharSequence g;
        if (relatedVideoItem != null) {
            g = relatedVideoItem.g();
        }
        else {
            g = "";
        }
        v.setText(g);
        final TextView w = d.w;
        CharSequence f = s;
        if (relatedVideoItem != null) {
            f = relatedVideoItem.f();
        }
        w.setText(f);
        if (relatedVideoItem == null) {
            d.E();
        }
        BitmapKey a = relatedVideoItem.a();
        if (a == null || !a.equals((Object)d.t)) {
            d.E();
        }
        final SelectableItemKey selectableItemKey = null;
        if (relatedVideoItem == null) {
            a = null;
        }
        d.t = a;
        SelectableItemKey b = selectableItemKey;
        if (relatedVideoItem != null) {
            b = relatedVideoItem.b();
        }
        d.u = b;
        final ahab c = relatedVideoItem.c();
        if (c == null) {
            afse.p("Unable to log visibility of related video item, tracking params are null");
        }
        else {
            this.g.d(c.I());
        }
        if (!this.e.get()) {
            d.F();
        }
    }
}
