import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnq extends ahcz implements aheo
{
    public static final alnq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnq.class, a = new alnq());
    }
    
    private alnq() {
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
                if ((b = alnq.b) == null) {
                    synchronized (alnq.class) {
                        if (alnq.b == null) {
                            alnq.b = (ahev)new ahcs((ahcz)alnq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnq.a;
            }
            case 4: {
                return new ahcr((ahcz)alnq.a);
            }
            case 3: {
                return new alnq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnq.a, "\u0001\u0000", null);
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
