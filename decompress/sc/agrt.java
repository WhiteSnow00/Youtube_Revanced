import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrt extends ahbh implements ahcw
{
    public static final agrt a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)agrt.class, (ahbh)(a = new agrt()));
    }
    
    private agrt() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agrt.b) == null) {
                    synchronized (agrt.class) {
                        if (agrt.b == null) {
                            agrt.b = (ahdd)new ahba((ahbh)agrt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agrt.a;
            }
            case 4: {
                return new ahaz((ahbh)agrt.a);
            }
            case 3: {
                return new agrt();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1504\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
