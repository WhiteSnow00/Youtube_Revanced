import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwa extends ahbh implements ahcw
{
    public static final akwa a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public ahbx d;
    public ahab e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)akwa.class, (ahbh)(a = new akwa()));
    }
    
    private akwa() {
        this.d = emptyProtobufList();
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akwa.f) == null) {
                    synchronized (akwa.class) {
                        if (akwa.f == null) {
                            akwa.f = (ahdd)new ahba((ahbh)akwa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akwa.a;
            }
            case 4: {
                return new ahaz((ahbh)akwa.a);
            }
            case 3: {
                return new akwa();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwa.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u001b\u0004\u100a\u0002", new Object[] { "g", "b", akjo.u, "c", "d", akvy.class, "e" });
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
