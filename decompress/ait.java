import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.net.Uri;
import java.io.InputStream;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileNotFoundException;
import android.util.Log;
import java.io.FileInputStream;
import java.io.File;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.drawable.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ait
{
    static Drawable a(final Icon icon, final Context context) {
        return icon.loadDrawable(context);
    }
    
    public static Icon b(final IconCompat iconCompat, final Context context) {
        final int b = iconCompat.b;
        final String s = null;
        final InputStream inputStream = null;
        Icon icon = null;
        switch (b) {
            default: {
                throw new IllegalArgumentException("Unknown type");
            }
            case 6: {
                if (Build$VERSION.SDK_INT >= 30) {
                    icon = aiw.a(iconCompat.c());
                    break;
                }
                if (context == null) {
                    final StringBuilder sb = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    final Uri c = iconCompat.c();
                    sb.append(c);
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(c)));
                }
                final Uri c2 = iconCompat.c();
                final String scheme = c2.getScheme();
                InputStream openInputStream = null;
                Label_0241: {
                    if (!"content".equals(scheme)) {
                        if (!"file".equals(scheme)) {
                            try {
                                openInputStream = new FileInputStream(new File((String)iconCompat.c));
                            }
                            catch (final FileNotFoundException ex) {
                                new StringBuilder("Unable to load image from path: ").append(c2);
                                Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(c2)), (Throwable)ex);
                                openInputStream = inputStream;
                            }
                            break Label_0241;
                        }
                    }
                    try {
                        openInputStream = context.getContentResolver().openInputStream(c2);
                    }
                    catch (final Exception ex2) {
                        new StringBuilder("Unable to load image from URI: ").append(c2);
                        Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(c2)), (Throwable)ex2);
                        openInputStream = inputStream;
                    }
                }
                if (openInputStream != null) {
                    icon = aiu.b(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                final StringBuilder sb2 = new StringBuilder("Cannot load adaptive icon from uri: ");
                final Uri c3 = iconCompat.c();
                sb2.append(c3);
                throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(c3)));
            }
            case 5: {
                icon = aiu.b((Bitmap)iconCompat.c);
                break;
            }
            case 4: {
                icon = Icon.createWithContentUri((String)iconCompat.c);
                break;
            }
            case 3: {
                icon = Icon.createWithData((byte[])iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            }
            case 2: {
                String s2;
                if (b == -1) {
                    final Object c4 = iconCompat.c;
                    if (Build$VERSION.SDK_INT >= 28) {
                        s2 = aiv.d(c4);
                    }
                    else {
                        try {
                            s2 = (String)c4.getClass().getMethod("getResPackage", (Class<?>[])new Class[0]).invoke(c4, new Object[0]);
                        }
                        catch (final NoSuchMethodException ex3) {
                            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
                            s2 = s;
                        }
                        catch (final InvocationTargetException ex4) {
                            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex4);
                            s2 = s;
                        }
                        catch (final IllegalAccessException ex5) {
                            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex5);
                            s2 = s;
                        }
                    }
                }
                else {
                    if (b != 2) {
                        new StringBuilder("called getResPackage() on ").append(iconCompat);
                        throw new IllegalStateException("called getResPackage() on ".concat(iconCompat.toString()));
                    }
                    final String k = iconCompat.k;
                    if (k != null && !TextUtils.isEmpty((CharSequence)k)) {
                        s2 = iconCompat.k;
                    }
                    else {
                        s2 = ((String)iconCompat.c).split(":", -1)[0];
                    }
                }
                icon = Icon.createWithResource(s2, iconCompat.f);
                break;
            }
            case 1: {
                icon = Icon.createWithBitmap((Bitmap)iconCompat.c);
                break;
            }
            case -1: {
                return (Icon)iconCompat.c;
            }
        }
        final ColorStateList h = iconCompat.h;
        if (h != null) {
            icon.setTintList(h);
        }
        final PorterDuff$Mode i = iconCompat.i;
        if (i != IconCompat.a) {
            icon.setTintMode(i);
        }
        return icon;
    }
    
    public static Uri c(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return aiv.c(o);
        }
        try {
            return (Uri)o.getClass().getMethod("getUri", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
        }
        catch (final NoSuchMethodException ex) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
            return null;
        }
        catch (final InvocationTargetException ex2) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
            return null;
        }
        catch (final IllegalAccessException ex3) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
            return null;
        }
    }
}
