// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.content.Context;
import java.util.Set;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

public class AccessibilityStateReceiver implements AccessibilityManager$AccessibilityStateChangeListener, AccessibilityManager$TouchExplorationStateChangeListener, tfh
{
    public final Set a;
    public final Set b;
    private final Context c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    public AccessibilityStateReceiver(final Context c) {
        this.c = c;
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void j() {
        if (this.d) {
            tqt.h(this.c, (AccessibilityManager$AccessibilityStateChangeListener)this);
            this.d = false;
        }
    }
    
    public final void k() {
        if (this.e) {
            tqt.a(this.c).removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
            this.e = false;
        }
    }
    
    public final void l() {
        if (!this.d) {
            tqt.g(this.c, (AccessibilityManager$AccessibilityStateChangeListener)this);
            this.d = true;
        }
    }
    
    public final void m() {
        this.n(this.q());
    }
    
    public final void n(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((AccessibilityManager$AccessibilityStateChangeListener)iterator.next()).onAccessibilityStateChanged(b);
        }
    }
    
    public final void o() {
        this.p(this.r());
    }
    
    public final void oS(final aum aum) {
        if (!this.a.isEmpty()) {
            this.l();
            if (this.f != this.q()) {
                this.m();
            }
        }
        if (!this.b.isEmpty()) {
            if (!this.e) {
                tqt.a(this.c).addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
                this.e = true;
            }
            if (this.g != this.q()) {
                this.o();
            }
        }
    }
    
    public final void oW(final aum aum) {
        this.j();
        this.f = this.q();
        this.k();
        this.g = this.r();
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.n(b);
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        this.p(b);
    }
    
    public final void p(final boolean b) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((AccessibilityManager$TouchExplorationStateChangeListener)iterator.next()).onTouchExplorationStateChanged(b);
        }
    }
    
    public final boolean q() {
        return tqt.e(this.c);
    }
    
    public final boolean r() {
        return tqt.f(this.c);
    }
}
