import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrk extends ahcz implements aheo
{
    public static final aqrk a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aqrk.class, a = new aqrk());
    }
    
    private aqrk() {
        this.b = 0;
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
                if ((d = aqrk.d) == null) {
                    synchronized (aqrk.class) {
                        if (aqrk.d == null) {
                            aqrk.d = (ahev)new ahcs((ahcz)aqrk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqrk.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrk.a);
            }
            case 3: {
                return new aqrk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrk.a, "\u0001\u0002\u0001\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "c", "b", aqrd.class, aqrc.class });
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
