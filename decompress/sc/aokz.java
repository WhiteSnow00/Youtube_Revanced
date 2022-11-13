import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokz extends ahbh implements ahcw
{
    public static final aokz a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aokz.class, (ahbh)(a = new aokz()));
    }
    
    private aokz() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aokz.c) == null) {
                    synchronized (aokz.class) {
                        if (aokz.c == null) {
                            aokz.c = (ahdd)new ahba((ahbh)aokz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aokz.a;
            }
            case 4: {
                return new ahaz((ahbh)aokz.a);
            }
            case 3: {
                return new aokz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anuv.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
