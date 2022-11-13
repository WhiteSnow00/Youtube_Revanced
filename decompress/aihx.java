import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihx extends ahbh implements ahcw
{
    public static final aihx a;
    private static volatile ahdd b;
    private int c;
    private aome d;
    private aicz e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aihx.class, (ahbh)(a = new aihx()));
    }
    
    private aihx() {
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
                final ahdd b;
                if ((b = aihx.b) == null) {
                    synchronized (aihx.class) {
                        if (aihx.b == null) {
                            aihx.b = (ahdd)new ahba((ahbh)aihx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aihx.a;
            }
            case 4: {
                return new ahaz((ahbh)aihx.a);
            }
            case 3: {
                return new aihx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihx.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0000\ueb11\u1f11\u1409\u0001", new Object[] { "c", "d", "e" });
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
