import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainw extends agzi implements ahax
{
    public static final ainw a;
    private static volatile ahbe h;
    public int b;
    public anss c;
    public ajsq d;
    public ajsq e;
    public int f;
    public int g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ainw.class, a = new ainw());
    }
    
    private ainw() {
        this.i = 2;
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
                if ((h = ainw.h) == null) {
                    synchronized (ainw.class) {
                        if (ainw.h == null) {
                            ainw.h = (ahbe)new agzb((agzi)ainw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ainw.a;
            }
            case 4: {
                return new agza((agzi)ainw.a);
            }
            case 3: {
                return new ainw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainw.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100b\u0003\u0005\u100c\u0004\u0006\u1409\u0000", new Object[] { "b", "d", "e", "f", "g", ahho.g, "c" });
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
