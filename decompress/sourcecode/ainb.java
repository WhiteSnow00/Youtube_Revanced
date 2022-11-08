import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainb extends agzi implements ahax
{
    public static final ainb a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    public aioe g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ainb.class, a = new ainb());
    }
    
    private ainb() {
        this.i = 2;
        this.d = "";
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
                final ahbe h;
                if ((h = ainb.h) == null) {
                    synchronized (ainb.class) {
                        if (ainb.h == null) {
                            ainb.h = (ahbe)new agzb((agzi)ainb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ainb.a;
            }
            case 4: {
                return new agza((agzi)ainb.a);
            }
            case 3: {
                return new ainb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0001\u0002\u1002\u0002\u0003\u1002\u0003\u0004\u1409\u0004\u0005\u100c\u0000", new Object[] { "b", "d", "e", "f", "g", "c", alsb.l });
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
