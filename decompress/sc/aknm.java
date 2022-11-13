import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknm extends ahbh implements ahcw
{
    public static final aknm a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)aknm.class, (ahbh)(a = new aknm()));
    }
    
    private aknm() {
        this.c = "";
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aknm.e) == null) {
                    synchronized (aknm.class) {
                        if (aknm.e == null) {
                            aknm.e = (ahdd)new ahba((ahbh)aknm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknm.a;
            }
            case 4: {
                return new ahaz((ahbh)aknm.a);
            }
            case 3: {
                return new aknm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
