import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpo extends ahcz implements aheo
{
    public static final aqpo a;
    private static volatile ahev d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aqpo.class, a = new aqpo());
    }
    
    private aqpo() {
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
                if ((d = aqpo.d) == null) {
                    synchronized (aqpo.class) {
                        if (aqpo.d == null) {
                            aqpo.d = (ahev)new ahcs((ahcz)aqpo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqpo.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpo.a);
            }
            case 3: {
                return new aqpo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", aqnr.d });
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
