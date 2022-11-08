import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqh extends agzi implements ahax
{
    public static final alqh a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(alqh.class, a = new alqh());
    }
    
    private alqh() {
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
                if ((d = alqh.d) == null) {
                    synchronized (alqh.class) {
                        if (alqh.d == null) {
                            alqh.d = (ahbe)new agzb((agzi)alqh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqh.a;
            }
            case 4: {
                return new agza((agzi)alqh.a);
            }
            case 3: {
                return new alqh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqh.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
