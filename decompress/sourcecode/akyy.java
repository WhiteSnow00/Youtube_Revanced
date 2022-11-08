import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyy extends agzi implements ahax
{
    public static final akyy a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public long f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)akyy.class, (agzi)(a = new akyy()));
    }
    
    private akyy() {
        this.h = 2;
        this.d = "";
        this.e = "";
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
                final ahbe g;
                if ((g = akyy.g) == null) {
                    synchronized (akyy.class) {
                        if (akyy.g == null) {
                            akyy.g = (ahbe)new agzb((agzi)akyy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akyy.a;
            }
            case 4: {
                return new agza((agzi)akyy.a);
            }
            case 3: {
                return new akyy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyy.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1003\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
