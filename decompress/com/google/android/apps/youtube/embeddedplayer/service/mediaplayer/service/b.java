// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.graphics.Canvas;
import android.os.RemoteException;
import android.graphics.Rect;
import java.util.Iterator;
import android.view.SurfaceHolder$Callback;
import java.util.ArrayList;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import java.util.List;
import android.view.SurfaceHolder;

public final class b implements SurfaceHolder
{
    public final List a;
    public f b;
    public i c;
    public Surface d;
    
    public b(final f b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public final void a() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((SurfaceHolder$Callback)iterator.next()).surfaceDestroyed((SurfaceHolder)this);
        }
    }
    
    public final void addCallback(final SurfaceHolder$Callback surfaceHolder$Callback) {
        if (!this.a.contains(surfaceHolder$Callback)) {
            this.a.add(surfaceHolder$Callback);
        }
    }
    
    public final Surface getSurface() {
        return this.d;
    }
    
    public final Rect getSurfaceFrame() {
        final f b = this.b;
        Label_0018: {
            if (b == null) {
                break Label_0018;
            }
            try {
                return b.a();
                return new Rect();
            }
            catch (final RemoteException ex) {
                return new Rect();
            }
        }
    }
    
    public final boolean isCreating() {
        final f b = this.b;
        if (b == null) {
            return false;
        }
        try {
            return b.l();
        }
        catch (final RemoteException ex) {
            return false;
        }
    }
    
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }
    
    public final Canvas lockCanvas(final Rect rect) {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }
    
    public final void removeCallback(final SurfaceHolder$Callback surfaceHolder$Callback) {
        this.a.remove(surfaceHolder$Callback);
    }
    
    public final void setFixedSize(final int n, final int n2) {
        final f b = this.b;
        if (b == null) {
            return;
        }
        try {
            b.b(n, n2);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void setFormat(final int n) {
        final f b = this.b;
        if (b == null) {
            return;
        }
        try {
            b.g(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void setKeepScreenOn(final boolean b) {
        tut.l("setKeepScreenOn should be through player Surface, not SurfaceHolder");
        final f b2 = this.b;
        if (b2 == null) {
            return;
        }
        try {
            b2.h(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void setSizeFromLayout() {
        final f b = this.b;
        if (b == null) {
            return;
        }
        try {
            b.i();
        }
        catch (final RemoteException ex) {}
    }
    
    @Deprecated
    public final void setType(final int n) {
        final f b = this.b;
        if (b == null) {
            return;
        }
        try {
            b.k(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void unlockCanvasAndPost(final Canvas canvas) {
        throw new UnsupportedOperationException("Unsupported call to unlockCanvasAndPost");
    }
}
