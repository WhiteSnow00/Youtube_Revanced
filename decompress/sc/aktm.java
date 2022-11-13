import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktm extends ahbh implements ahcw
{
    public static final aktm a;
    private static volatile ahdd h;
    public int b;
    public akli c;
    public aiqj d;
    public akug e;
    public ahbx f;
    public ahab g;
    private ajut i;
    private ajut j;
    private aiqj k;
    private anuv l;
    private ajvo m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)aktm.class, (ahbh)(a = new aktm()));
    }
    
    private aktm() {
        this.o = 2;
        this.f = emptyProtobufList();
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aktm.h) == null) {
                    synchronized (aktm.class) {
                        if (aktm.h == null) {
                            aktm.h = (ahdd)new ahba((ahbh)aktm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aktm.a;
            }
            case 4: {
                return new ahaz((ahbh)aktm.a);
            }
            case 3: {
                return new aktm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktm.a, "\u0001\u000b\u0000\u0001\u0001\u0309\u000b\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0006\u1409\u0003\u0007\u1009\u0005\b\u1409\u0004\t\u1409\b\n\u100a\t\u000b\u1409\u0006\u0309\u1409\u0007", new Object[] { "b", "c", "i", "j", "f", akuh.class, "d", "e", "k", "n", "g", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
