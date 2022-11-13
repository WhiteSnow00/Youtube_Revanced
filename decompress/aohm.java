import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohm extends ahbh implements ahcw
{
    public static final aohm a;
    private static volatile ahdd e;
    public ahbx b;
    public ahab c;
    public int d;
    private int f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aohm.class, (ahbh)(a = new aohm()));
    }
    
    private aohm() {
        this.h = 2;
        this.b = emptyProtobufList();
        this.c = ahab.b;
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
                final ahdd e;
                if ((e = aohm.e) == null) {
                    synchronized (aohm.class) {
                        if (aohm.e == null) {
                            aohm.e = (ahdd)new ahba((ahbh)aohm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aohm.a;
            }
            case 4: {
                return new ahaz((ahbh)aohm.a);
            }
            case 3: {
                return new aohm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohm.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100a\u0001\u0004\u100c\u0002", new Object[] { "f", "b", ajut.class, "g", "c", "d", aoet.k });
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
