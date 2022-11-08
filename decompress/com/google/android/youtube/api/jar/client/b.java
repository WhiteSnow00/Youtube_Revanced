// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

class b implements com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
{
    final /* synthetic */ RemoteEmbeddedPlayer a;
    
    public b(final RemoteEmbeddedPlayer a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.e = false;
    }
    
    public final void b() {
        final RemoteEmbeddedPlayer a = this.a;
        a.e = true;
        if (a.d) {
            a.g();
        }
    }
}
