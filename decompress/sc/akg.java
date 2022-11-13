// 
// Decompiled by Procyon v0.6.0
// 

final class akg implements akh
{
    static final akg a;
    static final akg b;
    private final int c;
    
    static {
        b = new akg(1);
        a = new akg(0);
    }
    
    private akg(final int c) {
        this.c = c;
    }
    
    public final int a(final CharSequence charSequence, final int n) {
        final int c = this.c;
        final int n2 = 0;
        if (c == 0) {
            int n3;
            int n4;
            for (n3 = 0, n4 = 2; n3 < n && n4 == 2; ++n3) {
                final byte directionality = Character.getDirectionality(charSequence.charAt(n3));
                Label_0166: {
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                default: {
                                    n4 = 2;
                                    continue;
                                }
                                case 16:
                                case 17: {
                                    break;
                                }
                                case 14:
                                case 15: {
                                    break Label_0166;
                                }
                            }
                        }
                        n4 = 0;
                        continue;
                    }
                }
                n4 = 1;
            }
            return n4;
        }
        int i = 0;
        boolean b = false;
        while (i < n) {
            final byte directionality2 = Character.getDirectionality(charSequence.charAt(i));
            Label_0065: {
                if (directionality2 != 0) {
                    int n5 = n2;
                    if (directionality2 != 1) {
                        n5 = n2;
                        if (directionality2 != 2) {
                            break Label_0065;
                        }
                    }
                    return n5;
                }
                b = true;
            }
            ++i;
        }
        if (b) {
            return 1;
        }
        return 2;
    }
}
