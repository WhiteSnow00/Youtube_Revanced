import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplq extends agzi implements ahax
{
    public static final aplq a;
    private static volatile ahbe b;
    private int c;
    private apib d;
    private ameo e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aplq.class, a = new aplq());
    }
    
    private aplq() {
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
                final ahbe b2;
                if ((b2 = aplq.b) == null) {
                    synchronized (aplq.class) {
                        if (aplq.b == null) {
                            aplq.b = (ahbe)new agzb((agzi)aplq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aplq.a;
            }
            case 4: {
                return new agza((agzi)aplq.a);
            }
            case 3: {
                return new aplq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplq.a, "\u0001\u0002\u0000\u0001\ueaaa\u1fae\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaa\u1fae\u1409\u0001\uf6ae\u2fd9\u1409\u0000", new Object[] { "c", "e", "d" });
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
