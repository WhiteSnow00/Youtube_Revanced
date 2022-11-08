import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocn extends agzi implements ahax
{
    public static final aocn a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public aorm d;
    public String e;
    public aocm f;
    public String g;
    public aioe h;
    public boolean i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aocn.class, a = new aocn());
    }
    
    private aocn() {
        this.k = 2;
        this.c = "";
        this.e = "";
        this.g = "";
        this.i = true;
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
                final ahbe j;
                if ((j = aocn.j) == null) {
                    synchronized (aocn.class) {
                        if (aocn.j == null) {
                            aocn.j = (ahbe)new agzb((agzi)aocn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aocn.a;
            }
            case 4: {
                return new agza((agzi)aocn.a);
            }
            case 3: {
                return new aocn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocn.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0005\u1009\u0004\u0006\u1008\u0005\u0007\u1409\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
