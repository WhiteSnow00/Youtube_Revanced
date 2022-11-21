// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service;

import android.view.View$OnClickListener;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c;

public final class a implements abfp
{
    public c a;
    
    public a(final c a) {
        this.a = a;
    }
    
    public final void b(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void c(final long n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void d(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void e(final View$OnClickListener view$OnClickListener) {
    }
    
    public final void f(final CharSequence charSequence) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i(charSequence);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void g() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void h() {
    }
    
    public final void te(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a(false);
        }
        catch (final RemoteException ex) {}
    }
}
