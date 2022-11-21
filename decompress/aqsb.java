import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsb extends ahcz implements aheo
{
    public static final aqsb a;
    private static volatile ahev f;
    public int b;
    public long c;
    public ahej d;
    public ahej e;
    
    static {
        ahcz.registerDefaultInstance(aqsb.class, a = new aqsb());
    }
    
    private aqsb() {
        this.d = ahej.a;
        this.e = ahej.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqsb.f) == null) {
                    synchronized (aqsb.class) {
                        if (aqsb.f == null) {
                            aqsb.f = (ahev)new ahcs((ahcz)aqsb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsb.a;
            }
            case 4: {
                return new ahcr((int[][])null, (short[][])null);
            }
            case 3: {
                return new aqsb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsb.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0002\u0000\u0000\u0001\u1002\u0000\u00032\u00042", new Object[] { "b", "c", "d", aqrz.a, "e", aqsa.a });
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
