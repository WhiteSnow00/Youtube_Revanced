// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;

final class ApiPlayerService$ApiPlayerEmbedConfigProvider implements aegw
{
    public g a;
    
    public ApiPlayerService$ApiPlayerEmbedConfigProvider(final g a) {
        this.a = a;
    }
    
    public final String a(String a) {
        final g a2 = this.a;
        if (a2 == null) {
            return "";
        }
        try {
            a = a2.a(a);
            return a;
        }
        catch (final RemoteException ex) {
            return "";
        }
    }
}
