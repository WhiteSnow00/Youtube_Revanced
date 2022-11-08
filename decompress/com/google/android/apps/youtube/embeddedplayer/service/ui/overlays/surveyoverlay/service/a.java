// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service;

import java.util.List;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c;

public final class a implements shm
{
    public c a;
    private final e b;
    
    public a(final Handler handler, final c a) {
        this.a = a;
        final e b = new e(handler);
        this.b = b;
        try {
            a.g((f)b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final shk e() {
        return null;
    }
    
    public final void f() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void i() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k(final shl a) {
        this.b.a = a;
    }
    
    public final void m(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void o(final String s, final List list, final boolean b, final aomi aomi) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.j(s, list, b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void p(final int n) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(n);
        }
        catch (final RemoteException ex) {}
    }
}
