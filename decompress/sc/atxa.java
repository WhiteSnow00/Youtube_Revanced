import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxa extends ahbh implements ahcw
{
    public static final atxa a;
    private static volatile ahdd c;
    public ahbp b;
    
    static {
        ahbh.registerDefaultInstance((Class)atxa.class, (ahbh)(a = new atxa()));
    }
    
    private atxa() {
        this.b = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = atxa.c) == null) {
                    synchronized (atxa.class) {
                        if (atxa.c == null) {
                            atxa.c = (ahdd)new ahba((ahbh)atxa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return atxa.a;
            }
            case 4: {
                return new ahaz((ahbh)atxa.a);
            }
            case 3: {
                return new atxa();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxa.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "b", areg.e });
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
