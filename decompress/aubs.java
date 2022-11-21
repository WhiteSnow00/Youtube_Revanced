import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubs extends ahcz implements aheo
{
    public static final aubs a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdk d;
    
    static {
        ahcz.registerDefaultInstance(aubs.class, a = new aubs());
    }
    
    private aubs() {
        this.c = "";
        this.d = ahcz.emptyLongList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aubs.e) == null) {
                    synchronized (aubs.class) {
                        if (aubs.e == null) {
                            aubs.e = (ahev)new ahcs((ahcz)aubs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aubs.a;
            }
            case 4: {
                return new ahcr((short[])null, (char[][][])null);
            }
            case 3: {
                return new aubs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubs.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0003(", new Object[] { "b", "c", "d" });
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
