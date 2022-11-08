import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlg implements ddq
{
    private static final cya d;
    private final Context a;
    private final List b;
    private final dmk c;
    private final cya e;
    
    static {
        d = new cya((byte[])null);
    }
    
    public dlg(final Context context, final List b, final dgf dgf, final dgd dgd) {
        final cya d = dlg.d;
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = new dmk(dgf, dgd);
        this.e = d;
    }
}
