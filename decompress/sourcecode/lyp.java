// 
// Decompiled by Procyon v0.6.0
// 

public final class lyp
{
    public final boolean a;
    public final String b;
    public final bub c;
    public final int d;
    public final byte[] e;
    
    public lyp(final boolean a, final String b, int d, final byte[] array, final int n, final int n2, final byte[] e) {
        final int n3 = 0;
        final int n4 = 1;
        dk.f(d == 0 ^ e == null);
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        int n5;
        if (b == null) {
            n5 = n4;
        }
        else {
            Label_0186: {
                switch (b.hashCode()) {
                    case 3049895: {
                        if (b.equals("cens")) {
                            d = 1;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3049879: {
                        if (b.equals("cenc")) {
                            d = n3;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3046671: {
                        if (b.equals("cbcs")) {
                            d = 3;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3046605: {
                        if (b.equals("cbc1")) {
                            d = 2;
                            break Label_0186;
                        }
                        break;
                    }
                }
                d = -1;
            }
            n5 = n4;
            if (d != 0) {
                n5 = n4;
                if (d != 1) {
                    if (d != 2 && d != 3) {
                        final StringBuilder sb = new StringBuilder("Unsupported protection scheme type '");
                        sb.append(b);
                        sb.append("'. Assuming AES-CTR crypto mode.");
                        bao.c("TrackEncryptionBox", sb.toString());
                        n5 = n4;
                    }
                    else {
                        n5 = 2;
                    }
                }
            }
        }
        this.c = new bub(n5, array, n, n2);
    }
    
    public lyp(final boolean a, final String b, int d, final byte[] array, final int n, final int n2, final byte[] e, final byte[] array2) {
        final int n3 = 0;
        final int n4 = 1;
        dk.f(d == 0 ^ e == null);
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        int n5;
        if (b == null) {
            n5 = n4;
        }
        else {
            Label_0186: {
                switch (b.hashCode()) {
                    case 3049895: {
                        if (b.equals("cens")) {
                            d = 1;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3049879: {
                        if (b.equals("cenc")) {
                            d = n3;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3046671: {
                        if (b.equals("cbcs")) {
                            d = 3;
                            break Label_0186;
                        }
                        break;
                    }
                    case 3046605: {
                        if (b.equals("cbc1")) {
                            d = 2;
                            break Label_0186;
                        }
                        break;
                    }
                }
                d = -1;
            }
            n5 = n4;
            if (d != 0) {
                n5 = n4;
                if (d != 1) {
                    if (d != 2 && d != 3) {
                        final StringBuilder sb = new StringBuilder("Unsupported protection scheme type '");
                        sb.append(b);
                        sb.append("'. Assuming AES-CTR crypto mode.");
                        bao.c("TrackEncryptionBox", sb.toString());
                        n5 = n4;
                    }
                    else {
                        n5 = 2;
                    }
                }
            }
        }
        this.c = new bub(n5, array, n, n2);
    }
}
