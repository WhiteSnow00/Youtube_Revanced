import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnr extends ahbh implements ahcw
{
    public static final apnr a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)apnr.class, (ahbh)(a = new apnr()));
    }
    
    private apnr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = apnr.e) == null) {
                    synchronized (apnr.class) {
                        if (apnr.e == null) {
                            apnr.e = (ahdd)new ahba((ahbh)apnr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apnr.a;
            }
            case 4: {
                return new ahaz((ahbh)apnr.a);
            }
            case 3: {
                return new apnr();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
