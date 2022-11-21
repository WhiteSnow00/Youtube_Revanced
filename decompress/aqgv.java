import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgv extends ahcz implements aheo
{
    public static final aqgv a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqgv.class, a = new aqgv());
    }
    
    private aqgv() {
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
                if ((b = aqgv.b) == null) {
                    synchronized (aqgv.class) {
                        if (aqgv.b == null) {
                            aqgv.b = (ahev)new ahcs((ahcz)aqgv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqgv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqgv.a);
            }
            case 3: {
                return new aqgv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqgv.a, "\u0001\u0000", null);
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
