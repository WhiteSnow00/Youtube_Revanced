import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqd extends ahcz implements aheo
{
    public static final aoqd a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public boolean d;
    private int f;
    
    static {
        final aoqd a2 = new aoqd();
        ahcz.registerDefaultInstance(aoqd.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aoqh.a, a2, (MessageLite)a2, null, 322606150, ahgc.k, aoqd.class);
    }
    
    private aoqd() {
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
                if ((e = aoqd.e) == null) {
                    synchronized (aoqd.class) {
                        if (aoqd.e == null) {
                            aoqd.e = (ahev)new ahcs((ahcz)aoqd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoqd.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqd.a);
            }
            case 3: {
                return new aoqd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[] { "f", "c", "d" });
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
