import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agty extends agzi implements ahax
{
    public static final agty a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(agty.class, a = new agty());
    }
    
    private agty() {
        this.c = 0;
        this.e = "";
        agzi.emptyProtobufList();
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
                if ((f = agty.f) == null) {
                    synchronized (agty.class) {
                        if (agty.f == null) {
                            agty.f = (ahbe)new agzb((agzi)agty.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agty.a;
            }
            case 4: {
                return new agza((agzi)agty.a);
            }
            case 3: {
                return new agty();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agty.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103f\u0000\u0004\u1008\u0002", new Object[] { "d", "c", "b", agtx.class, afon.o, "e" });
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
