import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjh extends ahcz implements aheo
{
    public static final amjh a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(amjh.class, a = new amjh());
    }
    
    private amjh() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amjh.d) == null) {
                    synchronized (amjh.class) {
                        if (amjh.d == null) {
                            amjh.d = (ahev)new ahcs((ahcz)amjh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjh.a;
            }
            case 4: {
                return new ahcr((ahcz)amjh.a);
            }
            case 3: {
                return new amjh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjh.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u1036\u0000", new Object[] { "c", "b" });
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
