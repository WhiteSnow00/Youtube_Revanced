import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlz extends ahcz implements aheo
{
    public static final ahlz a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(ahlz.class, a = new ahlz());
    }
    
    private ahlz() {
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
                if ((d = ahlz.d) == null) {
                    synchronized (ahlz.class) {
                        if (ahlz.d == null) {
                            ahlz.d = (ahev)new ahcs((ahcz)ahlz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlz.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlz.a);
            }
            case 3: {
                return new ahlz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
