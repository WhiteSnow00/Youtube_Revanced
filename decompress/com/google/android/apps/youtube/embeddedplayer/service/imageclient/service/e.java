// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.imageclient.service;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;

public final class e implements tdg
{
    private final BitmapKey a;
    private final WeakReference b;
    private Runnable c;
    
    public e(final BitmapKey a, final WeakReference b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        synchronized (this) {
            final Runnable c = this.c;
            if (c != null) {
                c.run();
                this.c = null;
            }
            this.b.clear();
        }
    }
    
    public final void b(final Bitmap bitmap) {
        monitorenter(this);
        while (true) {
            try {
                Label_0065: {
                    try {
                        final f f = (f)this.b.get();
                        if (f != null) {
                            f.a(this.a, bitmap);
                        }
                    }
                    finally {
                        break Label_0065;
                    }
                    final Runnable c = this.c;
                    if (c != null) {
                        c.run();
                        this.c = null;
                    }
                    this.b.clear();
                    monitorexit(this);
                    return;
                }
                monitorexit(this);
                throw;
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final /* bridge */ void c(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        this.b(null);
    }
    
    public final /* bridge */ void d(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        this.b((Bitmap)o2);
    }
}
