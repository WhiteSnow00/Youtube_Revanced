import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmh extends ahcz implements aheo
{
    public static final ajmh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmh.class, a = new ajmh());
    }
    
    private ajmh() {
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
                if ((b = ajmh.b) == null) {
                    synchronized (ajmh.class) {
                        if (ajmh.b == null) {
                            ajmh.b = (ahev)new ahcs((ahcz)ajmh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmh.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmh.a);
            }
            case 3: {
                return new ajmh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmh.a, "\u0001\u0000", null);
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
