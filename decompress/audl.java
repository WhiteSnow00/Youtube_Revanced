import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class audl
{
    static final aule a;
    
    static {
        final aule aule = a = new aule();
        final Object c = aule.c;
        final Object d = aule.d;
        final Object b = aule.b;
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
    
    static int a(final byte[] array, final int n, final ByteBuffer byteBuffer, int n2, int n3, final aule aule, int n4) {
        final Object b = aule.b;
        final Object c = aule.c;
        final Object d = aule.d;
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
        final int n17 = n2 + n16;
        int j;
        for (n2 = (j = n3 - n16 - n15), n3 = n17; j > 0; --j, ++n14, ++n3) {
            array[n14] = byteBuffer.get(n3);
        }
        int k = 0;
        int n19 = 0;
        Label_0948: {
            if (n7 != 10 && n7 != 11) {
                int n18;
                if ((n18 = n7) != 21) {
                    k = n10;
                    n19 = n14;
                    if (n7 != 22) {
                        break Label_0948;
                    }
                    n18 = 22;
                }
                int n20 = n14 - n2;
                n3 = ((short[])aule.a)[n4];
                n3 = (n3 & 0x7FFF) + (16777216 - (n3 & 0x8000));
                n4 = n2;
                while (true) {
                    k = n10;
                    n19 = n14;
                    if (n4 <= 0) {
                        break;
                    }
                    n2 = (array[n20] & 0xFF);
                    Label_0777: {
                        int n21 = 0;
                        Label_0378: {
                            if (n2 < 128) {
                                n21 = n3 + n2;
                                array[n20] = (byte)(n21 & 0x7F);
                            }
                            else {
                                if (n2 >= 192) {
                                    if (n2 < 224) {
                                        if (n4 >= 2) {
                                            final int n22 = n20 + 1;
                                            final byte b2 = array[n22];
                                            n3 += ((b2 & 0x3F) | (n2 & 0x1F) << 6);
                                            array[n20] = (byte)((n3 >> 6 & 0x1F) | 0xC0);
                                            array[n22] = (byte)((b2 & 0xC0) | (n3 & 0x3F));
                                            n2 = 2;
                                            break Label_0777;
                                        }
                                    }
                                    else if (n2 < 240) {
                                        if (n4 >= 3) {
                                            final int n23 = n20 + 1;
                                            final byte b3 = array[n23];
                                            final int n24 = n20 + 2;
                                            final byte b4 = array[n24];
                                            n3 += ((b4 & 0x3F) | (b3 & 0x3F) << 6 | (n2 & 0xF) << 12);
                                            array[n20] = (byte)((n3 >> 12 & 0xF) | 0xE0);
                                            array[n23] = (byte)((b3 & 0xC0) | (n3 >> 6 & 0x3F));
                                            array[n24] = (byte)((b4 & 0xC0) | (n3 & 0x3F));
                                            n2 = 3;
                                            break Label_0777;
                                        }
                                    }
                                    else {
                                        n21 = n3;
                                        if (n2 >= 248) {
                                            break Label_0378;
                                        }
                                        if (n4 >= 4) {
                                            final int n25 = n20 + 1;
                                            final byte b5 = array[n25];
                                            final int n26 = n20 + 2;
                                            final byte b6 = array[n26];
                                            final int n27 = n20 + 3;
                                            final byte b7 = array[n27];
                                            n3 += ((b7 & 0x3F) | (b6 & 0x3F) << 6 | (b5 & 0x3F) << 12 | (n2 & 0x7) << 18);
                                            array[n20] = (byte)((n3 >> 18 & 0x7) | 0xF0);
                                            array[n25] = (byte)((b5 & 0xC0) | (n3 >> 12 & 0x3F));
                                            array[n26] = (byte)((b6 & 0xC0) | (n3 >> 6 & 0x3F));
                                            array[n27] = (byte)((b7 & 0xC0) | (n3 & 0x3F));
                                            n2 = 4;
                                            break Label_0777;
                                        }
                                    }
                                    n2 = n4;
                                    break Label_0777;
                                }
                                n21 = n3;
                            }
                        }
                        n2 = 1;
                        n3 = n21;
                    }
                    n20 += n2;
                    n4 -= n2;
                    if (n18 != 21) {
                        continue;
                    }
                    n4 = 0;
                }
            }
            else {
                n3 = n14 - n2;
                if (n7 == 10) {
                    n2 = 1;
                }
                while (true) {
                    k = n10;
                    n19 = n14;
                    if (n2 <= 0) {
                        break;
                    }
                    n4 = array[n3];
                    final int n28 = n4 & 0xFF;
                    if (n28 < 192) {
                        if (n28 >= 97 && n28 <= 122) {
                            array[n3] = (byte)(n4 ^ 0x20);
                        }
                        --n2;
                        ++n3;
                    }
                    else if (n28 < 224) {
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
            array[n19] = ((byte[])c)[k];
            ++n19;
            ++k;
        }
        return n19 - n;
    }
}
