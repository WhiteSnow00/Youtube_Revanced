import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohg extends ahcz implements aheo
{
    public static final aohg a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aohg.class, a = new aohg());
    }
    
    private aohg() {
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
                if ((d = aohg.d) == null) {
                    synchronized (aohg.class) {
                        if (aohg.d == null) {
                            aohg.d = (ahev)new ahcs((ahcz)aohg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aohg.a;
            }
            case 4: {
                return new ahcr((ahcz)aohg.a);
            }
            case 3: {
                return new aohg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
