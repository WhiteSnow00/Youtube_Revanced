import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmq extends ahcz implements aheo
{
    public static final ajmq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmq.class, a = new ajmq());
    }
    
    private ajmq() {
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
                if ((b = ajmq.b) == null) {
                    synchronized (ajmq.class) {
                        if (ajmq.b == null) {
                            ajmq.b = (ahev)new ahcs((ahcz)ajmq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmq.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmq.a);
            }
            case 3: {
                return new ajmq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmq.a, "\u0001\u0000", null);
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
