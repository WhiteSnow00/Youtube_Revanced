import android.os.Handler;
import android.app.Application;
import android.media.AudioManager;
import android.content.ContentResolver;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class oyj extends ContentObserver
{
    public final ContentResolver a;
    public boolean b;
    public double c;
    private final AudioManager d;
    
    public oyj(final Application application, final Handler handler) {
        super(handler);
        this.d = (AudioManager)application.getSystemService("audio");
        this.a = application.getContentResolver();
    }
    
    public final double a() {
        final int streamMaxVolume = this.d.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            return 0.0;
        }
        final double n = this.d.getStreamVolume(3);
        final double n2 = streamMaxVolume;
        Double.isNaN(n);
        Double.isNaN(n2);
        return Math.min(n / n2, 1.0);
    }
    
    public final void onChange(final boolean b) {
        this.c = this.a();
    }
}
