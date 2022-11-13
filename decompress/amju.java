import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amju extends ahbh implements ahcw
{
    public static final amju a;
    private static volatile ahdd m;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public akdi f;
    public boolean g;
    public aiqj h;
    public aiqj i;
    public ahbx j;
    public long k;
    public long l;
    private amjv n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)amju.class, (ahbh)(a = new amju()));
    }
    
    private amju() {
        this.o = 2;
        this.j = emptyProtobufList();
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
                final ahdd m;
                if ((m = amju.m) == null) {
                    synchronized (amju.class) {
                        if (amju.m == null) {
                            amju.m = (ahdd)new ahba((ahbh)amju.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amju.a;
            }
            case 4: {
                return new ahaz((ahbh)amju.a);
            }
            case 3: {
                return new amju();
            }
            case 2: {
                return newMessageInfo((MessageLite)amju.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1007\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\t\u001b\u000b\u1003\n\f\u1003\u000b\r\u1409\u0002", new Object[] { "b", "c", "d", "f", "g", "h", "i", "n", "j", amki.class, "k", "l", "e" });
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
