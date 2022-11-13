// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import java.util.Map;
import java.util.List;

public final class EmbedFragmentService$$ExternalSyntheticLambda10 implements vcy
{
    public EmbedFragmentService a;
    
    public EmbedFragmentService$$ExternalSyntheticLambda10(final EmbedFragmentService a) {
        this.a = a;
    }
    
    public final void a(final aiqj aiqj) {
        vcx.a((vcy)this, aiqj);
    }
    
    public final void b(final List list) {
        vcx.b((vcy)this, list);
    }
    
    public final void c(final aiqj aiqj, final Map map) {
        final j d = this.a.d;
        if (d == null) {
            return;
        }
        try {
            d.g(new CommandWrapper(aiqj));
        }
        catch (final RemoteException ex) {}
    }
    
    public final void d(final List list, final Map map) {
        vcx.c((vcy)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        vcx.d((vcy)this, list, o);
    }
}
