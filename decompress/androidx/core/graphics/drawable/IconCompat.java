// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.graphics.drawable;

import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    public static final PorterDuff$Mode a;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff$Mode i;
    public String j;
    public String k;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
    }
    
    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = IconCompat.a;
        this.j = null;
    }
    
    public IconCompat(final int b) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = IconCompat.a;
        this.j = null;
        this.b = b;
    }
    
    public static IconCompat d(final Bitmap c) {
        final IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = c;
        return iconCompat;
    }
    
    public static IconCompat e(final int f) {
        if (f != 0) {
            final IconCompat iconCompat = new IconCompat(2);
            iconCompat.f = f;
            iconCompat.c = "";
            iconCompat.k = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
    
    public final int a() {
        final int b = this.b;
        if (b == -1) {
            final Object c = this.c;
            int n;
            if (Build$VERSION.SDK_INT >= 28) {
                n = ait.a(c);
            }
            else {
                try {
                    n = (int)c.getClass().getMethod("getResId", (Class<?>[])new Class[0]).invoke(c, new Object[0]);
                    return n;
                }
                catch (final NoSuchMethodException ex) {
                    Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex);
                }
                catch (final InvocationTargetException ex2) {
                    Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex2);
                }
                catch (final IllegalAccessException ex3) {
                    Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex3);
                }
                n = 0;
            }
            return n;
        }
        if (b == 2) {
            return this.f;
        }
        new StringBuilder("called getResId() on ").append(this);
        throw new IllegalStateException("called getResId() on ".concat(this.toString()));
    }
    
    public final int b() {
        final int b = this.b;
        int n = -1;
        if (b == -1) {
            final Object c = this.c;
            if (Build$VERSION.SDK_INT >= 28) {
                n = ait.b(c);
            }
            else {
                try {
                    n = (int)c.getClass().getMethod("getType", (Class<?>[])new Class[0]).invoke(c, new Object[0]);
                }
                catch (final NoSuchMethodException ex) {
                    new StringBuilder("Unable to get icon type ").append(c);
                    Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(c)), (Throwable)ex);
                }
                catch (final InvocationTargetException ex2) {
                    new StringBuilder("Unable to get icon type ").append(c);
                    Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(c)), (Throwable)ex2);
                }
                catch (final IllegalAccessException ex3) {
                    new StringBuilder("Unable to get icon type ").append(c);
                    Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(c)), (Throwable)ex3);
                }
            }
            return n;
        }
        return b;
    }
    
    public final Uri c() {
        final int b = this.b;
        if (b == -1) {
            return air.c(this.c);
        }
        if (b != 4 && b != 6) {
            new StringBuilder("called getUri() on ").append(this);
            throw new IllegalStateException("called getUri() on ".concat(this.toString()));
        }
        return Uri.parse((String)this.c);
    }
    
    public final String toString() {
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        String s = null;
        switch (this.b) {
            default: {
                s = "UNKNOWN";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 1: {
                s = "BITMAP";
                break;
            }
        }
        sb.append(s);
        switch (this.b) {
            case 4:
            case 6: {
                sb.append(" uri=");
                sb.append(this.c);
                break;
            }
            case 3: {
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            }
            case 2: {
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", this.a()));
                break;
            }
            case 1:
            case 5: {
                sb.append(" size=");
                sb.append(((Bitmap)this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap)this.c).getHeight());
                break;
            }
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != IconCompat.a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }
}
