import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktv extends ahbh implements ahcw
{
    public static final aktv a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aktv.class, (ahbh)(a = new aktv()));
    }
    
    private aktv() {
        this.c = "";
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aktv.e) == null) {
                    synchronized (aktv.class) {
                        if (aktv.e == null) {
                            aktv.e = (ahdd)new ahba((ahbh)aktv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aktv.a;
            }
            case 4: {
                return new ahaz((ahbh)aktv.a);
            }
            case 3: {
                return new aktv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aldq.a });
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
