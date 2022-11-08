import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andv extends agzi implements ahax
{
    public static final andv a;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public aibc d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(andv.class, a = new andv());
    }
    
    private andv() {
        this.f = 2;
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
                final ahbe e;
                if ((e = andv.e) == null) {
                    synchronized (andv.class) {
                        if (andv.e == null) {
                            andv.e = (ahbe)new agzb((agzi)andv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return andv.a;
            }
            case 4: {
                return new agza((agzi)andv.a);
            }
            case 3: {
                return new andv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
