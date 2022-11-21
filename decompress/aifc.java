import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifc extends ahcz implements aheo
{
    public static final aifc a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aifc.class, a = new aifc());
    }
    
    private aifc() {
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
                if ((d = aifc.d) == null) {
                    synchronized (aifc.class) {
                        if (aifc.d == null) {
                            aifc.d = (ahev)new ahcs((ahcz)aifc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifc.a;
            }
            case 4: {
                return new ahcr((ahcz)aifc.a);
            }
            case 3: {
                return new aifc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aiga.b });
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
