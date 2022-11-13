import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgu extends ahbh implements ahcw
{
    public static final ahgu a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahgu.class, (ahbh)(a = new ahgu()));
    }
    
    private ahgu() {
        this.b = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx b = this.b;
        if (!b.c()) {
            this.b = ahbh.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahgu.c) == null) {
                    synchronized (ahgu.class) {
                        if (ahgu.c == null) {
                            ahgu.c = (ahdd)new ahba((ahbh)ahgu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahgu.a;
            }
            case 4: {
                return new ahaz((byte[])null, (short[][][])null);
            }
            case 3: {
                return new ahgu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahgu.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahgt.class });
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
