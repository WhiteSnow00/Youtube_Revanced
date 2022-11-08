// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

public final class WindowAreaStatus
{
    public static final WindowAreaStatus AVAILABLE;
    public static final WindowAreaStatus$Companion Companion;
    public static final WindowAreaStatus UNAVAILABLE;
    public static final WindowAreaStatus UNSUPPORTED;
    private final String mDescription;
    
    static {
        Companion = new WindowAreaStatus$Companion(null);
        UNSUPPORTED = new WindowAreaStatus("UNSUPPORTED");
        UNAVAILABLE = new WindowAreaStatus("UNAVAILABLE");
        AVAILABLE = new WindowAreaStatus("AVAILABLE");
    }
    
    private WindowAreaStatus(final String mDescription) {
        this.mDescription = mDescription;
    }
    
    public static final WindowAreaStatus translate$window_release(final int n) {
        return WindowAreaStatus.Companion.translate$window_release(n);
    }
    
    @Override
    public String toString() {
        return this.mDescription;
    }
}
