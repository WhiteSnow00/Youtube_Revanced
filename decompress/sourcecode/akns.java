import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akns extends agzi implements ahax
{
    public static final akns a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akns.class, a = new akns());
    }
    
    private akns() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = akns.d) == null) {
                    synchronized (akns.class) {
                        if (akns.d == null) {
                            akns.d = (ahbe)new agzb((agzi)akns.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akns.a;
            }
            case 4: {
                return new agza((agzi)akns.a);
            }
            case 3: {
                return new akns();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akns.a, "\u0001\u0003\u0001\u0000\ufa18\u3c15\uf39d\uc62b\u0003\u0000\u0000\u0003\ufa18\u3c15\u143c\u0000\uec26\u4753\u143c\u0000\uf39d\uc62b\u143c\u0000", new Object[] { "c", "b", amgq.class, aiuy.class, amhp.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
