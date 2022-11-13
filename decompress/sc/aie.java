import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aie
{
    static {
        new ThreadLocal();
    }
    
    public static boolean a(final Paint paint, final String s) {
        return aic.a(paint, s);
    }
    
    public static void b(final Paint paint, final ahx ahx) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object xfermode = null;
        final Object o = null;
        if (sdk_INT >= 29) {
            Object a = o;
            if (ahx != null) {
                a = ahy.a(ahx);
            }
            aid.a(paint, a);
            return;
        }
        if (ahx != null) {
            PorterDuff$Mode porterDuff$Mode = null;
            switch (ahx.ordinal()) {
                default: {
                    porterDuff$Mode = null;
                    break;
                }
                case 17: {
                    porterDuff$Mode = PorterDuff$Mode.LIGHTEN;
                    break;
                }
                case 16: {
                    porterDuff$Mode = PorterDuff$Mode.DARKEN;
                    break;
                }
                case 15: {
                    porterDuff$Mode = PorterDuff$Mode.OVERLAY;
                    break;
                }
                case 14: {
                    porterDuff$Mode = PorterDuff$Mode.SCREEN;
                    break;
                }
                case 13: {
                    porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                    break;
                }
                case 12: {
                    porterDuff$Mode = PorterDuff$Mode.ADD;
                    break;
                }
                case 11: {
                    porterDuff$Mode = PorterDuff$Mode.XOR;
                    break;
                }
                case 10: {
                    porterDuff$Mode = PorterDuff$Mode.DST_ATOP;
                    break;
                }
                case 9: {
                    porterDuff$Mode = PorterDuff$Mode.SRC_ATOP;
                    break;
                }
                case 8: {
                    porterDuff$Mode = PorterDuff$Mode.DST_OUT;
                    break;
                }
                case 7: {
                    porterDuff$Mode = PorterDuff$Mode.SRC_OUT;
                    break;
                }
                case 6: {
                    porterDuff$Mode = PorterDuff$Mode.DST_IN;
                    break;
                }
                case 5: {
                    porterDuff$Mode = PorterDuff$Mode.SRC_IN;
                    break;
                }
                case 4: {
                    porterDuff$Mode = PorterDuff$Mode.DST_OVER;
                    break;
                }
                case 3: {
                    porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
                    break;
                }
                case 2: {
                    porterDuff$Mode = PorterDuff$Mode.DST;
                    break;
                }
                case 1: {
                    porterDuff$Mode = PorterDuff$Mode.SRC;
                    break;
                }
                case 0: {
                    porterDuff$Mode = PorterDuff$Mode.CLEAR;
                    break;
                }
            }
            if (porterDuff$Mode != null) {
                xfermode = new PorterDuffXfermode(porterDuff$Mode);
            }
            paint.setXfermode((Xfermode)xfermode);
            return;
        }
        paint.setXfermode((Xfermode)null);
    }
}
