import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahty extends agzi implements ahax
{
    public static final ahty a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public ahtw e;
    
    static {
        agzi.registerDefaultInstance(ahty.class, a = new ahty());
    }
    
    private ahty() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahty.f) == null) {
                    synchronized (ahty.class) {
                        if (ahty.f == null) {
                            ahty.f = (ahbe)new agzb((agzi)ahty.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahty.a;
            }
            case 4: {
                return new agza((agzi)ahty.a);
            }
            case 3: {
                return new ahty();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahty.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u103b\u0000\u0003\u103c\u0000", new Object[] { "d", "c", "b", "e", ahtx.class });
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
