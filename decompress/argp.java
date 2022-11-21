import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface argp extends IInterface
{
    boolean enableAsyncReprojection(final int p0);
    
    boolean enableCardboardTriggerEmulation(final argv p0);
    
    long getNativeGvrContext();
    
    argv getRootView();
    
    args getUiLayout();
    
    void onBackPressed();
    
    void onPause();
    
    void onResume();
    
    boolean setOnDonNotNeededListener(final argv p0);
    
    void setPresentationView(final argv p0);
    
    void setReentryIntent(final argv p0);
    
    void setStereoModeEnabled(final boolean p0);
    
    void shutdown();
}
