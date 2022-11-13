// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import j$.util.Optional;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.os.RemoteException;
import java.util.HashMap;

public final class b extends eoa implements c
{
    public final HashMap a;
    private f b;
    private final acgs c;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c d;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
    }
    
    private b(final f b, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c d, final acgs c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = new HashMap();
    }
    
    public static b e(f f, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c c, final acgs acgs) {
        f = (f)new b(f, c, acgs);
        try {
            final f b = ((b)f).b;
            if (b != null) {
                b.b((c)f);
            }
            return (b)f;
        }
        catch (final RemoteException ex) {
            return (b)f;
        }
    }
    
    public final void a(final BitmapKey bitmapKey) {
        synchronized (this) {
            final e e = this.a.get(bitmapKey);
            if (e != null) {
                e.c();
            }
            this.a.remove(bitmapKey);
        }
    }
    
    public final void b(final BitmapKey bitmapKey) {
        synchronized (this) {
            if (this.a.containsKey(bitmapKey)) {
                return;
            }
            final e e = new e(bitmapKey, new WeakReference((T)this.b), (Runnable)new a(this, bitmapKey, 3));
            this.a.put(bitmapKey, e);
            this.c(bitmapKey, (tcc)e);
        }
    }
    
    public final void c(final BitmapKey bitmapKey, final tcc tcc) {
        synchronized (this) {
            final Optional a = this.d.a(bitmapKey);
            if (a.isEmpty()) {
                return;
            }
            this.c.k((Uri)a.get(), tcc);
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList(this.a.values());
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((e)list.get(i)).c();
            }
            this.a.clear();
            this.b = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final BitmapKey bitmapKey = (BitmapKey)eob.a(parcel, BitmapKey.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(bitmapKey);
        }
        else {
            final BitmapKey bitmapKey2 = (BitmapKey)eob.a(parcel, BitmapKey.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.b(bitmapKey2);
        }
        parcel2.writeNoException();
        return true;
    }
}
