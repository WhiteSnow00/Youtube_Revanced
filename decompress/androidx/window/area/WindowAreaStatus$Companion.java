// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

public final class WindowAreaStatus$Companion
{
    private WindowAreaStatus$Companion() {
    }
    
    public final WindowAreaStatus translate$window_release(final int n) {
        WindowAreaStatus windowAreaStatus;
        if (n != 1) {
            if (n != 2) {
                windowAreaStatus = WindowAreaStatus.UNSUPPORTED;
            }
            else {
                windowAreaStatus = WindowAreaStatus.AVAILABLE;
            }
        }
        else {
            windowAreaStatus = WindowAreaStatus.UNAVAILABLE;
        }
        return windowAreaStatus;
    }
}
