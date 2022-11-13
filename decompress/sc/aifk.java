import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifk extends ahbh implements ahcw
{
    public static final aifk a;
    private static volatile ahdd e;
    public int b;
    public aiqj c;
    public ajut d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aifk.class, (ahbh)(a = new aifk()));
    }
    
    private aifk() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aifk.e) == null) {
                    synchronized (aifk.class) {
                        if (aifk.e == null) {
                            aifk.e = (ahdd)new ahba((ahbh)aifk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aifk.a;
            }
            case 4: {
                return new ahaz((ahbh)aifk.a);
            }
            case 3: {
                return new aifk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifk.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
