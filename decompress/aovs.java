import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovs extends ahbh implements ahcw
{
    public static final aovs a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aovs.class, (ahbh)(a = new aovs()));
    }
    
    private aovs() {
        this.e = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aovs.b) == null) {
                    synchronized (aovs.class) {
                        if (aovs.b == null) {
                            aovs.b = (ahdd)new ahba((ahbh)aovs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovs.a;
            }
            case 4: {
                return new ahaz((ahbh)aovs.a);
            }
            case 3: {
                return new aovs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovs.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
