import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahew extends agzi implements ahax
{
    public static final ahew a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahew.class, a = new ahew());
    }
    
    private ahew() {
        this.b = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy b = this.b;
        if (!b.c()) {
            this.b = agzi.mutableCopy(b);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahew.c) == null) {
                    synchronized (ahew.class) {
                        if (ahew.c == null) {
                            ahew.c = (ahbe)new agzb((agzi)ahew.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahew.a;
            }
            case 4: {
                return new agza((char[][])null, (int[])null);
            }
            case 3: {
                return new ahew();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahew.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahev.class });
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
