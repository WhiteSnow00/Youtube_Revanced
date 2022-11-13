import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsr extends ahbh implements ahcw
{
    public static final apsr a;
    private static volatile ahdd g;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public aida f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)apsr.class, (ahbh)(a = new apsr()));
    }
    
    private apsr() {
        this.i = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = apsr.g) == null) {
                    synchronized (apsr.class) {
                        if (apsr.g == null) {
                            apsr.g = (ahdd)new ahba((ahbh)apsr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apsr.a;
            }
            case 4: {
                return new ahaz((ahbh)apsr.a);
            }
            case 3: {
                return new apsr();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
