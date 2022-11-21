import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcf extends ahcz implements aheo
{
    public static final aqcf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqcf.class, a = new aqcf());
    }
    
    private aqcf() {
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
                if ((b = aqcf.b) == null) {
                    synchronized (aqcf.class) {
                        if (aqcf.b == null) {
                            aqcf.b = (ahev)new ahcs((ahcz)aqcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcf.a);
            }
            case 3: {
                return new aqcf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcf.a, "\u0001\u0000", null);
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
