import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifq extends ahcz implements aheo
{
    public static final aifq a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aifq.class, a = new aifq());
    }
    
    private aifq() {
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
                if ((d = aifq.d) == null) {
                    synchronized (aifq.class) {
                        if (aifq.d == null) {
                            aifq.d = (ahev)new ahcs((ahcz)aifq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifq.a;
            }
            case 4: {
                return new ahcr((ahcz)aifq.a);
            }
            case 3: {
                return new aifq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
