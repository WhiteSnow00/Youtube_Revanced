import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsw extends agzi implements ahax
{
    public static final agsw a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public long d;
    public long e;
    public String f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(agsw.class, a = new agsw());
    }
    
    private agsw() {
        this.c = "";
        emptyProtobufList();
        this.f = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = agsw.h) == null) {
                    synchronized (agsw.class) {
                        if (agsw.h == null) {
                            agsw.h = (ahbe)new agzb((agzi)agsw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agsw.a;
            }
            case 4: {
                return new agza((agzi)agsw.a);
            }
            case 3: {
                return new agsw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsw.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1002\u0002", new Object[] { "b", "c", "d", "f", "g", "e" });
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
