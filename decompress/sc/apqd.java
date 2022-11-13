import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqd extends ahbh implements ahcw
{
    public static final apqd a;
    private static volatile ahdd e;
    public apqe b;
    public ahab c;
    public boolean d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)apqd.class, (ahbh)(a = new apqd()));
    }
    
    private apqd() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = apqd.e) == null) {
                    synchronized (apqd.class) {
                        if (apqd.e == null) {
                            apqd.e = (ahdd)new ahba((ahbh)apqd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apqd.a;
            }
            case 4: {
                return new ahaz((ahbh)apqd.a);
            }
            case 3: {
                return new apqd();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u1007\u0002", new Object[] { "f", "b", "c", "d" });
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
