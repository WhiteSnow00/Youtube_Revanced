import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoin extends ahbh implements ahcw
{
    public static final aoin a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public aoie d;
    public aoie e;
    private ajut g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aoin.class, (ahbh)(a = new aoin()));
    }
    
    private aoin() {
        this.i = 2;
        this.c = emptyProtobufList();
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
                final ahdd f;
                if ((f = aoin.f) == null) {
                    synchronized (aoin.class) {
                        if (aoin.f == null) {
                            aoin.f = (ahdd)new ahba((ahbh)aoin.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoin.a;
            }
            case 4: {
                return new ahaz((int[])null, (boolean[][])null);
            }
            case 3: {
                return new aoin();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoin.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", aoid.class, "d", "e", "g", "h" });
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
