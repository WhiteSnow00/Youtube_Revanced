import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajll extends ahcz implements aheo
{
    public static final ajll a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajll.class, a = new ajll());
    }
    
    private ajll() {
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
                if ((b = ajll.b) == null) {
                    synchronized (ajll.class) {
                        if (ajll.b == null) {
                            ajll.b = (ahev)new ahcs((ahcz)ajll.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajll.a;
            }
            case 4: {
                return new ahcr((ahcz)ajll.a);
            }
            case 3: {
                return new ajll();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajll.a, "\u0001\u0000", null);
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
