import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyr extends agzi implements ahax
{
    public static final ajyr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ajyr.class, a = new ajyr());
    }
    
    private ajyr() {
        this.j = 2;
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
                final ahbe b2;
                if ((b2 = ajyr.b) == null) {
                    synchronized (ajyr.class) {
                        if (ajyr.b == null) {
                            ajyr.b = (ahbe)new agzb((agzi)ajyr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajyr.a;
            }
            case 4: {
                return new agza((agzi)ajyr.a);
            }
            case 3: {
                return new ajyr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyr.a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0006\u0006\u1409\b\t\u1409\u0002\n\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
