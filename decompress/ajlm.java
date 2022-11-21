import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlm extends ahcz implements aheo
{
    public static final ajlm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajlm.class, a = new ajlm());
    }
    
    private ajlm() {
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ajlm.b) == null) {
                    synchronized (ajlm.class) {
                        if (ajlm.b == null) {
                            ajlm.b = (ahev)new ahcs((ahcz)ajlm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlm.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlm.a);
            }
            case 3: {
                return new ajlm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlm.a, "\u0001\u0000", null);
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
