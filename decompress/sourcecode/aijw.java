import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijw extends agzi implements ahax
{
    public static final aijw a;
    private static volatile ahbe h;
    public int b;
    public long c;
    public long d;
    public String e;
    public long f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(aijw.class, a = new aijw());
    }
    
    private aijw() {
        this.e = "";
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
                if ((h = aijw.h) == null) {
                    synchronized (aijw.class) {
                        if (aijw.h == null) {
                            aijw.h = (ahbe)new agzb((agzi)aijw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aijw.a;
            }
            case 4: {
                return new agza((agzi)aijw.a);
            }
            case 3: {
                return new aijw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijw.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0006\u1008\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
