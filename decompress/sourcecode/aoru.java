import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoru extends agzi implements ahax
{
    public static final aoru a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public akbf h;
    public int i;
    public agyc j;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(aoru.class, a = new aoru());
    }
    
    private aoru() {
        this.c = 0;
        this.m = 2;
        this.j = agyc.b;
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
                final ahbe k;
                if ((k = aoru.k) == null) {
                    synchronized (aoru.class) {
                        if (aoru.k == null) {
                            aoru.k = (ahbe)new agzb((agzi)aoru.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aoru.a;
            }
            case 4: {
                return new agza((agzi)aoru.a);
            }
            case 3: {
                return new aoru();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoru.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u143c\u0000\u0006\u143c\u0000\u0007\u100c\u0006\b\u1409\u0007\t\u100a\b", new Object[] { "d", "c", "b", "e", "f", "g", "h", aioe.class, aioe.class, "i", aonj.r, "l", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
