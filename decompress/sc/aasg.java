import android.util.Base64;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class aasg implements Runnable
{
    final aasi a;
    
    public aasg(final aasi a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final aasi a = this.a;
        if (!a.b.isEmpty()) {
            final ArrayList list = new ArrayList(a.b);
            a.b.clear();
            final double n = (double)a.c;
            final double n2 = (double)a.d;
            a.c = -1L;
            a.d = 0L;
            a.k = -1L;
            a.n = null;
            final boolean empty = list.isEmpty();
            byte b = 0;
            if (!empty) {
                final int length = ((byte[])list.get(0)).length;
                final byte[] array = new byte[length];
                for (int i = 0; i < length; ++i) {
                    array[i] = ((byte[])list.get(0))[i];
                }
                for (int j = 1; j < list.size(); ++j) {
                    for (int k = 0; k < length; ++k) {
                        final byte b2 = ((byte[])list.get(j))[k];
                        final byte[] array2 = (byte[])list.get(j);
                        array2[k] -= array[k];
                        array[k] = b2;
                    }
                }
            }
            byte[] array3;
            if (list.isEmpty()) {
                array3 = new byte[0];
            }
            else {
                final int length2 = ((byte[])list.get(0)).length;
                array3 = new byte[list.size() * length2];
                for (int l = 0; l < length2; ++l) {
                    for (int n3 = 0; n3 < list.size(); ++n3) {
                        array3[list.size() * l + n3] = ((byte[])list.get(n3))[l];
                    }
                }
            }
            final int length3 = array3.length;
            final byte[] array4 = new byte[length3 + length3 + 3];
            array4[0] = 0;
            array4[1] = (byte)(length3 >> 8);
            array4[2] = (byte)length3;
            final byte[] array5 = new byte[256];
            final byte[] array6 = new byte[256];
            final int[] array7 = new int[256];
            for (int n4 = 0; n4 < 256; ++n4) {
                array6[n4] = (array5[n4] = (byte)n4);
                array7[n4] = 0;
            }
            int n5 = 3;
            int n6 = 0;
            int n7 = 0;
            while (n6 < length3) {
                final byte b3 = array3[n6];
                final byte a2 = aasi.a(array5, b3);
                final int n8 = b & 0xFF;
                final int n9 = b3 & 0xFF;
                if (array6[n8] == b3) {
                    array7[n8] += 4;
                }
                else if ((array7[n8] >>= 1) == 0) {
                    array6[n8] = b3;
                    array7[n8] = 1;
                }
                if (array7[n9] > 1) {
                    aasi.a(array5, array6[n9]);
                }
                if (a2 == 0) {
                    ++n7;
                }
                else {
                    while (n7 > 0) {
                        byte b4;
                        if (--n7 % 2 == 0) {
                            b4 = 0;
                        }
                        else {
                            b4 = -2;
                        }
                        array4[n5] = b4;
                        n7 >>= 1;
                        ++n5;
                    }
                    byte b5 = 0;
                    int n10 = 0;
                    Label_0673: {
                        if ((b5 = a2) != -1) {
                            b5 = a2;
                            n10 = n5;
                            if (a2 != -2) {
                                break Label_0673;
                            }
                            b5 = -2;
                        }
                        array4[n5] = -1;
                        n10 = n5 + 1;
                    }
                    array4[n10] = b5;
                    n5 = n10 + 1;
                }
                ++n6;
                b = b3;
            }
            while (n7 > 0) {
                byte b6;
                if (--n7 % 2 == 0) {
                    b6 = 0;
                }
                else {
                    b6 = -2;
                }
                array4[n5] = b6;
                n7 >>= 1;
                ++n5;
            }
            Double.isNaN(n2);
            final double n11 = n2 / 1000.0;
            Double.isNaN(n);
            a.l.post((Runnable)new aash(a, n / 1000.0, n11, Base64.encodeToString(Arrays.copyOf(array4, n5), 10)));
        }
        if (!this.a.h) {
            this.a.c(30000L);
            return;
        }
        this.a.quit();
    }
}
