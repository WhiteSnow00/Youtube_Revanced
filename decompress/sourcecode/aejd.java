import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejd extends agzi implements ahax
{
    public static final aejd a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public aehy d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aejd.class, a = new aejd());
    }
    
    private aejd() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aejd.f) == null) {
                    synchronized (aejd.class) {
                        if (aejd.f == null) {
                            aejd.f = (ahbe)new agzb((agzi)aejd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aejd.a;
            }
            case 4: {
                return new agza((agzi)aejd.a);
            }
            case 3: {
                return new aejd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aejd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aeih.a });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
