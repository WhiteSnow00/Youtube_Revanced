import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjp extends agzi implements ahax
{
    public static final anjp a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final anjp a2 = new anjp();
        agzi.registerDefaultInstance(anjp.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajkk.a, a2, (MessageLite)a2, null, 346823646, ahcm.k, anjp.class);
    }
    
    private anjp() {
        this.c = "";
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
                if ((d = anjp.d) == null) {
                    synchronized (anjp.class) {
                        if (anjp.d == null) {
                            anjp.d = (ahbe)new agzb((agzi)anjp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anjp.a;
            }
            case 4: {
                return new agza((agzi)anjp.a);
            }
            case 3: {
                return new anjp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
