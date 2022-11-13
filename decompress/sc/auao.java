import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class auao
{
    static final auii a;
    
    static {
        final auii auii = a = new auii();
        final Object c = auii.c;
        final Object d = auii.d;
        final Object b = auii.b;
        final int n = 0;
        int n2 = 1;
        int n3 = 0;
        int n4 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= 217) {
                break;
            }
            final char char1 = "# #s #, #e #.# the #.com/#\u00c2 # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #".charAt(n3);
            if (char1 == '#') {
                ((int[])d)[n2] = n4;
                ++n2;
            }
            else {
                ((byte[])c)[n4] = (byte)char1;
                ++n4;
            }
            ++n3;
        }
        while (i < 363) {
            ((int[])b)[i] = "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K".charAt(i) - ' ';
            ++i;
        }
    }
    
    static int a(final byte[] array, final int n, final ByteBuffer byteBuffer, int n2, int n3, final auii auii, int n4) {
        final Object b = auii.b;
        final Object c = auii.c;
        final Object d = auii.d;
        final int[] array2 = (int[])b;
        final int n5 = n4 * 3;
        final int n6 = array2[n5];
        final int n7 = array2[n5 + 1];
        final int n8 = array2[n5 + 2];
        final int[] array3 = (int[])d;
        int i = array3[n6];
        final int n9 = array3[n6 + 1];
        final int n10 = array3[n8];
        final int n11 = array3[n8 + 1];
        final int n12 = n7 - 11;
        int n13;
        if (n12 <= 0 || (n13 = n12) > 9) {
            n13 = 0;
        }
        int n14;
        int n15;
        if (n7 > 0 && n7 <= 9) {
            n14 = n;
            n15 = n7;
        }
        else {
            n14 = n;
            n15 = 0;
        }
        while (i != n9) {
            array[n14] = ((byte[])c)[i];
            ++n14;
            ++i;
        }
        int n16;
        if ((n16 = n13) > n3) {
            n16 = n3;
        }
        int j;
        for (n2 += n16, n3 = (j = n3 - n16 - n15); j > 0; --j, ++n14, ++n2) {
            array[n14] = byteBuffer.get(n2);
        }
        int k = 0;
        int n18 = 0;
        Label_0952: {
            if (n7 != 10 && n7 != 11) {
                int n17;
                if ((n17 = n7) != 21) {
                    k = n10;
                    n18 = n14;
                    if (n7 != 22) {
                        break Label_0952;
                    }
                    n17 = 22;
                }
                int n19 = n14 - n3;
                n2 = ((short[])auii.a)[n4];
                n2 = (n2 & 0x7FFF) + (16777216 - (n2 & 0x8000));
                n4 = n3;
                while (true) {
                    k = n10;
                    n18 = n14;
                    if (n4 <= 0) {
                        break;
                    }
                    n3 = (array[n19] & 0xFF);
                    Label_0767: {
                        int n20 = 0;
                        Label_0374: {
                            if (n3 < 128) {
                                n20 = n2 + n3;
                                array[n19] = (byte)(n20 & 0x7F);
                            }
                            else {
                                if (n3 >= 192) {
                                    if (n3 < 224) {
                                        if (n4 >= 2) {
                                            final int n21 = n19 + 1;
                                            final byte b2 = array[n21];
                                            n2 += ((b2 & 0x3F) | (n3 & 0x1F) << 6);
                                            array[n19] = (byte)((n2 >> 6 & 0x1F) | 0xC0);
                                            array[n21] = (byte)((b2 & 0xC0) | (n2 & 0x3F));
                                            n3 = 2;
                                            break Label_0767;
                                        }
                                    }
                                    else if (n3 < 240) {
                                        if (n4 >= 3) {
                                            final int n22 = n19 + 1;
                                            final byte b3 = array[n22];
                                            final int n23 = n19 + 2;
                                            final byte b4 = array[n23];
                                            n2 += ((b4 & 0x3F) | (b3 & 0x3F) << 6 | (n3 & 0xF) << 12);
                                            array[n19] = (byte)((n2 >> 12 & 0xF) | 0xE0);
                                            array[n22] = (byte)((b3 & 0xC0) | (n2 >> 6 & 0x3F));
                                            array[n23] = (byte)((b4 & 0xC0) | (n2 & 0x3F));
                                            n3 = 3;
                                            break Label_0767;
                                        }
                                    }
                                    else {
                                        n20 = n2;
                                        if (n3 >= 248) {
                                            break Label_0374;
                                        }
                                        if (n4 >= 4) {
                                            final int n24 = n19 + 1;
                                            final byte b5 = array[n24];
                                            final int n25 = n19 + 2;
                                            final byte b6 = array[n25];
                                            final int n26 = n19 + 3;
                                            final byte b7 = array[n26];
                                            n2 += ((b7 & 0x3F) | (b6 & 0x3F) << 6 | (b5 & 0x3F) << 12 | (n3 & 0x7) << 18);
                                            array[n19] = (byte)((n2 >> 18 & 0x7) | 0xF0);
                                            array[n24] = (byte)((b5 & 0xC0) | (n2 >> 12 & 0x3F));
                                            array[n25] = (byte)((b6 & 0xC0) | (n2 >> 6 & 0x3F));
                                            array[n26] = (byte)((b7 & 0xC0) | (n2 & 0x3F));
                                            n3 = 4;
                                            break Label_0767;
                                        }
                                    }
                                    n3 = n4;
                                    break Label_0767;
                                }
                                n20 = n2;
                            }
                        }
                        n3 = 1;
                        n2 = n20;
                    }
                    n19 += n3;
                    n4 -= n3;
                    if (n17 != 21) {
                        continue;
                    }
                    n4 = 0;
                }
            }
            else {
                n4 = n14 - n3;
                if (n7 == 10) {
                    n2 = 1;
                    n3 = n4;
                }
                else {
                    n2 = n3;
                    n3 = n4;
                }
                while (true) {
                    k = n10;
                    n18 = n14;
                    if (n2 <= 0) {
                        break;
                    }
                    final byte b8 = array[n3];
                    n4 = (b8 & 0xFF);
                    if (n4 < 192) {
                        if (n4 >= 97 && n4 <= 122) {
                            array[n3] = (byte)(b8 ^ 0x20);
                        }
                        --n2;
                        ++n3;
                    }
                    else if (n4 < 224) {
                        n4 = n3 + 1;
                        array[n4] ^= 0x20;
                        n2 -= 2;
                        n3 += 2;
                    }
                    else {
                        n4 = n3 + 2;
                        array[n4] ^= 0x5;
                        n2 -= 3;
                        n3 += 3;
                    }
                }
            }
        }
        while (k != n11) {
            array[n18] = ((byte[])c)[k];
            ++n18;
            ++k;
        }
        return n18 - n;
    }
}
