import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfs extends ahbh implements ahcw
{
    public static final akfs a;
    private static volatile ahdd d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)akfs.class, (ahbh)(a = new akfs()));
    }
    
    private akfs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akfs.d) == null) {
                    synchronized (akfs.class) {
                        if (akfs.d == null) {
                            akfs.d = (ahdd)new ahba((ahbh)akfs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akfs.a;
            }
            case 4: {
                return new ahaz((ahbh)akfs.a);
            }
            case 3: {
                return new akfs();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
