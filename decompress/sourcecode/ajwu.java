import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwu extends agzi implements ahax
{
    public static final ajwu a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(ajwu.class, a = new ajwu());
    }
    
    private ajwu() {
        this.c = 0;
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
                if ((f = ajwu.f) == null) {
                    synchronized (ajwu.class) {
                        if (ajwu.f == null) {
                            ajwu.f = (ahbe)new agzb((agzi)ajwu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajwu.a;
            }
            case 4: {
                return new agza((agzi)ajwu.a);
            }
            case 3: {
                return new ajwu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwu.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000", new Object[] { "d", "c", "b", "e", ajwq.class, ajwt.class, ajwp.class, ajwr.class, ajws.class });
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