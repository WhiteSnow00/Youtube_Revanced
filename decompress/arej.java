import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arej extends ahcz implements aheo
{
    public static final arej a;
    private static volatile ahev g;
    public int b;
    public ahhh c;
    public String d;
    public String e;
    public arei f;
    
    static {
        ahcz.registerDefaultInstance(arej.class, a = new arej());
    }
    
    private arej() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = arej.g) == null) {
                    synchronized (arej.class) {
                        if (arej.g == null) {
                            arej.g = (ahev)new ahcs((ahcz)arej.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arej.a;
            }
            case 4: {
                return new ahcr((ahcz)arej.a);
            }
            case 3: {
                return new arej();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arej.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
