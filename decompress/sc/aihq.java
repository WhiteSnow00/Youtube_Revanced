import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihq extends ahbh implements ahcw
{
    public static final aihq a;
    private static volatile ahdd g;
    public int b;
    public aidi c;
    public aicz d;
    public aona e;
    public aomw f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aihq.class, (ahbh)(a = new aihq()));
    }
    
    private aihq() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aihq.g) == null) {
                    synchronized (aihq.class) {
                        if (aihq.g == null) {
                            aihq.g = (ahdd)new ahba((ahbh)aihq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aihq.a;
            }
            case 4: {
                return new ahaz((ahbh)aihq.a);
            }
            case 3: {
                return new aihq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihq.a, "\u0001\u0004\u0000\u0001\ueb11\u1f11\ufeb7\u40e2\u0004\u0000\u0000\u0004\ueb11\u1f11\u1409\u0001\ue5d8\u2622\u1409\u0000\ue1ae\u38da\u1409\u0002\ufeb7\u40e2\u1409\u0003", new Object[] { "b", "d", "c", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
