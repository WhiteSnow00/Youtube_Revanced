// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import java.util.concurrent.Executor;
import android.app.Activity;

public interface WindowAreaController
{
    public static final WindowAreaController$Companion Companion = WindowAreaController$Companion.$$INSTANCE;
    
    void rearDisplayMode(final Activity p0, final Executor p1, final WindowAreaSessionCallback p2);
    
    attm rearDisplayStatus();
}
