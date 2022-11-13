import android.util.Log;
import android.graphics.Bitmap;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdx extends AsyncTask
{
    final cdz a;
    final cdy b;
    
    public cdx(final cdy b, final cdz a) {
        this.b = b;
        this.a = a;
    }
    
    protected final /* bridge */ Object doInBackground(final Object[] array) {
        final Bitmap[] array2 = (Bitmap[])array;
        ceb b;
        try {
            b = this.b.b();
        }
        catch (final Exception ex) {
            Log.e("Palette", "Exception thrown during async generate", (Throwable)ex);
            b = null;
        }
        return b;
    }
    
    protected final /* bridge */ void onPostExecute(final Object o) {
        this.a.a((ceb)o);
    }
}
