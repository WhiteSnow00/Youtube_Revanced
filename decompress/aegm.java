import android.content.res.Resources$Theme;
import android.content.Context;
import android.view.ContextThemeWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegm extends ContextThemeWrapper
{
    public aegm(final Context context, final int n) {
        super(context, n);
    }
    
    protected final void onApplyThemeResource(final Resources$Theme resources$Theme, final int n, final boolean b) {
        resources$Theme.applyStyle(n, false);
    }
}
