import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknq extends agzi implements ahax
{
    public static final aknq a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public String d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aknq.class, a = new aknq());
    }
    
    private aknq() {
        this.f = 2;
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
                final ahbe e;
                if ((e = aknq.e) == null) {
                    synchronized (aknq.class) {
                        if (aknq.e == null) {
                            aknq.e = (ahbe)new agzb((agzi)aknq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknq.a;
            }
            case 4: {
                return new agza((agzi)aknq.a);
            }
            case 3: {
                return new aknq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
