import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexn extends ahcz implements aheo
{
    public static final aexn a;
    private static volatile ahev d;
    public String b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aexn.class, a = new aexn());
    }
    
    private aexn() {
        this.b = "";
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
                if ((d = aexn.d) == null) {
                    synchronized (aexn.class) {
                        if (aexn.d == null) {
                            aexn.d = (ahev)new ahcs((ahcz)aexn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aexn.a;
            }
            case 4: {
                return new ahcr((ahcz)aexn.a);
            }
            case 3: {
                return new aexn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexn.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "b", "c" });
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
