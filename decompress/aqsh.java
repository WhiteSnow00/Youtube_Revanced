import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsh extends ahcz implements aheo
{
    public static final aqsh a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(aqsh.class, a = new aqsh());
    }
    
    private aqsh() {
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
                if ((d = aqsh.d) == null) {
                    synchronized (aqsh.class) {
                        if (aqsh.d == null) {
                            aqsh.d = (ahev)new ahcs((ahcz)aqsh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsh.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsh.a);
            }
            case 3: {
                return new aqsh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
