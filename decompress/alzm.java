import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzm extends ahcz implements aheo
{
    public static final alzm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alzm.class, a = new alzm());
    }
    
    private alzm() {
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
                if ((b = alzm.b) == null) {
                    synchronized (alzm.class) {
                        if (alzm.b == null) {
                            alzm.b = (ahev)new ahcs((ahcz)alzm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alzm.a;
            }
            case 4: {
                return new ahcr((ahcz)alzm.a);
            }
            case 3: {
                return new alzm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzm.a, "\u0001\u0000", null);
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
