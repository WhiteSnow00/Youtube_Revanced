import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorb extends agzi implements ahax
{
    public static final aorb a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aorb.class, a = new aorb());
    }
    
    private aorb() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aorb.c) == null) {
                    synchronized (aorb.class) {
                        if (aorb.c == null) {
                            aorb.c = (ahbe)new agzb((agzi)aorb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorb.a;
            }
            case 4: {
                return new agza((agzi)aorb.a);
            }
            case 3: {
                return new aorb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
