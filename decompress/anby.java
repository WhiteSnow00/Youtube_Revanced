import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anby extends ahbh implements ahcw
{
    public static final anby a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)anby.class, (ahbh)(a = new anby()));
    }
    
    private anby() {
        ahbh.emptyProtobufList();
        this.b = ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anby.c) == null) {
                    synchronized (anby.class) {
                        if (anby.c == null) {
                            anby.c = (ahdd)new ahba((ahbh)anby.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anby.a;
            }
            case 4: {
                return new ahaz((ahbh)anby.a);
            }
            case 3: {
                return new anby();
            }
            case 2: {
                return newMessageInfo((MessageLite)anby.a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001a", new Object[] { "b" });
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
