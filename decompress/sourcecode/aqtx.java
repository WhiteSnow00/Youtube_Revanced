import java.util.Iterator;
import java.util.List;
import j$.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.IOException;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtx
{
    private final aqtu a;
    private final String b;
    private int c;
    
    static {
        " ".codePointAt(0);
    }
    
    public aqtx(final String b, final int c) {
        final byte[] array = new byte[2];
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(b, "r");
            try {
                randomAccessFile.readFully(array);
                this.a = new aqtu(array);
                randomAccessFile.close();
                this.b = b;
                this.c = c;
                return;
            }
            finally {
                try {
                    randomAccessFile.close();
                }
                finally {
                    final Throwable t;
                    aqqn.b(t, (Throwable)randomAccessFile);
                }
            }
        }
        catch (final IllegalArgumentException randomAccessFile) {}
        catch (final IOException ex) {}
        throw new IOException("Wrong index file: ".concat(String.valueOf(b)), (Throwable)randomAccessFile);
    }
    
    private final void b(final ArrayList list, final aqtw aqtw) {
        int size = list.size();
        while (true) {
            int n;
            do {
                n = size - 1;
                if (n < 0) {
                    final int n2 = 0;
                    list.add(n2, aqtw);
                    if (list.size() > this.c) {
                        list.remove(list.size() - 1);
                    }
                    return;
                }
                size = n;
            } while (((aqtw)list.get(n)).b < aqtw.b);
            final int n2 = n + 1;
            continue;
        }
    }
    
    private static final String c(final RandomAccessFile randomAccessFile) {
        final int n = randomAccessFile.readByte() & 0xFF;
        if (n == 0) {
            return null;
        }
        final byte[] array = new byte[n];
        randomAccessFile.readFully(array);
        return new String(array, StandardCharsets.UTF_8);
    }
    
    private static final int d(final int n, final RandomAccessFile randomAccessFile) {
        final byte[] array = new byte[n];
        randomAccessFile.readFully(array);
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 |= (array[i] & 0xFF) << i * 8;
            ++i;
        }
        return n2;
    }
    
    public final List a(final String s) {
        final ArrayList list = new ArrayList();
        if (s.isEmpty()) {
            return list;
        }
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(this.b, "r");
            int c = 2;
            String c2 = null;
            int i = 0;
            int n = 0;
            int b = 0;
            try {
                while (true) {
                    while (i < s.length()) {
                        if (n == 0) {
                            randomAccessFile.seek(c);
                            if ((d(this.a.b, randomAccessFile) & 0x1) == 0x1) {
                                randomAccessFile.skipBytes(this.a.b);
                            }
                            n = 0;
                            do {
                                c2 = c(randomAccessFile);
                                if (c2 == null) {
                                    c2 = null;
                                    break;
                                }
                                final int d = d(1, randomAccessFile);
                                n = ((d & 0x1) ^ 0x1);
                                if (n == 0) {
                                    c = (d(this.a.a - 1, randomAccessFile) << 8 | d) >>> 1;
                                }
                                else {
                                    b = (d | d(this.a.b - 1, randomAccessFile) << 8) >>> 1;
                                }
                            } while (s.codePointAt(i) != c2.codePointAt(0));
                            if (c2 != null) {
                                if (s.substring(i).startsWith(c2) || c2.startsWith(s.substring(i))) {
                                    i += c2.length();
                                    continue;
                                }
                            }
                        }
                        final Object o = null;
                        if (o != null) {
                            final ArrayList list2 = new ArrayList();
                            list2.add(o);
                        Block_18:
                            while (true) {
                                int j = 0;
                                while (true) {
                                    while (j < list2.size()) {
                                        if (!((aqtw)list2.get(j)).a) {
                                            final aqtw aqtw = list2.get(j);
                                            list2.remove(j);
                                            int k = this.c - j;
                                            if (aqtw == null) {
                                                break Block_18;
                                            }
                                            randomAccessFile.seek(aqtw.c);
                                            if ((d(this.a.b, randomAccessFile) & 0x1) == 0x1) {
                                                final aqtw aqtw2 = new aqtw();
                                                aqtw2.d = aqtw.d;
                                                aqtw2.b = d(this.a.b, randomAccessFile);
                                                aqtw2.a = true;
                                                this.b(list2, aqtw2);
                                            }
                                            final ArrayList<aqtw> list3 = new ArrayList<aqtw>();
                                            while (k > 0) {
                                                final String c3 = c(randomAccessFile);
                                                if (c3 == null) {
                                                    break;
                                                }
                                                final aqtw aqtw3 = new aqtw();
                                                aqtw3.d = String.valueOf(aqtw.d).concat(c3);
                                                final int d2 = d(1, randomAccessFile);
                                                final int n2 = (d2 & 0x1) ^ 0x1;
                                                if (n2 != 0) {
                                                    aqtw3.b = (d2 | d(this.a.b - 1, randomAccessFile) << 8) >>> 1;
                                                }
                                                else {
                                                    aqtw3.c = (d2 | d(this.a.a - 1, randomAccessFile) << 8) >>> 1;
                                                }
                                                aqtw3.a = (n2 != 0);
                                                list3.add(aqtw3);
                                                --k;
                                            }
                                            for (int size = list3.size(), l = 0; l < size; ++l) {
                                                final aqtw aqtw4 = list3.get(l);
                                                if (!aqtw4.a) {
                                                    randomAccessFile.seek(aqtw4.c);
                                                    aqtw4.b = d(this.a.b, randomAccessFile) >>> 1;
                                                }
                                                this.b(list2, aqtw4);
                                            }
                                            continue Block_18;
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    final aqtw aqtw = null;
                                    int k = 0;
                                    continue;
                                }
                            }
                            final Iterator iterator = list2.iterator();
                            while (iterator.hasNext()) {
                                list.add(((aqtw)iterator.next()).d);
                            }
                        }
                        randomAccessFile.close();
                        return list;
                    }
                    final aqtw aqtw5 = new aqtw();
                    final String substring = c2.substring(c2.length() - (i - s.length()));
                    aqtw5.d = String.valueOf(s).concat(String.valueOf(substring));
                    aqtw5.a = (n != 0);
                    aqtw5.c = c;
                    if (n == 0) {
                        randomAccessFile.seek(c);
                        aqtw5.b = d(this.a.b, randomAccessFile) >>> 1;
                    }
                    else {
                        aqtw5.b = b;
                    }
                    if (substring.isEmpty()) {
                        final Object o = aqtw5;
                        continue;
                    }
                    substring.codePointAt(0);
                    final Object o = aqtw5;
                    continue;
                }
            }
            finally {
                try {
                    randomAccessFile.close();
                }
                finally {
                    final Throwable t;
                    aqqn.b((Throwable)s, t);
                }
            }
            return list;
        }
        catch (final IOException ex) {
            return list;
        }
    }
}
