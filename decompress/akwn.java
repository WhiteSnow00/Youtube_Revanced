import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwn extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final akwn b;
    private static volatile ahdd e;
    public ahbp c;
    public String d;
    private int f;
    
    static {
        a = (ahbq)new ptj(20);
        ahbh.registerDefaultInstance((Class)akwn.class, (ahbh)(b = new akwn()));
    }
    
    private akwn() {
        this.c = emptyIntList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akwn.e) == null) {
                    synchronized (akwn.class) {
                        if (akwn.e == null) {
                            akwn.e = (ahdd)new ahba((ahbh)akwn.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akwn.b;
            }
            case 4: {
                return new ahaz((boolean[][])null, (float[][])null);
            }
            case 3: {
                return new akwn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwn.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001e", new Object[] { "f", "d", "c", amvb.a() });
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
