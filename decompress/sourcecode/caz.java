import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.mediarouter.app.MediaRouteButton;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caz extends AsyncTask
{
    final /* synthetic */ MediaRouteButton a;
    private final int b;
    private final Context c;
    
    public caz(final MediaRouteButton a, final int b, final Context c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void a(final Drawable drawable) {
        if (drawable != null) {
            MediaRouteButton.a.put(this.b, (Object)drawable.getConstantState());
        }
        this.a.c = null;
    }
}
