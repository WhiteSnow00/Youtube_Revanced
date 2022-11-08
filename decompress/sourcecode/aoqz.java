import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqz extends agzi implements ahax
{
    public static final aoqz a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public akbf d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoqz.class, a = new aoqz());
    }
    
    private aoqz() {
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
                if ((e = aoqz.e) == null) {
                    synchronized (aoqz.class) {
                        if (aoqz.e == null) {
                            aoqz.e = (ahbe)new agzb((agzi)aoqz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoqz.a;
            }
            case 4: {
                return new agza((agzi)aoqz.a);
            }
            case 3: {
                return new aoqz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
