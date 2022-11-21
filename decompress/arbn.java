import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbn extends ahcz implements aheo
{
    public static final arbn a;
    private static volatile ahev e;
    public int b;
    public float c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(arbn.class, a = new arbn());
    }
    
    private arbn() {
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
                if ((e = arbn.e) == null) {
                    synchronized (arbn.class) {
                        if (arbn.e == null) {
                            arbn.e = (ahev)new ahcs((ahcz)arbn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arbn.a;
            }
            case 4: {
                return new ahcr((ahcz)arbn.a);
            }
            case 3: {
                return new arbn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
