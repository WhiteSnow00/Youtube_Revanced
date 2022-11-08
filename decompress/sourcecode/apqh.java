import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqh extends agzi implements ahax
{
    public static final apqh a;
    private static volatile ahbe f;
    public int b;
    public anbh c;
    public anbg d;
    public anbi e;
    
    static {
        agzi.registerDefaultInstance((Class)apqh.class, (agzi)(a = new apqh()));
    }
    
    private apqh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apqh.f) == null) {
                    synchronized (apqh.class) {
                        if (apqh.f == null) {
                            apqh.f = (ahbe)new agzb((agzi)apqh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqh.a;
            }
            case 4: {
                return new agza((agzi)apqh.a);
            }
            case 3: {
                return new apqh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqh.a, "\u0001\u0003\u0000\u0001\uf027\u2085\ue433\u2ca7\u0003\u0000\u0000\u0000\uf027\u2085\u1009\u0001\ue7c7\u20a1\u1009\u0000\ue433\u2ca7\u1009\u0003", new Object[] { "b", "d", "c", "e" });
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
