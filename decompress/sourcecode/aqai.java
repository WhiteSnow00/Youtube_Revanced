import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqai extends agzi implements ahax
{
    public static final aqai a;
    private static volatile ahbe f;
    public String b;
    public String c;
    public int d;
    public agzy e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(aqai.class, a = new aqai());
    }
    
    private aqai() {
        this.b = "";
        this.c = "";
        this.e = agzi.emptyProtobufList();
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
                if ((f = aqai.f) == null) {
                    synchronized (aqai.class) {
                        if (aqai.f == null) {
                            aqai.f = (ahbe)new agzb((agzi)aqai.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqai.a;
            }
            case 4: {
                return new agza((agzi)aqai.a);
            }
            case 3: {
                return new aqai();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqai.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u001a", new Object[] { "g", "b", "c", "d", aqah.a, "e" });
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
