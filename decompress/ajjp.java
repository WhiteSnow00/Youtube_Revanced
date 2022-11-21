import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjp extends ahcz implements aheo
{
    public static final ajjp a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(ajjp.class, a = new ajjp());
    }
    
    private ajjp() {
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
                if ((e = ajjp.e) == null) {
                    synchronized (ajjp.class) {
                        if (ajjp.e == null) {
                            ajjp.e = (ahev)new ahcs((ahcz)ajjp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajjp.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjp.a);
            }
            case 3: {
                return new ajjp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ajjo.a(), "d", ajgj.n });
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
