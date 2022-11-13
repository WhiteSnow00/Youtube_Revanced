import android.graphics.Bitmap;
import java.util.HashMap;
import android.view.View;
import android.text.TextUtils;
import android.graphics.drawable.Drawable$Callback;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwg
{
    private static final Object d;
    public final Context a;
    public final String b;
    public final Map c;
    
    static {
        d = new Object();
    }
    
    public cwg(final Drawable$Callback drawable$Callback, final String b, final Map c) {
        if (!TextUtils.isEmpty((CharSequence)b) && b.charAt(b.length() - 1) != '/') {
            this.b = String.valueOf(b).concat("/");
        }
        else {
            this.b = b;
        }
        if (!(drawable$Callback instanceof View)) {
            czk.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View)drawable$Callback).getContext();
        this.c = c;
    }
    
    public final void a(final String s, final Bitmap e) {
        synchronized (cwg.d) {
            this.c.get(s).e = e;
        }
    }
}
