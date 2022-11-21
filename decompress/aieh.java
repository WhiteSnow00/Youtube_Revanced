import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieh extends ahcz implements aheo
{
    public static final aieh a;
    private static volatile ahev d;
    public int b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aieh.class, a = new aieh());
    }
    
    private aieh() {
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
                if ((d = aieh.d) == null) {
                    synchronized (aieh.class) {
                        if (aieh.d == null) {
                            aieh.d = (ahev)new ahcs((ahcz)aieh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aieh.a;
            }
            case 4: {
                return new ahcr((ahcz)aieh.a);
            }
            case 3: {
                return new aieh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aieh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", aidb.n });
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
