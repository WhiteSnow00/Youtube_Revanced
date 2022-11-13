// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.os.RemoteException;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c;

public final class a implements abdb
{
    public c a;
    
    public a(final c a) {
        this.a = a;
    }
    
    public final void c(final List list) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j(list);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void e() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void f() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void g(final float n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(n);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void h(final int n, final int n2) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(n, 0);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i(subtitlesStyle);
        }
        catch (final RemoteException ex) {}
    }
}
