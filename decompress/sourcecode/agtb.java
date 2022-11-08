import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtb extends agzi implements ahax
{
    public static final agtb a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agtb.class, a = new agtb());
    }
    
    private agtb() {
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
                if ((d = agtb.d) == null) {
                    synchronized (agtb.class) {
                        if (agtb.d == null) {
                            agtb.d = (ahbe)new agzb((agzi)agtb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agtb.a;
            }
            case 4: {
                return new agza((agzi)agtb.a);
            }
            case 3: {
                return new agtb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtb.a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "c", "b", agtd.class, agtg.class, agth.class, agst.class, agtt.class, agta.class, agud.class, agtl.class, agti.class });
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
