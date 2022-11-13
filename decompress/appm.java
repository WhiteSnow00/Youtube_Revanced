import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appm extends ahbh implements ahcw
{
    public static final appm a;
    private static volatile ahdd i;
    public int b;
    public ahab c;
    public int d;
    public int e;
    public int f;
    public appm g;
    public ainb h;
    
    static {
        ahbh.registerDefaultInstance((Class)appm.class, (ahbh)(a = new appm()));
    }
    
    private appm() {
        this.c = ahab.b;
        this.e = -1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = appm.i) == null) {
                    synchronized (appm.class) {
                        if (appm.i == null) {
                            appm.i = (ahdd)new ahba((ahbh)appm.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return appm.a;
            }
            case 4: {
                return new ahaz((ahbh)appm.a);
            }
            case 3: {
                return new appm();
            }
            case 2: {
                return newMessageInfo((MessageLite)appm.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0006\u1004\u0003\u0007\u1009\u0004\b\u1009\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
