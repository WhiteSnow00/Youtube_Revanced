import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnu extends agzi implements ahax
{
    public static final ajnu a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public int d;
    public agyc e;
    private agyc g;
    
    static {
        agzi.registerDefaultInstance((Class)ajnu.class, (agzi)(a = new ajnu()));
    }
    
    private ajnu() {
        this.g = agyc.b;
        this.e = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajnu.f) == null) {
                    synchronized (ajnu.class) {
                        if (ajnu.f == null) {
                            ajnu.f = (ahbe)new agzb((agzi)ajnu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajnu.a;
            }
            case 4: {
                return new agza((agzi)ajnu.a);
            }
            case 3: {
                return new ajnu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnu.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002\u100a\u0003\u0004\u1002\u0000\u0005\u100c\u0001\u0006\u100a\u0002", new Object[] { "b", "e", "c", "d", ajoa.b, "g" });
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
