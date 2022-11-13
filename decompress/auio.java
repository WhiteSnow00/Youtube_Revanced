// 
// Decompiled by Procyon v0.6.0
// 

abstract class auio implements aujf, aujd
{
    protected final aufp a;
    protected final int b;
    protected final boolean c;
    
    public auio(final aufp a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        return this.b;
    }
    
    public int c(final auiz auiz, final CharSequence charSequence, int n) {
        int n2 = Math.min(this.b, charSequence.length() - n);
        final int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        boolean b = false;
        int n11 = 0;
        Label_0257: {
            int n6 = 0;
            Label_0253: {
                boolean b2 = false;
            Label_0094_Outer:
                while (true) {
                    n6 = n4;
                    if (n4 >= n2) {
                        break Label_0253;
                    }
                    final char char1 = charSequence.charAt(n + n4);
                    int n7 = n4;
                    int n8 = char1;
                    Label_0219: {
                        if (n4 == 0) {
                            int n9 = 0;
                            while (true) {
                                Label_0104: {
                                    if ((n9 = char1) == 45) {
                                        break Label_0104;
                                    }
                                    final int n10;
                                    if ((n10 = char1) == 43) {
                                        n9 = 43;
                                        break Label_0104;
                                    }
                                    n7 = 0;
                                    n8 = n10;
                                    break Label_0219;
                                }
                                int n10 = n9;
                                if (!this.c) {
                                    continue;
                                }
                                break;
                            }
                            b2 = (n9 == 45);
                            b = (n9 == 43);
                            if (n2 <= 1) {
                                break;
                            }
                            final char char2 = charSequence.charAt(n + 1);
                            if (char2 < '0') {
                                break;
                            }
                            if (char2 > '9') {
                                break;
                            }
                            n2 = Math.min(n2 + 1, charSequence.length() - n);
                            n5 = (b2 ? 1 : 0);
                            n4 = 1;
                            continue Label_0094_Outer;
                        }
                    }
                    n6 = n7;
                    if (n8 < 48) {
                        break Label_0253;
                    }
                    if (n8 > 57) {
                        n6 = n7;
                        break Label_0253;
                    }
                    n4 = n7 + 1;
                }
                n5 = (b2 ? 1 : 0);
                n11 = n3;
                break Label_0257;
            }
            n11 = n6;
        }
        if (n11 == 0) {
            return ~n;
        }
        Label_0442: {
            int n13;
            if (n11 >= 9) {
                if (b) {
                    final int n12 = n + n11;
                    n = Integer.parseInt(charSequence.subSequence(n + 1, n12).toString());
                    break Label_0442;
                }
                final int n12 = n + n11;
                n = Integer.parseInt(charSequence.subSequence(n, n12).toString());
                break Label_0442;
            }
            else if (n5 == 0 && !b) {
                n13 = n;
            }
            else {
                n13 = n + 1;
            }
            final int n14 = n13 + 1;
            try {
                final int n15 = charSequence.charAt(n13) - '0';
                final int n16 = n + n11;
                int i = n14;
                n = n15;
                while (i < n16) {
                    n = (n << 3) + (n + n) + charSequence.charAt(i) - 48;
                    ++i;
                }
                int n12;
                if (n5 != 0) {
                    n = -n;
                    n12 = n16;
                }
                else {
                    n12 = n16;
                }
                auiz.d(this.a, n);
                return n12;
            }
            catch (final StringIndexOutOfBoundsException ex) {
                return ~n;
            }
        }
    }
}
