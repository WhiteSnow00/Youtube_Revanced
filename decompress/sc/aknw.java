import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknw extends ahbh implements ahcw
{
    public static final aknw a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public String d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aknw.class, (ahbh)(a = new aknw()));
    }
    
    private aknw() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aknw.e) == null) {
                    synchronized (aknw.class) {
                        if (aknw.e == null) {
                            aknw.e = (ahdd)new ahba((ahbh)aknw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknw.a;
            }
            case 4: {
                return new ahaz((ahbh)aknw.a);
            }
            case 3: {
                return new aknw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u001b\u0004\u1008\u0001", new Object[] { "f", "b", "c", aknx.class, "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
