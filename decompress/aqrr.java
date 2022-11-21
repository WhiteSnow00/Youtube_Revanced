import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrr extends ahcz implements aheo
{
    public static final aqrr a;
    private static volatile ahev c;
    public ahdk b;
    
    static {
        ahcz.registerDefaultInstance(aqrr.class, a = new aqrr());
    }
    
    private aqrr() {
        this.b = ahcz.emptyLongList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqrr.c) == null) {
                    synchronized (aqrr.class) {
                        if (aqrr.c == null) {
                            aqrr.c = (ahev)new ahcs((ahcz)aqrr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrr.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (boolean[])null);
            }
            case 3: {
                return new aqrr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrr.a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u0014", new Object[] { "b" });
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
