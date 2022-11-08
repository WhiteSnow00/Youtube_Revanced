import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amie extends agzi implements ahax
{
    public static final amie a;
    private static volatile ahbe e;
    public int b;
    public Object c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)amie.class, (agzi)(a = new amie()));
    }
    
    private amie() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = amie.e) == null) {
                    synchronized (amie.class) {
                        if (amie.e == null) {
                            amie.e = (ahbe)new agzb((agzi)amie.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amie.a;
            }
            case 4: {
                return new agza((agzi)amie.a);
            }
            case 3: {
                return new amie();
            }
            case 2: {
                return newMessageInfo((MessageLite)amie.a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u103a\u0000", new Object[] { "c", "b", "f", "d", amcq.s });
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
