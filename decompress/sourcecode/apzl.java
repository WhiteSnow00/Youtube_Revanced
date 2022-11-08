import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzl extends agzi implements ahax
{
    public static final apzl a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apzl.class, a = new apzl());
    }
    
    private apzl() {
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
                if ((d = apzl.d) == null) {
                    synchronized (apzl.class) {
                        if (apzl.d == null) {
                            apzl.d = (ahbe)new agzb((agzi)apzl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzl.a;
            }
            case 4: {
                return new agza((agzi)apzl.a);
            }
            case 3: {
                return new apzl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
