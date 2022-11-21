import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhc extends ahcz implements aheo
{
    public static final aqhc a;
    private static volatile ahev b;
    private ahej c;
    
    static {
        ahcz.registerDefaultInstance(aqhc.class, a = new aqhc());
    }
    
    private aqhc() {
        this.c = ahej.a;
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
                if ((b = aqhc.b) == null) {
                    synchronized (aqhc.class) {
                        if (aqhc.b == null) {
                            aqhc.b = (ahev)new ahcs((ahcz)aqhc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqhc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhc.a);
            }
            case 3: {
                return new aqhc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqhb.a });
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
