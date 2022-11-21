// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.graphics.drawable;

import java.nio.charset.Charset;
import android.graphics.PorterDuff$Mode;
import android.os.Parcelable;
import android.content.res.ColorStateList;

public class IconCompatParcelizer
{
    public static IconCompat read(final ckq ckq) {
        final IconCompat iconCompat = new IconCompat();
        iconCompat.b = ckq.a(iconCompat.b, 1);
        byte[] d = iconCompat.d;
        if (ckq.s(2)) {
            final int int1 = ckq.d.readInt();
            if (int1 < 0) {
                d = null;
            }
            else {
                d = new byte[int1];
                ckq.d.readByteArray(d);
            }
        }
        iconCompat.d = d;
        iconCompat.e = ckq.b(iconCompat.e, 3);
        iconCompat.f = ckq.a(iconCompat.f, 4);
        iconCompat.g = ckq.a(iconCompat.g, 5);
        iconCompat.h = (ColorStateList)ckq.b((Parcelable)iconCompat.h, 6);
        iconCompat.j = ckq.e(iconCompat.j, 7);
        iconCompat.k = ckq.e(iconCompat.k, 8);
        iconCompat.i = PorterDuff$Mode.valueOf(iconCompat.j);
        Parcelable c = null;
        switch (iconCompat.b) {
            default: {
                return iconCompat;
            }
            case 3: {
                iconCompat.c = iconCompat.d;
                return iconCompat;
            }
            case 2:
            case 4:
            case 6: {
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String)iconCompat.c).split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            }
            case 1:
            case 5: {
                c = iconCompat.e;
                if (c != null) {
                    break;
                }
                final byte[] d2 = iconCompat.d;
                iconCompat.c = d2;
                iconCompat.b = 3;
                iconCompat.f = 0;
                iconCompat.g = d2.length;
                return iconCompat;
            }
            case -1: {
                c = iconCompat.e;
                if (c != null) {
                    break;
                }
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        iconCompat.c = c;
        return iconCompat;
    }
    
    public static void write(final IconCompat iconCompat, final ckq ckq) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case 4:
            case 6: {
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 3: {
                iconCompat.d = (byte[])iconCompat.c;
                break;
            }
            case 2: {
                iconCompat.d = ((String)iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 1:
            case 5: {
                iconCompat.e = (Parcelable)iconCompat.c;
                break;
            }
            case -1: {
                iconCompat.e = (Parcelable)iconCompat.c;
                break;
            }
        }
        final int b = iconCompat.b;
        if (b != -1) {
            ckq.h(b, 1);
        }
        final byte[] d = iconCompat.d;
        if (d != null) {
            ckq.p(2);
            ckq.d.writeInt(d.length);
            ckq.d.writeByteArray(d);
        }
        final Parcelable e = iconCompat.e;
        if (e != null) {
            ckq.i(e, 3);
        }
        final int f = iconCompat.f;
        if (f != 0) {
            ckq.h(f, 4);
        }
        final int g = iconCompat.g;
        if (g != 0) {
            ckq.h(g, 5);
        }
        final ColorStateList h = iconCompat.h;
        if (h != null) {
            ckq.i((Parcelable)h, 6);
        }
        final String j = iconCompat.j;
        if (j != null) {
            ckq.j(j, 7);
        }
        final String k = iconCompat.k;
        if (k != null) {
            ckq.j(k, 8);
        }
    }
}
