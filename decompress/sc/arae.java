import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arae extends ahbh implements ahcw
{
    public static final arae a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)arae.class, (ahbh)(a = new arae()));
    }
    
    private arae() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = arae.e) == null) {
                    synchronized (arae.class) {
                        if (arae.e == null) {
                            arae.e = (ahdd)new ahba((ahbh)arae.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arae.a;
            }
            case 4: {
                return new ahaz((short[])null, (boolean[])null);
            }
            case 3: {
                return new arae();
            }
            case 2: {
                return newMessageInfo((MessageLite)arae.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
