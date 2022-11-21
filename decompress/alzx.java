import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzx extends ahcz implements aheo
{
    public static final alzx a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(alzx.class, a = new alzx());
    }
    
    private alzx() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alzx.d) == null) {
                    synchronized (alzx.class) {
                        if (alzx.d == null) {
                            alzx.d = (ahev)new ahcs((ahcz)alzx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alzx.a;
            }
            case 4: {
                return new ahcr((ahcz)alzx.a);
            }
            case 3: {
                return new alzx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", alwa.u });
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
