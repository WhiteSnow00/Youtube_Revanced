import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfb extends agzi implements ahax
{
    public static final aqfb a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public String d;
    
    static {
        final aqfb a2 = new aqfb();
        agzi.registerDefaultInstance((Class)aqfb.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqev.a, (Object)a2, (MessageLite)a2, (agzn)null, 172035250, ahcm.k, (Class)aqfb.class);
    }
    
    private aqfb() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqfb.e) == null) {
                    synchronized (aqfb.class) {
                        if (aqfb.e == null) {
                            aqfb.e = (ahbe)new agzb((agzi)aqfb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqfb.a;
            }
            case 4: {
                return new agza((agzi)aqfb.a);
            }
            case 3: {
                return new aqfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
