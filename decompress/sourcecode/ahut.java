import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahut extends agzi implements ahax
{
    public static final ahut a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ahut.class, a = new ahut());
    }
    
    private ahut() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahut.d) == null) {
                    synchronized (ahut.class) {
                        if (ahut.d == null) {
                            ahut.d = (ahbe)new agzb((agzi)ahut.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahut.a;
            }
            case 4: {
                return new agza((agzi)ahut.a);
            }
            case 3: {
                return new ahut();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahut.a, "\u0001\u0005\u0001\u0000\u0002\u0007\u0005\u0000\u0000\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0007\u103c\u0000", new Object[] { "c", "b", ahuv.class, ahux.class, ahuw.class, apsi.class, ahuu.class });
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
