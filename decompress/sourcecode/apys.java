import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apys extends agzi implements ahax
{
    public static final apys a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apys.class, a = new apys());
    }
    
    private apys() {
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
                if ((d = apys.d) == null) {
                    synchronized (apys.class) {
                        if (apys.d == null) {
                            apys.d = (ahbe)new agzb((agzi)apys.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apys.a;
            }
            case 4: {
                return new agza((agzi)apys.a);
            }
            case 3: {
                return new apys();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apys.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
