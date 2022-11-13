import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowh extends ahbh implements ahcw
{
    public static final aowh a;
    private static volatile ahdd d;
    public albh b;
    public aowb c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aowh.class, (ahbh)(a = new aowh()));
    }
    
    private aowh() {
        this.f = 2;
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
                final ahdd d;
                if ((d = aowh.d) == null) {
                    synchronized (aowh.class) {
                        if (aowh.d == null) {
                            aowh.d = (ahdd)new ahba((ahbh)aowh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aowh.a;
            }
            case 4: {
                return new ahaz((ahbh)aowh.a);
            }
            case 3: {
                return new aowh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowh.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003\u1409\u0000\u0004\u1009\u0001", new Object[] { "e", "b", "c" });
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
