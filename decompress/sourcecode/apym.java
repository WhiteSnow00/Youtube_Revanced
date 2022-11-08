import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apym extends agzi implements ahax
{
    public static final apym a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apym.class, a = new apym());
    }
    
    private apym() {
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
                if ((d = apym.d) == null) {
                    synchronized (apym.class) {
                        if (apym.d == null) {
                            apym.d = (ahbe)new agzb((agzi)apym.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apym.a;
            }
            case 4: {
                return new agza((agzi)apym.a);
            }
            case 3: {
                return new apym();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apym.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
