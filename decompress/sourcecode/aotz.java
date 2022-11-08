import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotz extends agzi implements ahax
{
    public static final aotz a;
    private static volatile ahbe d;
    public anss b;
    public aoty c;
    private int e;
    private anss f;
    private anss g;
    private anss h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aotz.class, a = new aotz());
    }
    
    private aotz() {
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
                final ahbe d;
                if ((d = aotz.d) == null) {
                    synchronized (aotz.class) {
                        if (aotz.d == null) {
                            aotz.d = (ahbe)new agzb((agzi)aotz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aotz.a;
            }
            case 4: {
                return new agza((agzi)aotz.a);
            }
            case 3: {
                return new aotz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotz.a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\n\u1409\u0005\u000b\u1009\u0006", new Object[] { "e", "f", "g", "h", "i", "b", "c" });
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
