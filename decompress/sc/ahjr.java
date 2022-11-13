import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjr extends ahbh implements ahcw
{
    public static final ahjr a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ahab d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjr.class, (ahbh)(a = new ahjr()));
    }
    
    private ahjr() {
        this.f = 2;
        this.d = ahab.b;
        emptyProtobufList();
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
                if ((e = ahjr.e) == null) {
                    synchronized (ahjr.class) {
                        if (ahjr.e == null) {
                            ahjr.e = (ahdd)new ahba((ahbh)ahjr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjr.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjr.a);
            }
            case 3: {
                return new ahjr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
