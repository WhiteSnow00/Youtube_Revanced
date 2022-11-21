import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlc extends ahcz implements aheo
{
    public static final ahlc a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(ahlc.class, a = new ahlc());
    }
    
    private ahlc() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahlc.e) == null) {
                    synchronized (ahlc.class) {
                        if (ahlc.e == null) {
                            ahlc.e = (ahev)new ahcs((ahcz)ahlc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlc.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlc.a);
            }
            case 3: {
                return new ahlc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ahhs.u, "d", ahhs.t });
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
