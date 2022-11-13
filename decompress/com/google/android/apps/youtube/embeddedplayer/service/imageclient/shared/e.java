// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Set;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.os.Handler;
import java.util.HashMap;

public final class e extends eoa implements f
{
    public final HashMap a;
    public c b;
    private final Handler c;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
    }
    
    public e(final Handler c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
        this.c = c;
        this.a = new HashMap();
    }
    
    public final void a(final BitmapKey bitmapKey, final Bitmap bitmap) {
        this.c.post((Runnable)new jvg(this, bitmapKey, bitmap, 9));
    }
    
    public final void b(final c c) {
        this.c.post((Runnable)new a(this, c, 2));
    }
    
    public final void c(final BitmapKey bitmapKey, final Bitmap bitmap) {
        final Set set = this.a.get(bitmapKey);
        if (set == null) {
            return;
        }
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((tcc)iterator.next()).b((Object)bitmapKey, (Object)bitmap);
        }
        set.clear();
        this.a.remove(bitmapKey);
    }
    
    public final void d() {
        this.b = null;
        this.c.post((Runnable)new lke(this, 12));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final BitmapKey bitmapKey = (BitmapKey)eob.a(parcel, BitmapKey.CREATOR);
            final Bitmap bitmap = (Bitmap)eob.a(parcel, Bitmap.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(bitmapKey, bitmap);
        }
        else {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
                if (queryLocalInterface instanceof c) {
                    o = queryLocalInterface;
                }
                else {
                    o = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.a(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.b((c)o);
        }
        parcel2.writeNoException();
        return true;
    }
}
