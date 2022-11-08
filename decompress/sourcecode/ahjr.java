import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjr extends agzi implements ahax
{
    public static final ahjr a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public ahod d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjr.class, (agzi)(a = new ahjr()));
    }
    
    private ahjr() {
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahjr.e) == null) {
                    synchronized (ahjr.class) {
                        if (ahjr.e == null) {
                            ahjr.e = (ahbe)new agzb((agzi)ahjr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjr.a;
            }
            case 4: {
                return new agza((agzi)ahjr.a);
            }
            case 3: {
                return new ahjr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
