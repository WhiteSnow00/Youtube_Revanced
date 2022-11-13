// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import java.util.HashSet;
import android.os.RemoteException;
import android.graphics.Bitmap;
import java.util.Set;
import android.view.View;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e;

public final class d extends on
{
    public static final int B = 0;
    public int A;
    private final e C;
    public BitmapKey t;
    public SelectableItemKey u;
    public final TextView v;
    public final TextView w;
    public final ImageView x;
    public final WeakReference y;
    public final tcc z;
    
    public d(final Context context, final View view, final e c, final WeakReference y) {
        super(view);
        this.C = c;
        this.y = y;
        this.v = new TextView(context);
        this.w = new TextView(context);
        this.x = new ImageView(context);
        this.z = (tcc)new c(0);
    }
    
    public d(final View view, final e c, final WeakReference y) {
        super(view);
        this.C = c;
        this.y = y;
        this.v = (TextView)view.findViewById(2131431136);
        this.w = (TextView)view.findViewById(2131431135);
        this.x = (ImageView)view.findViewById(2131431134);
        this.A = 1;
        this.z = (tcc)new hxl(this, 6);
    }
    
    public final void E() {
        final BitmapKey t = this.t;
        while (true) {
            if (t == null) {
                break Label_0084;
            }
            final e c = this.C;
            final tcc z = this.z;
            final Set set = c.a.get(t);
            if (set == null) {
                break Label_0084;
            }
            set.remove(z);
            if (!set.isEmpty()) {
                break Label_0084;
            }
            c.a.remove(t);
            try {
                final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c b = c.b;
                if (b != null) {
                    b.a(t);
                }
                this.A = 1;
                this.x.setImageBitmap((Bitmap)null);
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void F() {
        final int a = this.A;
        Label_0120: {
            if (a == 0) {
                break Label_0120;
            }
            if (a != 1) {
                return;
            }
            final BitmapKey t = this.t;
            if (t == null) {
                return;
            }
            final e c = this.C;
            final tcc z = this.z;
            final Set set = c.a.get(t);
            while (true) {
                if (set != null) {
                    set.add(z);
                    break Label_0114;
                }
                final HashSet set2 = new HashSet();
                c.a.put(t, set2);
                set2.add(z);
                try {
                    final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c b = c.b;
                    if (b != null) {
                        b.b(t);
                    }
                    this.A = 2;
                    return;
                    throw null;
                }
                catch (final RemoteException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
