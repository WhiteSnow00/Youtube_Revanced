import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmp extends agzi implements ahax
{
    public static final agmp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agmp.class, a = new agmp());
    }
    
    private agmp() {
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
                if ((d = agmp.d) == null) {
                    synchronized (agmp.class) {
                        if (agmp.d == null) {
                            agmp.d = (ahbe)new agzb((agzi)agmp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agmp.a;
            }
            case 4: {
                return new agza((agzi)agmp.a);
            }
            case 3: {
                return new agmp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agmp.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u1037\u0000\u0003\u103a\u0000", new Object[] { "c", "b" });
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
