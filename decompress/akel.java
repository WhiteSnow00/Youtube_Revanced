import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akel extends ahbh implements ahcw
{
    public static final akel a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiao e;
    private aiqj f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akel.class, (ahbh)(a = new akel()));
    }
    
    private akel() {
        this.h = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = akel.b) == null) {
                    synchronized (akel.class) {
                        if (akel.b == null) {
                            akel.b = (ahdd)new ahba((ahbh)akel.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akel.a;
            }
            case 4: {
                return new ahaz((ahbh)akel.a);
            }
            case 3: {
                return new akel();
            }
            case 2: {
                return newMessageInfo((MessageLite)akel.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
