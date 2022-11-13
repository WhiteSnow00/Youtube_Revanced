import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfx
{
    private static final Logger a;
    private static final byte[] b;
    
    static {
        a = Logger.getLogger(asfx.class.getName());
        b = "-bin".getBytes(aeza.a);
    }
    
    private asfx() {
    }
    
    public static byte[][] a(final arwk arwk) {
        final byte[][] f = arvh.f(arwk);
        int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = f.length;
            if (n >= length) {
                break;
            }
            final byte[] array = f[n];
            final byte[] array2 = f[n + 1];
            Label_0220: {
                if (c(array, asfx.b)) {
                    f[n2] = array;
                    f[n2 + 1] = arvh.b.i(array2).getBytes(aeza.a);
                }
                else {
                    for (final byte b : array2) {
                        if (b < 32 || b > 126) {
                            final String s = new String(array, aeza.a);
                            final Logger a = asfx.a;
                            final Level warning = Level.WARNING;
                            final String string = Arrays.toString(array2);
                            final StringBuilder sb = new StringBuilder("Metadata key=");
                            sb.append(s);
                            sb.append(", value=");
                            sb.append(string);
                            sb.append(" contains invalid ASCII characters");
                            a.logp(warning, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                            break Label_0220;
                        }
                    }
                    f[n2] = array;
                    f[n2 + 1] = array2;
                }
                n2 += 2;
            }
            n += 2;
        }
        if (n2 == length) {
            return f;
        }
        return Arrays.copyOfRange(f, 0, n2);
    }
    
    public static byte[][] b(final byte[][] array) {
        for (int i = 0; i < array.length; i += 2) {
            final byte[] array2 = array[i];
            final int n = i + 1;
            final byte[] array3 = array[n];
            if (c(array2, asfx.b)) {
                for (int j = 0; j < array3.length; ++j) {
                    if (array3[j] == 44) {
                        final ArrayList list = new ArrayList(array.length + 10);
                        int n2 = 0;
                        int k;
                        while (true) {
                            k = i;
                            if (n2 >= i) {
                                break;
                            }
                            list.add(array[n2]);
                            ++n2;
                        }
                        while (k < array.length) {
                            final byte[] array4 = array[k];
                            final byte[] array5 = array[k + 1];
                            if (!c(array4, asfx.b)) {
                                list.add(array4);
                                list.add(array5);
                            }
                            else {
                                int n3 = 0;
                                int n4 = 0;
                                while (true) {
                                    final int length = array5.length;
                                    if (n3 > length) {
                                        break;
                                    }
                                    int n5 = 0;
                                    Label_0225: {
                                        if (n3 != length) {
                                            n5 = n4;
                                            if (array5[n3] != 44) {
                                                break Label_0225;
                                            }
                                        }
                                        final byte[] l = afoy.d.j((CharSequence)new String(array5, n4, n3 - n4, aeza.a));
                                        list.add(array4);
                                        list.add(l);
                                        n5 = n3 + 1;
                                    }
                                    ++n3;
                                    n4 = n5;
                                }
                            }
                            k += 2;
                        }
                        return (byte[][])list.toArray(new byte[0][]);
                    }
                }
                array[n] = afoy.d.j((CharSequence)new String(array3, aeza.a));
            }
        }
        return array;
    }
    
    private static boolean c(final byte[] array, final byte[] array2) {
        final int n = array.length - array2.length;
        if (n >= 0) {
            for (int i = n; i < array.length; ++i) {
                if (array[i] != array2[i - n]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
