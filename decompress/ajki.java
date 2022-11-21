import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajki extends ahcz implements aheo
{
    public static final ajki a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(ajki.class, a = new ajki());
    }
    
    private ajki() {
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
                if ((d = ajki.d) == null) {
                    synchronized (ajki.class) {
                        if (ajki.d == null) {
                            ajki.d = (ahev)new ahcs((ahcz)ajki.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajki.a;
            }
            case 4: {
                return new ahcr((ahcz)ajki.a);
            }
            case 3: {
                return new ajki();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajki.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
