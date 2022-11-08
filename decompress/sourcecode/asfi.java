import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfi
{
    private static final Logger a;
    private static final byte[] b;
    
    static {
        a = Logger.getLogger(asfi.class.getName());
        b = "-bin".getBytes(aexb.a);
    }
    
    private asfi() {
    }
    
    public static byte[][] a(final arug arug) {
        final byte[][] g = artc.g(arug);
        int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = g.length;
            if (n >= length) {
                break;
            }
            final byte[] array = g[n];
            final byte[] array2 = g[n + 1];
            Label_0220: {
                if (c(array, asfi.b)) {
                    g[n2] = array;
                    g[n2 + 1] = artc.b.i(array2).getBytes(aexb.a);
                }
                else {
                    for (final byte b : array2) {
                        if (b < 32 || b > 126) {
                            final String s = new String(array, aexb.a);
                            final Logger a = asfi.a;
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
                    g[n2] = array;
                    g[n2 + 1] = array2;
                }
                n2 += 2;
            }
            n += 2;
        }
        if (n2 == length) {
            return g;
        }
        return Arrays.copyOfRange(g, 0, n2);
    }
    
    public static byte[][] b(final byte[][] array) {
        for (int i = 0; i < array.length; i += 2) {
            final byte[] array2 = array[i];
            final int n = i + 1;
            final byte[] array3 = array[n];
            if (c(array2, asfi.b)) {
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
                            if (!c(array4, asfi.b)) {
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
                                    Label_0226: {
                                        if (n3 != length) {
                                            n5 = n4;
                                            if (array5[n3] != 44) {
                                                break Label_0226;
                                            }
                                        }
                                        final byte[] l = afmy.d.j((CharSequence)new String(array5, n4, n3 - n4, aexb.a));
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
                array[n] = afmy.d.j((CharSequence)new String(array3, aexb.a));
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
