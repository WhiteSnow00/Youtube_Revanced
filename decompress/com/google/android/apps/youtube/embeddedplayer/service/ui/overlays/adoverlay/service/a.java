// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g;

public final class a implements g
{
    public c a;
    private final e b;
    
    public a(final Handler handler, final c a) {
        this.a = a;
        final e b = new e(handler);
        this.b = b;
        try {
            a.g(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void A(final CharSequence charSequence) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.p(charSequence);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void n(final int n, final int n2, final int n3) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a(n, n2, n3);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void o(final int n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b(n);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void p(final CharSequence charSequence) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(charSequence);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void q(final Bitmap bitmap) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i(bitmap);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void s(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void u(final smo a) {
        this.b.a = a;
    }
    
    @Override
    public final void v(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void w(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.l(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void x(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.m(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void y(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.n(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void z(final ajtu ajtu) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.o(new FancyDismissibleDialogRendererWrapper(ajtu));
        }
        catch (final RemoteException ex) {}
    }
}
