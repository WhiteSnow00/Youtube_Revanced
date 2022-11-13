import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihh extends ahbh implements ahcw
{
    public static final aihh a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aihh.class, (ahbh)(a = new aihh()));
    }
    
    private aihh() {
        this.i = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aihh.b) == null) {
                    synchronized (aihh.class) {
                        if (aihh.b == null) {
                            aihh.b = (ahdd)new ahba((ahbh)aihh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aihh.a;
            }
            case 4: {
                return new ahaz((ahbh)aihh.a);
            }
            case 3: {
                return new aihh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihh.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
