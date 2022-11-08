import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjc extends agzi implements ahax
{
    public static final ahjc a;
    private static volatile ahbe f;
    public int b;
    public ahjb c;
    public ahjd d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)ahjc.class, (agzi)(a = new ahjc()));
    }
    
    private ahjc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahjc.f) == null) {
                    synchronized (ahjc.class) {
                        if (ahjc.f == null) {
                            ahjc.f = (ahbe)new agzb((agzi)ahjc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahjc.a;
            }
            case 4: {
                return new agza((agzi)ahjc.a);
            }
            case 3: {
                return new ahjc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
