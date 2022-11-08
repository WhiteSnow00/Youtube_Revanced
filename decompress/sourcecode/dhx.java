import android.text.TextUtils;
import java.net.URL;
import java.io.File;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhx implements dii
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public dhx(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhx(final Context context, final int a, final byte[] array) {
        this.a = a;
        this.b = context.getApplicationContext();
    }
    
    public dhx(final Context context, final int a, final char[] array) {
        this.a = a;
        this.b = context.getApplicationContext();
    }
    
    public dhx(final dhm b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhx(final dhv b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dhx(final dii b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    private static Uri c(final String s) {
        return Uri.fromFile(new File(s));
    }
}
