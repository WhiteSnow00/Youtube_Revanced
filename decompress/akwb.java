import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwb extends ahbh implements ahcw
{
    public static final akwb a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public apnr d;
    
    static {
        ahbh.registerDefaultInstance((Class)akwb.class, (ahbh)(a = new akwb()));
    }
    
    private akwb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akwb.e) == null) {
                    synchronized (akwb.class) {
                        if (akwb.e == null) {
                            akwb.e = (ahdd)new ahba((ahbh)akwb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akwb.a;
            }
            case 4: {
                return new ahaz((ahbh)akwb.a);
            }
            case 3: {
                return new akwb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", apta.a(), "d" });
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
