import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.mediarouter.app.MediaRouteButton;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbd extends AsyncTask
{
    final MediaRouteButton a;
    private final int b;
    private final Context c;
    
    public cbd(final MediaRouteButton a, final int b, final Context c) {
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
    
    protected final /* bridge */ Object doInBackground(final Object[] array) {
        final Void[] array2 = (Void[])array;
        if (MediaRouteButton.a.get(this.b) == null) {
            return fc.b(this.c, this.b);
        }
        return null;
    }
    
    protected final void onCancelled(final Object o) {
        this.a((Drawable)o);
    }
    
    protected final /* bridge */ void onPostExecute(final Object o) {
        Drawable drawable = (Drawable)o;
        if (drawable != null) {
            this.a(drawable);
        }
        else {
            final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)MediaRouteButton.a.get(this.b);
            if (drawable$ConstantState != null) {
                drawable = drawable$ConstantState.newDrawable();
            }
            this.a.c = null;
        }
        this.a.f(drawable);
    }
}
