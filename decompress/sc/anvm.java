import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvm extends ahbh implements ahcw
{
    public static final anvm a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private anuv f;
    private anuv g;
    private anuv h;
    private anuv i;
    private anuv j;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anvm.class, (ahbh)(a = new anvm()));
    }
    
    private anvm() {
        this.l = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anvm.b) == null) {
                    synchronized (anvm.class) {
                        if (anvm.b == null) {
                            anvm.b = (ahdd)new ahba((ahbh)anvm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvm.a;
            }
            case 4: {
                return new ahaz((ahbh)anvm.a);
            }
            case 3: {
                return new anvm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvm.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\t\u1409\b\n\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
