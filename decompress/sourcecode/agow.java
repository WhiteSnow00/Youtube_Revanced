import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agow extends agzi implements ahax
{
    public static final agow a;
    private static volatile ahbe e;
    public int b;
    public agor c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(agow.class, a = new agow());
    }
    
    private agow() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agow.e) == null) {
                    synchronized (agow.class) {
                        if (agow.e == null) {
                            agow.e = (ahbe)new agzb((agzi)agow.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agow.a;
            }
            case 4: {
                return new agza((agzi)agow.a);
            }
            case 3: {
                return new agow();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agow.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
