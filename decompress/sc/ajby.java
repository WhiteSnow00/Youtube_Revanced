import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajby extends ahbh implements ahcw
{
    public static final ajby a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajby.class, (ahbh)(a = new ajby()));
    }
    
    private ajby() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajby.e) == null) {
                    synchronized (ajby.class) {
                        if (ajby.e == null) {
                            ajby.e = (ahdd)new ahba((ahbh)ajby.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajby.a;
            }
            case 4: {
                return new ahaz((ahbh)ajby.a);
            }
            case 3: {
                return new ajby();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajby.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u100c\u0002", new Object[] { "b", "c", "d", ahga.o });
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
