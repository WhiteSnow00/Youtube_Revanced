import java.security.GeneralSecurityException;
import android.util.Log;
import java.security.MessageDigest;
import android.view.Display$Mode;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Iterator;
import com.google.vr.sdk.proto.Display$DisplayParams$Builder;
import android.util.Size;
import android.os.Build;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfj
{
    private static final String a = "arfj";
    private static ArrayList b;
    private static final List c;
    
    static {
        final arfi arfi = new arfi("Micromax", null, "4560MMX", null, 217.0f, 217.0f);
        final arfi arfi2 = new arfi("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f);
        final arfi arfi3 = new arfi("samsung", null, "SM-G920P", null, 575.0f, 575.0f);
        final arfi arfi4 = new arfi("samsung", null, "SM-G930", null, 581.0f, 580.0f);
        final arfi arfi5 = new arfi("samsung", null, "SM-G9300", null, 581.0f, 580.0f);
        final arfi arfi6 = new arfi("samsung", null, "SM-G930A", null, 581.0f, 580.0f);
        final arfi arfi7 = new arfi("samsung", null, "SM-G930F", null, 581.0f, 580.0f);
        final arfi arfi8 = new arfi("samsung", null, "SM-G930P", null, 581.0f, 580.0f);
        final arfi arfi9 = new arfi("samsung", null, "SM-G930R4", null, 581.0f, 580.0f);
        final arfi arfi10 = new arfi("samsung", null, "SM-G930T", null, 581.0f, 580.0f);
        final arfi arfi11 = new arfi("samsung", null, "SM-G930V", null, 581.0f, 580.0f);
        final arfi arfi12 = new arfi("samsung", null, "SM-G930W8", null, 581.0f, 580.0f);
        final arfi arfi13 = new arfi("samsung", null, "SM-N915FY", null, 541.0f, 541.0f);
        final arfi arfi14 = new arfi("samsung", null, "SM-N915A", null, 541.0f, 541.0f);
        final arfi arfi15 = new arfi("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final arfi arfi16 = new arfi("samsung", null, "SM-N915K", null, 541.0f, 541.0f);
        final arfi arfi17 = new arfi("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final arfi arfi18 = new arfi("samsung", null, "SM-N915G", null, 541.0f, 541.0f);
        final arfi arfi19 = new arfi("samsung", null, "SM-N915D", null, 541.0f, 541.0f);
        final arfi arfi20 = new arfi("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f);
        final arfi arfi21 = new arfi("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f);
        final arfi arfi22 = new arfi("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f);
        final Float value = 441.74f;
        final Float value2 = 0.004f;
        final arfi arfi23 = new arfi("Google", "sailfish", "Pixel", "sailfish", value, value, value2);
        final Float value3 = 537.57f;
        final arfi arfi24 = new arfi("Google", "marlin", "Pixel XL", "marlin", value3, value3, value2);
        final arfi arfi25 = new arfi("Google", "walleye", null, "walleye", value, value, value2);
        final arfi arfi26 = new arfi("Google", "taimen", null, "taimen", null, null, 0.0046f);
        final Float value4 = 522.63f;
        final Float value5 = 0.0038f;
        c = Arrays.asList(arfi, arfi2, arfi3, arfi4, arfi5, arfi6, arfi7, arfi8, arfi9, arfi10, arfi11, arfi12, arfi13, arfi14, arfi15, arfi16, arfi17, arfi18, arfi19, arfi20, arfi21, arfi22, arfi23, arfi24, arfi25, arfi26, new arfi("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, value4, value4, value5), new arfi("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, value5), new arfi("LGE", "joan", null, "joan", null, null, value5), new arfi("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, value5), new arfi("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }
    
    private arfj() {
    }
    
    public static Display$DisplayParams a(final Context context) {
        final Display$DisplayParams$Builder builder = Display$DisplayParams.newBuilder();
        final List c = arfj.c;
        final String manufacturer = Build.MANUFACTURER;
        final String device = Build.DEVICE;
        final String model = Build.MODEL;
        final String hardware = Build.HARDWARE;
        final String b = b(device);
        final Iterator iterator = c.iterator();
        arfi arfi;
        List list;
        do {
            final boolean hasNext = iterator.hasNext();
            list = null;
            if (!hasNext) {
                return null;
            }
            arfi = (arfi)iterator.next();
        } while (!arfi.a(manufacturer, device, model, hardware) && !arfi.a(manufacturer, b, model, hardware));
        final Object a = arfi.a;
        final int n = 0;
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", a, arfi.b, arfi.c, arfi.d, arfi.e, arfi.f, arfi.g);
        final Object e = arfi.e;
        if (e != null) {
            builder.setXPpi((float)e);
        }
        final Object f = arfi.f;
        if (f != null) {
            builder.setYPpi((float)f);
        }
        final Object g = arfi.g;
        if (g != null) {
            builder.setBottomBezelHeight((float)g);
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            final Display q = areq.q(context);
            final DisplayMetrics o = areq.o(q);
            int n2 = o.widthPixels;
            List list2;
            if (q == null) {
                list2 = list;
            }
            else {
                list2 = arfj.b;
                if (list2 == null) {
                    arfj.b = new ArrayList();
                    final Display$Mode[] supportedModes = q.getSupportedModes();
                    if (supportedModes != null) {
                        for (int i = 0; i < supportedModes.length; ++i) {
                            final Display$Mode display$Mode = supportedModes[i];
                            arfj.b.add(new Size(display$Mode.getPhysicalWidth(), display$Mode.getPhysicalHeight()));
                        }
                    }
                    list2 = arfj.b;
                }
            }
            if (list2 != null) {
                for (int size = list2.size(), j = n; j < size; ++j) {
                    final Size size2 = (Size)list2.get(j);
                    n2 = Math.max(n2, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (o.widthPixels != n2) {
                    final float n3 = o.widthPixels / (float)n2;
                    builder.setXPpi(builder.getXPpi() * n3);
                    builder.setYPpi(builder.getYPpi() * n3);
                }
            }
        }
        return (Display$DisplayParams)((ahcr)builder).build();
    }
    
    private static String b(final String s) {
        try {
            final byte[] digest = MessageDigest.getInstance("SHA-1").digest(s.getBytes());
            final int length = digest.length;
            final StringBuilder sb = new StringBuilder(length + length);
            for (int i = 0; i < length; ++i) {
                sb.append(String.format("%02x", digest[i]));
            }
            return sb.toString();
        }
        catch (final GeneralSecurityException ex) {
            Log.e(arfj.a, "SHA-256 is missing");
            return s;
        }
    }
}
