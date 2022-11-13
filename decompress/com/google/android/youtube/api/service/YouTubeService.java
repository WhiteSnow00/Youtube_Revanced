// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.service;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import android.content.Intent;
import android.os.RemoteException;
import android.os.IBinder;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;

public final class YouTubeService extends aegr
{
    public atke a;
    public c b;
    
    public static void b(final aegz aegz, final int n) {
        try {
            aegz.a(afse.r(n), (IBinder)null);
        }
        catch (final RemoteException ex) {}
    }
    
    public final IBinder onBind(final Intent intent) {
        if ("com.google.android.youtube.api.service.START".equals(intent.getAction())) {
            return (IBinder)this.a.a();
        }
        return null;
    }
    
    public final void onDestroy() {
        final Iterator iterator = new HashSet((Collection)this.b.a).iterator();
        while (iterator.hasNext()) {
            ((lpo)iterator.next()).c();
        }
        super.onDestroy();
    }
}
