// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import android.content.Context;
import android.app.Activity;

public interface WindowInfoTracker
{
    public static final WindowInfoTracker$Companion Companion = WindowInfoTracker$Companion.$$INSTANCE;
    
    atui windowLayoutInfo(final Activity p0);
    
    atui windowLayoutInfo(final Context p0);
}
