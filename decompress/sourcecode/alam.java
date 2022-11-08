import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alam extends agzi implements ahax
{
    public static final alam a;
    private static volatile ahbe i;
    public int b;
    public akjd c;
    public String d;
    public int e;
    public apkm f;
    public boolean g;
    public amjt h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)alam.class, (agzi)(a = new alam()));
    }
    
    private alam() {
        this.j = 2;
        this.d = "";
        this.e = 1;
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
                final ahbe i;
                if ((i = alam.i) == null) {
                    synchronized (alam.class) {
                        if (alam.i == null) {
                            alam.i = (ahbe)new agzb((agzi)alam.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alam.a;
            }
            case 4: {
                return new agza((agzi)alam.a);
            }
            case 3: {
                return new alam();
            }
            case 2: {
                return newMessageInfo((MessageLite)alam.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0005\u1009\u0004\u0006\u1007\u0005\u0007\u1009\u0006", new Object[] { "b", "c", "d", "e", akwf.n, "f", "g", "h" });
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
