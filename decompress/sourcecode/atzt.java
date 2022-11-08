// 
// Decompiled by Procyon v0.6.0
// 

final class atzt
{
    static final int[] a;
    
    static {
        final int[] array = a = new int[2048];
        final int n = 0;
        for (int i = 0; i < 256; ++i) {
            array[i] = (i & 0x3F);
            array[i + 512] = i >> 2;
            array[i + 1792] = (i >> 6) + 2;
        }
        for (int j = 0; j < 128; ++j) {
            array[j + 1024] = ("         !!  !                  \"#$##%#$&'##(#)#++++++++++((&*'##,---,---,-----,-----,-----&#'###.///.///./////./////./////&#'# ".charAt(j) - ' ') * 4;
        }
        for (int k = 0; k < 64; ++k) {
            array[k + 1216] = (array[k + 1152] = (k & 0x1)) + 2;
        }
        int n2 = 1280;
        for (int l = 0; l < 19; ++l) {
            final char char1 = "A/*  ':  & : $  \u0081 @".charAt(l);
            for (int n3 = 0; n3 < char1 - ' '; ++n3, ++n2) {
                array[n2] = (l & 0x3);
            }
        }
        for (int n4 = 0; n4 < 16; ++n4) {
            array[n4 + 1792] = 1;
            array[n4 + 2032] = 6;
        }
        array[1792] = 0;
        array[2047] = 7;
        for (int n5 = n; n5 < 256; ++n5) {
            array[n5 + 1536] = array[n5 + 1792] << 3;
        }
    }
}
