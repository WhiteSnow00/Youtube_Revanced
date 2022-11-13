import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anch extends ahbh implements ahcw
{
    private static final ahbq a;
    private static final anch b;
    private static volatile ahdd c;
    private ahbp d;
    
    static {
        a = (ahbq)new alvv(6);
        ahbh.registerDefaultInstance((Class)anch.class, (ahbh)(b = new anch()));
    }
    
    private anch() {
        this.d = emptyIntList();
    }
    
    public static anch a() {
        return anch.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anch.c) == null) {
                    synchronized (anch.class) {
                        if (anch.c == null) {
                            anch.c = (ahdd)new ahba((ahbh)anch.b);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anch.b;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new anch();
            }
            case 2: {
                return newMessageInfo((MessageLite)anch.b, "\u0001\u0000", (Object[])null);
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
