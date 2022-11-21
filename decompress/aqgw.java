import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgw extends ahcz implements aheo
{
    public static final aqgw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqgw.class, a = new aqgw());
    }
    
    private aqgw() {
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
                if ((b = aqgw.b) == null) {
                    synchronized (aqgw.class) {
                        if (aqgw.b == null) {
                            aqgw.b = (ahev)new ahcs((ahcz)aqgw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqgw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqgw.a);
            }
            case 3: {
                return new aqgw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqgw.a, "\u0001\u0000", null);
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
