// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

abstract class $AutoValue_PaneFragmentPanelDescriptor extends PaneFragmentPanelDescriptor
{
    public final PaneDescriptor a;
    
    public $AutoValue_PaneFragmentPanelDescriptor(final PaneDescriptor a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null paneDescriptor");
    }
    
    public final PaneDescriptor a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof PaneFragmentPanelDescriptor && this.a.equals(((PaneFragmentPanelDescriptor)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("PaneFragmentPanelDescriptor{paneDescriptor=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
