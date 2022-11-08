import java.util.function.Consumer;
import android.os.Handler;
import android.os.Looper;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Optional;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqd implements szx
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public gqd(final Resources a, final ImageView b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gqd(final fbf a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gqd(final hhy b, final FrameLayout a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gqd(final hpt a, final Optional b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
}
