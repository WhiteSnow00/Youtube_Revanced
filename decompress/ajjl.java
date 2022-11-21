import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjl extends ahcz implements aheo
{
    public static final ajjl a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(ajjl.class, a = new ajjl());
    }
    
    private ajjl() {
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
                if ((d = ajjl.d) == null) {
                    synchronized (ajjl.class) {
                        if (ajjl.d == null) {
                            ajjl.d = (ahev)new ahcs((ahcz)ajjl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajjl.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjl.a);
            }
            case 3: {
                return new ajjl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ajgj.l });
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
