import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsn extends agzi implements ahax
{
    public static final alsn a;
    private static volatile ahbe i;
    public int b;
    public aioe c;
    public boolean d;
    public int e;
    public long f;
    public alsm g;
    public boolean h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(alsn.class, a = new alsn());
    }
    
    private alsn() {
        this.j = 2;
        this.e = 1;
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
                final ahbe i;
                if ((i = alsn.i) == null) {
                    synchronized (alsn.class) {
                        if (alsn.i == null) {
                            alsn.i = (ahbe)new agzb((agzi)alsn.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alsn.a;
            }
            case 4: {
                return new agza((agzi)alsn.a);
            }
            case 3: {
                return new alsn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsn.a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0006\u0005\u1002\u0005\u0006\u1007\u0003\u0007\u1007\u0007\n\u100c\u0004", new Object[] { "b", "c", "g", "f", "d", "h", "e", alsb.c });
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
