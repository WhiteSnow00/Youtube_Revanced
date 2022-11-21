import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjr extends ahcz implements aheo
{
    public static final aqjr a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(aqjr.class, a = new aqjr());
    }
    
    private aqjr() {
        ahcz.emptyProtobufList();
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
                if ((d = aqjr.d) == null) {
                    synchronized (aqjr.class) {
                        if (aqjr.d == null) {
                            aqjr.d = (ahev)new ahcs((ahcz)aqjr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjr.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjr.a);
            }
            case 3: {
                return new aqjr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjr.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1002\u0002", new Object[] { "b", "c" });
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
