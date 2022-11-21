import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface args extends IInterface
{
    argv getRootView();
    
    boolean isEnabled();
    
    void setCloseButtonListener(final argv p0);
    
    void setEnabled(final boolean p0);
    
    void setSettingsButtonEnabled(final boolean p0);
    
    void setSettingsButtonListener(final argv p0);
    
    void setTransitionViewEnabled(final boolean p0);
    
    void setTransitionViewListener(final argv p0);
    
    void setViewerName(final String p0);
}
