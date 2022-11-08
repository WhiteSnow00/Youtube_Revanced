// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.fragments.panels;

import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import java.util.ArrayList;
import android.os.Parcelable;

public abstract class PanelsBackStack implements Parcelable
{
    public static PanelsBackStack e(final ArrayList list) {
        return (PanelsBackStack)new AutoValue_PanelsBackStack(list);
    }
    
    protected abstract ArrayList a();
    
    public final int b() {
        return this.a().size();
    }
    
    public final PanelsBackStack$PanelsBackStackEntry c() {
        if (this.b() == 0) {
            return null;
        }
        return this.a().get(0);
    }
    
    public final PanelsBackStack$PanelsBackStackEntry d() {
        if (this.b() == 0) {
            return null;
        }
        return this.a().remove(this.b() - 1);
    }
    
    public final void f(final PanelDescriptor panelDescriptor, final Fragment$SavedState fragment$SavedState, final Object o, final String s) {
        this.a().add(new PanelsBackStack$PanelsBackStackEntry(panelDescriptor, fragment$SavedState, o, s));
    }
    
    public final boolean g() {
        return this.a().isEmpty();
    }
    
    public final void h() {
        this.c();
        this.a().clear();
    }
}
