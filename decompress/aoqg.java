import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqg extends ahcz implements aheo
{
    public static final aoqg a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        final aoqg a2 = new aoqg();
        ahcz.registerDefaultInstance(aoqg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aoqh.a, a2, (MessageLite)a2, null, 272544428, ahgc.k, aoqg.class);
    }
    
    private aoqg() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aoqg.g) == null) {
                    synchronized (aoqg.class) {
                        if (aoqg.g == null) {
                            aoqg.g = (ahev)new ahcs((ahcz)aoqg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoqg.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqg.a);
            }
            case 3: {
                return new aoqg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "h", "c", "d", "e", "f" });
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
