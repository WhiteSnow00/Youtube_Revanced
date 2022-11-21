import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkc extends ahcz implements aheo
{
    public static final ajkc a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(ajkc.class, a = new ajkc());
    }
    
    private ajkc() {
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
                if ((d = ajkc.d) == null) {
                    synchronized (ajkc.class) {
                        if (ajkc.d == null) {
                            ajkc.d = (ahev)new ahcs((ahcz)ajkc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajkc.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkc.a);
            }
            case 3: {
                return new ajkc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkc.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0000", new Object[] { "b", "c" });
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
