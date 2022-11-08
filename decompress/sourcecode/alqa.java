import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqa extends agzi implements ahax
{
    public static final alqa a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public agyc e;
    
    static {
        agzi.registerDefaultInstance(alqa.class, a = new alqa());
    }
    
    private alqa() {
        this.d = "";
        this.e = agyc.b;
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
                if ((f = alqa.f) == null) {
                    synchronized (alqa.class) {
                        if (alqa.f == null) {
                            alqa.f = (ahbe)new agzb((agzi)alqa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alqa.a;
            }
            case 4: {
                return new agza((agzi)alqa.a);
            }
            case 3: {
                return new alqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqa.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d", "e" });
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
