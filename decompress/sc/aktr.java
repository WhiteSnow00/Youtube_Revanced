import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktr extends ahbh implements ahcw
{
    public static final aktr a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aktr.class, (ahbh)(a = new aktr()));
    }
    
    private aktr() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aktr.e) == null) {
                    synchronized (aktr.class) {
                        if (aktr.e == null) {
                            aktr.e = (ahdd)new ahba((ahbh)aktr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aktr.a;
            }
            case 4: {
                return new ahaz((ahbh)aktr.a);
            }
            case 3: {
                return new aktr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktr.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0000\u0003\u1007\u0001", new Object[] { "b", "c", "d" });
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
