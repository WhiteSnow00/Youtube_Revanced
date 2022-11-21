import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmm extends ahcz implements aheo
{
    public static final ajmm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmm.class, a = new ajmm());
    }
    
    private ajmm() {
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
                if ((b = ajmm.b) == null) {
                    synchronized (ajmm.class) {
                        if (ajmm.b == null) {
                            ajmm.b = (ahev)new ahcs((ahcz)ajmm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmm.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmm.a);
            }
            case 3: {
                return new ajmm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmm.a, "\u0001\u0000", null);
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
