import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apst extends agzi implements ahax
{
    public static final apst a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public int e;
    public agyc f;
    
    static {
        agzi.registerDefaultInstance((Class)apst.class, (agzi)(a = new apst()));
    }
    
    private apst() {
        this.c = "";
        this.d = "";
        this.f = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apst.g) == null) {
                    synchronized (apst.class) {
                        if (apst.g == null) {
                            apst.g = (ahbe)new agzb((agzi)apst.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apst.a;
            }
            case 4: {
                return new agza((agzi)apst.a);
            }
            case 3: {
                return new apst();
            }
            case 2: {
                return newMessageInfo((MessageLite)apst.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f" });
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
