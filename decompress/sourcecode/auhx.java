// 
// Decompiled by Procyon v0.6.0
// 

abstract class auhx implements auio, auim
{
    protected final auey a;
    protected final int b;
    protected final boolean c;
    
    public auhx(final auey a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        return this.b;
    }
    
    public int c(final auii auii, final CharSequence charSequence, int n) {
        int n2 = Math.min(this.b, charSequence.length() - n);
        final int n3 = 0;
        int n4 = 0;
        boolean b = false;
        boolean b2 = false;
        int n5 = 0;
        boolean b3 = false;
        boolean b4 = false;
        Label_0278: {
        Label_0094_Outer:
            while (true) {
                n5 = n4;
                if (n4 >= n2) {
                    break;
                }
                final char char1 = charSequence.charAt(n + n4);
                int n6 = n4;
                int n7 = char1;
                Label_0236: {
                    if (n4 == 0) {
                        int n8 = 0;
                        while (true) {
                            Label_0100: {
                                if ((n8 = char1) == 45) {
                                    break Label_0100;
                                }
                                if ((n7 = char1) == 43) {
                                    n8 = 43;
                                    break Label_0100;
                                }
                                n6 = 0;
                                break Label_0236;
                            }
                            n7 = n8;
                            if (!this.c) {
                                continue;
                            }
                            break;
                        }
                        b = (n8 == 45);
                        b2 = (n8 == 43);
                        n5 = n3;
                        b3 = b;
                        b4 = b2;
                        if (n2 <= 1) {
                            break Label_0278;
                        }
                        final char char2 = charSequence.charAt(n + 1);
                        n5 = n3;
                        b3 = b;
                        b4 = b2;
                        if (char2 < '0') {
                            break Label_0278;
                        }
                        if (char2 > '9') {
                            n5 = n3;
                            b3 = b;
                            b4 = b2;
                            break Label_0278;
                        }
                        n2 = Math.min(n2 + 1, charSequence.length() - n);
                        n4 = 1;
                        continue Label_0094_Outer;
                    }
                }
                n5 = n6;
                if (n7 < 48) {
                    break;
                }
                if (n7 > 57) {
                    n5 = n6;
                    break;
                }
                n4 = n6 + 1;
            }
            b4 = b2;
            b3 = b;
        }
        if (n5 == 0) {
            return ~n;
        }
        Label_0463: {
            int n10;
            if (n5 >= 9) {
                if (b4) {
                    final int n9 = n5 + n;
                    n = Integer.parseInt(charSequence.subSequence(n + 1, n9).toString());
                    break Label_0463;
                }
                final int n9 = n5 + n;
                n = Integer.parseInt(charSequence.subSequence(n, n9).toString());
                break Label_0463;
            }
            else if (!b3 && !b4) {
                n10 = n;
            }
            else {
                n10 = n + 1;
            }
            final int n11 = n10 + 1;
            try {
                final int n12 = charSequence.charAt(n10) - '0';
                final int n13 = n5 + n;
                int i = n11;
                n = n12;
                while (i < n13) {
                    n = (n << 3) + (n + n) + charSequence.charAt(i) - 48;
                    ++i;
                }
                int n9;
                if (b3) {
                    n = -n;
                    n9 = n13;
                }
                else {
                    n9 = n13;
                }
                auii.d(this.a, n);
                return n9;
            }
            catch (final StringIndexOutOfBoundsException ex) {
                return ~n;
            }
        }
    }
}
