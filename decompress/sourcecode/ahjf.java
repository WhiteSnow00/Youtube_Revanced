import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjf extends agzi implements ahax
{
    public static final ahjf a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public float d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjf.class, (agzi)(a = new ahjf()));
    }
    
    private ahjf() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahjf.e) == null) {
                    synchronized (ahjf.class) {
                        if (ahjf.e == null) {
                            ahjf.e = (ahbe)new agzb((agzi)ahjf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahjf.a;
            }
            case 4: {
                return new agza((agzi)ahjf.a);
            }
            case 3: {
                return new ahjf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "b", "c", ahho.h, "d" });
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
