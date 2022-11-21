import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetm extends ahcz implements aheo
{
    public static final aetm a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aetm.class, a = new aetm());
    }
    
    private aetm() {
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
                if ((d = aetm.d) == null) {
                    synchronized (aetm.class) {
                        if (aetm.d == null) {
                            aetm.d = (ahev)new ahcs((ahcz)aetm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aetm.a;
            }
            case 4: {
                return new ahcr((ahcz)aetm.a);
            }
            case 3: {
                return new aetm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
