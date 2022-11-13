// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c;

public final class a implements abcg
{
    public c a;
    private final e b;
    
    public a(final c a) {
        this.a = a;
        final e b = new e();
        this.b = b;
        try {
            a.i((f)b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final int getHeight() {
        final c a = this.a;
        if (a == null) {
            return 0;
        }
        try {
            return a.a();
        }
        catch (final RemoteException ex) {
            return 0;
        }
    }
    
    public final int getWidth() {
        final c a = this.a;
        if (a == null) {
            return 0;
        }
        try {
            return a.b();
        }
        catch (final RemoteException ex) {
            return 0;
        }
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m() {
    }
    
    public final void mk() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n() {
    }
    
    public final void o(final long n) {
    }
    
    public final void p(final Bitmap bitmap) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(bitmap);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void q(final abcf a) {
        this.b.a = a;
    }
    
    public final void r(final boolean b) {
    }
    
    public final void t(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final int n2) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j(charSequence, charSequence2, b, charSequence3, n, charSequence4, n2);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(charSequence, charSequence2, charSequence3);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void w(final boolean b) {
    }
    
    public final boolean x() {
        return false;
    }
}
