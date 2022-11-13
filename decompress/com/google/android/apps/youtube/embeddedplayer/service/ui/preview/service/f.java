// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c;

public final class f implements abdl
{
    public c a;
    
    public f(final c a) {
        this.a = a;
    }
    
    public final void mk() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void mm() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void p(final Bitmap bitmap) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(bitmap);
        }
        catch (final RemoteException ex) {}
    }
}
