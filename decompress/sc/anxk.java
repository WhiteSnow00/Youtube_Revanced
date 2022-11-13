import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxk extends ahbh implements ahcw
{
    public static final anxk a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public anxj d;
    
    static {
        ahbh.registerDefaultInstance((Class)anxk.class, (ahbh)(a = new anxk()));
    }
    
    private anxk() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anxk.e) == null) {
                    synchronized (anxk.class) {
                        if (anxk.e == null) {
                            anxk.e = (ahdd)new ahba((ahbh)anxk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anxk.a;
            }
            case 4: {
                return new ahaz((ahbh)anxk.a);
            }
            case 3: {
                return new anxk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
