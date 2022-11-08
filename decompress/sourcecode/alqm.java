import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqm extends agzi implements ahax
{
    public static final alqm a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alqm.class, a = new alqm());
    }
    
    private alqm() {
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
                if ((d = alqm.d) == null) {
                    synchronized (alqm.class) {
                        if (alqm.d == null) {
                            alqm.d = (ahbe)new agzb((agzi)alqm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqm.a;
            }
            case 4: {
                return new agza((agzi)alqm.a);
            }
            case 3: {
                return new alqm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqm.a, "\u0001\u0003\u0001\u0000\uf45c\u3f3a\ue932\u6031\u0003\u0000\u0000\u0003\uf45c\u3f3a\u143c\u0000\uf478\u3f3a\u143c\u0000\ue932\u6031\u143c\u0000", new Object[] { "c", "b", alqo.class, alqn.class, alql.class });
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
