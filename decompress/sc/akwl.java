import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwl extends ahbh implements ahcw
{
    public static final akwl a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)akwl.class, (ahbh)(a = new akwl()));
    }
    
    private akwl() {
        this.c = "";
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akwl.e) == null) {
                    synchronized (akwl.class) {
                        if (akwl.e == null) {
                            akwl.e = (ahdd)new ahba((ahbh)akwl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akwl.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (short[][][])null);
            }
            case 3: {
                return new akwl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", akwh.class });
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
