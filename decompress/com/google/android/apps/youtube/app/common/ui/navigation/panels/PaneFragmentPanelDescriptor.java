// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

public abstract class PaneFragmentPanelDescriptor implements PanelDescriptor
{
    public static PaneFragmentPanelDescriptor b(final PaneDescriptor paneDescriptor) {
        return (PaneFragmentPanelDescriptor)new AutoValue_PaneFragmentPanelDescriptor(paneDescriptor);
    }
    
    public abstract PaneDescriptor a();
    
    public final Optional c() {
        final Optional h = this.a().h();
        if (h.isPresent()) {
            return Optional.of((Object)h.get());
        }
        return Optional.empty();
    }
}
