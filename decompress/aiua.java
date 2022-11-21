import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiua extends ahcz implements aheo
{
    public static final aiua a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aiua.class, a = new aiua());
    }
    
    private aiua() {
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
                if ((c = aiua.c) == null) {
                    synchronized (aiua.class) {
                        if (aiua.c == null) {
                            aiua.c = (ahev)new ahcs((ahcz)aiua.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiua.a;
            }
            case 4: {
                return new ahcr((ahcz)aiua.a);
            }
            case 3: {
                return new aiua();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiua.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aitw.d });
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
