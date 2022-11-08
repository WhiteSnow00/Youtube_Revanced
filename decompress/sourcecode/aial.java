import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aial extends agzi implements ahax
{
    public static final aial a;
    private static volatile ahbe k;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public aian g;
    public aiao h;
    public String i;
    public int j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aial.class, (agzi)(a = new aial()));
    }
    
    private aial() {
        this.l = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.i = "";
    }
    
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
                if ((k = aial.k) == null) {
                    synchronized (aial.class) {
                        if (aial.k == null) {
                            aial.k = (ahbe)new agzb((agzi)aial.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aial.a;
            }
            case 4: {
                return new agza((agzi)aial.a);
            }
            case 3: {
                return new aial();
            }
            case 2: {
                return newMessageInfo((MessageLite)aial.a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0001\u0002\u1008\u0000\u0003\u1008\u0002\u0005\u1008\u0003\u0006\u1409\u0005\u0007\u1007\u0004\b\u1009\u0006\f\u1008\n\u000e\u100c\u000b", new Object[] { "b", "c", "d", "e", "g", "f", "h", "i", "j", ahzk.m });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
