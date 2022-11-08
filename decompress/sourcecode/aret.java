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

public final class aret
{
    protected static Logger a;
    protected static Map b;
    
    static {
        aret.a = Logger.getLogger(aret.class.getName());
        aret.b = new HashMap();
        final HashSet set = new HashSet();
        set.add(aren.class);
        set.add(arev.class);
        set.add(arek.class);
        set.add(areq.class);
        set.add(ares.class);
        set.add(areu.class);
        set.add(arej.class);
        set.add(arer.class);
        set.add(arep.class);
        set.add(arem.class);
        for (final Class clazz : set) {
            final areo areo = (areo)clazz.getAnnotation(areo.class);
            final int[] b = areo.b();
            final int a = areo.a();
            Map map;
            if ((map = aret.b.get(a)) == null) {
                map = new HashMap();
            }
            for (int length = b.length, i = 0; i < length; ++i) {
                map.put(b[i], clazz);
            }
            aret.b.put(a, map);
        }
    }
    
    public static arek a(int v, final ByteBuffer byteBuffer) {
        final int v2 = clm.v(byteBuffer);
        Map map;
        if ((map = aret.b.get(v)) == null) {
            map = aret.b.get(-1);
        }
        final Class clazz = (Class)map.get(v2);
        Object o = null;
        Label_0326: {
            if (clazz != null && !clazz.isInterface()) {
                if (!Modifier.isAbstract(clazz.getModifiers())) {
                    try {
                        o = clazz.newInstance();
                        break Label_0326;
                    }
                    catch (final Exception ex) {
                        final Logger a = aret.a;
                        final Level severe = Level.SEVERE;
                        final String string = clazz.toString();
                        final StringBuilder sb = new StringBuilder(string.length() + 99);
                        sb.append("Couldn't instantiate BaseDescriptor class ");
                        sb.append(string);
                        sb.append(" for objectTypeIndication ");
                        sb.append(v);
                        sb.append(" and tag ");
                        sb.append(v2);
                        a.logp(severe, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb.toString(), ex);
                        throw new RuntimeException(ex);
                    }
                }
            }
            final Logger a2 = aret.a;
            final Level warning = Level.WARNING;
            final String hexString = Integer.toHexString(v);
            final String hexString2 = Integer.toHexString(v2);
            final String value = String.valueOf(clazz);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 68 + String.valueOf(hexString2).length() + String.valueOf(value).length());
            sb2.append("No ObjectDescriptor found for objectTypeIndication ");
            sb2.append(hexString);
            sb2.append(" and tag ");
            sb2.append(hexString2);
            sb2.append(" found: ");
            sb2.append(value);
            a2.logp(warning, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb2.toString());
            o = new arew();
        }
        ((arek)o).T = v2;
        int n = clm.v(byteBuffer);
        ((arek)o).U = (n & 0x7F);
        for (v = 1; n >>> 7 == 1; n = clm.v(byteBuffer), ++v, ((arek)o).U = (((arek)o).U << 7 | (n & 0x7F))) {}
        ((arek)o).V = v;
        final ByteBuffer slice = byteBuffer.slice();
        slice.limit(((arek)o).U);
        ((arek)o).a(slice);
        byteBuffer.position(byteBuffer.position() + ((arek)o).U);
        return (arek)o;
    }
}
