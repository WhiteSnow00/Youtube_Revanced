import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogs extends ahcz implements aheo
{
    public static final aogs a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aogs.class, a = new aogs());
    }
    
    private aogs() {
        this.c = "";
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
                if ((d = aogs.d) == null) {
                    synchronized (aogs.class) {
                        if (aogs.d == null) {
                            aogs.d = (ahev)new ahcs((ahcz)aogs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogs.a;
            }
            case 4: {
                return new ahcr((ahcz)aogs.a);
            }
            case 3: {
                return new aogs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
