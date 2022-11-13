import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqc extends ahbh implements ahcw
{
    public static final apqc a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private anuv e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)apqc.class, (ahbh)(a = new apqc()));
    }
    
    private apqc() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqc.b) == null) {
                    synchronized (apqc.class) {
                        if (apqc.b == null) {
                            apqc.b = (ahdd)new ahba((ahbh)apqc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqc.a;
            }
            case 4: {
                return new ahaz((ahbh)apqc.a);
            }
            case 3: {
                return new apqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
