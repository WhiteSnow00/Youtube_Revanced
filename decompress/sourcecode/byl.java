import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byl
{
    public static int a(final byte[] array) {
        final trg i = i(array);
        if (i == null) {
            return -1;
        }
        return i.a;
    }
    
    public static UUID b(final byte[] array) {
        final trg i = i(array);
        if (i == null) {
            return null;
        }
        return (UUID)i.b;
    }
    
    public static byte[] c(final UUID uuid, final byte[] array) {
        return d(uuid, null, array);
    }
    
    public static byte[] d(UUID uuid, final UUID[] array, final byte[] array2) {
        final int n = 0;
        int length;
        if (array2 != null) {
            length = array2.length;
        }
        else {
            length = 0;
        }
        int n3;
        final int n2 = n3 = length + 32;
        if (array != null) {
            n3 = n2 + (array.length * 16 + 4);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n3);
        allocate.putInt(n3);
        allocate.putInt(1886614376);
        int n4;
        if (array != null) {
            n4 = 16777216;
        }
        else {
            n4 = 0;
        }
        allocate.putInt(n4);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (array != null) {
            final int length2 = array.length;
            allocate.putInt(length2);
            for (int i = n; i < length2; ++i) {
                uuid = array[i];
                allocate.putLong(uuid.getMostSignificantBits());
                allocate.putLong(uuid.getLeastSignificantBits());
            }
        }
        if (array2 != null) {
            final int length3 = array2.length;
            if (length3 != 0) {
                allocate.putInt(length3);
                allocate.put(array2);
            }
        }
        return allocate.array();
    }
    
    public static byte[] e(final byte[] array, final UUID uuid) {
        final trg i = i(array);
        if (i == null) {
            return null;
        }
        if (!uuid.equals(i.b)) {
            final String value = String.valueOf(uuid);
            final String string = i.b.toString();
            final StringBuilder sb = new StringBuilder("UUID mismatch. Expected: ");
            sb.append(value);
            sb.append(", got: ");
            sb.append(string);
            sb.append(".");
            bao.c("PsshAtomUtil", sb.toString());
            return null;
        }
        return (byte[])i.c;
    }
    
    public static final boolean f(String substring, final String s) {
        if (!atnh.c(substring, s)) {
            final int length = substring.length();
            final int n = 0;
            if (length != 0) {
                int i = 0;
                int n2 = 0;
                int n7;
                for (int n3 = 0; i < substring.length(); ++i, ++n3, n2 = n7) {
                    final char char1 = substring.charAt(i);
                    int n4 = n3;
                    int n5 = char1;
                    if (n3 == 0) {
                        if (char1 != '(') {
                            return false;
                        }
                        n4 = 0;
                        n5 = 40;
                    }
                    final int n6 = n4;
                    if (n5 == 40) {
                        n7 = n2 + 1;
                    }
                    else {
                        n7 = n2;
                        if (n5 == 41) {
                            n7 = --n2;
                            if (n2 == 0) {
                                n7 = n2;
                                if (n6 != substring.length() - 1) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                if (n2 == 0) {
                    substring = substring.substring(1, substring.length() - 1);
                    substring.getClass();
                    int n8 = substring.length() - 1;
                    boolean b = false;
                    int j = n;
                    while (j <= n8) {
                        int n9;
                        if (!b) {
                            n9 = j;
                        }
                        else {
                            n9 = n8;
                        }
                        final boolean s2 = aubt.s(substring.charAt(n9));
                        if (!b) {
                            if (!s2) {
                                b = true;
                            }
                            else {
                                ++j;
                            }
                        }
                        else {
                            if (!s2) {
                                break;
                            }
                            --n8;
                        }
                    }
                    return atnh.c(substring.subSequence(j, n8 + 1).toString(), s);
                }
            }
            return false;
        }
        return true;
    }
    
    public static final StringBuilder g() {
        return new StringBuilder();
    }
    
    public static final void h(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    public static trg i(final byte[] array) {
        final bar bar = new bar(array);
        if (bar.c < 32) {
            return null;
        }
        bar.G(0);
        if (bar.d() != bar.a() + 4) {
            return null;
        }
        if (bar.d() != 1886614376) {
            return null;
        }
        final int f = bwa.f(bar.d());
        if (f > 1) {
            final StringBuilder sb = new StringBuilder("Unsupported pssh version: ");
            sb.append(f);
            bao.c("PsshAtomUtil", sb.toString());
            return null;
        }
        final UUID uuid = new UUID(bar.p(), bar.p());
        if (f == 1) {
            bar.H(bar.l() * 16);
        }
        final int l = bar.l();
        if (l != bar.a()) {
            return null;
        }
        final byte[] array2 = new byte[l];
        bar.B(array2, 0, l);
        return new trg(uuid, f, array2);
    }
}
