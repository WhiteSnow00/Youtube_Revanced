import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aino extends agzi implements ahax
{
    public static final aino a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public akbf d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aino.class, a = new aino());
    }
    
    private aino() {
        this.j = 2;
        this.c = "";
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
                if ((i = aino.i) == null) {
                    synchronized (aino.class) {
                        if (aino.i == null) {
                            aino.i = (ahbe)new agzb((agzi)aino.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aino.a;
            }
            case 4: {
                return new agza((agzi)aino.a);
            }
            case 3: {
                return new aino();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aino.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
