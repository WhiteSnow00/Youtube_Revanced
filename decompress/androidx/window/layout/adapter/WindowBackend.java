// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter;

import java.util.concurrent.Executor;
import android.content.Context;

public interface WindowBackend
{
    void registerLayoutChangeCallback(final Context p0, final Executor p1, final ako p2);
    
    void unregisterLayoutChangeCallback(final ako p0);
}
