import android.graphics.Bitmap;
import android.os.RemoteException;
import android.net.Uri;
import android.content.Context;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlx extends AsyncTask
{
    private final mlz a;
    private final mlw b;
    
    static {
        new mnb("FetchBitmapTask");
    }
    
    public mlx(final Context context, final int n, final int n2, final mlw b) {
        this.b = b;
        this.a = mkb.e(context.getApplicationContext(), this, new mhb(this, 8), n, n2);
    }
}
