import android.view.View;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.AutoValue_DeviceLocalFile;
import android.provider.MediaStore$Images$Media;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class hhh extends AsyncTask
{
    private final WeakReference a;
    
    public hhh(final hhi hhi) {
        this.a = new WeakReference((T)hhi);
    }
}
