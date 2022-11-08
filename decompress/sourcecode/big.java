import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class big extends bhn
{
    public big() {
    }
    
    public final void e(final ByteBuffer byteBuffer) {
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - i;
        final int d = this.b.d;
        int n2 = n;
        int n3 = 0;
        Label_0101: {
            Label_0094: {
                if (d != 3) {
                    if (d != 4) {
                        n3 = n;
                        if (d == 268435456) {
                            break Label_0101;
                        }
                        if (d == 536870912) {
                            n2 = n / 3;
                            break Label_0094;
                        }
                        if (d != 805306368) {
                            throw new IllegalStateException();
                        }
                    }
                    n3 = n / 2;
                    break Label_0101;
                }
            }
            n3 = n2 + n2;
        }
        final ByteBuffer j = this.j(n3);
        final int d2 = this.b.d;
        int k = i;
        if (d2 != 3) {
            int l = i;
            if (d2 != 4) {
                int n4 = i;
                if (d2 != 268435456) {
                    int n5 = i;
                    if (d2 != 536870912) {
                        if (d2 != 805306368) {
                            throw new IllegalStateException();
                        }
                        while (i < limit) {
                            j.put(byteBuffer.get(i + 2));
                            j.put(byteBuffer.get(i + 3));
                            i += 4;
                        }
                    }
                    else {
                        while (n5 < limit) {
                            j.put(byteBuffer.get(n5 + 1));
                            j.put(byteBuffer.get(n5 + 2));
                            n5 += 3;
                        }
                    }
                }
                else {
                    while (n4 < limit) {
                        j.put(byteBuffer.get(n4 + 1));
                        j.put(byteBuffer.get(n4));
                        n4 += 2;
                    }
                }
            }
            else {
                while (l < limit) {
                    final short n6 = (short)(baw.a(byteBuffer.getFloat(l), -1.0f, 1.0f) * 32767.0f);
                    j.put((byte)(n6 & 0xFF));
                    j.put((byte)(n6 >> 8 & 0xFF));
                    l += 4;
                }
            }
        }
        else {
            while (k < limit) {
                j.put((byte)0);
                j.put((byte)((byteBuffer.get(k) & 0xFF) - 128));
                ++k;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }
    
    public final azs i(azs a) {
        final int d = a.d;
        if (d != 3) {
            if (d == 2) {
                a = azs.a;
                return a;
            }
            if (d != 268435456 && d != 536870912 && d != 805306368) {
                if (d != 4) {
                    throw new azt(a);
                }
            }
        }
        a = new azs(a.b, a.c, 2);
        return a;
    }
}
