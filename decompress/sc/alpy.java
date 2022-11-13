import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpy extends ahbh implements ahcw
{
    public static final alpy a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)alpy.class, (ahbh)(a = new alpy()));
    }
    
    private alpy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = alpy.e) == null) {
                    synchronized (alpy.class) {
                        if (alpy.e == null) {
                            alpy.e = (ahdd)new ahba((ahbh)alpy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alpy.a;
            }
            case 4: {
                return new ahaz((ahbh)alpy.a);
            }
            case 3: {
                return new alpy();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", alnf.j, "d", alnf.k });
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
