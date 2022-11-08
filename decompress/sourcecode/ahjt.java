import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjt extends agzi implements ahax
{
    public static final ahjt a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public ahjr e;
    
    static {
        agzi.registerDefaultInstance((Class)ahjt.class, (agzi)(a = new ahjt()));
    }
    
    private ahjt() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahjt.f) == null) {
                    synchronized (ahjt.class) {
                        if (ahjt.f == null) {
                            ahjt.f = (ahbe)new agzb((agzi)ahjt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahjt.a;
            }
            case 4: {
                return new agza((agzi)ahjt.a);
            }
            case 3: {
                return new ahjt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", ahne.a(), "e" });
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
