import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexd extends ahcz implements aheo
{
    public static final aexd a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aexd.class, a = new aexd());
    }
    
    private aexd() {
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
                if ((d = aexd.d) == null) {
                    synchronized (aexd.class) {
                        if (aexd.d == null) {
                            aexd.d = (ahev)new ahcs((ahcz)aexd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aexd.a;
            }
            case 4: {
                return new ahcr((ahcz)aexd.a);
            }
            case 3: {
                return new aexd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
