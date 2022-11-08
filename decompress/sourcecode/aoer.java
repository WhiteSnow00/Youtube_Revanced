import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoer extends agzi implements ahax
{
    public static final aoer a;
    private static volatile ahbe c;
    public anss b;
    private int d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoer.class, a = new aoer());
    }
    
    private aoer() {
        this.f = 2;
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
                final ahbe c;
                if ((c = aoer.c) == null) {
                    synchronized (aoer.class) {
                        if (aoer.c == null) {
                            aoer.c = (ahbe)new agzb((agzi)aoer.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoer.a;
            }
            case 4: {
                return new agza((agzi)aoer.a);
            }
            case 3: {
                return new aoer();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "e", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
