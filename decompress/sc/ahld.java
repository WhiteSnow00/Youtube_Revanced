import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahld extends ahbh implements ahcw
{
    public static final ahld a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public float d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahld.class, (ahbh)(a = new ahld()));
    }
    
    private ahld() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahld.e) == null) {
                    synchronized (ahld.class) {
                        if (ahld.e == null) {
                            ahld.e = (ahdd)new ahba((ahbh)ahld.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahld.a;
            }
            case 4: {
                return new ahaz((ahbh)ahld.a);
            }
            case 3: {
                return new ahld();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahld.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "b", "c", ahjm.h, "d" });
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
