import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohw extends ahcz implements aheo
{
    private static final aohw a;
    private static volatile ahev b;
    private int c;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aohw.class, a = new aohw());
    }
    
    private aohw() {
    }
    
    public static aohv a() {
        return (aohv)aohw.a.createBuilder();
    }
    
    static aohw b() {
        return aohw.a;
    }
    
    public static void c(final aohw aohw, final aohq aohq) {
        aohw.d(aohq);
    }
    
    private void d(final aohq aohq) {
        this.d = aohq.e;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aohw.b) == null) {
                    synchronized (aohw.class) {
                        if (aohw.b == null) {
                            aohw.b = (ahev)new ahcs((ahcz)aohw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohw.a;
            }
            case 4: {
                return new aohv();
            }
            case 3: {
                return new aohw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aohq.a() });
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
