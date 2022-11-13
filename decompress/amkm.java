import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkm extends ahbh implements ahcw
{
    public static final amkm a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public long d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)amkm.class, (ahbh)(a = new amkm()));
    }
    
    private amkm() {
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
                final ahdd f;
                if ((f = amkm.f) == null) {
                    synchronized (amkm.class) {
                        if (amkm.f == null) {
                            amkm.f = (ahdd)new ahba((ahbh)amkm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amkm.a;
            }
            case 4: {
                return new ahaz((ahbh)amkm.a);
            }
            case 3: {
                return new amkm();
            }
            case 2: {
                return newMessageInfo((MessageLite)amkm.a, "\u0001\u0003\u0000\u000114\u0003\u0000\u0000\u00001\u1008\u00003\u1002\u00014\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
