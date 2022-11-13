import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoj extends ahbh implements ahcw
{
    public static final apoj a;
    private static volatile ahdd b;
    private int c;
    private apol d;
    private ajut e;
    private ajut f;
    private aqdy g;
    private apok h;
    private apom i;
    private ajut j;
    private ajut k;
    private aiqj l;
    private aiqj m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)apoj.class, (ahbh)(a = new apoj()));
    }
    
    private apoj() {
        this.o = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apoj.b) == null) {
                    synchronized (apoj.class) {
                        if (apoj.b == null) {
                            apoj.b = (ahdd)new ahba((ahbh)apoj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoj.a;
            }
            case 4: {
                return new ahaz((ahbh)apoj.a);
            }
            case 3: {
                return new apoj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoj.a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\r\f\u1409\n\u000e\u1409\u000b\u000f\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "n", "l", "m", "g" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
