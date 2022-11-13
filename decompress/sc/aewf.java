import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewf extends ahbh implements ahcw
{
    public static final aewf a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aewf.class, (ahbh)(a = new aewf()));
    }
    
    private aewf() {
        this.c = 5;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aewf.e) == null) {
                    synchronized (aewf.class) {
                        if (aewf.e == null) {
                            aewf.e = (ahdd)new ahba((ahbh)aewf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aewf.a;
            }
            case 4: {
                return new ahaz((ahbh)aewf.a);
            }
            case 3: {
                return new aewf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aewf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aeki.f, "d", aeki.g });
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
