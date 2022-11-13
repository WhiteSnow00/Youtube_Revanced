import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojt extends ahbh implements ahcw
{
    public static final aojt a;
    private static volatile ahdd i;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public ahbx g;
    public boolean h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aojt.class, (ahbh)(a = new aojt()));
    }
    
    private aojt() {
        this.k = 2;
        this.g = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aojt.i) == null) {
                    synchronized (aojt.class) {
                        if (aojt.i == null) {
                            aojt.i = (ahdd)new ahba((ahbh)aojt.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aojt.a;
            }
            case 4: {
                return new ahaz((ahbh)aojt.a);
            }
            case 3: {
                return new aojt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojt.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u041b\u0005\u1007\u0006\u0006\u1409\u0005\u0007\u1409\u0007", new Object[] { "b", "c", "d", "e", "g", anuv.class, "h", "f", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
