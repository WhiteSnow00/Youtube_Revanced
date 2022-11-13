import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gl
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    
    static {
        a = new int[] { 2130968770, 2130968781, 2130968782, 2130969145, 2130969146, 2130969147, 2130969148, 2130969149, 2130969150, 2130969208, 2130969252, 2130969253, 2130969311, 2130969511, 2130969520, 2130969528, 2130969529, 2130969541, 2130969569, 2130969610, 2130969790, 2130970000, 2130970115, 2130970138, 2130970139, 2130970369, 2130970373, 2130970673, 2130970687 };
        b = new int[] { 16842931 };
        c = new int[] { 16843071 };
        d = new int[] { 2130968770, 2130968781, 2130969012, 2130969511, 2130970373, 2130970687 };
        e = new int[] { 16842994, 2130968857, 2130968860, 2130969746, 2130969747, 2130969989, 2130970275, 2130970283 };
        f = new int[] { 16843033, 2130970314, 2130970670, 2130970671 };
        g = new int[] { 16843074, 2130970664, 2130970665, 2130970666 };
        h = new int[] { 16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667 };
        i = new int[] { 16842804, 2130968763, 2130968764, 2130968765, 2130968766, 2130968767, 2130969273, 2130969274, 2130969275, 2130969276, 2130969279, 2130969280, 2130969281, 2130969282, 2130969315, 2130969405, 2130969461, 2130969470, 2130969641, 2130969737, 2130970555, 2130970626 };
        j = $d2j$hex$00ab4a87$decode_I("57000101ae0001010500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1100047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2500047f2b00047f4300047f4400047f4500047f4600047fb900047ff700047f0f01047f1001047f1101047f1201047f1301047f1e01047f1f01047f7a01047f8501047fcf01047fd001047fd101047fd301047fd401047fd501047fd701047ffe01047f0102047f1802047f4902047f9702047f9c02047f9d02047faa02047faf02047fc602047fc702047fd102047fd202047fd402047fb803047fd703047f8d04047f8e04047f8f04047f9004047f9404047f9504047f9604047f9704047f9804047f9904047f9a04047f9b04047f9c04047fdd05047fde05047fdf05047f0206047f0406047f2806047f2b06047f2c06047f2d06047f6806047f7406047f7706047f7806047fba06047fbb06047f8e07047fdb07047fdd07047fde07047fdf07047fe207047fe307047fe407047fe507047ff607047ff707047f4308047f4408047f4708047f4808047f9a08047fb508047fb608047fb708047fb808047fb908047fba08047fbb08047fbc08047fbd08047fbe08047f");
        k = new int[] { 2130968656 };
        l = new int[] { 16843016, 2130968951, 2130968952, 2130968953 };
        m = new int[] { 16843015, 2130968852, 2130968866, 2130968867 };
        n = new int[] { 16842927, 16842948, 16843046, 16843047, 16843048, 2130969253, 2130969261, 2130969884, 2130970269 };
        o = new int[] { 16843436, 16843437 };
        p = new int[] { 16842766, 16842960, 16843156, 16843230, 16843231, 16843232 };
        q = new int[] { 16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, 2130968594, 2130968614, 2130968617, 2130968658, 2130969144, 2130969550, 2130969551, 2130970012, 2130970264, 2130970698 };
        r = new int[] { 16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, 2130970132, 2130970362 };
        s = new int[] { 16843126, 16843465, 2130970062 };
        t = new int[] { 2130970069, 2130970075 };
        u = new int[] { 16842804, 16842970, 16843039, 16843087, 16843088, 16843296, 16843364, 2130968663, 2130968664, 2130968762, 2130969005, 2130969124, 2130969229, 2130969491, 2130969510, 2130969519, 2130969553, 2130969648, 2130970149, 2130970150, 2130970211, 2130970212, 2130970214, 2130970367, 2130970500, 2130970753, 2130970788 };
        v = new int[] { 16842930, 16843126, 16843131, 16843362, 2130970115 };
        w = new int[] { 16843044, 16843045, 16843074, 2130970274, 2130970306, 2130970506, 2130970507, 2130970511, 2130970655, 2130970656, 2130970657, 2130970705, 2130970716, 2130970717 };
        x = new int[] { 16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, 2130969461, 2130969470, 2130970555, 2130970626 };
        y = new int[] { 16842927, 16843072, 2130968854, 2130969024, 2130969025, 2130969145, 2130969146, 2130969147, 2130969148, 2130969149, 2130969150, 2130969790, 2130969793, 2130969872, 2130969901, 2130969997, 2130969998, 2130970115, 2130970369, 2130970371, 2130970372, 2130970673, 2130970677, 2130970678, 2130970679, 2130970680, 2130970681, 2130970682, 2130970684, 2130970685 };
        z = new int[] { 16842752, 16842970, 2130970071, 2130970074, 2130970639 };
        A = new int[] { 16842964, 2130968785, 2130968786 };
        B = new int[] { 16842960, 16842994, 16842995 };
    }
    
    private static long[] $d2j$hex$00ab4a87$decode_J(final String src) {
        final byte[] d = $d2j$hex$00ab4a87$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final LongBuffer s = b.asLongBuffer();
        final long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }
    
    private static int[] $d2j$hex$00ab4a87$decode_I(final String src) {
        final byte[] d = $d2j$hex$00ab4a87$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final IntBuffer s = b.asIntBuffer();
        final int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }
    
    private static short[] $d2j$hex$00ab4a87$decode_S(final String src) {
        final byte[] d = $d2j$hex$00ab4a87$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final ShortBuffer s = b.asShortBuffer();
        final short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }
    
    private static byte[] $d2j$hex$00ab4a87$decode_B(final String src) {
        final char[] d = src.toCharArray();
        final byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            final char h = d[2 * i];
            final char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            }
            else if (h >= 'a' && h <= 'f') {
                hh = h - 'a' + 10;
            }
            else {
                if (h < 'A' || h > 'F') {
                    throw new RuntimeException();
                }
                hh = h - 'A' + 10;
            }
            int ll;
            if (l >= '0' && l <= '9') {
                ll = l - '0';
            }
            else if (l >= 'a' && l <= 'f') {
                ll = l - 'a' + 10;
            }
            else {
                if (l < 'A' || l > 'F') {
                    throw new RuntimeException();
                }
                ll = l - 'A' + 10;
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}
