import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlw extends ahbh implements ahcw
{
    public static final aqlw a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahab d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlw.class, (ahbh)(a = new aqlw()));
    }
    
    private aqlw() {
        this.c = "";
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqlw.e) == null) {
                    synchronized (aqlw.class) {
                        if (aqlw.e == null) {
                            aqlw.e = (ahdd)new ahba((ahbh)aqlw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqlw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlw.a);
            }
            case 3: {
                return new aqlw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
