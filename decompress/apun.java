import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apun extends ahcz implements aheo
{
    public static final apun a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(apun.class, a = new apun());
    }
    
    private apun() {
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
                if ((d = apun.d) == null) {
                    synchronized (apun.class) {
                        if (apun.d == null) {
                            apun.d = (ahev)new ahcs((ahcz)apun.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apun.a;
            }
            case 4: {
                return new ahcr((ahcz)apun.a);
            }
            case 3: {
                return new apun();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apun.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aobh.a() });
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
