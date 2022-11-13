import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlu extends ahbh implements ahcw
{
    public static final amlu a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)amlu.class, (ahbh)(a = new amlu()));
    }
    
    private amlu() {
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
                if ((e = amlu.e) == null) {
                    synchronized (amlu.class) {
                        if (amlu.e == null) {
                            amlu.e = (ahdd)new ahba((ahbh)amlu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amlu.a;
            }
            case 4: {
                return new ahaz((float[][][])null, (int[][])null);
            }
            case 3: {
                return new amlu();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
