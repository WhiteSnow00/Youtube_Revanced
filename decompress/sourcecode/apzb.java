import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzb extends agzi implements ahax
{
    public static final apzb a;
    private static volatile ahbe f;
    public int b;
    public apzw c;
    public aoxb d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(apzb.class, a = new apzb());
    }
    
    private apzb() {
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apzb.f) == null) {
                    synchronized (apzb.class) {
                        if (apzb.f == null) {
                            apzb.f = (ahbe)new agzb((agzi)apzb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apzb.a;
            }
            case 4: {
                return new agza((agzi)apzb.a);
            }
            case 3: {
                return new apzb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
