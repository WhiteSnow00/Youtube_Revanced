import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkx extends ahbh implements ahcw
{
    public static final amkx a;
    private static volatile ahdd k;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public aiqj f;
    public amkw g;
    public amkv h;
    public ajut i;
    public ahab j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)amkx.class, (ahbh)(a = new amkx()));
    }
    
    private amkx() {
        this.m = 2;
        emptyProtobufList();
        this.j = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = amkx.k) == null) {
                    synchronized (amkx.class) {
                        if (amkx.k == null) {
                            amkx.k = (ahdd)new ahba((ahbh)amkx.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amkx.a;
            }
            case 4: {
                return new ahaz((ahbh)amkx.a);
            }
            case 3: {
                return new amkx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkx.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\b\u0006\u1409\t\u0007\u1409\u0004\b\u1409\u0005\n\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "j", "l", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
