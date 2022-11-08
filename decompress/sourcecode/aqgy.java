import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgy extends agzi implements ahax
{
    public static final aqgy a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public aobv d;
    public String e;
    
    static {
        final aqgy a2 = new aqgy();
        agzi.registerDefaultInstance((Class)aqgy.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)anlt.a, (Object)a2, (MessageLite)a2, (agzn)null, 1000, ahcm.k, (Class)aqgy.class);
    }
    
    private aqgy() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aqgy.f) == null) {
                    synchronized (aqgy.class) {
                        if (aqgy.f == null) {
                            aqgy.f = (ahbe)new agzb((agzi)aqgy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqgy.a;
            }
            case 4: {
                return new agza((agzi)aqgy.a);
            }
            case 3: {
                return new aqgy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
