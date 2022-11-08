import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajys extends agzi implements ahax
{
    public static final ajys a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public akbf e;
    public ahgm f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ajys.class, a = new ajys());
    }
    
    private ajys() {
        this.c = 0;
        this.i = 2;
        final agyc b = agyc.b;
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
                final ahbe g;
                if ((g = ajys.g) == null) {
                    synchronized (ajys.class) {
                        if (ajys.g == null) {
                            ajys.g = (ahbe)new agzb((agzi)ajys.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajys.a;
            }
            case 4: {
                return new agza((agzi)ajys.a);
            }
            case 3: {
                return new ajys();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajys.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u1009\u0003\u0005\u1409\u0004", new Object[] { "d", "c", "b", "e", aioe.class, aioe.class, "f", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
