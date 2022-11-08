import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apml extends agzi implements ahax
{
    public static final apml a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public apir d;
    public apir e;
    public String f;
    
    static {
        agzi.registerDefaultInstance((Class)apml.class, (agzi)(a = new apml()));
    }
    
    private apml() {
        this.c = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apml.g) == null) {
                    synchronized (apml.class) {
                        if (apml.g == null) {
                            apml.g = (ahbe)new agzb((agzi)apml.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apml.a;
            }
            case 4: {
                return new agza((agzi)apml.a);
            }
            case 3: {
                return new apml();
            }
            case 2: {
                return newMessageInfo((MessageLite)apml.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
