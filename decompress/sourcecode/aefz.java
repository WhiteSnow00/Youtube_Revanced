import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefz extends agzi implements ahax
{
    public static final aefz a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(aefz.class, a = new aefz());
    }
    
    private aefz() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((f = aefz.f) == null) {
                    synchronized (aefz.class) {
                        if (aefz.f == null) {
                            aefz.f = (ahbe)new agzb((agzi)aefz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aefz.a;
            }
            case 4: {
                return new agza((agzi)aefz.a);
            }
            case 3: {
                return new aefz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aefz.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0004\u1008\u0006\u0005\u1008\u0007", new Object[] { "b", "c", "d", "e" });
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
