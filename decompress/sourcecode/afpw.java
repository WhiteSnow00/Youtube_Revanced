import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpw extends agzi implements ahax
{
    public static final afpw a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public long d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(afpw.class, a = new afpw());
    }
    
    private afpw() {
        this.c = agzi.emptyProtobufList();
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
                if ((f = afpw.f) == null) {
                    synchronized (afpw.class) {
                        if (afpw.f == null) {
                            afpw.f = (ahbe)new agzb((agzi)afpw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpw.a;
            }
            case 4: {
                return new agza((agzi)afpw.a);
            }
            case 3: {
                return new afpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1003\u0000\u0003\u1003\u0001", new Object[] { "b", "c", afpv.class, "d", "e" });
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
