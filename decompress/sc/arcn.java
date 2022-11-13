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

public final class arcn
{
    private static final String a = "arcn";
    private static ArrayList b;
    private static final List c;
    
    static {
        final arcm arcm = new arcm("Micromax", null, "4560MMX", null, 217.0f, 217.0f);
        final arcm arcm2 = new arcm("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f);
        final arcm arcm3 = new arcm("samsung", null, "SM-G920P", null, 575.0f, 575.0f);
        final arcm arcm4 = new arcm("samsung", null, "SM-G930", null, 581.0f, 580.0f);
        final arcm arcm5 = new arcm("samsung", null, "SM-G9300", null, 581.0f, 580.0f);
        final arcm arcm6 = new arcm("samsung", null, "SM-G930A", null, 581.0f, 580.0f);
        final arcm arcm7 = new arcm("samsung", null, "SM-G930F", null, 581.0f, 580.0f);
        final arcm arcm8 = new arcm("samsung", null, "SM-G930P", null, 581.0f, 580.0f);
        final arcm arcm9 = new arcm("samsung", null, "SM-G930R4", null, 581.0f, 580.0f);
        final arcm arcm10 = new arcm("samsung", null, "SM-G930T", null, 581.0f, 580.0f);
        final arcm arcm11 = new arcm("samsung", null, "SM-G930V", null, 581.0f, 580.0f);
        final arcm arcm12 = new arcm("samsung", null, "SM-G930W8", null, 581.0f, 580.0f);
        final arcm arcm13 = new arcm("samsung", null, "SM-N915FY", null, 541.0f, 541.0f);
        final arcm arcm14 = new arcm("samsung", null, "SM-N915A", null, 541.0f, 541.0f);
        final arcm arcm15 = new arcm("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final arcm arcm16 = new arcm("samsung", null, "SM-N915K", null, 541.0f, 541.0f);
        final arcm arcm17 = new arcm("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final arcm arcm18 = new arcm("samsung", null, "SM-N915G", null, 541.0f, 541.0f);
        final arcm arcm19 = new arcm("samsung", null, "SM-N915D", null, 541.0f, 541.0f);
        final arcm arcm20 = new arcm("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f);
        final arcm arcm21 = new arcm("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f);
        final arcm arcm22 = new arcm("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f);
        final Float value = 441.74f;
        final Float value2 = 0.004f;
        final arcm arcm23 = new arcm("Google", "sailfish", "Pixel", "sailfish", value, value, value2);
        final Float value3 = 537.57f;
        final arcm arcm24 = new arcm("Google", "marlin", "Pixel XL", "marlin", value3, value3, value2);
        final arcm arcm25 = new arcm("Google", "walleye", null, "walleye", value, value, value2);
        final arcm arcm26 = new arcm("Google", "taimen", null, "taimen", null, null, 0.0046f);
        final Float value4 = 522.63f;
        final Float value5 = 0.0038f;
        c = Arrays.asList(arcm, arcm2, arcm3, arcm4, arcm5, arcm6, arcm7, arcm8, arcm9, arcm10, arcm11, arcm12, arcm13, arcm14, arcm15, arcm16, arcm17, arcm18, arcm19, arcm20, arcm21, arcm22, arcm23, arcm24, arcm25, arcm26, new arcm("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, value4, value4, value5), new arcm("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, value5), new arcm("LGE", "joan", null, "joan", null, null, value5), new arcm("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, value5), new arcm("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }
    
    private arcn() {
    }
    
    public static Display$DisplayParams a(final Context context) {
        final Display$DisplayParams$Builder builder = Display$DisplayParams.newBuilder();
        final List c = arcn.c;
        final String manufacturer = Build.MANUFACTURER;
        final String device = Build.DEVICE;
        final String model = Build.MODEL;
        final String hardware = Build.HARDWARE;
        final String b = b(device);
        final Iterator iterator = c.iterator();
        arcm arcm;
        List list;
        do {
            final boolean hasNext = iterator.hasNext();
            list = null;
            if (!hasNext) {
                return null;
            }
            arcm = (arcm)iterator.next();
        } while (!arcm.a(manufacturer, device, model, hardware) && !arcm.a(manufacturer, b, model, hardware));
        final Object a = arcm.a;
        final int n = 0;
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", a, arcm.b, arcm.c, arcm.d, arcm.e, arcm.f, arcm.g);
        final Object e = arcm.e;
        if (e != null) {
            builder.setXPpi((float)e);
        }
        final Object f = arcm.f;
        if (f != null) {
            builder.setYPpi((float)f);
        }
        final Object g = arcm.g;
        if (g != null) {
            builder.setBottomBezelHeight((float)g);
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            final Display r = arbu.r(context);
            final DisplayMetrics p = arbu.p(r);
            int n2 = p.widthPixels;
            List list2;
            if (r == null) {
                list2 = list;
            }
            else {
                list2 = arcn.b;
                if (list2 == null) {
                    arcn.b = new ArrayList();
                    final Display$Mode[] supportedModes = r.getSupportedModes();
                    if (supportedModes != null) {
                        for (int i = 0; i < supportedModes.length; ++i) {
                            final Display$Mode display$Mode = supportedModes[i];
                            arcn.b.add(new Size(display$Mode.getPhysicalWidth(), display$Mode.getPhysicalHeight()));
                        }
                    }
                    list2 = arcn.b;
                }
            }
            if (list2 != null) {
                for (int size = list2.size(), j = n; j < size; ++j) {
                    final Size size2 = (Size)list2.get(j);
                    n2 = Math.max(n2, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (p.widthPixels != n2) {
                    final float n3 = p.widthPixels / (float)n2;
                    builder.setXPpi(builder.getXPpi() * n3);
                    builder.setYPpi(builder.getYPpi() * n3);
                }
            }
        }
        return (Display$DisplayParams)builder.build();
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
            Log.e(arcn.a, "SHA-256 is missing");
            return s;
        }
    }
}
