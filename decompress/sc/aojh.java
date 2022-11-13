import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojh extends ahbh implements ahcw
{
    public static final aojh a;
    private static volatile ahdd e;
    public int b;
    public anuv c;
    public aiqj d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aojh.class, (ahbh)(a = new aojh()));
    }
    
    private aojh() {
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
                final ahdd e;
                if ((e = aojh.e) == null) {
                    synchronized (aojh.class) {
                        if (aojh.e == null) {
                            aojh.e = (ahdd)new ahba((ahbh)aojh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aojh.a;
            }
            case 4: {
                return new ahaz((ahbh)aojh.a);
            }
            case 3: {
                return new aojh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
