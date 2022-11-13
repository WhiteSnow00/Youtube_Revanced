import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyx extends ahbh implements ahcw
{
    public static final atyx a;
    private static volatile ahdd d;
    public ahbp b;
    public ahbp c;
    
    static {
        ahbh.registerDefaultInstance((Class)atyx.class, (ahbh)(a = new atyx()));
    }
    
    private atyx() {
        this.b = emptyIntList();
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atyx.d) == null) {
                    synchronized (atyx.class) {
                        if (atyx.d == null) {
                            atyx.d = (ahdd)new ahba((ahbh)atyx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atyx.a;
            }
            case 4: {
                return new ahaz((int[][])null, (char[])null);
            }
            case 3: {
                return new atyx();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyx.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[] { "b", "c" });
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
