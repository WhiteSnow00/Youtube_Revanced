import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidl extends ahcz implements aheo
{
    public static final aidl a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aidl.class, a = new aidl());
    }
    
    private aidl() {
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
                if ((d = aidl.d) == null) {
                    synchronized (aidl.class) {
                        if (aidl.d == null) {
                            aidl.d = (ahev)new ahcs((ahcz)aidl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidl.a;
            }
            case 4: {
                return new ahcr((ahcz)aidl.a);
            }
            case 3: {
                return new aidl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aidb.f });
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
