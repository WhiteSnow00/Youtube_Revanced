import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetn extends ahcz implements aheo
{
    public static final aetn a;
    private static volatile ahev e;
    public int b;
    public aetm c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aetn.class, a = new aetn());
    }
    
    private aetn() {
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
                if ((e = aetn.e) == null) {
                    synchronized (aetn.class) {
                        if (aetn.e == null) {
                            aetn.e = (ahev)new ahcs((ahcz)aetn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aetn.a;
            }
            case 4: {
                return new ahcr((ahcz)aetn.a);
            }
            case 3: {
                return new aetn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
