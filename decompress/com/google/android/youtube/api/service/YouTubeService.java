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

public final class YouTubeService extends aeeq
{
    public atjj a;
    public c b;
    
    public static void b(final aeey aeey, final int n) {
        try {
            aeey.a(aeda.j(n), (IBinder)null);
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
            ((lol)iterator.next()).c();
        }
        super.onDestroy();
    }
}
