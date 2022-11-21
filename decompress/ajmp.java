import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmp extends ahcz implements aheo
{
    public static final ajmp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmp.class, a = new ajmp());
    }
    
    private ajmp() {
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
                if ((b = ajmp.b) == null) {
                    synchronized (ajmp.class) {
                        if (ajmp.b == null) {
                            ajmp.b = (ahev)new ahcs((ahcz)ajmp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmp.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmp.a);
            }
            case 3: {
                return new ajmp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmp.a, "\u0001\u0000", null);
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
