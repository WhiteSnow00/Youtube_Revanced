import java.util.logging.Level;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkc
{
    protected static Logger a;
    protected static Map b;
    
    static {
        arkc.a = Logger.getLogger(arkc.class.getName());
        arkc.b = new HashMap();
        final HashSet set = new HashSet();
        set.add(arjw.class);
        set.add(arke.class);
        set.add(arjt.class);
        set.add(arjz.class);
        set.add(arkb.class);
        set.add(arkd.class);
        set.add(arjs.class);
        set.add(arka.class);
        set.add(arjy.class);
        set.add(arjv.class);
        for (final Class clazz : set) {
            final arjx arjx = (arjx)clazz.getAnnotation(arjx.class);
            final int[] b = arjx.b();
            final int a = arjx.a();
            Map map;
            if ((map = arkc.b.get(a)) == null) {
                map = new HashMap();
            }
            for (int length = b.length, i = 0; i < length; ++i) {
                map.put(b[i], clazz);
            }
            arkc.b.put(a, map);
        }
    }
    
    public static arjt a(int v, final ByteBuffer byteBuffer) {
        final int i = coh.i(byteBuffer);
        Map map;
        if ((map = arkc.b.get(v)) == null) {
            map = arkc.b.get(-1);
        }
        final Class clazz = (Class)map.get(i);
        arjt arjt = null;
        Label_0341: {
            if (clazz != null && !clazz.isInterface()) {
                if (!Modifier.isAbstract(clazz.getModifiers())) {
                    try {
                        arjt = (arjt)clazz.newInstance();
                        break Label_0341;
                    }
                    catch (final Exception ex) {
                        final Logger a = arkc.a;
                        final Level severe = Level.SEVERE;
                        final String string = clazz.toString();
                        final StringBuilder sb = new StringBuilder(string.length() + 99);
                        sb.append("Couldn't instantiate BaseDescriptor class ");
                        sb.append(string);
                        sb.append(" for objectTypeIndication ");
                        sb.append(v);
                        sb.append(" and tag ");
                        sb.append(i);
                        a.logp(severe, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb.toString(), ex);
                        throw new RuntimeException(ex);
                    }
                }
            }
            final Logger a2 = arkc.a;
            final Level warning = Level.WARNING;
            final String hexString = Integer.toHexString(v);
            final String hexString2 = Integer.toHexString(i);
            final String value = String.valueOf(clazz);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 68 + String.valueOf(hexString2).length() + String.valueOf(value).length());
            sb2.append("No ObjectDescriptor found for objectTypeIndication ");
            sb2.append(hexString);
            sb2.append(" and tag ");
            sb2.append(hexString2);
            sb2.append(" found: ");
            sb2.append(value);
            a2.logp(warning, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb2.toString());
            arjt = new arkf();
        }
        arjt.T = i;
        int n = coh.i(byteBuffer);
        arjt.U = (n & 0x7F);
        for (v = 1; n >>> 7 == 1; n = coh.i(byteBuffer), arjt.U = (arjt.U << 7 | (n & 0x7F)), ++v) {}
        arjt.V = v;
        final ByteBuffer slice = byteBuffer.slice();
        slice.limit(arjt.U);
        arjt.a(slice);
        byteBuffer.position(byteBuffer.position() + arjt.U);
        return arjt;
    }
}
