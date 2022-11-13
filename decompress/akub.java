import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akub extends ahbh implements ahcw
{
    public static final akub a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)akub.class, (ahbh)(a = new akub()));
    }
    
    private akub() {
        this.b = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akub.c) == null) {
                    synchronized (akub.class) {
                        if (akub.c == null) {
                            akub.c = (ahdd)new ahba((ahbh)akub.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akub.a;
            }
            case 4: {
                return new ahaz((char[][])null, (float[])null);
            }
            case 3: {
                return new akub();
            }
            case 2: {
                return newMessageInfo((MessageLite)akub.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
