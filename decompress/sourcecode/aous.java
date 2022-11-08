import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aous extends agzi implements ahax
{
    public static final aous a;
    private static volatile ahbe f;
    public String b;
    public long c;
    public long d;
    public aioe e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aous.class, a = new aous());
    }
    
    private aous() {
        this.h = 2;
        this.b = "";
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
                final ahbe f;
                if ((f = aous.f) == null) {
                    synchronized (aous.class) {
                        if (aous.f == null) {
                            aous.f = (ahbe)new agzb((agzi)aous.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aous.a;
            }
            case 4: {
                return new agza((agzi)aous.a);
            }
            case 3: {
                return new aous();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aous.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1409\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
