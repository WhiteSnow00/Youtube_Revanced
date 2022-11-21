import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqc extends ahcz implements aheo
{
    public static final aoqc a;
    public static final ahcx b;
    private static volatile ahev d;
    public boolean c;
    private int e;
    
    static {
        final aoqc a2 = new aoqc();
        ahcz.registerDefaultInstance(aoqc.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aoqh.a, a2, (MessageLite)a2, null, 259636353, ahgc.k, aoqc.class);
    }
    
    private aoqc() {
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
                if ((d = aoqc.d) == null) {
                    synchronized (aoqc.class) {
                        if (aoqc.d == null) {
                            aoqc.d = (ahev)new ahcs((ahcz)aoqc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoqc.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqc.a);
            }
            case 3: {
                return new aoqc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqc.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "e", "c" });
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
