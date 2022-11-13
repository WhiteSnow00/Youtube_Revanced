import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihm extends ahbh implements ahcw
{
    public static final aihm a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public ajut d;
    public int e;
    public ajut f;
    public String g;
    public ajut h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aihm.class, (ahbh)(a = new aihm()));
    }
    
    private aihm() {
        this.j = 2;
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aihm.i) == null) {
                    synchronized (aihm.class) {
                        if (aihm.i == null) {
                            aihm.i = (ahdd)new ahba((ahbh)aihm.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aihm.a;
            }
            case 4: {
                return new ahaz((ahbh)aihm.a);
            }
            case 3: {
                return new aihm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u1004\u0002\u0004\u1409\u0003\u0005\u1008\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
