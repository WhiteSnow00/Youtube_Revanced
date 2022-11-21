import java.util.Arrays;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public class aucj implements Serializable, Comparable
{
    public static final aucj a;
    private static final long serialVersionUID = 1L;
    public final byte[] b;
    public transient int c;
    public transient String d;
    
    static {
        a = new aucj(new byte[0]);
    }
    
    public aucj(final byte[] b) {
        b.getClass();
        this.b = b;
    }
    
    public static final aucj d(final String d) {
        final aucj aucj = new aucj(aucu.a(d));
        aucj.d = d;
        return aucj;
    }
    
    private final void readObject(final ObjectInputStream objectInputStream) {
        final int int1 = objectInputStream.readInt();
        objectInputStream.getClass();
        if (int1 >= 0) {
            final byte[] array = new byte[int1];
            int read;
            for (int i = 0; i < int1; i += read) {
                read = objectInputStream.read(array, i, int1 - i);
                if (read == -1) {
                    throw new EOFException();
                }
            }
            final aucj aucj = new aucj(array);
            final Field declaredField = aucj.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, aucj.b);
            return;
        }
        final StringBuilder sb = new StringBuilder("byteCount < 0: ");
        sb.append(int1);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private final void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }
    
    public byte a(final int n) {
        return this.b[n];
    }
    
    public int b() {
        return this.b.length;
    }
    
    public String c() {
        final byte[] b = this.b;
        final int length = b.length;
        final char[] array = new char[length + length];
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b2 = b[i];
            final int n2 = n + 1;
            array[n] = aucw.a[b2 >> 4 & 0xF];
            array[n2] = aucw.a[b2 & 0xF];
            n = n2 + 1;
            ++i;
        }
        return new String(array);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final aucj aucj = (aucj)o;
        aucj.getClass();
        final int b = this.b();
        final int b2 = aucj.b();
        final int min = Math.min(b, b2);
        final int n = 0;
        int i = 0;
        while (i < min) {
            final int n2 = this.a(i) & 0xFF;
            final int n3 = aucj.a(i) & 0xFF;
            if (n2 == n3) {
                ++i;
            }
            else {
                if (n2 >= n3) {
                    return 1;
                }
                return -1;
            }
        }
        if (b == b2) {
            return n;
        }
        if (b >= b2) {
            return 1;
        }
        return -1;
    }
    
    public boolean e(final int n, final byte[] array, final int n2, final int n3) {
        array.getClass();
        if (n >= 0) {
            final byte[] b = this.b;
            if (n <= b.length - n3 && n2 >= 0 && n2 <= array.length - n3 && aucx.c(b, n, array, n2, n3)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof aucj) {
                final aucj aucj = (aucj)o;
                final int b2 = aucj.b();
                final byte[] b3 = this.b;
                final int length = b3.length;
                if (b2 == length) {
                    if (aucj.e(0, b3, 0, length)) {
                        return true;
                    }
                }
            }
            b = false;
        }
        return b;
    }
    
    public byte[] f() {
        return this.b;
    }
    
    public boolean g(final aucj aucj, final int n) {
        return aucj.e(0, this.b, 0, n);
    }
    
    @Override
    public int hashCode() {
        final int c = this.c;
        if (c != 0) {
            return c;
        }
        return this.c = Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        final byte[] b = this.b;
        final int length = b.length;
        String s;
        if (length == 0) {
            s = "[size=0]";
        }
        else {
            final char[] a = aucw.a;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
        Label_0835:
            while (true) {
                n4 = n3;
                if (n < length) {
                    final byte b2 = b[n];
                    Label_0240: {
                        int n8;
                        int n9;
                        if (b2 >= 0) {
                            int n5 = n2 + 1;
                            if (n2 == 64) {
                                n4 = n3;
                                break;
                            }
                            if (b2 != 10 && b2 != 13) {
                                if (b2 < 32) {
                                    break Label_0240;
                                }
                                if (b2 >= 127) {
                                    break Label_0240;
                                }
                            }
                            int n6 = n3 + 1;
                            int n7 = n + 1;
                            while (true) {
                                n8 = n7;
                                n3 = n6;
                                n9 = n5;
                                if (n7 >= length) {
                                    break;
                                }
                                final byte b3 = b[n7];
                                n8 = n7;
                                n3 = n6;
                                n9 = n5;
                                if (b3 < 0) {
                                    break;
                                }
                                ++n7;
                                n4 = n6;
                                if (n5 == 64) {
                                    break Label_0835;
                                }
                                if (b3 != 10 && b3 != 13) {
                                    if (b3 < 32) {
                                        break Label_0240;
                                    }
                                    if (b3 >= 127) {
                                        break Label_0240;
                                    }
                                }
                                ++n6;
                                ++n5;
                            }
                        }
                        else if (b2 >> 5 == -2) {
                            final int n10 = n + 1;
                            if (length <= n10) {
                                n4 = n3;
                                if (n2 != 64) {
                                    break Label_0240;
                                }
                                break;
                            }
                            else {
                                final byte b4 = b[n10];
                                if ((b4 & 0xC0) == 0x80) {
                                    final int n11 = b2 << 6 ^ (b4 ^ 0xF80);
                                    if (n11 < 128) {
                                        n4 = n3;
                                        if (n2 != 64) {
                                            break Label_0240;
                                        }
                                        break;
                                    }
                                    else {
                                        final int n12 = n2 + 1;
                                        n4 = n3;
                                        if (n2 == 64) {
                                            break;
                                        }
                                        if (n11 < 160) {
                                            break Label_0240;
                                        }
                                        if (n11 == 65533) {
                                            break Label_0240;
                                        }
                                        int n13;
                                        if (n11 < 65536) {
                                            n13 = 1;
                                        }
                                        else {
                                            n13 = 2;
                                        }
                                        n3 += n13;
                                        n8 = n + 2;
                                        n9 = n12;
                                    }
                                }
                                else {
                                    n4 = n3;
                                    if (n2 != 64) {
                                        break Label_0240;
                                    }
                                    break;
                                }
                            }
                        }
                        else if (b2 >> 4 == -2) {
                            final int n14 = n + 2;
                            if (length <= n14) {
                                n4 = n3;
                                if (n2 != 64) {
                                    break Label_0240;
                                }
                                break;
                            }
                            else {
                                final byte b5 = b[n + 1];
                                if ((b5 & 0xC0) == 0x80) {
                                    final byte b6 = b[n14];
                                    if ((b6 & 0xC0) == 0x80) {
                                        final int n15 = b6 ^ 0xFFFE1F80 ^ b5 << 6 ^ b2 << 12;
                                        if (n15 < 2048) {
                                            n4 = n3;
                                            if (n2 != 64) {
                                                break Label_0240;
                                            }
                                            break;
                                        }
                                        else if (n15 >= 55296 && n15 < 57344) {
                                            n4 = n3;
                                            if (n2 != 64) {
                                                break Label_0240;
                                            }
                                            break;
                                        }
                                        else {
                                            final int n16 = n2 + 1;
                                            n4 = n3;
                                            if (n2 == 64) {
                                                break;
                                            }
                                            if (n15 == 65533) {
                                                break Label_0240;
                                            }
                                            int n17;
                                            if (n15 < 65536) {
                                                n17 = 1;
                                            }
                                            else {
                                                n17 = 2;
                                            }
                                            n3 += n17;
                                            n8 = n + 3;
                                            n9 = n16;
                                        }
                                    }
                                    else {
                                        n4 = n3;
                                        if (n2 != 64) {
                                            break Label_0240;
                                        }
                                        break;
                                    }
                                }
                                else {
                                    n4 = n3;
                                    if (n2 != 64) {
                                        break Label_0240;
                                    }
                                    break;
                                }
                            }
                        }
                        else if (b2 >> 3 == -2) {
                            final int n18 = n + 3;
                            if (length <= n18) {
                                n4 = n3;
                                if (n2 != 64) {
                                    break Label_0240;
                                }
                                break;
                            }
                            else {
                                final byte b7 = b[n + 1];
                                if ((b7 & 0xC0) == 0x80) {
                                    final byte b8 = b[n + 2];
                                    if ((b8 & 0xC0) == 0x80) {
                                        final byte b9 = b[n18];
                                        if ((b9 & 0xC0) == 0x80) {
                                            final int n19 = b9 ^ 0x381F80 ^ b8 << 6 ^ b7 << 12 ^ b2 << 18;
                                            if (n19 > 1114111) {
                                                n4 = n3;
                                                if (n2 != 64) {
                                                    break Label_0240;
                                                }
                                                break;
                                            }
                                            else if (n19 >= 55296 && n19 < 57344) {
                                                n4 = n3;
                                                if (n2 != 64) {
                                                    break Label_0240;
                                                }
                                                break;
                                            }
                                            else if (n19 < 65536) {
                                                n4 = n3;
                                                if (n2 != 64) {
                                                    break Label_0240;
                                                }
                                                break;
                                            }
                                            else {
                                                final int n20 = n2 + 1;
                                                n4 = n3;
                                                if (n2 == 64) {
                                                    break;
                                                }
                                                n3 += 2;
                                                n8 = n + 4;
                                                n9 = n20;
                                            }
                                        }
                                        else {
                                            n4 = n3;
                                            if (n2 != 64) {
                                                break Label_0240;
                                            }
                                            break;
                                        }
                                    }
                                    else {
                                        n4 = n3;
                                        if (n2 != 64) {
                                            break Label_0240;
                                        }
                                        break;
                                    }
                                }
                                else {
                                    n4 = n3;
                                    if (n2 != 64) {
                                        break Label_0240;
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            n4 = n3;
                            if (n2 != 64) {
                                break Label_0240;
                            }
                            break;
                        }
                        n2 = n9;
                        n = n8;
                        continue;
                    }
                    n4 = -1;
                    break;
                }
                break;
            }
            if (n4 == -1) {
                final byte[] b10 = this.b;
                final int length2 = b10.length;
                if (length2 <= 64) {
                    final String c = this.c();
                    final StringBuilder sb = new StringBuilder("[hex=");
                    sb.append(c);
                    sb.append("]");
                    s = sb.toString();
                }
                else {
                    b10.getClass();
                    final byte[] copyOfRange = Arrays.copyOfRange(b10, 0, 64);
                    copyOfRange.getClass();
                    final String c2 = new aucj(copyOfRange).c();
                    final StringBuilder sb2 = new StringBuilder("[size=");
                    sb2.append(length2);
                    sb2.append(" hex=");
                    sb2.append(c2);
                    sb2.append("\u2026]");
                    s = sb2.toString();
                }
            }
            else {
                String d;
                if ((d = this.d) == null) {
                    final byte[] f = this.f();
                    f.getClass();
                    d = new String(f, atsf.a);
                    this.d = d;
                }
                final String substring = d.substring(0, n4);
                substring.getClass();
                final String v = auop.v(auop.v(auop.v(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
                if (n4 < d.length()) {
                    final int length3 = this.b.length;
                    final StringBuilder sb3 = new StringBuilder("[size=");
                    sb3.append(length3);
                    sb3.append(" text=");
                    sb3.append(v);
                    sb3.append("\u2026]");
                    s = sb3.toString();
                }
                else {
                    final StringBuilder sb4 = new StringBuilder("[text=");
                    sb4.append(v);
                    sb4.append("]");
                    s = sb4.toString();
                }
            }
        }
        return s;
    }
}
