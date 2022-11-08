import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjl extends agzi implements ahax
{
    public static final apjl a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apjl.class, a = new apjl());
    }
    
    private apjl() {
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
                if ((d = apjl.d) == null) {
                    synchronized (apjl.class) {
                        if (apjl.d == null) {
                            apjl.d = (ahbe)new agzb((agzi)apjl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjl.a;
            }
            case 4: {
                return new agza((agzi)apjl.a);
            }
            case 3: {
                return new apjl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
