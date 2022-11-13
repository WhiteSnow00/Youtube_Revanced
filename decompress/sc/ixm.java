import android.os.Handler;
import android.content.Context;
import android.provider.Settings$System;
import android.media.AudioManager;
import android.net.Uri;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class ixm extends ContentObserver
{
    public static final Uri a;
    private final int b;
    private final int c;
    private final AudioManager d;
    private final ashh e;
    
    static {
        a = Settings$System.CONTENT_URI;
    }
    
    public ixm(final Context context, final ashh e) {
        super(new Handler());
        this.e = e;
        this.c = 3;
        final AudioManager d = (AudioManager)context.getSystemService("audio");
        d.getClass();
        this.d = d;
        this.b = d.getStreamVolume(3);
    }
    
    public final void onChange(final boolean b) {
        super.onChange(b);
        final int n = this.b - this.d.getStreamVolume(this.c);
        if (n != 0) {
            this.e.c(n);
        }
    }
}
